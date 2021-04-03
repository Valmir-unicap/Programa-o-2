package p2lista3matrizq2;
import java.util.Scanner;
public class P2Lista3MatrizQ2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Matriz");
        System.out.println("");
        int tamanho1, tamanho2;
        System.out.print("Informe a quantidade de colunas: ");
        tamanho1= in.nextInt();
        while(tamanho1<1){
            System.out.print("Inválido, digite novamente: ");
            tamanho1= in.nextInt();
        }
        System.out.print("Informe a quantidade de linhas: ");
        tamanho2= in.nextInt();
        while(tamanho2<1){
            System.out.print("Inválido, digite novamente: ");
            tamanho2= in.nextInt();
        }
        double[][]matriz= new double[tamanho1][tamanho2];
        System.out.println("Preencha a matriz ");
        preencherMatriz(matriz);
        System.out.println("");
        System.out.println("Matriz Atual");
        exibirMatriz(matriz);
        System.out.println("");
        System.out.println("Procurando: maior número e menor número, encontrado na matriz.");
        Pesquisa(matriz);
    }
    public static void preencherMatriz(double[][]matriz){//preenchimento por linhas
        Scanner in= new Scanner(System.in);
        int i,k;
        for(i=0;i<matriz.length;i=i+1){
            for(k=0;k<matriz[i].length;k=k+1){
                System.out.print("["+(i+1)+","+(k+1)+"]: ");
                matriz[i][k]= in.nextDouble();
            }
            System.out.println("");
        }
    }
    public static void exibirMatriz(double[][]matriz){
        int i,k;
        for(i=0;i<matriz.length;i=i+1){
            for(k=0;k<matriz[i].length;k=k+1){
                System.out.print("|"+matriz[i][k]+"|");
            }
            System.out.println("");
        }
    }
    public static void Pesquisa(double[][]matriz){
        int i,k;
        double maior;
        maior= Double.MIN_VALUE;
        double menor;
        menor= Double.MAX_VALUE;
        for(i=0;i<matriz.length;i=i+1){
            for(k=0;k<matriz[i].length;k=k+1){
                if(matriz[i][k]>maior){
                    maior= matriz[i][k];
                }
                if(matriz[i][k]<menor){
                    menor= matriz[i][k];
                }
            }
        }
        System.out.println("Maior número encontrado foi: "+maior);
        System.out.println("Menor número encontrado foi: "+menor);
    }
}
