package clase;

public class Main 
{
    public static void main(String[]args)
    {
     Interes interes = new Interes(1000.000,2,5);
         
      System.out.println("capital: "+interes.obtenerCapitalC());
      System.out.println("interes: "+interes.obtenerInteresI());
      System.out.println("periodo en meses: "+interes.obtenerPeriodoN());
      interes.calcularAcumulado();
    }
}


