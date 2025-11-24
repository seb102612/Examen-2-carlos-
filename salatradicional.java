public class salatradicional extends reserva

    private int duracionminima;

    public salatradicional(String codigo, String nombrePelicula, double costobase, int duracionminima) {
        super(codigo, nombrePelicula, costobase ) ;
        this.duracionminima = duracionminima;
    }

    public int duracionminima() {
        return duracionminima;
    }
    public void setduracionminima(int duracionminima) {
        this.duracionminima = duracionminima;
    }

    @Override
    public String obtenerDetalles() {
        // TODO Auto-generated method stub

        String resultado = super.obtenerDetalles();
        if(duracionminima){
            resultado += " duracionminima";
        }else{
            resultado += " duraciónmaxima";
        }

        return resultado;

    }
    
}
