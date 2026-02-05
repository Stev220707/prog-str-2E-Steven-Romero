public class ShippingCalculator {

    public double calcularSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean zonaRemota) {
        double subtotal = 0;

        subtotal += (tipoServicio == 1) ? 50.0 : 90.0;

        subtotal += pesoKg * 12.0;

        if (distanciaKm <= 50) subtotal += 20;
        else if (distanciaKm <= 200) subtotal += 60;
        else subtotal += 120;

        if (zonaRemota) subtotal *= 1.10;

        return subtotal;
    }

    public double calcularIVA(double subtotal) {
        return subtotal * 0.16;
    }

    public double calcularTotal(double subtotal, double iva) {
        return subtotal + iva;
    }
}