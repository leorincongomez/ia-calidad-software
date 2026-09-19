public class Compra {

    public double calcular(double precio, int edad, boolean vip) {

        if (edad >= 18) {
            if (vip) {
                precio = precio - (precio * 0.20);
            } else {
                precio = precio - (precio * 0.05);
            }
        }

        if (precio > 100000) {
            precio = precio - 5000;
        }

        return precio;
    }
}