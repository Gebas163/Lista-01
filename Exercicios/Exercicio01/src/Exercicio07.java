import java.util.Scanner;   
public class Exercicio07{
     public static void main(String[] args) throws Exception {
     double km = 0;
     double gasolina = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite a quantidade de km percorridos");
        km = sc.nextDouble();
      System.out.println(" Digite a quantidade de gasolina gasta");
    gasolina = sc.nextDouble();
    double consumo = km / gasolina;
     System.out.println(" O consumo do carro é: " + consumo);

        }
        }