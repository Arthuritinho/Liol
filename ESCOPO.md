
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
- Registro de dados pessoais do aluno (Nome, CPF, Data de Nascimento, Telefone)
- Registro de dados físicos (Peso e Altura) e objetivo principal do aluno (Emagrecimento, Hipertrofia, Condicionamento)
- Controle de status da matrícula do aluno (Ativo, Expirada, Cancelada)

### Gestão de Funcionários
O sistema permite a gestão de funcionários novos ou existentes da academia. Esses funcionários estão divididos entre diferentes cargos. Possui como funcionalidades:

- Cadastro de funcionários na academia
- Registro de dados pessoais do funcionário (Nome, CPF, Data de Nascimento, Telefone, Endereço, Data de admissão, Cargo e Salário)
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

### Controle de Matrículas
O sistema conta com o registro de matrículas atribuídas aos alunos, validando a inscrição deste na academia. Possui como funcionalidades: 

- Criação de matrícula;
- Consulta de validade;
- Controle de status da matrícula (Ativa, Expirada, Cancelada).

### Controle Financeiro
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
  16. A data e valor de cada pagamento são registrados automaticamente pelo sistema.

