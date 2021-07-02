
public class persona
{
    private String nombre;
    private int edad;
    private String cedulaDeIdentidad;
    public persona(String nombre,int edad,String carnet)
    {
        this.nombre = nombre;
        this.edad  = edad;
        this.cedulaDeIdentidad = carnet;
    }
    public String saludar()
    {
        return "me presento, mi nombre es "+nombre;
    }
    public void cambiarNombre(String Nombre)
    {
        this.nombre = Nombre;
    }
    public String mostrarEdad()
    {
        return "la edad de la persona es"+edad+" años";
    }
}
