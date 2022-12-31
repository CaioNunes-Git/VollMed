package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        medicoRepository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listarTodos(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){ //deafult para caso o parametro n seja passado na url
        return medicoRepository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarMedico dadosAtualizar){
        var medico = medicoRepository.getReferenceById(dadosAtualizar.id());
        medico.atualizar(dadosAtualizar);
        //A anotation Transactional faz com que inice-se uma transação, assim quando a JPA detectar a mudança na entidade e a transação for commitada será automagico a att no banco
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletarTradicional(@PathVariable Long id){
        medicoRepository.deleteById(id);
    }

    @DeleteMapping("/deletelogico/{id}")
    @Transactional
    public void deletarLogicamente(@PathVariable Long id){
        var medico = medicoRepository.getReferenceById(id);
        medico.deletar();
    }

}
