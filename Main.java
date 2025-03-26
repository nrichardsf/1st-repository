// CONVERSOR BIDIRECCIONAL GRADOS CELSIUS-FAHRENHEIT

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final double CONSTANTE_CONVERSION = 1.8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t- CONVERSOR DE TEMPERATURA -");
        boolean repetirPrograma = false;

        do {
            int eleccionConversion = seleccionarConversion(scanner);

            if (eleccionConversion == 1) {
                double celsiusAFahrenheit = celsiusAFahrenheit(scanner, CONSTANTE_CONVERSION);
                System.out.println("La temperatura es: " + celsiusAFahrenheit + "ºF\n" + "De nada :)");
            } else{
                double fahrenheitACelsius = fahrenheitACelsius(scanner, CONSTANTE_CONVERSION);
                System.out.println("La temperatura es: " + fahrenheitACelsius + "ºC\n" + "De nada :)");
            }

            System.out.println("¿Desea realizar otra conversión? (S/N)");
            boolean repetirEleccion = false;

            do {
                String respuesta = scanner.next().toLowerCase();
                if (respuesta.equals("s")) {
                    repetirPrograma = false; // VOLVEMOS A EMPEZAR EL PROGRAMA
                    repetirEleccion = true; // SALIMOS DEL BUCLE DE ELECCIÓN
                } else if (respuesta.equals("n")) {
                    repetirPrograma = true; // FINALIZAMOS PROGRAMA
                    repetirEleccion = true; // SALIMOS DEL BUCLE DE ELECCIÓN
                    System.out.println("¡Hasta luego! ⋆.˚☆˚.⋆ (◡‿◡✿)");
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese 'S' o 'N'.");
                    repetirEleccion = false; // VOLVEMOS A PEDIR LA RESPUESTA
                }
            } while (!repetirEleccion);

        } while (!repetirPrograma);
        scanner.close();
    }

    public static double fahrenheitACelsius(Scanner scanner, double CONSTANTE_CONVERSION) {
        System.out.println("Introduzca la cifra de su temperatura en grados Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();
        double conversionCelsius = (temperaturaFahrenheit - 32) / CONSTANTE_CONVERSION;
        return conversionCelsius;
    }

    public static double celsiusAFahrenheit(Scanner scanner, double CONSTANTE_CONVERSION) {
        System.out.println("Introduzca la cifra de su temperatura en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        double conversionFahrenheit = (temperaturaCelsius * CONSTANTE_CONVERSION) + 32;
        return conversionFahrenheit;
    }

    public static int seleccionarConversion(Scanner scanner) {
        System.out.println("Seleccione una de las siguientes opciones: ");
        System.out.println("Introduzca 1: Celsius a Fahrenheit");
        System.out.println("Introduzca 2: Fahrenheit a Celsius");
        int eleccion = 0;
        do {
            System.out.print("Elección: ");
            eleccion = scanner.nextInt();

            // MENSAJE PARA CUANDO NO INTRODUCIMOS UN NÚMERO VÁLIDO
            if ((eleccion < 1) || (eleccion > 2)) {
                System.out.println("Por favor introduzca un número válido :)");
            }
        } while (eleccion < 1 || eleccion > 2);
        return eleccion;
    }
}
