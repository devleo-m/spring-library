CREATE TABLE livro(
    id_livro BIGSERIAL PRIMARY KEY,
    titulo_livro VARCHAR(255) NOT NULL,
    autor_livro VARCHAR(255) NOT NULL,
    ano_publicacao INTEGER NOT NULL
);