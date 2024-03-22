CREATE TABLE IF NOT exists  cryptomoneda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ruta_imagen VARCHAR(255),
    nombre VARCHAR(255) NOT NULL,
    max_prize BIGINT,
    minim_prize BIGINT,
    creador VARCHAR(255),
    descripcion TEXT,
    red VARCHAR(255)
);