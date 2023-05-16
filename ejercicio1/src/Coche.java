public class Coche{
    private int numPuertas;
    public Coche(){

        numPuertas = 4;
    }
    public void agregarPuerta(){

        numPuertas++;
    }
    public int getNumPuertas() {

        return numPuertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas.");
        miCoche.agregarPuerta();
        System.out.println("Después de agregar una puerta, el coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
}