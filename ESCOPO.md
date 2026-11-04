
# Projeto de Linguagem de Programação Orientada a Objetos - Tecnologia em Análise e Desenvolvimento de Sistemas - 2° período (manhã)

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
- Consulta de histórico de matrícula
- Registro de dados pessoais do aluno (Matrícula, Nome, CPF, Data de Nascimento, Telefone)
- Registro de dados físicos (Peso e Altura) e objetivo principal do aluno (emagrecimento, hipertrofia, condicionamento, etc)
- Controle de status do aluno (Ativo, Inativo ou Bloqueado)

### Gestão de Funcionários
O sistema permite a gestão de funcionários novos ou existentes da academia. Esses funcionários estão divididos entre diferentes cargos. Possui como funcionalidades:

- Cadastro de funcionários na academia
- Registro de dados pessoais do funcionário (Nome, CPF, Data de Nascimento, Data de admissão, Cargo e Salário)
- Validação de credenciais conforme cargo (CREF - Instrutores e CRA - gerentes)
- Controle de status do funcionário (Ativo, Afastado, De Férias, Licença, Inativo)

**CARGOS DE FUNCIONÁRIO**

- Instrutor
- Recepcionista
- Gerente

### Registro de Ponto
O sistema conta com a possibilidade de registro da jornada de trabalho dos funcionários. Possui como funcionalidades: 

- Registro de horário de entrada (Funcionário, Data, Hora, Minuto, Segundo, Dia, Mês e Ano);
- Registro de horário de saída (Funcionário, Data, Hora, Minuto, Segundo, Dia, Mês e ano);
- Registro e consulta de horas trabalhadas;
- Controle de presença diária;
- Consulta de histórico de ponto.

### Gestão de Treinos
O sistema permite que um instrutor possa criar e atribuir treinos aos alunos. Possui como funcionalidades: 

- Cadastro de exercícios;
- Registro dos dados dos exercícios (Nome, Grupo muscular, Quantidade de séries, Quantidade de repetições);
- Criação de rotinas de treinos pelos instrutores;
- Permitir que o instrutor vincule uma rotina de treinos aos alunos.

### Gestão de Planos
O sistema conta com planos para realizar a matrícula dos alunos. Esses planos possuem diferentes tipos dependendo da escolha do aluno. Possui como funcionalidades: 

- Contratação de plano;
- Renovação de plano;
- Cancelamento de plano;
- Consulta de vencimentos.

**TIPOS DE PLANOS**

| Planos              | Valor Fixo | Desconto em % | Duração em dias |
| ------------------- | ---------- | ------------- | --------------- |
| Treino experimental | R$ 0,00    | 0%            | 1               |
| Plano Mensal        | R$ 60,00   | 0%            | 30              |
| Plano Trimestral    | R$ 180,00  | 5%            | 90              |
| Plano Semestral     | R$ 360,00  | 10%           | 180             |
| Plano Anual         | R$ 720,00  | 15%           | 360             |
