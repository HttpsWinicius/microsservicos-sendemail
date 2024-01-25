## Documentação da API
### API Rest de Envio de E-mails em Java
Este projeto consiste em um microsserviço de *API Rest* desenvolvida em *Java 17* no ecossistema *Spring* para facilitar o envio de e-mails.

O endpoint principal é denominado **/sending-email**.


## Instalação

Configurações Iniciais

Antes de começar a usar a API, certifique-se de que as seguintes dependências estão instaladas:

```bash
  Java JDK 8 ou superior
  Maven
```

### Clone o repositório:

```bash
git clone https://github.com/HttpsWinicius/microsservicos-sendemail.git
```
### Navegue até o diretório do projeto:
Compile o projeto com o Maven:

```bash
mvn clean install
```

### Execute a aplicação:

Na sua IDE de preferência

```bash
Run EmailApplication
A API estará em execução em http://localhost:8081.
```
#### Disparar um e-mail

```http
  POST /sending-email
```

| Parâmetro   | Tipo       | Descrição                                              |
| :---------- | :--------- | :----------------------------------------------------- |
| `ownerRef`  | `string`   | **Obrigatório**. O nome de quem está enviando o e-mail |
| `emailFrom` | `string`   | **Obrigatório**. O endereço de e-mail do remetente     |
| `emailTo`   | `string`   | **Obrigatório**. O endereço de e-mail do destinatário  |
| `subject`   | `string`   | **Obrigatório**. O assunto do e-mail                   |
| `text`      | `string`   | **Obrigatório**. O corpo do e-mail                     |

Certifique-se de substituir os valores nos parâmetros de exemplo pelos seus próprios valores.

#### Retorna o item

    "emailId": ID do disparo,
    "sendDateEmail": Data do disparo,
    "statusEmail": Status do disparo


## Licença

Este projeto está licenciado sob a *MIT License*.

## Por Winicius Souza

[![GitHub license](https://img.shields.io/badge/linkedin-green.svg)](https://www.linkedin.com/in/winicius-dev/)
