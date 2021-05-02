package p2lista2poo;
/*
  @author valmir
 */
import java.util.Scanner;
public class P2Lista2POO {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int ano, mes, dia;
        System.out.println("Primeira data");
        System.out.println("");
        System.out.print("Informe o dia: ");
        dia= in.nextInt();
        System.out.print("Informe o mês: ");
        mes= in.nextInt();
        System.out.print("Informe o ano: ");
        ano= in.nextInt();
        Data data1= new Data(ano,mes,dia);
        //data1.acrescentar(dia, mes, ano);
        System.out.println("Primeira data: "+data1);
        data1.exibir(dia, mes, ano);
        System.out.println("");
        System.out.println("Segunda data");
        System.out.println("");
        System.out.print("Informe o dia: ");
        dia= in.nextInt();
        System.out.print("Informe o mês: ");
        mes= in.nextInt();
        System.out.print("Informe o ano: ");
        ano= in.nextInt();
        Data data2= new Data(ano,mes,dia);
        //data2.acrescentar(dia, mes, ano);
        System.out.println("Segunda data: "+data2);
        data2.exibir(dia, mes, ano);
        System.out.println("");
        int retorno;
        retorno= data1.compareTo(data2);
        if(retorno==0){
            System.out.println("São iguais!");
        }else if(retorno==1){
            System.out.println("A data: "+data1+" vem depois da data: "+data2);
        }else{
            System.out.println("A data: "+data1+" vem antes da data: "+data2);
        }
    }
}
