import java.util.Scanner;   
public class Exercicio08{
     public static void main(String[] args) throws Exception {
  double celcius = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite a temperatura em celcius");
        celcius = sc.nextDouble();
        double fahrenheit =  (celcius * 9/5)+32;
        System.out.println(" A temperatura em fahrenheit e: " + fahrenheit);
    double kelvin = celcius + 273.15;
    System.out.println(" A temperatura em kelvin e: " + kelvin);
    
    
    
    }
          }