public class Main {
    public static void main(String[] args) {
        // Creamos objetos de las subclases "Circulo", "Cuadrado" y "Triangulo"
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(4);
        Triangulo triangulo = new Triangulo(3, 4, 5);

        // Mostramos el área y perímetro de cada figura
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());

        System.out.println("Área del cuadrado: " + cuadrado.area());
        System.out.println("Perímetro del cuadrado: " + cuadrado.perimetro());

        System.out.println("Área del triángulo: " + triangulo.area());
        System.out.println("Perímetro del triángulo: " + triangulo.perimetro());
    }
}

// Clase abstracta "Figura"
abstract class Figura {
    // Métodos abstractos para calcular el área y el perímetro
    public abstract double area();
    public abstract double perimetro();
}

// Subclase "Círculo" que extiende de la clase "Figura"
class Circulo extends Figura {
    private double radio;

    public Circulo(double r) {
        radio = r;
    }

    // Implementación de los métodos abstractos para calcular el área y el perímetro
    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

// Subclase "Cuadrado" que extiende de la clase "Figura"
class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double l) {
        lado = l;
    }

    // Implementación de los métodos abstractos para calcular el área y el perímetro
    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }
}

// Subclase "Triángulo" que extiende de la clase "Figura"
class Triangulo extends Figura {
    private double lado1, lado2, lado3;

    public Triangulo(double l1, double l2, double l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    // Implementación de los métodos abstractos para calcular el área y el perímetro
    public double area() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
}