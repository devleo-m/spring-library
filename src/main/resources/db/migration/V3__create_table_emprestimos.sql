CREATE TABLE emprestimos (
    id_emprestimo BIGSERIAL PRIMARY KEY,
    id_livro BIGINT NOT NULL,
    id_membro BIGINT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE NOT NULL,
    FOREIGN KEY (id_livro) REFERENCES livro (id_livro),
    FOREIGN KEY (id_membro) REFERENCES membro (id_membro)
);
