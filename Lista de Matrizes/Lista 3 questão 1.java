package p2lista3matrizq1;
import java.util.Scanner;
public class P2Lista3MatrizQ1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[][]matriz= new int[3][3];
        System.out.println("Preenchar a matriz");
        preencher(matriz);
        System.out.println("Matriz atual");
        exibir(matriz);
        System.out.println("Verificando, se tal matriz, é um quadrado mágico.");
        calcular(matriz);
        int situacao;
        situacao= calcular(matriz);
        if(situacao==1){
            System.out.println("E uma quadrado mágico.");
        }else{
            System.out.println("Não é um quadrado mágico.");
        }
    }
    public static void preencher(int[][]matriz){//preenchimento por linhas
        Scanner in= new Scanner(System.in);
        int i,k;
        for(i=0;i<matriz.length;i=i+1){
            for(k=0;k<matriz[i].length;k=k+1){
                System.out.print("["+(i+1)+","+(k+1)+"]: ");
                matriz[i][k]= in.nextInt();
            }
            System.out.println("");
        }
    }
    public static void exibir(int[][]matriz){
        int i,k;
        for(i=0;i<matriz.length;i=i+1){
            for(k=0;k<matriz[i].length;k=k+1){
                System.out.print("|"+matriz[i][k]+"|");
            }
            System.out.println("");
        }
    }
    public static int calcular(int[][]matriz){
        int j,i,k,w,x,z,r;
        int soma1,soma2,soma3,soma4,soma5;
        //soma os elementos da primeira linha
        soma1=0;
        for(j=0;j<matriz[0].length;j=j+1){ 
            soma1= soma1+matriz[0][j];
        }
        //somar as demais linhas
        for(i=0;i<matriz.length;i=i+1){ //coloca i=1
            soma2=0;
            for(k=0;k<matriz[i].length;k=k+1){
                soma2= soma2+matriz[i][k];
            }  
            if(soma1!=soma2){
                return 0;//não é quadrado mágico
            }
        }
        //soma as colunas
        for(r=0;r<matriz[0].length;r=r+1){
            soma3=0;
            for(w=0;w<matriz.length;w=w+1){
                soma3=soma3+matriz[w][r];
            }
            if(soma3!=soma1){
            return 0;
        }
    }
        //soma a diagonal principal
        soma4=0;
        for(z=0;z<matriz.length;z=z+1){
            soma4=soma4+matriz[z][z];
        }
        if(soma4!=soma1){
            return 0;
        }
        //soma diagonal secundária
        soma5=0;
        int m=0;
        for(x=matriz.length-1;x>=0;x=x-1){
            soma5= soma5+matriz[m][x];
            m=m+1;
        }
        if(soma5!=soma1){
            return 0;
        }
        return 1;
    }     
}
/*
        Lista de o que fazer:
        -somar os elementos da primeira linha
        -somar as demis linhas
        -somar as colunas
        -somar a diagonal principal
        -somar a diagonal secundária
        Tudo isso numa matriz 3x3
*/
