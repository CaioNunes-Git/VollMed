<h1 align="center">VollMed</h1>
<h3 align="center">API voltada para um CRUD de uma clínica médica</h3>
<p align="center">
  <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>
<hr size = "185%">

# Pré-Requisitos 
  - Java 17
  - Apache Maven 4.0

## Execução

1. Clonar o repositório git utilizando o comando

  - Execute o comando no terminal
    
        git clone https://github.com/CaioNunes-Git/VollMed.git
    
2. Abra o projeto com a IDE

      2.1 Caso seja o Eclipse será necessário uma configuração adicional por conta do [Lombok](#tópicos_especiais)  
     
3. Atualize o arquivo pom.xml para garantir o download de todas as dependências seja efetuado

 
## ✔️ Tecnologias Utilizadas
   * SpringBoot v3.0
   * Java 17
   * Maven
   * Lombok
   * JPA/Hibernate
   * MySQL
      * Flyway
   * Postman


🛠 Funcionalidades
=================
- Médico:<br>
    - [x] Criação, leitura, atualização e deleção;
- Cliente:<br>
    - [ ]  Criação, leitura, atualização e deleção de cliente;
- Consulta:<br>
    - [ ]  Criação, leitura, atualização e deleção de consulta,<br>
    - [ ]  Marcação de consulta.


## Tópicos_Especiais
  #### *Utilização do Lombok no Eclipse*
  1. Baixar o [Lombok](https://projectlombok.org/downloads/lombok.jar), 
  2. Entrair e executar o Lombok,
  3. Selecionar o local onde está seu Eclipse,
  4. Reiniciar o Eclipse,
  5. Rebuildar o projeto caso necessário.

