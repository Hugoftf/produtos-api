# Projeto API

![imagem local](/imagem_readme/bancodedados/springframework.png)

 - [Sobre](#Sobre) 
 - [Primeiros passos](#Primeiros-Passos)
 - [Configurando Banco de Dados](#Banco-de-Dados)
 - [Mapeamento JPA](#Mapeamento-JPA)
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

## Mapeamento JPA

 Comecei mapeando minha classe Produtos, utilizando a anotação @Entity para marca-lá como entidade persistente,ou seja, ela representará uma tabela no banco de dados. A anotação @Table é utilizada para especificar o nome tabela no banco de dados, ela não é obrigatória se a tabela tiver o mesmo nome da classe(a JVM entende), seguindo para os campos, a anotação @Column é usada para especificar e customizar o mapeamento de um campo ou atributo de uma classe de entidade para uma coluna de uma tabela no banco de dados, ela permite voce defenir constrains nas colunas também, não é obrigatória se o nome da columna for igual ao nome da variavel, por fim a anotação @Id, é usada para marcar um campo ou atributo em uma classe de entidade como sendo o identificador único (ou chave primária) dessa entidade, ou seja, o campo que será utilizado para identificar de forma única cada registro na tabela do banco de dados: 

![imagem local](/imagem_readme/JPA/classeproduto.png)

Em seguido criei a interface ProdutoRepository no pacote repository, ela tem a anotação @Repository usada para marcar uma classe ou interface como um repositório responsável por acessar dados em um banco de dados ou qualquer outro tipo de armazenamento(Não é obrigatória), ela extends a interface JpaRepository, onde eu preciso indicar qual será a entidade e a classe do meu id, aqui estão todos os metodos para manipular minhas aplicações: 

![imagem local](/imagem_readme/JPA/interfaceProdutoRepository.png)

No próximo passo, eu atualizei minha classe ProdutoController, adicionando um campo de ProdutoRepository e um construtor para iniciar o campo (Quando você usa a anotação @RestController no Spring Framework, juntamente com a injeção de dependência, você não precisa instanciar manualmente o seu repositório porque o Spring gerencia automaticamente os objetos de controle e serviço da sua aplicação. Isso é possível por causa do mecanismo de injeção de dependência (DI), que é uma das principais funcionalidades do Spring), agora no meu metodo salvar eu posso utilizar os metodos da minha interface ProdutoRepository para salvar a entidade no meu banco de dados e também estou gerando um código random da classe UUID para o meu campo ID: 

![imagem local](/imagem_readme/JPA/classeProdutoController.png)

Por fim os testes para vê o funcionamento, depois de rodar o programa sem nenhum problema, retornaremos ao postman para realizar o post com esse novo retorno:

![imagem local](/imagem_readme/JPA/postmanatt.png)


E agora no meu banco de dados H2 eu consigo visualizar o meu produto:

![imagem local](/imagem_readme/JPA/retornoh2.png)

## Tecnologias Usadas
[Java](https://pt.wikipedia.org/wiki/Java_(linguagem_de_programa%C3%A7%C3%A3o)) / [Spring](https://pt.wikipedia.org/wiki/Spring_Framework)  / [Postman](https://en.wikipedia.org/wiki/Postman_(software))  
