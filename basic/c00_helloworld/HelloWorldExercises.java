package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/


public class HelloWorldExercise {

    public static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("¡Hola Mundo!");
        // Este programa imprime mensajes imprime Hola Mundo.

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        // Este programa imprime mensajes imprime Hola y aparte Mundo.
        System.out.println("¡Hola \n Mundo!");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // YALA

        // 4. Crea un comentario en varias líneas.
        /*Este es
        un comentario
        en varias líneas*/

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 39\nColor Favorito: Azafrán\nCiudad: Manta");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.out.println("");
        System.err.println("Este es un mensaje de error.");
        System.out.println("Este es un mensaje normal.");
        System.out.printf("Este es un mensaje formateado: %s\n", "Hola Mundo");
        System.out.format("Este es otro mensaje formateado: %d\n", 2024);
        System.out.println("Este es un mensaje normal nuevamente.");

        // 7. Utiliza varios println para imprimir una frase.
        Systema.out.println("¡Hola" + "mecoo");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("\uD83D\uDE00"); // 😀
        System.out.println("\uD83D\uDE80"); // 🚀
        System.out.println("\uD83D\uDD25"); // 🔥
        

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
            // yala

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

     }
}