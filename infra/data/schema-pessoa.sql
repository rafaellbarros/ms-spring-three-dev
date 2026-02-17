-- Remover tabela se existir (com CASCADE para dependências)
DROP TABLE IF EXISTS pessoa CASCADE;

-- Criar tabela pessoa
CREATE TABLE pessoa (
    id              SERIAL PRIMARY KEY,
    nome            VARCHAR(500) NOT NULL,
    email           VARCHAR(500) NOT NULL UNIQUE,
    data_nascimento DATE,
    idade           INTEGER
);

-- Comentários na tabela e colunas (opcional, mas boa prática)
COMMENT ON TABLE pessoa IS 'Tabela de cadastro de pessoas';
COMMENT ON COLUMN pessoa.id IS 'Identificador único da pessoa';
COMMENT ON COLUMN pessoa.nome IS 'Nome completo da pessoa';
COMMENT ON COLUMN pessoa.email IS 'E-mail da pessoa (único)';
COMMENT ON COLUMN pessoa.data_nascimento IS 'Data de nascimento da pessoa';
COMMENT ON COLUMN pessoa.idade IS 'Idade da pessoa (pode ser calculada)';


