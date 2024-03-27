CREATE TABLE membro (
    id_membro BIGSERIAL PRIMARY KEY,
    nome_membro VARCHAR(255) NOT NULL,
    endereco_membro TEXT NOT NULL,
    telefone_membro VARCHAR(20) NOT NULL
);
