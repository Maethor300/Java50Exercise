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
        do{
            System.out.println("Digita una cadena de 5 palabras de largo");
            System.out.println("Que empiezen con X y termine con O");
          String cadena = scanner.nextLine();
           int length = cadena.length();

            if(cadena.equals("&&&&&")){
                System.out.println("saliste");
                break;
            }
            if(length == 5){

                    char subCadena = cadena.charAt(0);
                    char subCadena2 = cadena.charAt(length-1);
                    if(Character.toUpperCase(subCadena) == 'X' && Character.toUpperCase(subCadena2)=='O'){
                        System.out.println("Correcto");

                    }else{
                        System.out.println("Incorrecto");

                    }

            }else if(length != 5) {
                System.out.println("Error en el tamaño de la cadena");
                cadena = scanner.nextLine();
            }
        }while(true);

    }
    public static void Ejercicio13(){
        Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i == 0 || j == 0 || i == num - 1 || j == num -1){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void Ejercicio14(int euro){

        float libras = euro * 0.68f;
        if(euro == 1){
            System.out.println( euro +" euro"+ " son: " + libras);
        } else if (euro < 1 || euro > 0 || euro >= 10) {
            System.out.println( euro +" euros "+ "son: " + libras);
        }

    }
    public static void Ejercicio15(){
        int[] array = new int[101];
        for (int i = 1; i <= 100; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

    }
    public static void Ejercicio16(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamaño Del Array");
        int tamaño = scanner.nextInt();
        int[] array = new int[tamaño];


        int i = 0;
        do {
            System.out.println("Digita un numero");
            int num = scanner.nextInt();
            int conteo = 0;
            for (  i = 0; i < tamaño ; i++) {

                int aleatorio = (int) (Math.random() * 10);
                array[i] = aleatorio;

                if(num == array[i]){
                    conteo++;

                }
                System.out.println(aleatorio);

            }
            System.out.println("Numero "+num+" encontrado: " + conteo);
              i++;
        }while(i < tamaño);

    }
    public static void Ejercicio17(){

        int[] array = new int[100];


            for ( int i = 0; i < 99 ; i++) {

                int numeroAleatorio = (int) (Math.random() * 100000);
                array[i] = numeroAleatorio;
            }
            for (int i = 0; i < 99; i++) {
                if(array[i] >= 10000){
                    System.out.println("El numero es de 5 digitos y es : " + array[i]);
                }else if(array[i] >= 1000 && array[i] < 10000){
                    System.out.println("El numero es de 4 digitos y es : " + array[i]);
                } else if (array[i] >= 100 && array[i] < 1000) {
                    System.out.println("El numero es de 3 digitos y es : " + array[i]);
                } else if (array[i] >= 10 && array[i] < 100) {
                    System.out.println("El numero es de 2 digitos y es : " + array[i]);
                } else if (array[i]<10 ) {
                    System.out.println("El numero es de 1 digitos y es : " + array[i]);
                }
            }

    }
    public static void Ejercicio18(){
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numeroAleatorio = (int) (Math.random() * 9);
                matriz[i][j] = numeroAleatorio;
            }
        }
        System.out.println("Matriz Normal");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz invertida");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }
        System.out.println("");
    }
    public static void Ejercicio19(){
          Scanner scanner = new Scanner(System.in);
          int[][] matriz = new int[3][3];
          int[][] matrizInvertida = new int[3][3];
          boolean boolean1 = false;
          boolean boolean2 = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce un numero");
                int numbers = scanner.nextInt();
                matriz[i][j] = numbers;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz Invertida");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrizInvertida[i][j] = matriz[j][i];
                System.out.print(matrizInvertida[i][j]);
            }
            System.out.println();
        }

        System.out.println("Prueba: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == matrizInvertida[i][j] * -1){
                    boolean1 = true;
                }else {
                    boolean1 = false;
                    break;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == matrizInvertida[i][j]){
                    boolean2 = true;
                }else {
                    boolean2 = false;
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("Es igual pero no es antiSimetrica: " + boolean2);
        System.out.println("Es antiSimetrica: "+boolean1);
    }
    public static void Ejercicio20(){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
         int variable = 0;
        int variable1 = 0;
        int variable2 = 0;
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digita los numeros: ");
                int numbers = scanner.nextInt();
                matriz[i][j] = numbers;
            }
        }
        int conteo = 0;
        int conteo2 = 3-1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if(matriz[0][j] == matriz[i][j] ){
                    variable = variable + matriz[i][j];
                }
                if(matriz[i][conteo] == matriz[i][j]){
                    variable1 = variable1 + matriz[i][j];
                }
                if(matriz[i][conteo2] == matriz[i][j]){
                    variable2 = variable2 + matriz[i][j];
                }
                if(matriz[conteo][j] == matriz[i][j]){
                    suma = suma + matriz[i][j];
                }
            }
            conteo++;
            conteo2--;
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        if(suma/3 == variable && suma/3 == variable1 && suma/3 == variable2){
            System.out.println("Es magica");
        }else {
            System.out.println("No es magica");
        }
    }
    public static void Ejercicio21(){
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int numeroAleatorio = (int) (Math.random() * 9);
                matriz2[i][j] = numeroAleatorio;
                System.out.print(matriz2[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numeroAleatorio = (int) (Math.random() * 9);
                matriz[i][j] = numeroAleatorio;
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
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
      //Ejercicio12();
      //Ejercicio13();
      //Ejercicio14(1);
      //Ejercicio15();
      //Ejercicio16();
      //Ejercicio17();
      //Ejercicio18();
      //Ejercicio19();
      //Ejercicio20();
      //Ejercicio21();
    }
}