import java.util.Scanner;
public class Exercicio05{
     public static void main(String[] args) throws Exception {
     double nota1 = 0;
     double nota2 = 0;
     double nota3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite a primeira nota");
        nota1 = sc.nextDouble();
        System.out.println(" Digite a segunda nota");
        nota2 = sc.nextDouble();
        System.out.println(" Digite a terceira nota");
        nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(" A media das notas é: " + media);
       } 
}