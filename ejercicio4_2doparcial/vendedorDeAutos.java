

public class vendedorDeAutos extends persona
{
    public int cantidadDeAutosVendidos;
    public vendedorDeAutos(String nombre,int edad,String carnet,int numeroDeAutosVendidos)
    {
        super(nombre,edad,carnet);
        this.cantidadDeAutosVendidos = numeroDeAutosVendidos;
    }
    public String MostrarCantidadDeAutosVendidos()
    {
        return "Tengo un total de "+cantidadDeAutosVendidos+" autos vendidos";
    }
}
