# SOAT-fast-food

A seguir um breve guia referente a aplição:

Link da documentação no Miro:
https://miro.com/app/board/uXjVL2juGC0=/

Link do video no youtube: https://youtu.be/E6mPFZskTTQ

Aplicação fui desenvolvida em Java na sua versão 21 e usando o framework Spring boot.

### Requisitos:
```
Java 21
Docker
intellij
Postman
```

## Executando a aplicação:

Para subir a aplicação após ter realizando o "git clone", abra o projeto no intellij e usando o terminal execute o seguinte comando para gerar o build do projeto:
```
mvn clean package
```

Após gerado o build, será o momento de criar a imagem do docker com o seguinte comando de dentro da raiz do projeto:
```
docker compose build --no-cache
```
Finalizado a criação da image execute o seguinte comando para subir os containers e a aplicação + banco de dandos Postgres:
```
docker compose up
```

Obs: Caso no momento da subida a execução terminei informando uma mensagem de "*unhealthy*" do banco postgres, simplesmente execute o comando "*docker compose up*" novamente para finalizar a subida da aplicação.


### Postman
Na raiz do projeto é possivel encontrar um arquivo:
```
SOAT-FastFood.postman_collection.json
```
Com as consultas que eu realizei no video usando o postman, para usa-las basta importar no postman.
