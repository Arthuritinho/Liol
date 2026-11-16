## Estrutura de Pastas e Pacotes

O projeto segue o padrão de diretórios do **Apache Maven** combinado com uma **Arquitetura em Camadas** voltada para Programação Orientada a Objetos:

```text
LIOL/
├── pom.xml                                  # Dependências Maven (MySQL Connector/J, Mail, BCrypt) e configuração do compilador
├── README.md                                # Documentação estrutural e guia de configuração
├── .gitignore                               # Regras de arquivos locais ignorados pelo Git
├── database/                                # Scripts de banco de dados relacional
│   └── schemaLiol.sql                       # Script DDL oficial do banco MySQL (tabelas, restrições, triggers e procedures)
├── docs/                                    # Documentação acadêmica, diagramas UML e MER/DER
└── src/
    ├── main/
    │   ├── java/
    │   │   └── br/com/liol/
    │   │       ├── main/                    # Ponto de entrada e inicialização da aplicação
    │   │       ├── ui/                      # Camada de apresentação (interface gráfica em Java Swing)
    │   │       ├── business/                # Camada de negócio (regras de domínio da academia)
    │   │       ├── service/                 # Camada de serviços (integrações externas, e-mail SMTP e autenticação)
    │   │       ├── data/                    # Camada de dados (conexão JDBC e persistência no MySQL)
    │   │       ├── entities/                # Camada de domínio (entidades e enumerações do sistema)
    │   │       ├── exceptions/              # Exceções personalizadas da aplicação
    │   │       └── utils/                   # Utilitários e funções auxiliares reutilizáveis
    │   └── resources/
    │       ├── assets/                      # Imagens, ícones e logotipos da interface gráfica
    │       └── config/                      # Moldes de arquivos de configuração de ambiente
    │           ├── db.properties.example    # Molde de configuração do banco de dados MySQL
    │           └── email.properties.example # Molde de configuração do servidor de e-mail
    └── test/
        ├── java/                            # Testes automatizados da aplicação
        └── resources/                       # Recursos auxiliares para testes
```

### Responsabilidade de Cada Pasta e Pacote

| Pasta / Pacote | Objetivo na Arquitetura |
| :--- | :--- |
| **`br.com.liol.main`** | Contém o ponto de entrada da aplicação, responsável por configurar o visual da interface Swing, inicializar recursos essenciais e abrir a primeira tela do sistema. |
| **`br.com.liol.ui`** | Concentra os componentes visuais em Java Swing (janelas, painéis, diálogos e tabelas). Captura ações do usuário, exibe mensagens de retorno e delega o processamento às camadas de negócio e serviço, sem conter comandos SQL ou regras de domínio. |
| **`br.com.liol.business`** | Implementa as regras de negócio específicas da academia, como unicidade de CPF, exigência de credenciais profissionais por cargo (CREF/CRA), restrições de horário de funcionamento e registro de ponto, regras de matrícula, cálculos de planos e gestão de treinos. |
| **`br.com.liol.service`** | Gerencia serviços transversais e integrações externas que não pertencem a uma única entidade de negócio, como disparo de e-mails (confirmação de cadastro e recuperação de senha), controle de sessão e autenticação. |
| **`br.com.liol.data`** | Isola a comunicação com o banco de dados MySQL via JDBC. Gerencia o ciclo de vida da conexão, a execução de consultas parametrizadas, o controle de transações (`commit` e `rollback`) e a chamada de rotinas armazenadas no banco. |
| **`br.com.liol.entities`** | Modela os conceitos e dados do domínio da academia aplicando os pilares da Programação Orientada a Objetos (abstração, herança, encapsulamento, polimorfismo e enumerações). |
| **`br.com.liol.exceptions`** | Define exceções específicas para representar violações de regras de negócio e restrições de acesso, separando falhas de domínio de erros técnicos de banco de dados ou infraestrutura. |
| **`br.com.liol.utils`** | Reúne funções auxiliares independentes de estado, como validação de documentos (CPF e registros profissionais), leitura de arquivos de configuração (`.properties`), manipulação de datas/horas e criptografia de senhas. |
| **`src/main/resources/assets`** | Armazena arquivos estáticos de mídia carregados pelo *classpath* do Maven para composição visual das telas. |
| **`src/main/resources/config`** | Guarda os moldes de configuração (`.example`) versionados no Git, que servem de base para os arquivos reais criados localmente em cada máquina. |
| **`database/`** | Centraliza os scripts SQL versionados para criação e manutenção da estrutura do banco de dados no MySQL. |
| **`docs/`** | Armazena diagramas de modelagem (UML, MER/DER) e especificações técnicas da equipe. |

---

## Arquivos Sensíveis ao Ambiente (Variam por Máquina, Eclipse e JDK)

Ao clonar o projeto em diferentes computadores da equipe, alguns arquivos dependem da configuração local do **Eclipse IDE**, da **versão do JDK instalada** ou das **credenciais reais de cada integrante**:

