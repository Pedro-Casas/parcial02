public class Cubo extends figurasGeometricas
{
    private int area;

    public Cubo (int area)
    {
        this.area = area;
    }
    public int getRadio()
    {
        return area;
    }

    public void setArea(int area)
    {
        this.area = area;
    }

    public String toString[]
    {
        return area*area*area;
    }

}