/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  irina
 * Created: 10 nov. 2023
 */

CREATE DATABASE IF NOT EXISTS bd_cartelera;


INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('152', 'Harry Potter y la piedra filosofal');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('161', 'Harry Potter y la cámara secreta');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('139', 'Harry Potter y el prisionero de Azkaban');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('157', 'Harry Potter y el cáliz de fuego');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('138', 'Harry Potter y la orden del Fénix');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('153', 'Harry Potter y el misterio del príncipe');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('146', 'Harry Potter y las reliquias de la muerte - Parte 1');
INSERT INTO `bd_cartelera`.`pelicula` (`duracion`, `nombre`) VALUES ('130', 'Harry Potter y las reliquias de la muerte - Parte 2');

INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 1');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 2');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 33');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala 27');
INSERT INTO `bd_cartelera`.`sala_cine` (`estado`, `nombre`) VALUES ('1', 'Sala Premium');


INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-09', '2023-11-10', '1', '1');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-10', '2023-11-10', '2', '1');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-11', '2023-11-10', '3', '2');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-12', '2023-11-10', '4', '2');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-13', '2023-11-10', '5', '2');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-14', '2023-11-10', '6', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-15', '2023-11-10', '7', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-16', '2023-11-10', '1', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-17', '2023-11-10', '2', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-18', '2023-11-10', '3', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-19', '2023-11-10', '4', '3');
INSERT INTO `bd_cartelera`.`pelicula_sala_cine` (`fecha_fin`, `fecha_publicacion`, `pelicula_id`, `sala_cine_id`) VALUES ('2023-12-16', '2023-11-11', '1', '3');
