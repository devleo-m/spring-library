CREATE TABLE bibliotecarios (
    id_bibliotecario BIGSERIAL PRIMARY KEY,
    nome_bibliotecario VARCHAR(255) NOT NULL,
    email_bibliotecario VARCHAR(255) UNIQUE NOT NULL,
    senha_bibliotecario VARCHAR(255) NOT NULL
);
