package p2lista2vetorq7;
import java.util.Scanner;
public class P2Lista2VetorQ7 {
    public static void main(String[] args) {
        int[] tamanho= new int[5];//coloca 25
        preencher(tamanho);
        maior(tamanho);
    }
    
    public static void preencher(int[] tamanho){
        Scanner in= new Scanner(System.in);
        int i;
        for(i=0; i<tamanho.length; i=i+1){
            System.out.print("Digite um numero, na posição ["+i+"] : ");
            tamanho[i]= in.nextInt();
        }
        System.out.println("");
    }
    
    public static void maior(int[] tamanho){
        int i, k, num=0,maior= Integer.MIN_VALUE;
        for(i=0; i<tamanho.length; i=i+1){
            if(tamanho[i]<maior){
                maior= -1; //para calcular o vetor, por completo.
            }
            if(tamanho[i]>maior){
                maior= tamanho[i] - tamanho[i+1];//junção de dois elementos em cada vetor
                for(k=0; k<maior; k=k+1){
                  if(maior>num){
                num= maior;//exibir o maior elemento, no vetor.
                System.out.println("O maior elemento é: "+num);
                   }
                }
             System.out.println("Dois elementos consecutivos: ["+i+ "] e ["+(i+1)+"] é: "+maior);
            }
        } 
    }
}
