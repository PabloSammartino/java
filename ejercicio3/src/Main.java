public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Pablo");
        String nombre = persona.getNombre();
        persona.setEdad(30);
        int edad = persona.getEdad();
        persona.setTelefono (1158817204);
        int telefono = persona.getTelefono();
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
}