import java.util.Scanner;  

public class Soma
{
  public static void main(String[] args)
  {
    int x, y, soma;
    Scanner scan = new Scanner(System.in);

    x = scan.nextInt();
    y = scan.nextInt();

    soma = x + y;

    System.out.println(soma);
    
  }
}
