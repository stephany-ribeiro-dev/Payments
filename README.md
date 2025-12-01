## Payments API Rest

#### Objetivo:

Aplicação de pagamentos, onde os processamentos são realizados por tipo de pagamento, com regras específicas para cada tipo.
#### Tecnologias:

- Linguagem: Java 17
- Framework: SpringBoot 3.5.8
- Arquitetura: Hexagonal

#### Atividades propostas:

- [x] projeto no padrão Hexagonal
    - [x] Uso de separação de entidades de acordo com suas propriedades
    - [x] Validações de criação de entidades
    - [x] Uso de design patterns sobre aplicação de regras e serviços
    - [x] Uso de demais estruturas para adequação ao modelo Hexagonal
- [ ] Resolver issue de segurança que impede o acesso aos endpoints REST 
- [x] Criar endpoint REST POST para criação de pagamentos via json:
    - [x] Credit
    - [x] Debit
- [x] Organização dos endpoints REST de acordo com as regras do OpenApi 3.0
- [x] Tratamentos de error handler e exceptions
- [ ] Implementação testes unitários
- [ ] Implementação de logs para monitoramento

#### Referências:

- [Arquitetura Hexagonal, Fernanda Kipper.](https://conteudos.kipperdev.com.br/video-arquitetura-hexagonal-kipperdev)
- [Error handle validation](https://medium.com/@fingervinicius/how-to-handle-validation-errors-in-spring-boot-to-become-human-friendly-90bd2ec3ed6e)
- [Maven Repository](https://mvnrepository.com/)