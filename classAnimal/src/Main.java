public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.setSonido("GUAU");
        Gato gato = new Gato();
        gato.setSonido("MIAU");
        Vaca vaca = new Vaca();
        vaca.setSonido("MUUU");

        System.out.println("El sonido del perro es: " + perro.getSonido());
        System.out.println("El sonido del gato es: " + gato.getSonido());
        System.out.println("El sonido de la vaca es: " + vaca.getSonido());
    }
}

abstract class Animal{

    String sonido;
        public void setSonido(String sonido){
            this.sonido = sonido;
        }
    public String getSonido() {
        return sonido;
    }
}

class Perro extends Animal{
}

class Gato extends Animal{

}

class Vaca extends Animal{

}