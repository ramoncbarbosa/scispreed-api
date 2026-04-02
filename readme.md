# scispread — pt

> 🇧🇷 Português | [🇺🇸 English](#scispread--en)

Plataforma de gestão e publicação de pesquisas científicas para pequenos grupos acadêmicos.

API REST documentada via Swagger UI em `/swagger-ui.html`.

---

## Stack — pt

### Backend

| Tecnologia            | Versão | Função                        |
|-----------------------|--------|-------------------------------|
| Java                  | 25     | Linguagem principal           |
| Spring Boot           | 4.x    | Framework base                |
| Spring Web            | —      | Camada REST / MVC             |
| Spring Security       | —      | Autenticação e autorização    |
| Spring Validator      | —      | Validação de entrada          |
| Spring Boot Dev Tools | —      | Hot reload em desenvolvimento |
| Lombok                | latest | Redução de boilerplate        |
| Maven                 | 3.9+   | Gerenciamento de dependências |
| OpenAPI / Swagger     | 3.x    | Documentação da API           |

### Dados & Persistência

| Tecnologia      | Versão | Função               |
|-----------------|--------|----------------------|
| PostgreSQL      | 16+    | Banco relacional     |
| JPA / Hibernate | —      | ORM                  |
| Flyway          | latest | Migrations de schema |
| Redis           | 7+     | Cache distribuído    |

### Infra

| Tecnologia       | Versão | Função                |
|------------------|--------|-----------------------|
| Docker / Compose | latest | Containerização local |
| GitHub Actions   | —      | CI/CD pipeline        |

### Testes

| Tecnologia | Versão | Função                        |
|------------|--------|-------------------------------|
| JUnit 5    | 5.x    | Testes unitários e integração |
| Grafana K6 | latest | Testes de carga e estresse    |

---

## Pré-requisitos

- Java 25 (recomendado via [SDKMAN](https://sdkman.io))
- Maven 3.9+ ou o wrapper `./mvnw` incluso
- Docker + Docker Compose

---

## Setup local

```bash
# 1. clone o repositório
git clone https://github.com/ramoncbarbosa/sci-spread.git
cd sci-spread

# 2. suba PostgreSQL e Redis
docker compose up -d

# 3. rode a aplicação
./mvnw spring-boot:run
```

API disponível em `http://localhost:8080`  
Swagger UI em `http://localhost:8080/swagger-ui.html`

---

## Rodando testes

```bash
# todos os testes
./mvnw test

# classe específica
./mvnw test -Dtest=NomeDaClasseTest

# testes de carga (requer k6 instalado)
k6 run k6/load-test.js
```

---

## Roadmap — pt

- [x] Estrutura base (Spring Boot + Docker)
- [ ] Módulo de autenticação e gestão de usuários
- [ ] CRUD de grupos de pesquisa
- [ ] Submissão e revisão de artigos
- [ ] Pipeline CI/CD com GitHub Actions
- [ ] Cobertura de testes > 80%
- [ ] RabbitMQ — mensageria assíncrona *(em avaliação)*

---

## Licença

MIT


---

# scispread — en

> [🇧🇷 Português](#scispread--pt) | 🇺🇸 English

Platform for managing and publishing scientific research for small academic groups.

REST API documented via Swagger UI at `/swagger-ui.html`.

----

## Stack — en

### Backend

| Technology            | Version | Purpose                        |
|-----------------------|---------|--------------------------------|
| Java                  | 25      | Main language                  |
| Spring Boot           | 4.x     | Base framework                 |
| Spring Web            | —       | REST / MVC layer               |
| Spring Security       | —       | Authentication & authorization |
| Spring Validator      | —       | Input validation               |
| Spring Boot Dev Tools | —       | Hot reload in development      |
| Lombok                | latest  | Boilerplate reduction          |
| Maven                 | 3.9+    | Dependency management          |
| OpenAPI / Swagger     | 3.x     | API documentation              |

### Data & Persistence

| Technology      | Version | Purpose             |
|-----------------|---------|---------------------|
| PostgreSQL      | 16+     | Relational database |
| JPA / Hibernate | —       | ORM                 |
| Flyway          | latest  | Schema migrations   |
| Redis           | 7+      | Distributed cache   |

### Infra

| Technology       | Version | Purpose                |
|------------------|---------|------------------------|
| Docker / Compose | latest  | Local containerization |
| GitHub Actions   | —       | CI/CD pipeline         |

### Testing

| Technology | Version | Purpose                  |
|------------|---------|--------------------------|
| JUnit 5    | 5.x     | Unit & integration tests |
| Grafana K6 | latest  | Load & stress testing    |

---

## Prerequisites

- Java 25 (recommended via [SDKMAN](https://sdkman.io))
- Maven 3.9+ or the included `./mvnw` wrapper
- Docker + Docker Compose

---

## Local setup

```bash
# 1. clone the repository
git clone https://github.com/ramoncbarbosa/sci-spread.git
cd sci-spread

# 2. start PostgreSQL and Redis
docker compose up -d

# 3. run the application
./mvnw spring-boot:run
```

API available at `http://localhost:8080`  
Swagger UI at `http://localhost:8080/swagger-ui.html`

---

## Running tests

```bash
# all tests
./mvnw test

# specific class
./mvnw test -Dtest=NomeDaClasseTest

# load tests (requires k6 installed)
k6 run k6/load-test.js
```

---

## Roadmap — en

- [x] Project base structure (Spring Boot + Docker)
- [ ] Authentication and user management module
- [ ] Research group CRUD
- [ ] Paper submission and peer review
- [ ] CI/CD pipeline with GitHub Actions
- [ ] Test coverage > 80%
- [ ] RabbitMQ — async messaging *(under evaluation)*

---

## License

MIT