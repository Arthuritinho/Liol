
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

## Regras de negócio

1. O CPF é único para identificar cada pessoa, a data de nascimento é necessária para saber a idade
2. O objetivo é necessário para avaliar o tipo de treino que o cliente deve fazer.
3. O status da matrícula e do pagamento do cliente determina se ele pode ter acesso à academia e aos treinos.
4. O cargo de funcionário é necessário para definir o salário e supervisão, o CREF (Conselho Regional de Educação Física) é necessário para os instrutores, estar matriculado no curso de ED. Física é necessário para os estagiários, o CRA (Conselho Regional de Administração) é necessário para os gestores.
5. O Status da matrícula dos funcionários define se estão trabalhando na academia ou não, e o status da matrícula dos clientes define se podem ou não ter acesso à academia.
6. Todos os funcionários têm direito ao benefício do Plano de saúde, o plano poderá incluir todos os seus dependentes mas com desconto de valor unitário do plano de saúde no salário do funcionário.
