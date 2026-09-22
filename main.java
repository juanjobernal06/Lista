public class Main {

    public static void main(String[] args) {

        Lista patios = new Lista();

        Vehiculo vehiculo1 = new Vehiculo(
                "ABC123", "Carro", "Mazda", 50);

        Vehiculo vehiculo2 = new Vehiculo(
                "DEF456", "Moto", "Yamaha", 200);

        Vehiculo vehiculo3 = new Vehiculo(
                "GHI789", "Camion", "Chevrolet", 100);

        Vehiculo vehiculo4 = new Vehiculo(
                "JKL321", "Bus", "Mercedes", 250);

        patios.agregar(vehiculo1);
        patios.agregar(vehiculo2);
        patios.agregar(vehiculo3);
        patios.agregar(vehiculo4);

        System.out.println("VEHICULOS EN LOS PATIOS");
        System.out.println("=======================");

        patios.mostrarVehiculos();
    }
}
