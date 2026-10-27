
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
Liol

## Descrição
O Projeto tem como objetivo principal realizar a gestão de negócios de uma academia de bairro (pequeno porte), para melhoria de eficiência do controle interno e organização estrutural . Sendo de interesse do projeto atender a necessidade de cada cliente, fornecendo um tipo de plano e treino de acordo com o seu objetivo, organizar a estrutura de funcionários, definindo salários e cargos.

## Funcionalidades

1. Cadastro de alunos e funcionários: Tem como objetivo coletar dados pessoais e profissionais dos clientes e funcionários.
2. Cadastro de treinos e exercícios e atribuição a alunos: Tem como objetivo permitir que o treinador personalize e organize os treinos de cada aluno de acordo com seus objetivos.
3. Cadastro de planos e mensalidades: Tem como objetivo definir os tipos de planos oferecidos, seus valores e condições de pagamento.
4. Registros de pagamento: Tem como objetivo controlar os pagamentos realizados e pendentes dos alunos.
5. Necessários Geral: Reúne dados gerais sobre os clientes e funcionários, ex: nome, matrícula.
6. Específicos - Clientes: Reúne dados específicos sobre os clientes, ex: matrícula, peso e altura.
7. Específicos - Funcionários: Reúne dados sobre a formação e cargo atual (instrutor,estagiário, gerente e administrativo).

## Regras de negócio

1. O CPF é único para identificar cada pessoa, a data de nascimento é necessária para saber a idade
2. O objetivo é necessário para avaliar o tipo de treino que o cliente deve fazer.
3. O status da matrícula e do pagamento do cliente determina se ele pode ter acesso à academia e aos treinos.
4. O cargo de funcionário é necessário para definir o salário e supervisão, o CREF (Conselho Regional de Educação Física) é necessário para os instrutores, estar matriculado no curso de ED. Física é necessário para os estagiários, o CRA (Conselho Regional de Administração) é necessário para os gestores.
5. O Status da matrícula dos funcionários define se estão trabalhando na academia ou não, e o status da matrícula dos clientes define se podem ou não ter acesso à academia.
6. Todos os funcionários têm direito ao benefício do Plano de saúde, o plano poderá incluir todos os seus dependentes mas com desconto de valor unitário do plano de saúde no salário do funcionário.

## Gestão de Planos e mensalidades

1. Treino experimental (1 dia para cada cliente, precisa cadastrar nome e CPF) - VALOR FIXO
2. Plano mensal (1 mês) - VALOR FIXO
3. Plano trimestral (3 meses) - DESCONTO DE 5%
4. Plano semestral (6 meses) - DESCONTO DE 10%​
5. Plano anual (12 meses) - DESCONTO DE 15%

| Planos              | Valor Fixo | Desconto em % | Duração em dias |
| ------------------- | ---------- | ------------- | --------------- |
| Treino experimental | R$ 0,00    | 0%            | 1               |
| Plano Mensal        | R$ 60,00   | 0%            | 30              |
| Plano Trimestral    | R$ 180,00  | 5%            | 90              |
| Plano Semestral     | R$ 360,00  | 10%           | 180             |
| Plano Anual         | R$ 720,00  | 15%           | 360             |

## Observações:

1. O sistema deve dar a possibilidade de adicionar qualquer um desses planos para cada cliente e dependentes, adicionando um desconto padrão de acordo com o plano.
2. Cada cliente só pode ter um plano ativo por vez.
3. O valor da mensalidade é calculado a partir da data de início e data de vencimento, com base na duração do plano, contando 30 dias para cada mês.
4. O sistema irá mostrar o valor final cobrado para cada cliente, e o status do pagamento(Pendente, Pago, Atrasado).
