
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) throws Exception {
    int divisao = 0;
    int divisao1 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println(" Digite o primeiro numero");
    divisao = sc.nextInt();
    System.out.println(" Digite o segundo numero");
    divisao1 = sc.nextInt();
    int resultado = divisao % divisao1;
    System.out.println(" O resto da divisao e : " + resultado);
}
}
