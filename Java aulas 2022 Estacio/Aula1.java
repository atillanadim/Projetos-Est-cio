import java.util.Scanner;

public class Main{
    public static void main(Strings[] args) {
      Scanner entrada = new Scanner(System.in);
        /*
      System.out.print("Infome o salário Base: ");
      double salarioBase = entrada.nextDouble() ;

      System.out.print("Informe o percentual da gratificação; ");
      double gratificacao = entrada.nextDouble();
      double valorGratificacao = salarioBase * gratificacao / 100;

      System.out.print("Informe o percentual do imposto; ");
      double impposto = entrada.nextDouble();
      double valorImposto = salarioBase * imposto / 100;

      double salarioReceber = salarioBase + valorGratificacao - valorImposto;
      System.out.print("Seu salário à receber será: " +salarioReceber);

    */

        System.out.print("Infome o salário Base: ");
        double salarioBase = entrada.nextDouble() ;

        System.out.print("Informe o percentual de aumento; ");
        double aumento = entrada.nextDouble();
        double valorAumento = salarioBase * Aumento / 100;

        double salarioReceber = salarioBase + valorAumento;
        System.out.print("Seu salário à receber será: " +salarioReceber);


    }







}