public class Numeros {
    public static int sumarTresNumeros(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        return resultado;
    }
    public static int restarTresNumeros(int num1, int num2, int num3){
        int resultadoResta = num1 - num2 -num3;
        return resultadoResta;
    }
    public static int multiplicarTresNumeros(int num1, int num2, int num3){
        int resultadoMultiplicacion = num1 * num2 * num3;
        return resultadoMultiplicacion;
    }
    public static int dividirTresNumeros(int num1, int num2, int num3){
        int resultadoDivision = num1 / num2 / num3;
        return resultadoDivision;
    }
    public static void main(String[] args) {
        int numero1 = 500;
        int numero2 = 10;
        int numero3 = 2;
        int suma = sumarTresNumeros(numero1, numero2, numero3);
        int resta = restarTresNumeros(numero1, numero2, numero3);
        int multiplicacion = multiplicarTresNumeros(numero1, numero2, numero3);
        int division = dividirTresNumeros(numero1, numero2, numero3);
        System.out.println("La suma de los tres números es: " + suma);
        System.out.println("La resta de los tres numeros es: "+ resta);
        System.out.println("La multiplicacion de los tres numeros es: "+ multiplicacion);
        System.out.println("La division de los tres numeros es:" + division);
    }
}
