# **Backend - Gerenciador de Produtos**

Este é o backend do projeto de gerenciamento de produtos, desenvolvido com Spring Boot. Ele fornece uma API RESTful para gerenciar produtos, incluindo funcionalidades de criar, editar, excluir e listar produtos.

## **Funcionalidades da API**

- **GET /products**: Retorna todos os produtos.
- **GET /products/{id}**: Retorna um produto específico pelo ID.
- **POST /products**: Cria um novo produto.
- **PUT /products/{id}**: Atualiza um produto existente.
- **DELETE /products/{id}**: Exclui um produto.

## **Tecnologias Utilizadas**

- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **Spring Data JPA**: Para interação com o banco de dados.
- **Swagger**: Para documentação da API.
- **Banco de Dados H2**: Usado para armazenamento dos produtos em memória durante o desenvolvimento.
- **Lombok**: Para reduzir boilerplate code no Java.

## **Instalação e Execução**

### **1. Clonando o Repositório**

Clone o repositório para sua máquina local:

```bash
git clone https://github.com/amandaalvees/ProductManager.git
