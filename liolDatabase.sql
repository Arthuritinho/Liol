DROP DATABASE IF EXISTS liol;

CREATE DATABASE liol
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE liol;

CREATE TABLE pessoas (
  cpf            CHAR(11)      PRIMARY KEY,
  nome_completo  VARCHAR(50)   NOT NULL,
  data_nasc      DATE          NOT NULL,
  genero         CHAR(1)       NOT NULL,
  idade          INT           NOT NULL,
  logradouro     VARCHAR(50)   NOT NULL,
  bairro         VARCHAR(30)   NOT NULL,
  cep            CHAR(8)       NOT NULL,
  CONSTRAINT chk_genero CHECK (genero IN ('M', 'F'))
);

CREATE TABLE contato (
  numero_contato VARCHAR(15)   NOT NULL,
  fk_pessoa_cpf  CHAR(11)      NOT NULL,
  PRIMARY KEY (numero_contato, fk_pessoa_cpf),
  FOREIGN KEY (fk_pessoa_cpf) REFERENCES pessoas(cpf)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE alunos (
  matricula_aluno  VARCHAR(10)         PRIMARY KEY,
  data_inscricao   DATE                NOT NULL,
  altura           DECIMAL(3,2)        NOT NULL,
  peso             DECIMAL(5,2)        NOT NULL,
  status_matricula ENUM('Ativo','Inativo') DEFAULT 'Ativo',
  objetivo         VARCHAR(40)         NOT NULL,
  fk_aluno_cpf     CHAR(11)            NOT NULL UNIQUE,
  FOREIGN KEY (fk_aluno_cpf) REFERENCES pessoas(cpf)
    ON UPDATE CASCADE,
  CONSTRAINT chk_objetivo  CHECK (objetivo IN ('Emagrecimento','Hipertrofia','Condicionamento'))
);

CREATE TABLE plano (
  id_plano       INT           PRIMARY KEY AUTO_INCREMENT,
  nome_plano     VARCHAR(40)   NOT NULL,
  desconto_base  DECIMAL(10,2) DEFAULT 0.00,
  duracao_dias   INT           NOT NULL,
  valor_fixo     DECIMAL(10,2) NOT NULL
) AUTO_INCREMENT = 1;

CREATE TABLE assinatura (
  id_assinatura          INT           PRIMARY KEY AUTO_INCREMENT,
  data_vencimento        DATE,
  valor_final            DECIMAL(10,2) NOT NULL,
  data_inicio_assinatura DATE,
  fk_id_plano            INT           NOT NULL,
  fk_matricula_aluno     VARCHAR(10)   NOT NULL,
  FOREIGN KEY (fk_id_plano)        REFERENCES plano(id_plano),
  FOREIGN KEY (fk_matricula_aluno) REFERENCES alunos(matricula_aluno)
) AUTO_INCREMENT = 1;

CREATE TABLE funcionarios (
  matricula_func        VARCHAR(10)              PRIMARY KEY,
  email                 VARCHAR(40)              UNIQUE NOT NULL,
  data_admissao         DATE                     NOT NULL,
  status_matricula_func ENUM('Ativo','Inativo')  DEFAULT 'Ativo',
  numero_depedentes     INT                      NOT NULL DEFAULT 0,
  desconto_plano_saude  DECIMAL(10,2)            NOT NULL DEFAULT 150.00,
  supervisor_matricula  VARCHAR(10),
  fk_funcionario_cpf    CHAR(11)                 NOT NULL UNIQUE,
  FOREIGN KEY (supervisor_matricula) REFERENCES funcionarios(matricula_func)
    ON DELETE SET NULL ON UPDATE CASCADE,
  FOREIGN KEY (fk_funcionario_cpf)   REFERENCES pessoas(cpf)
    ON UPDATE CASCADE
);

CREATE TABLE dependentes (
  d_cpf              CHAR(11)    PRIMARY KEY,
  nome_completo      VARCHAR(50) NOT NULL,
  fk_funcionario_cpf CHAR(11)    NOT NULL,
  FOREIGN KEY (fk_funcionario_cpf) REFERENCES funcionarios(fk_funcionario_cpf)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE plano_saude (
  id_plano_saude          INT           PRIMARY KEY AUTO_INCREMENT,
  valor_total_depedentes  DECIMAL(10,2),
  fk_depedente_d_cpf      CHAR(11)      NOT NULL,
  FOREIGN KEY (fk_depedente_d_cpf) REFERENCES dependentes(d_cpf)
    ON DELETE CASCADE ON UPDATE CASCADE
) AUTO_INCREMENT = 1;

CREATE TABLE setores (
  id_setor          INT         PRIMARY KEY AUTO_INCREMENT,
  numero_setor      INT         NOT NULL,
  fk_matricula_func VARCHAR(10) NOT NULL UNIQUE,
  FOREIGN KEY (fk_matricula_func) REFERENCES funcionarios(matricula_func)
    ON UPDATE CASCADE
) AUTO_INCREMENT = 1;

CREATE TABLE instrutores (
  cref              INT           PRIMARY KEY,
  salario_instrutor DECIMAL(10,2) DEFAULT 3000.00,
  fk_matricula_func VARCHAR(10)   NOT NULL UNIQUE,
  fk_id_setor       INT           NOT NULL,
  FOREIGN KEY (fk_id_setor)       REFERENCES setores(id_setor),
  FOREIGN KEY (fk_matricula_func) REFERENCES funcionarios(matricula_func)
    ON UPDATE CASCADE
);

CREATE TABLE gerentes (
  cra               INT           PRIMARY KEY,
  salario_gerente   DECIMAL(10,2) DEFAULT 10000.00,
  fk_matricula_func VARCHAR(10)   NOT NULL UNIQUE,
  fk_id_setor       INT           NOT NULL UNIQUE,
  FOREIGN KEY (fk_id_setor)       REFERENCES setores(id_setor),
  FOREIGN KEY (fk_matricula_func) REFERENCES funcionarios(matricula_func)
    ON UPDATE CASCADE
);

CREATE TABLE pagamento (
  id_pagamento      INT         PRIMARY KEY AUTO_INCREMENT,
  status_pagamento  VARCHAR(15) NOT NULL,
  fk_matricula_aluno VARCHAR(10) NOT NULL,
  FOREIGN KEY (fk_matricula_aluno) REFERENCES alunos(matricula_aluno)
    ON UPDATE CASCADE,
  CONSTRAINT chk_status_pagamento
    CHECK (status_pagamento IN ('PAGO','PENDENTE','ATRASADO'))
) AUTO_INCREMENT = 1;

CREATE TABLE orienta (
  id_orienta         INT         PRIMARY KEY AUTO_INCREMENT,
  fk_cref            INT         NOT NULL,
  fk_matricula_aluno VARCHAR(10) NOT NULL,
  FOREIGN KEY (fk_cref)            REFERENCES instrutores(cref)
    ON UPDATE CASCADE,
  FOREIGN KEY (fk_matricula_aluno) REFERENCES alunos(matricula_aluno)
    ON UPDATE CASCADE
) AUTO_INCREMENT = 1;

CREATE TABLE administrativo (
  salario_adm        DECIMAL(10,2) DEFAULT 1542.00,
  fk_matricula_func  VARCHAR(10)   NOT NULL UNIQUE,
  fk_id_setor        INT           NOT NULL,
  FOREIGN KEY (fk_matricula_func) REFERENCES funcionarios(matricula_func)
    ON UPDATE CASCADE,
  FOREIGN KEY (fk_id_setor) REFERENCES setores(id_setor)
);

CREATE TABLE registra (
  id_registra      INT           PRIMARY KEY AUTO_INCREMENT,
  valor_pago       DECIMAL(10,2) NOT NULL,
  data_pagamento   DATE          NOT NULL,
  forma_pagamento  VARCHAR(30)   NOT NULL,
  fk_id_pagamento  INT           NOT NULL,
  fk_adm_cpf       CHAR(11)      NOT NULL,
  FOREIGN KEY (fk_id_pagamento) REFERENCES pagamento(id_pagamento)
    ON UPDATE CASCADE,
  FOREIGN KEY (fk_adm_cpf) REFERENCES pessoas(cpf)
    ON UPDATE CASCADE
) AUTO_INCREMENT = 1;

CREATE TABLE exercicio (
  id_exercicio   INT         PRIMARY KEY AUTO_INCREMENT,
  nome_exercicio VARCHAR(30) NOT NULL,
  area_muscular  VARCHAR(20) NOT NULL
) AUTO_INCREMENT = 1;

CREATE TABLE lista_exercicios (
  id_lista_exercicios INT         PRIMARY KEY AUTO_INCREMENT,
  nome_lista          VARCHAR(20) NOT NULL,
  quantidade_max      INT         NOT NULL
) AUTO_INCREMENT = 1;

CREATE TABLE esta_em (
  id_esta_em             INT PRIMARY KEY AUTO_INCREMENT,
  series                 INT,
  repeticoes             INT,
  ordem_de_execucao      INT,
  fk_id_exercicio        INT NOT NULL,
  fk_id_lista_exercicios INT NOT NULL,
  FOREIGN KEY (fk_id_exercicio)        REFERENCES exercicio(id_exercicio)
    ON UPDATE CASCADE,
  FOREIGN KEY (fk_id_lista_exercicios) REFERENCES lista_exercicios(id_lista_exercicios)
    ON UPDATE CASCADE
) AUTO_INCREMENT = 1;

CREATE TABLE treino (
  id_treino              INT         PRIMARY KEY AUTO_INCREMENT,
  nome_treino            VARCHAR(30),
  objetivo               VARCHAR(30),
  data_inicio            DATE,
  data_fim               DATE,
  fk_id_lista_exercicios INT         NOT NULL,
  FOREIGN KEY (fk_id_lista_exercicios) REFERENCES lista_exercicios(id_lista_exercicios)
    ON UPDATE CASCADE
) AUTO_INCREMENT = 1;

CREATE TABLE instrutores_treino_aluno (
  id_instrutor_treino_aluno INT         PRIMARY KEY AUTO_INCREMENT,
  fk_id_treino              INT         NOT NULL,
  fk_matricula_aluno        VARCHAR(10) NOT NULL,
  fk_cref                   INT         NOT NULL,
  FOREIGN KEY (fk_id_treino)       REFERENCES treino(id_treino)
    ON UPDATE CASCADE,
  FOREIGN KEY (fk_matricula_aluno) REFERENCES alunos(matricula_aluno)
    ON UPDATE CASCADE,
  FOREIGN KEY (fk_cref)            REFERENCES instrutores(cref)
    ON UPDATE CASCADE
) AUTO_INCREMENT = 1;
