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
        int[] array = {1,26,36,47,5,6,72,81,95,10,11,12,13,21,41,22,67,20,10,61,56,78,87,90,9,90,17,12,87,67,41,87,24,56,97,74,87,42,64,35,32,76,79,1,36,5,67,96,12,11,99,13,54,88,89,90,75,12,41,76,67,78,87,45,12,22,26,42,56,78,98,45,34,23,32,56,74,16,19,18,24,67,97,46,87,13,67,89,93,24,21,68,78,98,90,67,12,41,65,12};
        int[] array2 = {72,81,95,67,20,10,17,12,87};
        int indice = 0;
        int indice2 = 0;
        System.out.println("Matriz 10x10");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                    matriz2[i][j] = array[indice];
                    indice++;

                System.out.print(" "+matriz2[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matriz[i][j] =  array2[indice2];
                indice2++;

                System.out.print(" "+matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        int conteo ;
        int conteo0;
        int conteo1;
        int conteo1_1;
        int conteo3;
        int conteo3_1;
        int varJava;
        int siguiente;
        int resta;
        int varJava2;
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        for (int i = 0; i < 10; i++) {

            conteo = 0;
            conteo0 = 0;
            conteo1 = 0;
            conteo1_1 = 0;
            conteo3 = 0;
            conteo3_1 = 0;
            varJava = 0;
            varJava2 = 0;
            siguiente = 0;
            resta = 0;

            for (int j = 0; j < 10; j++) {
                if (matriz[0][conteo] == matriz2[i][j]) {
                    if(conteo == 0){
                         varJava = j;
                    }


                    if(j - varJava == conteo0){
                       conteo0++;
                    }
                    if(conteo0 == 3){
                        System.out.println("ubicacion i: " + i + " ubicacion j: " + j);
                        j1 = j;
                        System.out.println(j1);
                    }
                        if (conteo < 2) {
                            conteo++;
                        }
                }
                if (matriz[1][conteo1] == matriz2[i][j]) {
                    if(conteo1 == 0){
                        varJava = j;
                    }


                    if(j - varJava == conteo1_1){

                        conteo1_1++;

                    }
                    if(conteo1_1 == 3){
                        System.out.println("ubicacion i: " + i + " ubicacion j: " + j);
                        j2 = j;
                        System.out.println(j2);
                    }
                    if (conteo1 < 2) {
                        conteo1++;
                    }
                }
                if (matriz[2][conteo3] == matriz2[i][j]) {
                    if(conteo3 == 0){
                        varJava = j;
                    }


                    if(j - varJava == conteo3_1){

                        conteo3_1++;

                    }
                    if(conteo3_1 == 3){
                        System.out.println("ubicacion i: " + i + " ubicacion j: " + j);
                        j3 = j;
                        System.out.println(j3);
                    }
                    if (conteo3 < 2) {
                        conteo3++;
                    }
                }

                System.out.println();
            }


        }
        if(j1==j2 && j2==j3 ){
            System.out.println("Existe la matriz 3x3 dentro de la matriz 10x10");
        }
    }
    public static void Ejercicio1Extra(){
          Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el tiempo en minutos: ");
          double numero = scanner.nextInt();
          double operacion = numero / 24;

          double floor1 ;
          if(operacion < 24){
              floor1 = operacion % 1*24;

          }else {
              floor1 = operacion % 1 *24;
          }
        System.out.println("Dias: "+ Math.floor(operacion)+" Horas: "+  Math.floor(floor1));

    }
    public static void Ejercicio2Extra(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el valor de la variable A: ");
        int a = scanner.nextInt();
        System.out.println("Digita el valor de la variable B: ");
        int b = scanner.nextInt();
        System.out.println("Digita el valor de la variable C: ");
        int c = scanner.nextInt();
        System.out.println("Digita el valor de la variable D: ");
        int d = scanner.nextInt();
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("a: "+ a + " b: "+b+" c: "+c+" d: "+ d);
    }
    public static void Ejercicio3Extra(){
        Scanner scanner = new Scanner(System.in);
        char vocal = scanner.next().charAt(0);
        String Mayuscula = String.valueOf(vocal).toUpperCase();

        if(Mayuscula.equals("A") || Mayuscula.equals("E") || Mayuscula.equals("I") ||Mayuscula.equals("O") || Mayuscula.equals("U")){
            System.out.println("Es Vocal");
        }else {
            System.out.println("No es vocal");
        }

    }
    public static void Ejercicio4Extra(){

        String romano = "";
        String I = "I";
        String X = "X";
        for (int i = 1; i <= 10; i++) {

                 if(i <= 3){
                     romano = "I".concat(romano);
                     System.out.println(romano);
             }
                if(i == 4 ){
                    romano =  romano.replace("I", "" );
                    romano = "V".concat(romano);
                    romano = I.concat(romano);
                    System.out.println(romano);
                }if(i == 5){

                romano =  romano.replace("IV", "V");
                System.out.println(romano);
            }if(i > 5 && i <= 8 ){
                 romano = romano.concat(I);
                System.out.println(romano);
            }if(i == 9){
                romano =  romano.replace("V", X);
                romano =  romano.replace("I", "");
                romano = I.concat(romano);
                System.out.println(romano);
            }if(i == 10 ){
                romano =  romano.replace("I", "");

                System.out.println(romano);
            }

        }

    }
    public static void Ejercicio5Extra(){
        Scanner scanner = new Scanner(System.in);
        String socios = scanner.nextLine();
        String mayusculas = socios.toUpperCase();
        double tratamiento = scanner.nextDouble();

        switch (mayusculas){
            case "A":
                System.out.println("El valor seria de: "+ tratamiento * 0.50);
            break;
            case "B":
                System.out.println("El valor seria de: "+ (tratamiento-tratamiento * 0.35));
            break;
            case "C":
                System.out.println("No tienes descuento");
                System.out.println("El valor seria de: "+  tratamiento);
        }

    }
    public static void Ejercicio6Extra(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digita el numero de personas: ");
        int personas = scanner.nextInt();
        int i = 0;
        double p160 = 0;
        int conteo = 0;
        double pTotal = 0;
        do {
            i++;
            System.out.println("Digita la estatura de la persona "+i+" en cm: ");
            double estatura = scanner.nextDouble();
            pTotal = pTotal + estatura;
            if(estatura <= 160){
                  p160 = p160 + estatura;
                  conteo++;
            }
        }while(i < personas);
        System.out.println(conteo);
        double promedio160 = p160 / conteo;
        double promedioTotal = pTotal / personas;
        System.out.println("Estatura promedio 1.60 mts " + promedio160);
        System.out.println("Estatura promedio total:  " + promedioTotal);
    }
    public static void Ejercicio7ExtraVDowhile(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digita la cantidad de numeros que quieres agregar: ");
        int numeros = scanner.nextInt();
        int mayor = 0;
        int menor = 0;
        double promedio = 0;
        int i = 0;
        do {
            i++;
            System.out.println("Digita el numero " +i+ ": ");
            int number = scanner.nextInt();
            promedio = promedio + number;
            if(i == 1){
                menor = number;
            }
            if(menor > number){
                menor = number;
            }
            if(mayor < number){
                mayor = number;
            }

        }while(i < numeros);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El promedio de los numeros es: " + promedio / numeros);
    }
    public static void Ejercicio7ExtraVwhile(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digita la cantidad de numeros que quieres agregar: ");
        int numeros = scanner.nextInt();
        int mayor = 0;
        int menor = 0;
        double promedio = 0;
        int i = 0;
        while (i < numeros ){
            i++;
            System.out.println("Digita el numero " +i+ ": ");
            int number = scanner.nextInt();
            promedio = promedio + number;
            if(i == 1){
                menor = number;
            }
            if(menor > number){
                menor = number;
            }
            if(mayor < number){
                mayor = number;
            }

        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El promedio de los numeros es: " + promedio / numeros);
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
      //Ejercicio1Extra();
      //Ejercicio2Extra();
      //Ejercicio3Extra();
      //Ejercicio4Extra();
      //Ejercicio5Extra();
      //Ejercicio6Extra();
      //Ejercicio7ExtraVDowhile();
      //Ejercicio7ExtraVwhile();

    }
}