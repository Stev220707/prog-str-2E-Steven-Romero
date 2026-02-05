public class Ticket {

    private double DESCUENTO = 0.10;
    private double PRECIO = 10;

    public Ticket(){ //Contructor vacio, si no lo escribes, se crea un par de

    }

    public double calcularSubtotal(int cantidad){
        return cantidad*PRECIO;
    }

    public double calcularDescuento(double subtotal){
        return (subtotal*DESCUENTO);
    }

    public double calcularTotal(double subtotal){
        return subtotal-calcularDescuento(subtotal);
    }

    public void imprimirTicket(int cantidad, double subtotal, double total, double descuento){

    }


}
