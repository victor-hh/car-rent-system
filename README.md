# car-rent-system
Repositório criado para a execução de projeto da disciplina de Sistemas de Gerência de Banco de Dados do curso de Ciência da Computação na Unisinos.


# Rodando Postgress
Para rodar o postgress basca executar o comando docker abaixo:
```
docker run -p 5432:5432 -v /tmp/database:/var/lib/postgresql/data -e POSTGRES_PASSWORD=1234 postgres
```
