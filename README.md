# Projeto API

![imagem local](/imagem_readme/bancodedados/springframework.png)

 - [Sobre](#Sobre) 
 - [Primeiros passos](#Primeiros-Passos)
 - [Configurando Banco de Dados](#Banco-de-Dados)
 - [Tecnologias](#tecnologias-usadas)


## Sobre

 Um exemplo de criação e uso básico de uma API com o spring. Utilizei o site "https://start.spring.io/" para criar as configurações do meu projeto:

![imagem local](imagem_readme/start_spring.png)

No site você consegue configurar que tipo de dependência, linguagem, versão, etc. Para este projeto vou utilzar um banco h2 em memória para exemplicar minha API.

## Primeiros Passos

 Antes de começar os trabalhos, realizei um teste de hello world para vê se estava tudo Ok, criei um metodo hello world que retorna uma string com a anotação Get mapping: 

![imagem local](imagem_readme/metodo_helloworld.png)

Rodou perfeitamente, e retornou: 

![imagem local](imagem_readme/helloworld.png)

Comecei a preencher meu projeto, Fiz a classe Produtos, ela será minha base para ser manipulada na minha API:

![imagam local](/imagem_readme/classe_produtos/atributos.png)

Criei a Classe ProdutosController com a anotação @RestController, ela servirá como uma ponte através de metodos que fazem requisições: 

![imagam local](/imagem_readme/classe_controller/post_salvar.png)

Para testar meus metodos eu utilizei o aplicativo Postman, Com ele, você pode enviar requisições HTTP para seus servidores, simular o comportamento de clientes em um ambiente de desenvolvimento e visualizar as respostas. 

![imagam local](/imagem_readme/postman/postman_salvar1.png).

No app, para testar, você utiliza a url do servidor local junto com a requisição que você defeniu na classe ProdutosController. No caso agora eu vou utilizar o Post, Você digita os campos definidos na classe produtos corretamente no formato Json, depois disso a magia acontece, se tudo estiver correto, ele retorna o protudo criado e o código 200 Ok. 

## Banco de Dados

 Para configurar meu banco de dados eu utilizei o arquivo [Yamal](https://pt.wikipedia.org/wiki/YAML), é de mais fácil compreensão e evita repetição de código. Fiz a configuração padrão do Spring:

 ![imagem local](/imagem_readme/bancodedados/configuração.png)

 Nesse projeto estou utilizando um banco de dados em memória H2, criei um arquivo sql com o comando de criar uma tabela de produto com os atributos da minha classe produto, assim, toda vez que eu iniciar o meu spring ele criára a tabela:

![imagem local](/imagem_readme/bancodedados/configuração2.png)

Hora de testar!! Depois de iniciar sem erros, no [browser](https://tecnoblog.net/responde/o-que-e-um-browser/) voce deve digitar o http do local host em conjunto com o path do console h2 da configuração do arquivo yml, ele retornará mais ou menos isso:

![imagem local](/imagem_readme/bancodedados/console.png)

Se estiver tudo certo, irá retornar a tela inicia com o comando sql de criar a tabela:

![imagem local](/imagem_readme/bancodedados/bancodedadostelainicial.png)

## Tecnologias Usadas
[Java](https://pt.wikipedia.org/wiki/Java_(linguagem_de_programa%C3%A7%C3%A3o)) / [Spring](https://pt.wikipedia.org/wiki/Spring_Framework)  / [Postman](https://en.wikipedia.org/wiki/Postman_(software))  
