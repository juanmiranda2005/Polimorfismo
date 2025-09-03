public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

  
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

   
    public void comer() {
        System.out.println(nombre + " está comiendo 🥩.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo 💤.");
    }

    public void jugar() {
        System.out.println(nombre + " está jugando 🎾.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        Mascota miMascota = new Mascota("Firulais", "Perro", 3);
        miMascota.mostrarInfo();
        miMascota.comer();
        miMascota.dormir();
        miMascota.jugar();
    }
}
