public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador ();
        System.out.println("La edad del cliente es: " + cliente.edad);
        System.out.println("El nombre del cliente es: " + cliente.nombre);
        System.out.println("El telefono del cliente es: " + cliente.telefono);
        System.out.println("El credito del cliente es: " + cliente.credito);
        System.out.println("El salario del trabajador es: " + trabajador.salario);
    }
}
class Persona{
    int edad = 30;
    String nombre = "Pablo";
    int telefono = 1158817204;
}
class Cliente extends Persona {
    int credito = 500;
}

class Trabajador extends Persona {
    int salario = 15000;
}