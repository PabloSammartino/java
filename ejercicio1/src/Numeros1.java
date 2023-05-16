public class Numeros1 {
    public static int restarTresNumeros(int num1, int num2, int num3){
        int resultadoResta = num1 - num2 - num3;
        return resultadoResta;
    }
    public static void main (String [] string) {
        int num1 = 1000;
        int num2 = 500;
        int num3 = 10;
        int resta = restarTresNumeros(num1, num2, num3);
        System.out.println("La resta de los tres numeros es:" +resta);
    }
}