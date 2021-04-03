package p2lista1vetor;
import java.util.Scanner;
public class P2Lista1Vetor {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double [] ganhos= new double [12];
        double [] gastos= new double [12];
        double [] lucros= new double [12];
        preencher(ganhos,gastos);
        Lucromensal(ganhos,gastos,lucros);
        exibir(ganhos,gastos,lucros);
        Somatotal(ganhos,gastos,lucros);
        MediaLucro(lucros);
    }
    public static void preencher(double[]ganhos, double[] gastos){
        Scanner in= new Scanner(System.in);
        int i,j;
        for(i=0; i<ganhos.length; i=i+1){
            System.out.print("Informe o total de ganhos, do mês: "+(i+1)+ ": ");
            ganhos[i]= in.nextDouble();
            }
            System.out.println(" ");
            for(j=0; j<gastos.length; j=j+1){
                System.out.print("Informe o total de gastos, do mês: "+(j+1)+" : ");
                gastos[j]= in.nextDouble();
        }
            System.out.println("");
    }
    public static void Lucromensal(double[]ganhos, double[]gastos, double[]lucros){
        int i;
        for(i=0; i<lucros.length; i=i+1){
            lucros[i]= ganhos[i]-gastos[i];
            System.out.println("*O lucro mensal, do mês: "+(i+1)+" foi de: "+lucros[i]);
        }
        System.out.println("");
    }
    public static void exibir(double[]ganhos, double[]gastos, double[]lucros){
      int i;
      for(i=0; i<ganhos.length; i=i+1){
          System.out.println("-Mês: "+(i+1)+" adqueriu um total de ganhos de: R$"+ganhos[i]);
      }
        System.out.println("");
      int j;
      for(j=0; j<gastos.length; j=j+1){
          System.out.println("-Mês: "+(j+1)+ " adqueriu um total de gastos de: R$"+gastos[j]);
      }
        System.out.println("");
      int k;
      for(k=0; k<lucros.length; k=k+1){
          System.out.println("-Mês: "+(k+1)+ " adqueriu um total de lucro de: R$"+lucros[k]);
      }
        System.out.println("");
    }

    public static void Somatotal(double[]ganhos, double[]gastos, double[]lucros){
        int i;
        double soma1=0;
        for(i=0; i<ganhos.length; i=i+1){
            soma1= soma1 + ganhos[i];
        }
            System.out.println("Soma total dos ganhos: R$"+soma1);
            System.out.println("");
            
            int k;
            double soma2=0;
            for(k=0; k<gastos.length; k=k+1){
                soma2= soma2 + gastos[k];
            }
            System.out.println("Soma total dos gastos: R$"+soma2);
            System.out.println("");
            
            int j;
            double soma3=0;
            for(j=0; j<lucros.length; j=j+1){
                soma3= soma3 + lucros[j];
            }
            System.out.println("Soma total dos lucros: R$"+soma3);
            System.out.println("");
    }
    public static void MediaLucro(double[]lucros){
      int i;
      double soma=0;
      double media;
      for(i=0; i<lucros.length; i=i+1){
          soma= soma + lucros[i];
      }
      media= soma/lucros.length;
      System.out.println("O lucro médio obtido, foi de: R$"+media);
    }
}
