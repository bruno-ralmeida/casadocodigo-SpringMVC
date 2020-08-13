# Casa do Código - Spring MVC

Projeto criado para estudos com Spring MVC - Alura.


### Tecnologias

Tecnologias utilizadas:

* [Java] - Back-end
* [SpringMVC] - Framework para desenvolvimento web
* [JPA] - Java Persistence API
* [Hibernate] - Framework ORM
* [Postgresql] - Banco de dados
* [Apache Maven] - Ferramenta de automação de compilação 
* [Apache Tomcat] - Servidor
* [Eclipse] - IDE



### Instalação

Para executar o projeto, será necessário instalar os seguintes programas:
 * [JDK +8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html).
 * [Apache Tomcat 9](https://tomcat.apache.org/download-90.cgi)
 * [Postgresql](https://www.postgresql.org/download/)

### Desenvolvimento
```sh
cd "diretório de sua preferencia"
$ git clone "https://github.com/bruno-ralmeida/casadocodigo-SpringMVC.git"
```
Após realizar a cópia do projeto, será necessário abrir na sua ide de preferência e configurar o servidor tomcat.

##### Eclipse

* Aba servers -> new server -> Apache -> Tomcat v9 Server -> Next-> adicione o projeto ao servidor -> Finish 
Feito isso, na aba servers você terá o seu servidor disponível para inicialização.

##### Configuração do banco de dados

* No arquvio **JPAConfiguration** (src/main/java/br/com/casadocodigo/loja/conf) estão todas as configurações do banco de dados.
* Crie o banco de dados e altere as informações no arquivo de configuração **ex: banco, usuário e senha**.
