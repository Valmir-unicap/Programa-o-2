//Erro busca binária
package p2.lista1q1.ordenado;
import java.security.SecureRandom;
import java.util.Scanner;
public class P2Lista1Q1Ordenado {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] tamanho= new int[3];//coloca 100
        int quantidade=0, retorno,valor;
        int escolha;
        do{
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1-Preencher vetor");
            System.out.println("2-Ordenar vetor");
            System.out.println("3-Buscar vetor");
            System.out.println("4-Exibir vetor");
            System.out.println("0-Sair");
            System.out.print("Escolha a opção desejada: ");
            escolha= in.nextInt();
            switch(escolha){
                case 1:
                    preencher(tamanho,quantidade);
                    break;
                
                case 2:
                    Bolha(tamanho);
                    break;
                    
                case 3:
                    int num;
                    System.out.print("Informe o número que deseja buscar: ");
                    num= in.nextInt();
                    retorno = BuscaBinaria(tamanho,quantidade,num);
                    if(retorno==-1){
                        System.out.println("Valor não encontrado!");
                    }else{
                        System.out.println("Valor encontrado: "+retorno);
                        quantidade=retorno;
                    }
                    break;
                case 4:
                   Exibir(tamanho);
                   break; 
                    
                case 0:
                    System.out.println("Fim do programa!");
                    break;
                
                default:
                    System.out.println("Opção inválida!");
            }
        }while(escolha!=0); 
    }
    public static void preencher(int[]vetor, int quantidade){ //qualquer coisa muda a posição do for
        SecureRandom random= new SecureRandom();
        int i;
        if(quantidade==0){
        System.out.print("Vetor vázio!");
            }else{
                if(quantidade==vetor.length){
                System.out.println("Vetor cheio!");
                }
            }
        System.out.println("");
                    for(i=0;i<vetor.length;i=i+1){
                    vetor[i]= random.nextInt(10000);//coloca 100
                    System.out.println("Valor que foi preenchido: "+vetor[i]);
    }
                    System.out.println("");
 }
    public static void Bolha(int vetor[]){//ordem decresncente
        int i,aux;
        int pos=0;
        int fim= vetor.length-1;
        boolean troca=true;
        while(troca==true){
            troca=false;
            for(i=0;i<fim;i=i+1){//passagem de troca
                if(vetor[i]<vetor[i+1]){//aqui: < ordem decrescente, > ordem crescente.
                    aux=vetor[i];
                    vetor[i]= vetor[i+1];
                    vetor[i+1]=aux;
                    troca=true;
                    pos=i;
                }
            }
            fim=pos;
        }
    }
    public static void Exibir(int[]vetor){
        int i;
        for(i=0;i<vetor.length;i=i+1){
            System.out.println("Exibir: "+vetor[i]);
        }
    }
    public static int BuscaBinaria(int[]vetor,int quantidade, int procurar){
        int inicio,meio,fim;
        inicio=0;
        fim= quantidade-1;
        do{
          meio=(inicio+fim)/2;
          if(procurar==vetor[meio]){
              return meio;
          }else if(procurar<vetor[meio]){
              fim= meio-1;
          }else{
              inicio=meio+1;
          }
        }while(inicio<=fim);
        return -1;
    }
}
