

---

# 📦 Produtos API

> API REST didática desenvolvida em Java 21 e Spring Boot para o gerenciamento de um catálogo de produtos, utilizando persistência em banco de dados em memória.

---

## 🚀 Tecnologias e Ferramentas

* **Java 21**
* **Spring Boot 4.x** (Spring MVC)
* **Spring Data JPA**
* **H2 Database** (Banco de dados relacional em memória)
* **Lombok & Jakarta Persistence**
* **Maven**

---

## 🧠 Conceitos e Aprendizados Consolidados

Este projeto demonstra a aplicação prática de diversos conceitos fundamentais de desenvolvimento corporativo com Spring Boot:

* **Injeção de Dependência por Construtor:** Em vez de utilizar a anotação `@Autowired` diretamente no atributo da classe `ProdutoController`, o repositório é injetado via construtor. Essa é a abordagem recomendada pelo Spring Framework por facilitar testes unitários e garantir a imutabilidade dos componentes locais.
* **Geração Dinâmica de UUID:** Emprego da classe `UUID` nativa do Java para geração de chaves primárias do tipo texto (`String`), mitigando problemas comuns de previsibilidade associados a IDs sequenciais numéricos.
* **Derived Queries (Query Methods):** Utilização da capacidade do Spring Data JPA de gerar consultas SQL automaticamente a partir do nome do método declarado na interface (`findByNome`).
* **Mapeamento de Parâmetros de URL:** Uso combinado de `@PathVariable` (para identificação de recursos únicos) e `@RequestParam` (para filtros dinâmicos de busca através de Query Strings).

---

## 🛣️ Endpoints da API (Rotas)

A API escuta na porta padrão `8080`. O prefixo base para o gerenciamento é `/produtos`.

| Método | Endpoint | Parâmetro / Query | Descrição |
| --- | --- | --- | --- |
| **POST** | `/produtos` | Nenhum | Salva um novo produto no banco. |
| **GET** | `/produtos/{id}` | `id` (na URL) | Obtém os detalhes de um produto específico. |
| **GET** | `/produtos` | `?nome=NomeDoProduto` | Filtra produtos por correspondência de nome. |
| **PUT** | `/produtos/{id}` | `id` (na URL) | Atualiza os dados de um produto existente. |
| **DELETE** | `/produtos/{id}` | `id` (na URL) | Remove um produto do banco de dados. |

### 📝 Estrutura do Payload (JSON)

Para requisições de criação (**POST**) e atualização (**PUT**), utilize o seguinte formato de objeto corporativo:

```json
{
  "nome": "Teclado Mecânico",
  "descricao": "Teclado switch brown layout ABNT2",
  "preco": 349.90
}

```

*Nota: O campo `id` não precisa ser enviado no corpo da requisição ao criar um produto, pois a regra de negócio implementada no Controller gera o identificador de forma automatizada via `UUID`.*

---

## 🗄️ Integração com Banco de Dados e Testes Rápidos

A aplicação está configurada para mapear entidades automaticamente utilizando o Hibernate. O banco de dados relacional integrado opera em memória dinâmica.

* **Console Web do H2:** Disponível durante o tempo de execução no endereço `http://localhost:8080/h2-console`.
* **String de Conexão JDBC:** `jdbc:h2:mem:produtos`
* **Usuário:** `ga` | **Senha:** `password`

---

## 📂 Estrutura de Pacotes do Projeto

```text
src/main/java/com/github/gabrielpcdsi/ProdutosApi
│
├── controller/
│   └── ProdutoController.java      # Camada REST que expõe os endpoints HTTP
├── model/
│   └── Produto.java                # Entidade JPA mapeada para o banco de dados
├── repository/
│   └── ProdutoRepository.java     # Interface JPA de abstração de consultas
└── ProdutosApiApplication.java     # Classe de inicialização (Bootstrapping)

```

---

## 🛠️ Como Clonar e Executar

1. Baixe o código localmente:
```bash
git clone https://github.com/seu-usuario/ProdutosApi.git

```


2. Certifique-se de possuir o **JDK 21** configurado.
3. Execute o comando Maven para inicializar ou rode diretamente a classe `ProdutosApiApplication` por sua IDE:
```bash
./mvnw spring-boot:run

```



---
