# Processo Seletivo Maptriz

# API REST para Agenda de Contatos (Java + Angular)

Este projeto consiste no desenvolvimento de uma API REST em Java para gerenciar uma agenda de contatos, além de um front-end em Angular 23.5.0. O sistema segue boas práticas de Clean Code e Domain-Driven Design (DDD).

## 🏗 Arquitetura do Projeto

- **Back-end:** Java (Spring Boot) com uma base de dados SQL.
- **Front-end:** Angular 23.5.0 seguindo DDD e Clean Code.
- **Autenticação:** Via endpoint externo.
- **Notificações:** Envio de e-mails ao criar um contato.
- **Validações:** CPF e CEP válidos.

## 🖥 Back-end (Java + Spring Boot)

### 📂 Estrutura do Projeto

```
backend/
│── src/
│   ├── main/java/com/exemplo/agenda/
│   │   ├── application/  # Casos de uso
│   │   ├── domain/       # Entidades e repositórios
│   │   ├── infrastructure/ # Integração com banco e serviços
│   │   ├── presentation/  # Controllers e DTOs
│   ├── resources/
│   │   ├── application.yml  # Configuração do Spring Boot
```

### 📌 Funcionalidades
- CRUD de contatos (criação, edição, consulta e remoção).
- Validação de CPFs e CEPs inválidos.
- Integração com API externa para envio de e-mails.
- Tratamento global de exceções.

## 🎨 Front-end (Angular 23.5.0)

### 📂 Estrutura do Projeto

```
frontend/
│── src/
│   ├── app/
│   │   ├── core/       # Serviços e modelos
│   │   ├── features/   # Componentes específicos (CRUD de contatos)
│   │   ├── shared/     # Componentes reutilizáveis
│   ├── assets/
│   ├── environments/
```

### 📌 Funcionalidades
- Interface moderna e responsiva para gerenciar contatos.
- Formulários reativos com validações para CPF e CEP.
- Serviço centralizado de autenticação via API externa.
- Uso de RxJS para manipulação assíncrona.
- Padrão de diretivas e componentes reutilizáveis.

## 🚀 Tecnologias Utilizadas
- **Back-end:** Java, Spring Boot, Hibernate, Flyway, PostgreSQL, Lombok.
- **Front-end:** Angular 23.5.0, RxJS, Angular Material.
- **Ferramentas:** Docker, Postman, Swagger.

## Introdução

O processo seletivo é caracterizado por um projeto full-stack sub-divido em dois projetos - Back e Front.

Ambos projetos (e seus respectivos READMEs) estão inclusos nesse repositório. Por favor, leia as instruções de cada um atentamente.

É de suma importância que os dois projetos comuniquem-se entre si e que ambos rodem em sua máquina (ou em uma máquina virtual que possa ser apresentada).

Os projetos contêm, também, estruturas básicas para o desenvolvimento em Angular (Front) e Spring Boot/Java (Back). No entanto, apesar dessas tecnologias serem as que melhor se encaixam com o dia-a-dia da Maptriz, sinta-se à vontade para utilizar outras tecnologias se desejar.

Dito isso, caso deseje utilizar os projetos providenciados, crie um *fork* desse repositório no GitHub para isso. No entanto, se decidir por utilizar outras tecnologias, pode criar um repositório novo em seu GitHub para seu(s) projeto(s).

Em ambos os casos, evite mencionar a Maptriz em seu projeto/fork.

## Executando os Desafios

A escolha de ferramentas para o desenvolvimento ficará a seu critério.

Não se preocupe caso não consiga concluir 100% dos dois desafios até a data final estabelecida no e-mail que lhe foi enviado. Procure concluir o máximo possível dentro do prazo estabelecido. A equipe técnica da Maptriz realizará a avaliação mesmo se os desafios estiverem incompletos.

Fique à vontade para tirar quaisquer dúvidas relacionadas ao processo e os desafios através do e-mail processoseletivo@maptriz.com.br.

## Avaliação

Após concluir os projetos, tenha certeza de detalhar as tecnologias utilizadas em seus respectivos READMEs. Após isso, envie os links para os projetos no GitHub para o e-mail processoseletivo@maptriz.com.br.

A equipe técnica da Maptriz realizará um *Code Review* de seus projetos e, eventualmente, marcará uma reunião remota para discutir a sua solução dos desafios.

## Conclusão

Boa sorte no desafio! A equipe Maptriz deseja muito sucesso para você!