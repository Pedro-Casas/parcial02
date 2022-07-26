public class Esfera extends figurasGeometricas
{
    private double radio;

    public Esfera (double radio)
    {
        this.radio = radio;
    }
    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    public String toString[]
    {
        return (4/3)*Math.PI*radio*radio*radio;
    }

}