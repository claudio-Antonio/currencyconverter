# Conversor de Moedas

Este projeto é um aplicativo Android desenvolvido para realizar a conversão de moedas utilizando taxas de câmbio em tempo real.

## Tecnologias Utilizadas

- Kotlin
- Jetpack Compose (Interface de Usuário)
- Ktor (Comunicação de Rede)
- Hilt (Injeção de Dependência)
- Kotlinx Serialization (Processamento de JSON)

## Configuração da API

O aplicativo consome dados da ExchangeRate-API. Para que o projeto funcione corretamente, é necessário possuir uma chave de API válida.

### Passo a passo para gerar a chave de API

1. Acesse o site oficial da ExchangeRate-API em https://www.exchangerate-api.com/.
2. Realize o cadastro criando uma conta gratuita.
3. Confirme seu endereço de e-mail através do link enviado pelo serviço.
4. Faça login na sua conta para acessar o painel de controle (Dashboard).
5. No painel, localize e copie o código exibido no campo "Your API Key".

### Onde configurar a chave no código

A chave deve ser configurada em um arquivo `.env` na raiz do projeto.

1. Crie um arquivo chamado `.env` na pasta raiz do projeto (mesma pasta onde está o arquivo `build.gradle.kts` principal).
2. Adicione o seguinte conteúdo ao arquivo:
   ```text
   API_KEY=SUA_CHAVE_AQUI
   ```

O sistema de build do Gradle lerá esta variável e a disponibilizará no código através do `BuildConfig.API_KEY`.

## Execução do Projeto

1. Abra o projeto no Android Studio.
2. Certifique-se de ter configurado a chave da API conforme descrito acima.
3. Sincronize os arquivos do Gradle (Gradle Sync).
4. Compile e execute o aplicativo em um emulador ou dispositivo Android físico.
