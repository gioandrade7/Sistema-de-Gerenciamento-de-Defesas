USE db_tp1;

CREATE TABLE IF NOT EXISTS defesa(
	aluno varchar (50)PRIMARY KEY,
    tipo_de_defesa varchar(30) NOT NULL,
    titulo_da_defesa varchar(100) NOT NULL,
    dia varchar(20) NOT NULL,
    lugar varchar(100) NOT NULL,
    orientador varchar(50) NOT NULL,
    nota_final varchar(10) NOT NULL,
    resultado varchar(20) NOT NULL,
    observacoes TEXT
);

CREATE TABLE IF NOT EXISTS banca(
	aluno_banca varchar(50),
	banca_tipo_defesa varchar(30) NOT NULL,
    professor varchar(50) PRIMARY KEY NOT NULL,
    FOREIGN KEY (aluno_banca) references defesa(aluno)
);


INSERT INTO defesa VALUES ('Giovanna Andrade Santos', 'Defesa de TCC', 'Bebês', '2022-10-23', 'UFAM', 'Eulanda', 10.0, 'aprovado', ' ');
INSERT INTO defesa VALUES ('Jose Mateus', 'Defesa de TCC', 'Desidratação', '2022-10-23', 'UFAM', 'Eduardo Souto', 10.0, 'aprovado', ' ');
INSERT INTO defesa VALUES ('Nathalia Rodrigues Machado dos Santos', 'Defesa de TCC', 'CodeBench', '2022-10-23', 'UFAM', 'Fulana', 10.0, 'aprovado', ' ');
INSERT INTO defesa VALUES ('Matheus Palheta', 'Defesa de TCC', 'Bebês', '2022-10-23', 'UFAM', 'Eulanda', 10.0, 'aprovado', ' ');
INSERT INTO defesa VALUES ('Igor dos Santos', 'Defesa de TCC', 'Voz', '2022-10-23', 'UFAM', 'Rafael', 10.0, 'aprovado', ' ');

INSERT INTO banca VALUES ('Giovanna Andrade Santos','Defesa de TCC', 'Edleno');
INSERT INTO banca VALUES ('Giovanna Andrade Santos','Defesa de TCC', 'Eduardo Nakamura');
INSERT INTO banca VALUES ('Giovanna Andrade Santos','Defesa de TCC', 'Fabíola Nakamura');
INSERT INTO banca VALUES ('Igor dos Santos','Defesa de TCC', 'Horácio');





