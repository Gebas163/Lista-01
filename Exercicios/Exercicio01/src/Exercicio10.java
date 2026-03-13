import java.util.Scanner;   
public class Exercicio10{
     public static void main(String[] args) throws Exception {
 double distancia = 0;
 double velocidade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite a distancia a ser percorrida");
        distancia = sc.nextDouble();
      System.out.println(" Digite a velocidade media");
    velocidade = sc.nextDouble();
    double tempo = distancia / velocidade;
     int horas = (int) tempo;
        int minutos = (int) ((tempo - horas) * 60);
        System.out.println(" O tempo gasto para percorrer a distancia é: " + horas + " horas e " + minutos + " minutos");
        




         }
          }