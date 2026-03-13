//Gabriel Castro Lara Oliveira
//Matricula : 1261941637
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
   double a = 0; 
   double b = 0;
   System.out.println(" Digite o primeiro numero");     
   Scanner sc = new Scanner(System.in);
   a = sc.nextDouble();
   System.out.println(" Digite o segundo numero");
   b = sc.nextDouble();
   double resultado = a + b;
    System.out.println(" O resultado da soma é: " + resultado);
      double resultado1 = a - b;
    System.out.println(" O resultado da subtração é: " + resultado1);
      double resultado2 = a * b;
    System.out.println(" O resultado da multiplicação é: " + resultado2);
      double resultado3 = a / b;
    System.out.println(" O resultado da divisão é: " + resultado3);
}
}
