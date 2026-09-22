public class Vehiculo {

    String placa;
    String tipo;
    String marca;
    int diasEnPatio;

    public Vehiculo(String placa, String tipo, String marca, int diasEnPatio) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.diasEnPatio = diasEnPatio;
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Dias en patio: " + diasEnPatio);
    }
}
