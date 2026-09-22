public class Lista {

    Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public void agregar(Vehiculo vehiculo) {

        Nodo nuevo = new Nodo(vehiculo);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public void mostrarVehiculos() {

        Nodo actual = cabeza;

        while (actual != null) {

            actual.vehiculo.mostrarInformacion();

            if (actual.vehiculo.diasEnPatio >= 180) {
                System.out.println("Estado: CHATARRIZAR");
            } else {
                System.out.println("Estado: EN PATIO");
            }

            System.out.println("----------------------");

            actual = actual.siguiente;
        }
    }
}
