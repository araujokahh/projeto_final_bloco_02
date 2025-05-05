# FarmaJava - Sistema de Cadastro e Gerenciamento de Produtos Farmacêuticos.

Projeto desenvolvido para o Teste Performance Goal - Bloco 02 do Bootcamp FullStack Web Java da Generation Brasil, com foco em criar uma aplicação funcional para auxiliar no cadastro e gerenciamento de produtos farmacêuticos.


## 👨‍👦‍👦 Descrição do Projeto

A FarmaJava tem como propósito auxiliar no cadastro de novos produtos de um e-commerce de farmácia, facilitando a localização dos produtos pelos clientes através da plataforma de vendas. 


### 🎯 Objetivo

A aplicação foi idealizada atender as necessidades de venda e entrega dos produtos da FarmaJava, visando facilitar o cadastro de novos produtos e a localização dos itens pelos clientes através da plataforma online, gerando um aumento nas vendas da empresa. A aplicação permite realizar o cadastro de itens individuais ou em lotes, realizar buscas gerais ou através de filtros, atualizar informações ou deletar. 


## 👥 Público-alvo

O público-alvo deste sistema são clientes da FarmaJava, buscando agilizar a localização dos produtos e proporcionar uma experiência de compra agradável e satisfatória.


## ❗ Problemas que o projeto visa resolver:

O sistema FarmaJava foi desenvolvido para solucionar diversos desafios enfrentados pela empresa na gestão de produtos do e-commerce. Dentre as principais soluções oferecidas, destacam-se:
- Organização do estoque dos produtos disponíveis na plataforma online
- Fácil localização dos produtos pelos usuários
- Aumento das vendas
- Segurança e confidencialidade
- Facilidade de atualização e manutenção de informações
- Acessibilidade
- Suporte ao crescimento


## 🗃️ Entidades e Atributos

### Banco de dados (`db_farmacia`)

### Categoria (`tb_categoria`)
- `id`: Identificador único
- `nome`: Nome da categoria do medicamento ou item de higiene 
- `descricao`: Descrição da finalidade do produto 


### Produtos (`tb_produtos`)
- `id`: Identificador único
- `nome`: Nome do produto/fabricante
- `quantidade`: Quantidade em estoque
- `preco`: Preço do produto
- `categoria_id`: Referência à categoria associada ao produto (relacionamento)


## 🔧 Funcionalidades (CRUD)

### Categoria
- **Post**: Cadastrar nova categoria
- **PostLote**: Cadastrar categoria por lote
- **Get**: Visualizar todas as categorias (com opção de filtro por ID ou nome)
- **Post**: Editar informações de uma categoria existente
- **Delete**: Excluir uma categoria 

### Produto
- **Post**: Cadastrar novo produto
- **PostLote**: Cadastrar produtos por lote
- **Get**: Visualizar todos os produtos (com opção de filtro por ID ou nome)
- **Post**: Editar informações de um produto já cadastrado
- **Delete**: Excluir um produto


## 💻 Tecnologias Utilizadas

| Tecnologia      | Descrição                                           |
|-----------------|-----------------------------------------------------|
| Java            | Linguagem principal do backend                      |
| Spring Boot     | Framework para desenvolvimento web                  |
| MySQL           | Banco de dados relacional                           |
| JPA/Hibernate   | ORM para mapeamento objeto-relacional               |
| Maven           | Gerenciador de dependências                         |
| Insomnia        | Testes de endpoints RESTful                         |


## 🧪 Testes com Insomnia

Um arquivo .yaml com as requisições já prontas está disponível no repositório.
Basta importar no Insomnia e começar a testar!

## ▶️ Como Rodar o Projeto
1. Clone o repositório
2. Configure o banco de dados MySQL no arquivo application.properties:
    Abra o arquivo src/main/resources/application.properties e configure os parâmetros de conexão com o banco de dados MySQL de acordo com o que está configurado no seu ambiente local:

    spring.datasource.url=jdbc:mysql://localhost:3306/db_farmacia
    spring.datasource.username=seu_usuario
   --> Substitua 'seu_usuario' pelo nome de usuário do MySQL da sua máquina

   spring.datasource.password=sua_senha
   --> Substitua 'sua_senha' pela senha do usuário do MySQL na sua máquina

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

Importante: Lembre-se de substituir seu_usuario e sua_senha pelos dados corretos do MySQL configurados na sua máquina.

3. Execute a aplicação:
    Pela IDE:
    - Abra o arquivo ProjetoFinalBloco02Application.java (classe principal do Spring Boot).

    - Clique com o botão esquerdo do mouse em cima do arquivo.

    - Procure e clique na opção Run Java para rodar a aplicação.



📅 Projeto iniciado em: **05/05/2025**


---

## 📌 Observações

Este projeto é voltado para fins educacionais e representa uma solução inicial que pode ser expandida com outras features no futuro.

---
