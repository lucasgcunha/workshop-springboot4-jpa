# Workshop Spring Boot com JPA & Hibernate

[![Java Version](https://img.shields.io/badge/Java-25-orange)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0-brightgreen)](https://spring.io/projects/spring-boot)
[![JPA/Hibernate](https://img.shields.io/badge/JPA-Hibernate-blue)](https://hibernate.org/)
[![Deploy on Render](https://img.shields.io/badge/Live%20Demo-Render-informational)](https://workshop-springboot4-jpa-zee9.onrender.com)

Este projeto é uma API RESTful desenvolvida para demonstrar a implementação de um modelo de domínio complexo utilizando **Spring Boot 4** e **JPA/Hibernate**.

---

## 🌐 Deploy
A aplicação está hospedada no **Render** e pode ser acessada publicamente através do link abaixo:
> **API URL:** [https://workshop-springboot4-jpa-zee9.onrender.com](https://workshop-springboot4-jpa-zee9.onrender.com)

*(Nota: Por ser uma hospedagem gratuita, a primeira requisição pode demorar alguns segundos para "acordar" o servidor).*

---

## 🚀 Tecnologias Utilizadas

* **Java 25**
* **Spring Boot 4**
* **Spring Data JPA**
* **Hibernate** (Mecanismo de ORM)
* **H2 Database** (Memória) / **PostgreSQL** (Produção)
* **Maven**

## 📋 Funcionalidades

A aplicação consiste em um sistema de pedidos (e-commerce simplificado):
- **Gestão de Usuários**: Cadastro e listagem de clientes.
- **Fluxo de Pedidos**: Registro de pedidos, status e pagamentos.
- **Catálogo de Produtos**: Categorização e associação de produtos.
- **Itens de Pedido**: Mapeamento de tabelas associativas com atributos extras.

## 🔧 Como Executar Localmente

### Passo a passo
1. Clone o repositório:
   ```bash
   git clone https://github.com/lucasgcunha/workshop-springboot4-jpa.git
2. Entre na pasta do projeto:
   ```bash
   cd workshop-springboot4-jpa
3. Clone o repositório:
   ```bash
   mvn spring-boot:run

## 🔌 Endpoints da API (Teste no Render)

Você pode testar a API rodando ao vivo através dos links abaixo:

| Método | Endpoint | Link de Acesso Direto |
| :--- | :--- | :--- |
| **GET** | `/users` | [https://workshop-springboot4-jpa-zee9.onrender.com/users](https://workshop-springboot4-jpa-zee9.onrender.com/users) |
| **GET** | `/users/{id}` | [https://workshop-springboot4-jpa-zee9.onrender.com/users/1](https://workshop-springboot4-jpa-zee9.onrender.com/users/1) |
| **GET** | `/orders` | [https://workshop-springboot4-jpa-zee9.onrender.com/orders](https://workshop-springboot4-jpa-zee9.onrender.com/orders) |
| **GET** | `/products` | [https://workshop-springboot4-jpa-zee9.onrender.com/products](https://workshop-springboot4-jpa-zee9.onrender.com/products) |
| **GET** | `/categories` | [https://workshop-springboot4-jpa-zee9.onrender.com/categories](https://workshop-springboot4-jpa-zee9.onrender.com/categories) |

> **Nota:** Caso o link não carregue de imediato, aguarde cerca de 30 segundos. O **Render** coloca a aplicação em "modo de espera" após períodos de inatividade na versão gratuita.

## 📋 Autor

### Lucas Cunha

- LinkedIn: [link](https://linkedin.com/in/lucas-granier-623504263)
