package p2lista2q1;
import java.util.Scanner;
public class P2Lista2MatrizQ1 {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       int[][]matriz= new int[3][3];//matriz quadrada, coloca 4
       System.out.println("Preenchar a matriz!");
       preencher(matriz);
       System.out.println("Matriz Atual!");
       exibirAtual(matriz);
       System.out.println("Matriz Transposta!");
       transposta(matriz);
       int retorno;
       retorno= simetrica(matriz);
       if(retorno==1){
           System.out.println("E simétrica!");
       }else{
           System.out.println("Não é simétrica!");
       }
    }
    public static void preencher(int[][]matriz){
       Scanner in= new Scanner(System.in);
        int i,k;
        for(i=0;i<matriz.length;i=i+1){//Aqui, o preenchimento é dado por linhas.
            for(k=0; k<matriz[i].length;k=k+1){
                System.out.print("Preenchar a posição: ["+(i+1)+","+(k+1)+"]: ");
                matriz[i][k]= in.nextInt();
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void transposta(int[][]matriz){//E quando eu inverto, os elementos da linha, pelo os elementos da coluna.
        int i,k;
        for(i=0;i<matriz[0].length;i=i+1){//Aqui, a exibição é dado por colunas.
            for(k=0;k<matriz.length;k=k+1){
                System.out.print("|"+matriz[k][i]+"|");//Exibição por coluna
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void exibirAtual(int[][]matriz){//matriz atual
        int i,k;
        for(i=0;i<matriz.length;i=i+1){
            for(k=0;k<matriz[i].length;k=k+1){//Aqui, a exibição é dado por linhas.
                System.out.print("|"+matriz[i][k]+"|");//Exibição por linha
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static int simetrica(int[][]matriz){//Ela só é simétrica, quando a matriz transposta é a matriz origianl
        //bug
        int i,k,j,w;
        for(i=0;i<matriz.length;i=i+1){
            for(k=0;k<matriz[i].length;k=k+1){
                if((matriz[i][k])!=(matriz[k][i])){//Aqui garanto, que se a matriz original for diferente da transposta, ela não é simétrica
                    return 0;   
                }
            }
       }
        return 1;
    }
}
