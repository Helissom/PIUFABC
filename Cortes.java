import java.util.Scanner;

public class Cortes {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		System.out.println();
     	int c=scan.nextInt();
		System.out.println();
        System.out.println((c * (c + 1) >> 1) + 1);
    }
}
