import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        clearConsole();

        System.out.println("""
            88 88 888     888                                 888                                                                                  888 88 88 
            8P 8P 888     888                                 888                                                                                  888 8P 8P 
            "  "  888     888                                 888                                                                                  888 "  "  
                  888     888 88888b.   8888b.        .d8888b 888  8888b.  .d8888b   .d88b.       88888b.   .d88b.  888d888 88888b.d88b.   8888b.  888       
                  888     888 888 "88b     "88b      d88P"    888     "88b 88K      d8P  Y8b      888 "88b d88""88b 888P"   888 "888 "88b     "88b 888       
                  888     888 888  888 .d888888      888      888 .d888888 "Y8888b. 88888888      888  888 888  888 888     888  888  888 .d888888 888       
                  Y88b. .d88P 888  888 888  888      Y88b.    888 888  888      X88 Y8b.          888  888 Y88..88P 888     888  888  888 888  888 888       
                   "Y88888P"  888  888 "Y888888       "Y8888P 888 "Y888888  88888P'  "Y8888       888  888  "Y88P"  888     888  888  888 "Y888888 888

        """);

        System.out.print("Presione enter para comenzar "); scanner.nextLine();

        clearConsole();

        System.out.println("""
            Bienvenido al mundo de la informática, donde tu habilidad como estudiante será 
            puesta a prueba para salvar al resto de estudiantes de una inminente amenaza. 
            Es el año 2024, los profesores de varias materias aun se encuentran planificando 
            la letra del proyecto y los estudiantes que no cuentan con mucha paciencia someten 
            a los profes bajo mucho estrés. Esto provoca que durante una clase de ADA el 
            profesor por causa de mucho estrés comienza a perder la cabeza y en un arranque 
            de ira da una voltereta mortal inversa hacia delante y jala una palanca escondida 
            detras del pizarron, haciendo que las ventanas y puertas se cierren para someterlos a 
            una prueba de vida o muerte. Como un habilidoso estudiante, tienes la capacidad de 
            combatir esta amenaza utilizando tu conocimiento en la informática.
        """);

        System.out.println("""
                        8888888 888b    888 8888888  .d8888b.  8888888  .d88888b.  
                          888   8888b   888   888   d88P  Y88b   888   d88P" "Y88b 
                          888   88888b  888   888   888    888   888   888     888 
                          888   888Y88b 888   888   888          888   888     888 
                          888   888 Y88b888   888   888          888   888     888 
                          888   888  Y88888   888   888    888   888   888     888 
                          888   888   Y8888   888   Y88b  d88P   888   Y88b. .d88P 
                        8888888 888    Y888 8888888  "Y8888P"  8888888  "Y88888P"
        """);
        
        System.out.println("""
            El profesor impaciente comienza a explicar las normativas de la prueba, elejira a
            un alumno de entre todos para realizarla, y el resto depenera del alumno escojido.
            ----------------------------------------------------------------------------------
        """);

        System.out.println("A) Te ofreces para realizar la prueba");
        System.out.println("B) Solo te limitas a esperar que no te toque a ti");
        System.out.println("C) Intentas escapar del profesor\n");
        
        System.out.print("Elige una opción (A, B o C): ");
        String respuesta1 = scanner.nextLine().toUpperCase();
        
        switch (respuesta1) {
            case "A":
                clearConsole();

                System.out.println("""
                    Te levantas de tu silla y en un intento de valentía tu corazon se para debido al
                    miedo y mueres.   
                """);

                msgDied();
                break;
            case "B":
                clearConsole();

                System.out.println("""
                    Desgraciadamente el profesor termina por escojerte como el alumno que tratara de
                    realizar la prueba de vida o muerte. ¡Ahora los demas dependen de ti!.
                """);
                break;
            case "C":
                clearConsole();

                System.out.println("""
                    En un intento de escapar cometes el error de tropezar y golpearte tan fuerte la cabeza
                    que terminas pereciendo al instante.   
                """);

                msgDied();
                break;
            default:
                clearConsole();

                System.out.println("""
                    Te pones tan nervioso que empiezas a decir incoerencias. Mueres por un ACV.
                """);

                msgDied();
        }

        //Primera pregunta
        System.out.println("""
            El profe respira muy ondo y comienza a gritar. Te pregunta lo siguiente: ¿¡cual de 
            estas no es una cualidad del sofware!?
        """);

        System.out.println("A) Amigabilidad");
        System.out.println("B) Productividad");
        System.out.println("C) Asertividad");
        System.out.println("D) Visibilidad\n");
        
        System.out.print("Elige una opción (A, B, C o D): ");
        String respuesta2 = scanner.nextLine().toUpperCase();
        
        if (!respuesta2.equals("C")) {
            clearConsole();

            System.out.println("""
                ¡Incorrecto! grito el profesor antes de darte una patada inversa lateral cosmica
                supercalifragilisticamente poderosa y acabar contigo y el resto de alumnos.
            """);

            msgDied();
        }

        clearConsole();

        // Segunda pregunta
        System.out.println("""
            Respondiste correctamente, parese que se devilita sigue así. Pero aun quedan mas 
            preguntas, ¿¡cual de estas cualidades del software es interna!? exclama el profe:
        """);

        System.out.println("A) Correctitud");
        System.out.println("B) Visibilidad");
        System.out.println("C) Confiabilidad\n");

        System.out.print("Elige una opción (A, B o C): ");
        String respuesta3 = scanner.nextLine().toUpperCase();

        if (!respuesta3.equals("B")) {
            clearConsole();

            System.out.println("""
                Respondiste incorrectamente. Debido a eso el profe ahora es mas fuerte que nunca.
                !!!Ahora todos estan a su merced¡¡¡.
            """);

            msgDied();
        }

        clearConsole();

        //Tercera pregunta
        System.out.println("""
            Pasaste la segunda pregunta, recuarda que todos dependen de ti !NO metas la pata 
            ahora¡. Al vorde del colapso te pregunta el profe: ¿¡cual de estas es una cualidad de 
            software que debe tener una caja negra!?:
        """);

        System.out.println("A) Robustez");
        System.out.println("B) Visibilidad");
        System.out.println("C) Productividad");
        System.out.println("D) Amigabilidad");
        System.out.println("E) Reusabilidad\n");

        System.out.print("Elige una opción (A, B, C, D o E): ");
        String respuesta4 = scanner.nextLine().toUpperCase();

        if (!respuesta4.equals("A")) {
            clearConsole();

            System.out.println("""
                'La muerte no es la ultima palabra, es mas bien el preludio de una nueva sinfonia'
                Dijo el profesor antes de acabar con tu vida subitamente.
            """);

            msgDied();
        }

        clearConsole();

        // Quinta pregunta
        System.out.println("""
            Parese que esta perdiendo el control de si mismo y esta a punto de colapsar ¡¡¡rapido!!! 
            responde ¿¡cuantas son las cualidades del software que dimos en clase!? vuelve a
            exclamar el profe mientras cae al piso sin fuerzas.
        """);

        System.out.println("A) 13");
        System.out.println("B) 16");
        System.out.println("C) 14\n");

        System.out.print("Elige una opción (A, B o C): ");
        String respuesta5 = scanner.nextLine().toUpperCase();

        if (!respuesta5.equals("C")) {
            clearConsole();

            System.out.println("""
                A punto del colapso total se recupera inesperadamente y acaba con todos los alumnos.
            """);

            msgDied();
        }

        clearConsole();

        // Sexta pregunta
        System.out.println("""
            ¡Es ahora dale el golpe final!!!, con sus últimos alientos el profe te pregunta: 
            ¿Cuál es el papel de los requerimientos funcionales?
        """);

        System.out.println("A) Describen funciones");
        System.out.println("B) Describen acciones");
        System.out.println("C) Organizan funciones");
        System.out.println("D) Ninguna es correcta\n");

        System.out.print("Elige una opción (A, B, C o D): ");
        String respuesta6 = scanner.nextLine().toUpperCase();

        if (!respuesta6.equals("A")) {
            clearConsole();

            System.out.println("""
                Por culpa de tu poco IQ ahora el profesor a recuperado el aliento y dinamita todo
                el lugar.
            """);

            msgDied();
        }

        clearConsole();
        msgWin();

        System.out.println("""
            ¡Felicidades! Has respondido correctamente a todas las preguntas. Gracias a ti el profe
            ahora esta mas tranquilo y tus compañeros estan a salvo.
        """);
    }

    public static void msgWin() {
        System.out.println("""
                                       
                                    ##   ##  ######   ##  ## 
                                    ##   ##    ##     ### ##  
                                    ## # ##    ##     ######  
                                    #######    ##     ######  
                                    ### ###    ##     ## ###  
                                    ##   ##  ######   ##  ##  
        """);
    }

    public static void msgDied() {
        System.out.println("""
                                                    
        DDDDDDDDDDDDD      IIIIIIIIIIEEEEEEEEEEEEEEEEEEEEEEDDDDDDDDDDDDD        
        D::::::::::::DDD   I::::::::IE::::::::::::::::::::ED::::::::::::DDD     
        D:::::::::::::::DD I::::::::IE::::::::::::::::::::ED:::::::::::::::DD   
        DDD:::::DDDDD:::::DII::::::IIEE::::::EEEEEEEEE::::EDDD:::::DDDDD:::::D  
          D:::::D    D:::::D I::::I    E:::::E       EEEEEE  D:::::D    D:::::D 
          D:::::D     D:::::DI::::I    E:::::E               D:::::D     D:::::D
          D:::::D     D:::::DI::::I    E::::::EEEEEEEEEE     D:::::D     D:::::D
          D:::::D     D:::::DI::::I    E:::::::::::::::E     D:::::D     D:::::D
          D:::::D     D:::::DI::::I    E:::::::::::::::E     D:::::D     D:::::D
          D:::::D     D:::::DI::::I    E::::::EEEEEEEEEE     D:::::D     D:::::D
          D:::::D     D:::::DI::::I    E:::::E               D:::::D     D:::::D
          D:::::D    D:::::D I::::I    E:::::E       EEEEEE  D:::::D    D:::::D 
        DDD:::::DDDDD:::::DII::::::IIEE::::::EEEEEEEE:::::EDDD:::::DDDDD:::::D  
        D:::::::::::::::DD I::::::::IE::::::::::::::::::::ED:::::::::::::::DD   
        D::::::::::::DDD   I::::::::IE::::::::::::::::::::ED::::::::::::DDD     
        DDDDDDDDDDDDD      IIIIIIIIIIEEEEEEEEEEEEEEEEEEEEEEDDDDDDDDDDDDD        
        """);

        System.exit(0);
    }

    public static void clearConsole() {
        for(int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}
