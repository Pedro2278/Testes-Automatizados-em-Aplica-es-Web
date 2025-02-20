# TestSite - Projeto de Testes Automatizados com Selenium e JUnit

Este projeto tem como objetivo realizar testes automatizados de funcionalidades em sites utilizando Selenium WebDriver e JUnit no ambiente Java. O projeto inclui diversos testes para validar o login, o envio de formulários, e interações com o carrinho de compras, entre outros.

## Estrutura do Código

O código está estruturado da seguinte forma:

estSite/ ├── src/ │ └── TestSite.java # Arquivo principal com os testes automatizados ├── pom.xml # Arquivo de configuração do Maven └── README.md # Este arquivo de documentação


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

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSite.TesteSite
Testando login válido...
Testando login inválido...
Testando formulário preenchido corretamente...
Testando campos obrigatórios...
Testando adicionar produto ao carrinho...
Testando remover produto do carrinho...
-------------------------------------------------------
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.48 sec

Isso indica que todos os testes foram executados com sucesso e passaram sem falhas.

## Contribuições

Contribuições para este projeto são bem-vindas! Para contribuir, siga os passos abaixo:

1. Faça um **fork** deste repositório.
2. Crie uma nova branch para a sua feature ou correção de bug:
   ```bash
   git checkout -b minha-nova-feature

3 - Faça as modificações e commit as mudanças:

git commit -am 'Adicionando nova funcionalidade'

4 - Envie para o repositório remoto:

git push origin minha-nova-feature

5 - Crie um Pull Request para que possamos revisar suas alterações.
Certifique-se de que seu código esteja devidamente testado antes de enviar o pull request.

Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.


Agora, você pode copiar o conteúdo completo para o arquivo `README.md` do seu projeto. Se precisar de mais algum ajuste, estou à disposição!
