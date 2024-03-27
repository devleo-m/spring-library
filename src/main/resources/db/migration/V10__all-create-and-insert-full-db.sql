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

-- INSERT'S

INSERT INTO livro (titulo_livro, autor_livro, ano_publicacao) VALUES
('Dom Quixote', 'Miguel de Cervantes', 1605),
('Orgulho e Preconceito', 'Jane Austen', 1813),
('Moby Dick', 'Herman Melville', 1851),
('Guerra e Paz', 'Lev Tolstói', 1869),
('Cem Anos de Solidão', 'Gabriel García Márquez', 1967),
('1984', 'George Orwell', 1949),
('Ulisses', 'James Joyce', 1922),
('A Divina Comédia', 'Dante Alighieri', 1320),
('O Apanhador no Campo de Centeio', 'J.D. Salinger', 1951),
('Crime e Castigo', 'Fiódor Dostoiévski', 1866),
('O Senhor dos Anéis', 'J.R.R. Tolkien', 1954),
('A Revolução dos Bichos', 'George Orwell', 1945),
('O Grande Gatsby', 'F. Scott Fitzgerald', 1925),
('O Pequeno Príncipe', 'Antoine de Saint-Exupéry', 1943),
('Hamlet', 'William Shakespeare', 1603),
('A Metamorfose', 'Franz Kafka', 1915),
('Os Miseráveis', 'Victor Hugo', 1862),
('O Retrato de Dorian Gray', 'Oscar Wilde', 1890),
('A Odisséia', 'Homero', 0),
('Anna Karenina', 'Lev Tolstói', 1877);

--

INSERT INTO membro (nome_membro, endereco_membro, telefone_membro) VALUES
('Maria Silva', 'Rua das Flores, 123', '(11) 1234-5678'),
('José Santos', 'Avenida Principal, 456', '(22) 9876-5432'),
('Ana Oliveira', 'Rua dos Almeidas, 789', '(33) 2468-1357'),
('Carlos Pereira', 'Travessa dos Pinheiros, 101', '(44) 3698-7412'),
('Patrícia Costa', 'Alameda das Palmeiras, 202', '(55) 1596-7530'),
('João Lima', 'Praça Central, 303', '(66) 8523-9641'),
('Amanda Souza', 'Avenida das Águias, 404', '(77) 7410-3698'),
('Pedro Oliveira', 'Rua dos Girassóis, 505', '(88) 3698-2587'),
('Fernanda Santos', 'Travessa das Orquídeas, 606', '(99) 1478-3698'),
('Lucas Fernandes', 'Alameda dos Ipês, 707', '(00) 6541-9873'),
('Camila Rodrigues', 'Rua das Violetas, 808', '(12) 3698-1478'),
('Rafaela Almeida', 'Avenida das Rosas, 909', '(24) 9874-6321'),
('Diego Silva', 'Travessa dos Lírios, 1010', '(36) 7412-3698'),
('Juliana Oliveira', 'Rua dos Cravos, 1111', '(48) 3698-8520'),
('Marcelo Costa', 'Alameda dos Cedros, 1212', '(55) 1478-9630'),
('Aline Souza', 'Avenida dos Jasmins, 1313', '(14) 8520-3698'),
('Bruno Santos', 'Rua dos Narcisos, 1414', '(78) 9630-1478'),
('Luana Lima', 'Travessa das Margaridas, 1515', '(32) 3698-7530'),
('Vinícius Rodrigues', 'Alameda das Acácias, 1616', '(66) 1478-8520'),
('Carolina Oliveira', 'Avenida das Hortênsias, 1717', '(01) 3698-6321');

--

INSERT INTO bibliotecarios (nome_bibliotecario, email_bibliotecario, senha_bibliotecario) VALUES
('Ana Silva', 'ana.silva@example.com', 'senha123'),
('José Santos', 'jose.santos@example.com', 'password'),
('Carla Oliveira', 'carla.oliveira@example.com', 'qwerty'),
('Marcos Lima', 'marcos.lima@example.com', '1122334455'),
('Amanda Costa', 'amanda.costa@example.com', 'abc123');

--

INSERT INTO visitante (nome_visitante, telefone_visitante) VALUES
('João Silva', '11987654321'),
('Maria Oliveira', '11901234567'),
('Carlos Santos', '11998765432'),
('Ana Pereira', '11987651234'),
('Pedro Almeida', '11976543210'),
('Juliana Costa', '11987654321'),
('Lucas Souza', '11904567890'),
('Amanda Santos', '11987654321'),
('Gabriel Ferreira', '11987654321'),
('Laura Silva', '11987654321'),
('Rafael Oliveira', '11987654321'),
('Luiza Mendes', '11987654321'),
('Matheus Santos', '11987654321'),
('Larissa Costa', '11987654321'),
('Felipe Souza', '11987654321'),
('Beatriz Almeida', '11987654321'),
('Guilherme Oliveira', '11987654321'),
('Carolina Pereira', '11987654321'),
('Diego Costa', '11987654321'),
('Isabela Santos', '11987654321'),
('Vinícius Souza', '11987654321'),
('Mariana Oliveira', '11987654321'),
('Thiago Mendes', '11987654321'),
('Julia Santos', '11987654321'),
('Eduardo Almeida', '11987654321'),
('Fernanda Costa', '11987654321'),
('Rodrigo Pereira', '11987654321'),
('Camila Oliveira', '11987654321'),
('Lucas Souza', '1198765432');