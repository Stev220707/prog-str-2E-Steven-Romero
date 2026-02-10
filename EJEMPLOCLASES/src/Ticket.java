public class Ticket {

    private double DESCUENTO = 0.10;
    private double PRECIO = 10;
    public double subtotal;
    public double descuentoCalculado;
    public double total;

    public Ticket(){ //Constructor vacio, si no lo escribes, se crea un por default

    }

    public void procesar(int cantidad){
        calcularSubtotal(cantidad);
        calcularDescuento(this.subtotal);
        calcularTotal(this.subtotal);
    }

    private void calcularSubtotal(int cantidad){
        this.subtotal=cantidad*PRECIO;
    }

    private void calcularDescuento(double subtotal){
        this.descuentoCalculado= this.subtotal*DESCUENTO;
    }

    private void calcularTotal(double subtotal){
        this.total= this.subtotal - this.descuentoCalculado;
    }

    public void imprimirTicket(int cantidad){
        System.out.println("---Ticket---");
        System.out.println("Cantidad de productos: "+cantidad);
        System.out.println("Subtotal: "+this.subtotal);
        System.out.println("Descuento: "+this.descuentoCalculado);
        System.out.println("Total del ticket: "+this.total);
        System.out.println("---Ticket---");
    }


}