import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void Ejercicio1(){
        DecimalFormat formato = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digita el primer numero");
        float num = scanner.nextFloat();
        System.out.println("Digita el segundo numero");
        float num2 = scanner.nextFloat();
        float resultado = num + num2;
        System.out.println("El resultado es: ");
        System.out.println(formato.format(resultado));
    }
    public static void Ejercicio2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita tu nombre");
        String name = scanner.nextLine();
        System.out.println("Tu nombre es: ");
        System.out.println(name);
    }
    public static void Ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un texto");
        String frase = scanner.nextLine();
        System.out.println("Mayusculas");
        System.out.println(frase.toUpperCase());
        System.out.println("Minusculas");
        System.out.println(frase.toLowerCase());
    }
    public static void Ejercicio4(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digita la temperatura en grados");
        double temperatura1 = scanner.nextDouble();
        double Fahrenheit = 32 + (9 * temperatura1 / 5);
        System.out.println("Temperatura en grados Fahrenheit: "+ Fahrenheit);
    }
    public static void Ejercicio5(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormat formato = new DecimalFormat("#.#");
        System.out.println("Digita un numero");
        int numero = scanner.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raizCuadrada);
    }
    public static void Ejercicio6(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digita un numero");
        double numero = scanner.nextDouble();
        if(numero % 2 == 0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
    public static void Ejercicio7(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digita una frase");
        String frase = scanner.nextLine();
        if(frase.equals("eureka")){
            System.out.println("eureka");
        }else {
            System.out.println("Nop");
        }
    }
    public static void Ejercicio8(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Escribe un frase");
        String frase = scanner.nextLine();
        if(frase.length() == 8){
            System.out.println("correcto");
        }else {
            System.out.println("incorrecto");
        }
    }
    public static void Ejercicio9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un frase");
        String frase = scanner.nextLine();
        if(frase.substring(0, 1).equals("A")){
            System.out.println("correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    public static void Ejercicio10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el numero");
        int num = scanner.nextInt();
        int suma = 0;
        int i = 0;
         do {
             System.out.println("Digita el numero siguiente numero");
             int num1 = scanner.nextInt();
             suma = suma + num1;
             if(suma >= num){
                 break;
             }
             i++;
         }while(i < num);
    }
    public static void Ejercicio11(){
        Scanner scanner = new Scanner(System.in);

         char palabra1 ;
         char palabra;
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Salir");

            System.out.print("Ingrese su opción: ");
           palabra1 ='w';
            int num = scanner.nextInt();
           if(num == 1){
               System.out.println("suma");
           }else if(num == 2){
               System.out.println("resta");
           } else if (num == 3) {
               System.out.println("Multiplicar");
           } else if (num == 4) {
               System.out.println("Dividir");
           }else if (num == 5){
               System.out.println("Quieres Salir S/N");
               palabra = scanner.next().charAt(0);
               if( Character.toUpperCase(palabra) == 'S'){
                   palabra1 = Character.toUpperCase(palabra);
               } else {
                   System.out.println("Volviendo al menu");
                 }
               }else{
               System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
           }
        }while(palabra1 != 'S');
    }
    public static void Ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita una cadena de 5 palabras de largo");
        System.out.println("Que empiezen con X y termine con O");
        String cadena = scanner.nextLine();
        int length = cadena.length();
        System.out.println(length);
        do{
            length = cadena.length();
            if(length == 5){
                break;
            }else if(length != 5){
                System.out.println("Error en el tamaño de la cadena");
                 cadena = scanner.nextLine();

            }

        }while(true);

    }
    public static void main(String[] args) {
      //Ejercicio1();
      //Ejercicio2();
      //Ejercicio3();
      //Ejercicio4();
      //Ejercicio5();
      //Ejercicio6();
      //Ejercicio7();
      //Ejercicio8();
      //Ejercicio9();
      //Ejercicio10();
      //Ejercicio11();
      Ejercicio12();
    }
}