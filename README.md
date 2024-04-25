# Projeto JPA com Maven

Este é um projeto simples demonstrando o uso de JPA (Java Persistence API) com Maven para persistência de dados em um banco de dados MySQL.

## Descrição

Este projeto consiste em uma aplicação Java que utiliza JPA para se conectar a um banco de dados MySQL, realizar operações CRUD (Create, Read, Update, Delete) em uma entidade de exemplo `Pessoa`, e demonstrar o funcionamento básico do JPA.

## Requisitos

Para executar este projeto localmente, você precisa ter instalado:

- Java Development Kit (JDK) 8 ou superior
- Maven
- Um banco de dados MySQL (ou outro banco de dados suportado pelo JPA)

## Configuração do Banco de Dados

Antes de executar o projeto, você precisa configurar as propriedades de conexão com o banco de dados no arquivo `persistence.xml`. Certifique-se de fornecer as credenciais corretas do seu banco de dados.

```xml
<!-- Exemplo de configuração do persistence.xml -->
<persistence-unit name="exemplo-jpa" transaction-type="RESOURCE_LOCAL">
    <properties>
        <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/meu_banco_de_dados"/>
        <property name="javax.persistence.jdbc.user" value="usuario"/>
        <property name="javax.persistence.jdbc.password" value="senha"/>
        <!-- outras propriedades -->
    </properties>
</persistence-unit>
```csharp
## Executando o Projeto

Após configurar o banco de dados, você pode executar o projeto localmente seguindo estas etapas:

1. Clone este repositório:

   ```bash
   git clone git@github.com:rodri-oliveira/jpa-maven.git

2. Navegue até o diretório do projeto:
   cd jpa-maven

3. Compile o projeto com Maven:
  mvn clean install

4.Execute a classe Program:
  mvn exec:java -Dexec.mainClass="application.Program"


