import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    final double FACTOR_CONVERSION = 1.8;

    Scanner scanner = new Scanner(System.in);

    System.out.println("\t- CONVERSOR DE TEMPERATURA -");



    String repetir;

    do {

      int eleccion = seleccionarConversion(scanner);

      procesarConversion(eleccion, scanner, FACTOR_CONVERSION);

      repetir = pedirRepetir(scanner);

    } while (repetir.equals("s"));



    System.out.println("¡Hasta luego!");

    scanner.close();

  }



  public static int seleccionarConversion(Scanner scanner) {

    System.out.println("Seleccione una opción:");

    System.out.println("1: Celsius a Fahrenheit");

    System.out.println("2: Fahrenheit a Celsius");

    System.out.print("Elección: ");

    return scanner.nextInt();

  }



  public static void procesarConversion(int eleccion, Scanner scanner, double factor) {

    if (eleccion == 1) convertirCelsiusAFahrenheit(scanner, factor);

    else if (eleccion == 2) convertirFahrenheitACelsius(scanner, factor);

    else System.out.println("Por favor, introduzca 1 o 2.");

  }



  public static void convertirCelsiusAFahrenheit(Scanner scanner, double factor) {

    System.out.print("Introduzca la temperatura en grados Celsius: ");

    double celsius = scanner.nextDouble();

    double fahrenheit = (celsius * factor) + 32;

    System.out.println("La temperatura es: " + fahrenheit + "ºF");

  }



  public static void convertirFahrenheitACelsius(Scanner scanner, double factor) {

    System.out.print("Introduzca la temperatura en grados Fahrenheit: ");

    double fahrenheit = scanner.nextDouble();

    double celsius = (fahrenheit - 32) / factor;

    System.out.println("La temperatura es: " + celsius + "ºC");

  }



  public static String pedirRepetir(Scanner scanner) {

    System.out.print("¿Desea realizar otra conversión? (S/N): ");

    return scanner.next().trim().toLowerCase();

  }

}
