public class Main {
    public static void main(String[] args) {
        int entero = 30;
        System.out.println("Numeros primos:");
        System.out.println(primos(entero));
        System.out.println("Sucesion de Fibonacci:");
        System.out.println(fibonnacci(entero));
    }

    private static String fibonnacci(int n) {
        String sucecion = "";
        for (int i = 0; i < n; i++) {
            sucecion += fibonacciRecursivo(i) + " ";
        }
        return sucecion;
    }

    public static int fibonacciRecursivo(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }

    }
    private static String primos(int limite){
        String sucecion = "";
        int contador = 0;
        int numero = 0;
        while (contador < 30){
            if (esPrimo(numero) == true) {
                sucecion += String.valueOf(numero) + " ";
                contador++;
            }
            numero++;
        }
        return sucecion;
    }
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}