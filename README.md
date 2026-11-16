# Projeto de Linguagem de Programação Orientada a Objetos - Tecnologia em Análise e Desenvolvimento de Sistemas - 2° período (manhã)

# Liol
Gestor de sistema de negócios de academia

## Integrantes
- Anderson Batista Tavares da Silva
- Arthur Pereira do Nascimento
- Beatriz Pereira Balbino Silva
- Cintia Ferreira de Almeida
- Deise Ellen Sousa dos Santos
- Lucas Felipe Bispo da Silva
- Marcos Antônio Câmara de Carvalho

## Nome do Sistema
Liol – Sistema Gestor de Academia

## Descrição
Liol é um sistema desktop desenvolvido em Java para gestão de processos administrativos e operacionais de uma academia de pequeno porte, visando melhoria da eficiência do controle interno e organização estrutural.
O sistema permite o gerenciamento do cadastro de alunos e funcionários, atribuição de treinos personalizados e planos de matrícula para os alunos, o controle de pagamentos de matrículas, registro de ponto dos funcionários e a criação de relatórios administrativos.

## Funcionalidades

### Gestão de Alunos
O sistema permite a gestão de alunos novos ou existentes da academia. Possui como funcionalidades:

- Cadastro de novos alunos
- Atualização de informações cadastrais
- Registro de dados pessoais do aluno (Nome, CPF, Data de Nascimento, Telefone, Email)
- Registro de dados físicos (Peso e Altura) e objetivo principal do aluno (Emagrecimento, Hipertrofia, Condicionamento)
- Controle de status da matrícula do aluno (Ativo, Expirada, Cancelada)

### Controle de Plano do Aluno
O sistema conta com o registro do plano do aluno, validando a inscrição deste na academia. Possui como funcionalidades: 

- Controle de status da matrícula (Ativa, Expirada, Cancelada).
- Contratação de plano;
- Renovação de plano;
- Cancelamento de plano;
- Consulta de vencimentos.

### Controle de Treinos
O sistema permite que um instrutor possa atribuir treinos aos alunos e personalizá-los. Existem treinos bases atribuídos automaticamente ao aluno no momento de seu cadastro, mas esses podem ser editados pelo instrutor. Possui como funcionalidades: 

- Registro dos dados dos exercícios (Nome, Grupo muscular, Quantidade de séries, Quantidade de repetições);
- Edição de exercícios;
- Vinculação de um treino a um aluno.

### Gestão de Funcionários
O sistema permite a gestão de funcionários novos ou existentes da academia. Esses funcionários estão divididos entre diferentes cargos. Possui como funcionalidades:

- Cadastro de funcionários na academia
- Registro de dados pessoais do funcionário (Nome, CPF, Data de Nascimento, Telefone, Email, Endereço, Data de admissão, Cargo e Salário)
- Validação de credenciais conforme cargo (CREF - Instrutores ; CRA - gerentes)
- Controle de status do funcionário (Ativo, De Férias, Licença)

**CARGOS DE FUNCIONÁRIO**

- Instrutor
- Recepcionista
- Gerente

### Registro de Ponto
O sistema conta com a possibilidade de registro da jornada de trabalho dos funcionários. Possui como funcionalidades: 

- Registro de horário de entrada (Funcionário, Data, Hora, Minuto, Segundo, Dia, Mês e Ano);
- Registro de horário de saída (Funcionário, Data, Hora, Minuto, Segundo, Dia, Mês e ano);
- Consulta de histórico de ponto.

### Gestão de Planos
O sistema conta com planos para realizar a matrícula dos alunos. Esses planos possuem diferentes tipos dependendo da escolha do aluno. 

**TIPOS DE PLANOS**

| Planos              | Valor Fixo | Desconto em % | Duração em dias |
| ------------------- | ---------- | ------------- | --------------- |
| Treino experimental | R$ 0,00    | 0%            | 1               |
| Plano Mensal        | R$ 60,00   | 0%            | 30              |
| Plano Trimestral    | R$ 180,00  | 5%            | 90              |
| Plano Semestral     | R$ 360,00  | 10%           | 180             |
| Plano Anual         | R$ 720,00  | 15%           | 360             |

### Controle Financeiro (Relatório)
O sistema permite o registro e consulta dos pagamentos realizados e a criação de relatórios administrativos do sistema. Esse controle atribui status de pagamento aos alunos com base na situação de matrícula dele. Possui como funcionalidades:

- Registro de pagamento do mês atual;
- Consulta de pagamentos de meses anteriores;
- Relatório de inadimplência;
- Histórico financeiro do aluno.

**STATUS DE PAGAMENTO**
- Pago;
- Pendente;
- Atrasado;
- Cancelado.

## Regras de Negócio

  1. Cada pessoa cadastrada possui um CPF único no sistema;
  2. Somente funcionários do cargo de Instrutor pode alterar ou criar treinos;
  3. Ao acessar a ficha de treino diário, o sistema registra o treino daquele aluno como concluído;
  4. Para um funcionário ocupar o cargo de Instrutor, ele deve possuir registro CREF (Conselho Regional de Educação Física) válido;
  5. Para um funcionário ocupar o cargo de Gerente, ele deve possuir registro CRA (Conselho Regional de Administração) válido;
  6. Todos os funcionários devem registrar a jornada de trabalho diária;
  7. O horário de saída do registro de ponto não pode ser menor que o horário de entrada;
  8. O horário de funcionamento da academia é de 05h às 23h em dias úteis e de 8h às 13h aos finais de semana e feriados;
  9. O sistema calcula automaticamente as horas trabalhadas do funcionário;
  10. O status da matrícula determina se um cliente pode ou não ter acesso à academia;
  11. Um aluno pode possuir apenas uma matrícula;
  12. Uma matrícula deve estar associada à apenas um plano;
  13. Uma matrícula deve ser ativada apenas após a contratação de um plano;
  14. O valor da mensalidade é calculado a partir da data de início e de vencimento, considerando 30 dias em um mês;
  15. Pagamentos devem estar vinculados a uma matrícula ativa;
  16. A data e valor de cada pagamento são registrados automaticamente pelo sistema;
  17. Sistema de recuperação de senha: Código é enviado ao email cadastrado para alterá-la;
  18. Um email é enviado ao usuário toda vez que um cadastro novo é realizado.

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
