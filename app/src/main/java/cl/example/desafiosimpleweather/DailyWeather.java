package cl.example.desafiosimpleweather;

public class DailyWeather {
    private String ciudad;
    private String fecha;
    private String imagen;
    private String temperatura;
    private String grados;

    public DailyWeather(String ciudad, String fecha, String imagen, String temperatura, String grados) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.imagen = imagen;
        this.temperatura = temperatura;
        this.grados = grados;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getGrados() {
        return grados;
    }

    public void setGrados(String grados) {
        this.grados = grados;
    }

    @Override
    public String toString() {
        return "DailyWeather{" +
                "ciudad='" + ciudad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", imagen='" + imagen + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", grados='" + grados + '\'' +
                '}';
    }
}
