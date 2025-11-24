public class gestordereservas {

    /**
     *
     */
    private reserva[] pedido; 
    private int numeroActual;
    private int tamañoPedido;

    public GestorPedidos(int tamañoPedido) 
    {
        this.tamañoPedido = tamañoPedido;
        pedido = new reserva[tamañoPedido];
        numeroActual = 0;
    }

    public void agregarItem(reserva item){

        pedido[numeroActual] = item;
        numeroActual += 1;
    }

    public reserva[] getPedido() {
        return pedido;
    }
    
    
}
