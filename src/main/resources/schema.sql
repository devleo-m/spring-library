CREATE TABLE livro(
    id_livro BIGSERIAL PRIMARY KEY,
    titulo_livro VARCHAR(255) NOT NULL,
    autor_livro VARCHAR(255) NOT NULL,
    ano_publicacao INTEGER NOT NULL
);

CREATE TABLE membro (
    id_membro BIGSERIAL PRIMARY KEY,
    nome_membro VARCHAR(255) NOT NULL,
    endereco_membro TEXT NOT NULL,
    telefone_membro VARCHAR(20) NOT NULL
);

CREATE TABLE emprestimos (
    id_emprestimo BIGSERIAL PRIMARY KEY,
    id_livro BIGINT NOT NULL,
    id_membro BIGINT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE NOT NULL,
    FOREIGN KEY (id_livro) REFERENCES livro (id_livro),
    FOREIGN KEY (id_membro) REFERENCES membro (id_membro)
);

CREATE TABLE bibliotecarios (
    id_bibliotecario BIGSERIAL PRIMARY KEY,
    nome_bibliotecario VARCHAR(255) NOT NULL,
    email_bibliotecario VARCHAR(255) UNIQUE NOT NULL,
    senha_bibliotecario VARCHAR(255) NOT NULL
);

CREATE TABLE visitante (
    id_visitante BIGSERIAL PRIMARY KEY,
    nome_visitante VARCHAR(255) NOT NULL,
    telefone_visitante VARCHAR(20) NOT NULL
);

ALTER TABLE emprestimos
    ADD CONSTRAINT fk_emprestimos_membro FOREIGN KEY (id_membro)
    REFERENCES membro (id_membro)
    ON DELETE CASCADE;


ALTER TABLE emprestimos
    ADD CONSTRAINT fk_emprestimos_livro FOREIGN KEY (id_livro)
    REFERENCES livro (id_livro)
    ON DELETE CASCADE;




