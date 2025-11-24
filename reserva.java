public class reserva {

    //id (String), nombre (String), precio (double).
    private String codigo;
    private String nombrePelicula;
    private double costobase;

    public reserva(String codigo, String nombrePelicula, double costobase) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costobase = costobase;
    }

    public String getcódigo() {
        return codigo;
    }
    
    public String getnombrePelicula() {
        return nombrePelicula;
    }
    public void setNombre(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    public double getcostobase() {
        return costobase;
    }
    public void setcostobase(double costobase) {
        this.costobase = costobase;
    }

    public String obtenerDetalles(){
        String resultado = "codigo: " + codigo + " nombrePelicula: " + nombrePelicula + " costobase: " + costobase;
        return resultado;

    }
}

