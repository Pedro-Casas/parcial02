public class figurasGeometricas
{
    protected int Volumen;
    protected String Nombre;


    public figurasGeometricas(int Volumen, String Nombre)
    {
        this.Volumen= Volumen;
        this.Nombre = Nombre;
    }
    
    public int getVolumen()
    {
        return Volumen;
    }

    public String getNombre()
    {
        return Nombre;
    }
    
    public void setNombre(String Nombre)
    {
        this.Nombre = Nombre;
    }

    public void setVolumen(int Volumen)
    {
        this.Volumen = Volumen;
    }
    public String toString[]
    {
        return "El volumen del " + Nombre + " es: " + Volumen;
    }

} 