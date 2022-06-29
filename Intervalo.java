import java.util.Scanner;

public class Intervalo
{
public static void main(String[] args)
  {
    double numqualquer;
    Scanner scan = new Scanner(System.in);
    numqualquer = scan.nextDouble();

    if (numqualquer >=0 && numqualquer <= 25)
      System.out.println("intervalo [0,25]");
    else if (numqualquer > 25 && numqualquer < 50)
      System.out.println("intervalo (25,50]");
    else if (numqualquer >= 50 && numqualquer < 75)
      System.out.println("intervalo (50,75]");
    else if (numqualquer >= 75 && numqualquer <= 100)
      System.out.println("intervalo (75,100]");
    else{
      System.out.println("Fora de intervalo");
    }
  }    
}
