public class Cono extends figurasGeometricas
{
    private int radio;
    private int altura;

    public Cono (int radio, int altura)
    {
        this.radio = radio;
        this.altura = altura;
    }
    public int getRadio()
    {
        return radio;
    }
    public int getAlatura()
    {
        return altura;
    }
    public void setAltura(int altura)
    {
        this.altura = altura;
    }
    public void setRadio(int radio)
    {
        this.radio = radio;
    }
    public String toString[]
    {
        return (1/3)*altura*Math.PI*radio;
    }
}
