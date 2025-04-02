mysql.sql

DROP DATABASE IF EXISTS dbclientesdam02;
CREATE DATABASE IF NOT EXISTS dbvideojuegosdam02;
USE dbvideojuegosdam02;

CREATE TABLE Videojuegos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    genero VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio INT NOT NULL
);

INSERT INTO Videojuegos (titulo, genero, descripcion, precio) VALUES
('The Legend of Zelda: Breath of the Wild', 'Aventura', 'Un juego de aventura y mundo abierto en el que controlas a Link mientras exploras el vasto reino de Hyrule, resuelves acertijos y luchas contra criaturas.', 60),
('The Witcher 3: Wild Hunt', 'RPG', 'Un RPG de mundo abierto donde controlas a Geralt de Rivia, un cazador de monstruos, en su búsqueda por encontrar a su hija adoptiva mientras enfrenta desafíos y decisiones morales.', 50),
('Minecraft', 'Supervivencia', 'Un juego de construcción y supervivencia donde puedes crear mundos, explorar y enfrentarte a criaturas en un entorno completamente abierto.', 30),
('Grand Theft Auto V', 'Acción, Aventura', 'Un juego de acción y aventura de mundo abierto en el que controlas a tres personajes mientras realizas misiones y actividades criminales en la ciudad de Los Santos.', 40),
('Red Dead Redemption 2', 'Acción, Aventura', 'Un juego de acción y aventura en el que controlas a Arthur Morgan, un forajido, mientras navegas por el Viejo Oeste, enfrentándote a dilemas morales y tomando decisiones difíciles.', 60),
('FIFA 23', 'Deportes', 'El último juego de fútbol de la franquicia FIFA, con jugabilidad realista, nuevos modos y equipos, y un enfoque en la simulación del fútbol profesional.', 70),
('Overwatch 2', 'Disparos, Multijugador', 'Un juego de disparos en equipo en el que seleccionas héroes con habilidades únicas para enfrentarte a otros jugadores en combates rápidos y estratégicos.', 40),
('Hollow Knight', 'Metroidvania', 'Un juego de acción y aventuras en 2D donde controlas a un caballero diminuto en un mundo subterráneo lleno de enemigos, acertijos y secretos.', 15),
('Cyberpunk 2077', 'RPG', 'Un RPG de mundo abierto ambientado en un futuro distópico, donde juegas como V, un mercenario en busca de un implante cibernético que podría cambiar el destino de la humanidad.', 60),
('Call of Duty: Modern Warfare II', 'Disparos', 'Un juego de disparos en primera persona que forma parte de la serie Call of Duty, con un enfoque en misiones de combate militares y un modo multijugador altamente competitivo.', 50);
