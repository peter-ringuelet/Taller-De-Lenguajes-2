# Piedra, Papel, Tijera

## Descripción
Una implementación en Java del clásico juego Piedra, Papel, Tijera. El juego permite que dos jugadores (en este caso, controlados por la computadora) compitan en varias rondas y determine el ganador al final de todas las rondas.

## Estructura

### Clases
1. **Gesto**: Una clase abstracta que representa un gesto genérico en el juego.
    - **Piedra**: Representa el gesto de Piedra.
    - **Papel**: Representa el gesto de Papel.
    - **Tijera**: Representa el gesto de Tijera.
    
2. **Jugador**: Representa a un jugador con atributos como nombre, el gesto seleccionado y el número de rondas ganadas.

3. **Juego**: Esta clase tiene la lógica principal del juego. Implementa el patrón Singleton, lo que significa que solo puede haber una instancia de la clase en cualquier momento.

## Cómo Jugar
Actualmente, los jugadores son controlados por la computadora y seleccionan sus gestos de forma aleatoria. Para iniciar una partida, se debe:

1. Crear dos jugadores.
2. Establecer el número de rondas.
3. Llamar al método `jugar()` de la clase `Juego`.

## Futuras Mejoras
1. Implementar una interfaz de usuario.
2. Permitir la entrada del usuario para seleccionar gestos.

## Autor
Pedro Ringuelet

