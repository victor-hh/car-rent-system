# car-rent-system

Repositório criado para a execução de projeto da disciplina de Sistemas de Gerência de Banco de Dados do curso de Ciência da Computação na Unisinos.

## Tecnologias

- Java 17
- SpringBoot
- Hibernate

## Como rodar o projeto

### PostgreSQL Database

Primeiro inicie o banco de dados, para isto execute o comando docker abaixo:

```sh
docker run -p 5432:5432 -v /tmp/database:/var/lib/postgresql/data -e POSTGRES_PASSWORD=1234 postgres
```

### Inicie o servidor

Para isto, execute o projeto através da interface de sua IDE de preferencia ou comando:

```sh
./gradlew bootRun 
```

## Diagramas

### Entidade Relacionamento

![diagrama_er](./doc/digrama_er)

### Classes

![diagrama_classes](./doc/digrama_classes)
