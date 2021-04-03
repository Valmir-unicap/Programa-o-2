package p2lista4q1;
import java.util.Scanner;
public class P2Lista4Q1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int escolha;
        int num1[]= new int[3];//coloca 50
        int num2[]= new int[3];//coloca 50
        do{
        System.out.println("Menu de opções: ");
        System.out.println("");
        System.out.println("1-Armazenar número");
        System.out.println("2-Procurar número");
        System.out.println("3-Exibir números pares");
        System.out.println("4-Exibir números ímpares");
        System.out.println("5-Encerrar programa");
        System.out.print("Digite a opção desejada: ");
        escolha= in.nextInt();
         switch(escolha){
             case 1:
               Par(num1);
               Impar(num2);
               break;
                 
             case 2:
                 int procura, pos;
                 System.out.print("Digite o número procurado: ");
                 procura= in.nextInt();
                 pos= PesquisaSimples(num1,num2,procura,num1.length,num2.length);
                 if(pos==-1){
                     System.out.println(+procura+ " não foi encontrado. ");
                 }else{
                     System.out.println(+procura+" foi encontrado. ");
                }
                 break;
                 
             case 3:
                 ExibirPar(num1);
                 break;
                 
             case 4:
                 ExibirImpar(num2);
         }
        }while(escolha!=5);
    }
    public static void Par(int[]num1){
        Scanner in= new Scanner(System.in);
        System.out.println("");
        System.out.println("Vetor A, só armazena números pares.");
        System.out.println("");
        int i, conta=0;
        for(i=0; i<num1.length; i=i+1){
            System.out.print("Digite um número, na posição "+(i+1)+": ");
            num1[i]= in.nextInt();
            while(num1[i]%2!=0){
                System.out.print("Inválido, digite novamente um número par: ");
                num1[i]= in.nextInt();
            }
            conta=conta+1;
            }
            System.out.println("Contou "+conta+ " vezes, num vetor de tamanho: "+num1.length);
            System.out.println("");
    }
    public static void Impar(int[]num2){
        Scanner in= new Scanner(System.in);
        System.out.println("Vetor B, só armazena números ímpares.");
        System.out.println("");
        int k, conta=0;
        for(k=0; k<num2.length; k=k+1){
            System.out.print("Digite um número, na posição"+(k+1)+": ");
            num2[k]= in.nextInt();
            while(num2[k]%2!=1){
                System.out.print("Inválido, digite novamente: ");
                num2[k]= in.nextInt();
            }
            conta= conta+1;
        }
        System.out.println("Contou "+conta+" vezes, num vetor de tamanho: "+num2.length);
        System.out.println("");
    }
    public static int PesquisaSimples(int[]num1, int[]num2, int procura, int par, int impar){
        int i, conta=0;
        boolean achou=false;
        for(i=0; i<par; i=i+1){
            conta=conta+1;
            if(num1[i]==procura){
                achou=true;
                System.out.println("Procurou: "+conta+" vezes no vetor Par de tamanho: "+num1.length);
                System.out.println("");
                break;
        }
    }
        int k, conta2=0;
        for(k=0; k<impar; k=k+1){
            conta2= conta2+1;
            if(num2[k]==procura){
                achou=true;
                System.out.println("Procurou: "+conta2+" vezes no vetor Impar de tamanho: "+num2.length);
                System.out.println("");
                break;
            }
        }
        if(achou==true){
            return i;//retorna o número encontrado
        }else{
            return -1;//retorna dizendo que não foi encontrada
        }
    }
    public static void ExibirPar(int[]num1){
        int i,conta=0;
        for(i=0; i<num1.length; i=i+1){ 
            conta=conta+1;
            System.out.println("Exibir números par: "+num1[i]);
        }
        System.out.println("Preencheu "+conta+" vezes. ");
    }
    public static void ExibirImpar(int[]num2){
        int k, conta2=0;
        for(k=0;k<num2.length; k=k+1){
            conta2=conta2+1;
            System.out.println("Exibir números ímpar: "+num2[k]);
        }
        System.out.println("Preencheu "+conta2+ " vezes. ");
    }
}
