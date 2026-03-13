import java.util.Scanner ;

public class Exercicio03 {
     public static void main(String[] args) throws Exception {
double dolar = 0; 
Scanner sc = new Scanner(System.in);
    System.out.println(" Digite o primeiro numero");
    dolar = sc.nextDouble();
    dolar = dolar * 4.95;
    System.out.println(" O valor em reais é: " + dolar);
}
}