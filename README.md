#  Buscador de CEP (ViaCep)

Repositório de um projeto que consome dados da api externa ViaCep.
Site: https://viacep.com.br/

## Sumário

* [Business Rules](#business-rules)
* [Tecnologias e Ferramentas utilizadas](#tecnologias-e-ferramentas-utilizadas)
* [Execução do projeto](#execução-do-projeto)
    * [Por CLI](#executando-manualmente-via-cli)
* [Acessando a aplicação](#acessando-a-aplicação)
* [Endpoints](#endpoints)
    * [Buscar Cep](#buscar-cep)

## Business Rules

Regras de Negócio:
- Ao executar uma requisição, deve retornar todas as informações referente ao cep pesquisado;

## Tecnologias e Ferramentas utilizadas

[voltar ao início](#sumário)

* **Java 17**
* **Spring Boot 3**
* **API REST**
* **IntelliJ IDEA Community Edition**
* **Insomnia**
* **Maven**

## Execução do projeto

[voltar ao início](#sumário)

Para rodar a aplicação, será necessário ter instalado:

* **Java 17**
* **Maven - utilizei a versão 3.9.4**

## Executando manualmente via CLI

[voltar ao início](#sumário)

Primeiramente clone o projeto com o comando:

- Clonar com SSH

```shell
git clone git@github.com:rafaelcloud83/consumo-viacep.git
```

- OU Clonar com HTTPS

```shell
git clone https://github.com/rafaelcloud83/consumo-viacep.git
```

Antes da execução do projeto, realize o `build` da aplicação indo no diretório raiz e executando o comando:

```shell
mvn clean package
```

Para executar o projeto com Maven, basta entrar no diretório raiz do projeto, e executar o comando:

```shell
mvn spring-boot:run
```

## Acessando a aplicação

[voltar ao início](#sumário)

Para acessar a aplicação, basta acessar a URL(BaseURL):

http://localhost:8080/api

## Endpoints

### Buscar Cep

[voltar ao início](#sumário)

**GET** http://localhost:8080/api/cep

Payload:

```json
{
  "cep": "01001000"
}
```

Resposta:

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```