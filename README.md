# TestSite - Projeto de Testes Automatizados com Selenium e JUnit

Este projeto tem como objetivo realizar testes automatizados de funcionalidades em sites utilizando Selenium WebDriver e JUnit no ambiente Java. O projeto inclui diversos testes para validar o login, o envio de formulários, e interações com o carrinho de compras, entre outros.

## Estrutura do Código

O código está estruturado da seguinte forma:


- **TestSite.java**: Contém os testes automatizados para o site usando Selenium e JUnit. Os testes cobrem funcionalidades como login, interação com formulários e carrinho de compras.
  
- **pom.xml**: Arquivo de configuração do Maven, que define as dependências necessárias para o projeto, como Selenium WebDriver, JUnit e outros plugins.

## Como Executar

1. **Pré-requisitos**:
   - Java 17 ou superior instalado no seu computador.
   - WebDriver do navegador desejado (ChromeDriver, por exemplo) instalado e configurado.
   - Maven instalado para gerenciar dependências.

2. **Passos**:
   1. Clone o repositório do projeto:
      ```bash
      git clone <URL do repositório>
      ```
   2. Navegue até a pasta do projeto:
      ```bash
      cd TestSite
      ```
   3. Compile o projeto usando Maven:
      ```bash
      mvn compile
      ```
   4. Execute os testes automatizados:
      ```bash
      mvn test
      ```

## Exemplo de Saída

Ao rodar os testes com Maven, você verá uma saída como a seguinte no console:


Isso indica que todos os testes foram executados com sucesso e passaram sem falhas.

## Contribuições

Contribuições para este projeto são bem-vindas! Para contribuir, siga os passos abaixo:

1. Faça um **fork** deste repositório.
2. Crie uma nova branch para a sua feature ou correção de bug:
   ```bash
   git checkout -b minha-nova-feature

### Detalhes Importantes:
- **Estrutura do Código**: A descrição clara da estrutura do seu projeto ajuda qualquer colaborador a entender como o código está organizado.
- **Exemplo de Saída**: Incluímos um exemplo de como seria a saída dos testes no terminal para ajudar os desenvolvedores a verificarem o que esperar.
- **Contribuições**: Um guia simples para qualquer pessoa que queira contribuir com melhorias para o projeto.

Esse `README.md` serve como um guia abrangente para quem for usar ou contribuir para o seu projeto. Se precisar de mais alguma coisa ou ajustes, só avisar!
Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
