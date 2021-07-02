
public class policia extends persona
{
    public int numeroDeDelicuentesApresados;
    public policia(String nombre,int edad,String carnet,int delicuentes)
    {
        super(nombre,edad,carnet);
        this.numeroDeDelicuentesApresados = delicuentes;
    }
    public String MostrarApresados()
    {
        return "atrape un total de "+numeroDeDelicuentesApresados+" delicuentes";
    }
}
