public class Vehiculo {
    private String marca;
    private int año;
    
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.año = año;
    }
    
    public void acelerar() {
        System.out.println("Burrum! Burrum!");
    }
    
    public String obtenerInformacion() {
        return marca + " " + " (" + año + ")";
    }
}

    public static void main(String[] args) {
        Vehiculo miCoche = new Vehiculo("Toyota",  2020);
        System.out.println(miCoche.obtenerInformacion());
        miCoche.acelerar();
    }