| Arquivo / Pasta | Origem | Variação entre Máquinas | Regra no Git |
| :--- | :--- | :--- | :--- |
| **`src/main/resources/config/db.properties`** | Criado localmente a partir de `db.properties.example` | Cada integrante possui usuário, senha e porta próprios no MySQL local. | **Ignorado (`.gitignore`)** — apenas o `.example` é versionado. |
| **`src/main/resources/config/email.properties`** | Criado localmente a partir de `email.properties.example` | Credenciais reais da conta SMTP usada nos testes de envio de e-mail. | **Ignorado (`.gitignore`)** — apenas o `.example` é versionado. |
| **`.project`** | Gerado automaticamente pelo Eclipse IDE | Registra o nome e as configurações de natureza (Java/Maven) do projeto no *workspace* local. | **Ignorado (`.gitignore`)** — recriado ao importar via Maven. |
| **`.classpath`** | Gerado automaticamente pelo Eclipse IDE | Aponta para o caminho exato da **JRE System Library** (ex.: JavaSE-17, JavaSE-21) e do repositório local `.m2` na máquina do desenvolvedor. | **Ignorado (`.gitignore`)** — recriado pelo Eclipse ao sincronizar o Maven. |
| **`.settings/`** | Gerado automaticamente pelo Eclipse IDE | Guarda preferências locais do compilador e codificação do editor Eclipse de cada máquina. | **Ignorado (`.gitignore`)**. |
| **`target/`** | Gerado pelo Maven durante a compilação | Contém os arquivos compilados pelo JDK local e o pacote executável gerado. | **Ignorado (`.gitignore`)**. |
| **`pom.xml`** *(tag `<maven.compiler.release>`)* | Versionado na raiz do projeto | Configurado originalmente para **Java 21**. Caso a equipe padronize outra versão (ex.: Java 17), deve ser ajustado aqui para manter compatibilidade entre todos os JDKs. | **Versionado** — alteração deve ser combinada entre o grupo. |

---

## Como Configurar o Projeto e Aplicar Dados Reais em uma Nova Máquina

### 1. Preparar o Banco de Dados Local
Execute o script `database/schemaLiol.sql` no servidor MySQL local (via MySQL Workbench, DBeaver ou terminal) para criar o banco de dados com todas as tabelas, *triggers* e *procedures*.

### 2. Importar e Sincronizar no Eclipse IDE
1. Acesse **File → Import... → Maven → Existing Maven Projects**, selecione a pasta raiz `LIOL` e clique em **Finish**.
2. Confirme se a **JRE System Library** do projeto corresponde ao **JDK 21** (ou à versão definida no `pom.xml`).
3. Clique com o botão direito sobre o projeto → **Maven → Update Project...** (`Alt + F5`), marque **Force Update of Snapshots/Releases** e clique em **OK** para baixar as dependências e gerar `.classpath` e `.settings/` localmente.

### 3. Ativar os Arquivos de Configuração com Dados Reais
Os arquivos `.example` presentes em `src/main/resources/config/` são apenas moldes públicos e **não são lidos pela aplicação**. Para conectar o sistema a serviços reais na sua máquina:

1. **Criar os arquivos ativos:** Na pasta `src/main/resources/config/`, duplique os dois arquivos e remova a extensão `.example` das cópias:
   - `db.properties.example` → **`db.properties`**
   - `email.properties.example` → **`email.properties`**

2. **Aplicar credenciais reais do MySQL (`db.properties`):**
   - Preencha `db.user` e `db.password` com o usuário e a senha reais configurados na instalação do MySQL da sua máquina (os mesmos utilizados para acessar o MySQL Workbench ou terminal), mantendo `db.url` apontando para o banco criado pelo script SQL.

3. **Aplicar credenciais reais de envio de e-mail (`email.properties`):**
   - Para utilizar uma conta Gmail nos disparos reais de recuperação de senha e confirmação de cadastro:
     1. Acesse **Gerenciar sua Conta Google → Segurança** e ative a **Verificação em duas etapas**.
     2. Pesquise por **Senhas de app** nas configurações da conta e gere uma senha exclusiva para o projeto (código de 16 caracteres).
     3. No arquivo `email.properties`, informe o endereço de e-mail completo em `mail.username` e cole o código de 16 caracteres (sem espaços) em `mail.password`.
   - *Alternativa para testes sem envio externo:* utilize uma caixa de entrada virtual gratuita (como o **Mailtrap**), substituindo o servidor SMTP, porta e credenciais pelos dados fornecidos na plataforma.

4. **Verificar proteção no Git:**
   - Certifique-se de que `src/main/resources/config/db.properties` e `src/main/resources/config/email.properties` constam no `.gitignore` antes de realizar qualquer *commit*, evitando expor senhas reais no repositório compartilhado.

5. **Consumo e validação em tempo de execução:**
   - Em tempo de execução, a camada utilitária (`br.com.liol.utils`) deve carregar `config/db.properties` e `config/email.properties` diretamente do *classpath* do Maven para fornecer as credenciais às camadas de dados (`br.com.liol.data`) e serviços (`br.com.liol.service`).
   - Antes de iniciar a construção completa das telas Swing, recomenda-se testar a abertura de conexão com o MySQL e um disparo de e-mail a partir do ponto de entrada da aplicação (`br.com.liol.main`).