

public class medico extends persona
{
     public int numeroDePacientesAtendidos;
    public medico (String nombre,int edad,String carnet,int pacientesAtendidos)
    {
        super(nombre,edad,carnet);
        this.numeroDePacientesAtendidos = pacientesAtendidos;
    }
    public String MostrarPacientesAtendidos()
    {
        return "En total atendi "+numeroDePacientesAtendidos+" pacientes";
    }
}
