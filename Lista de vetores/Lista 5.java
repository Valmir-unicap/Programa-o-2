package p2llista5;
import java.util.Scanner;
public class P2lLista5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] par= new int[50];//coloca 50
        int[] impar= new int[50];//coloca 50
        int quantidadePar=0,quantidadeImpar=0;
        int valor,escolha,retorno;
        do{
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("");
        System.out.println("1-Inserir número");
        System.out.println("2-Procurar número");
        System.out.println("3-Remover um número");
        System.out.println("4-Exibir números pares");
        System.out.println("5-Exibir números impar");
        System.out.println("0-Sair");
        System.out.print("Escolha uma opção: ");
        escolha= in.nextInt();
        switch(escolha){
            case 1:
                System.out.print("Informe o número, que deseja inserir: ");
                valor= in.nextInt();
                if(valor%2==0){
                    retorno= inserirOrdenado(par,quantidadePar,valor);
                    if(retorno==-2){
                        System.out.println("Vetor vázio!");
                    }else if(retorno==-1){
                        System.out.println("Valor repetido!");
                    }else{
                        quantidadePar= retorno;
                    }
                }else{
                    retorno= inserirOrdenado(impar,quantidadeImpar,valor);
                    if(retorno==-2){
                        System.out.println("Vetor vázio!");
                    }else if(retorno==-1){
                        System.out.println("Valor repetido!");
                    }else{
                        quantidadeImpar=retorno;
                    }
                }
            break;
                
            case 2:
                System.out.print("Informe o número procurado: ");
                valor= in.nextInt();
                if(valor%2==0){
                    retorno= BuscaBinaria(par,quantidadePar,valor);
                    if(retorno==-1){
                        System.out.println("Não foi encontrado!");
                    }else{
                        System.out.println("Valor encontrado na posição: "+retorno);
                    }
                }else{
                    retorno= BuscaBinaria(impar,quantidadeImpar,valor);
                    if(retorno==-1){
                        System.out.println("Não foi encontrado!");
                    }else{
                        System.out.println("Valor encontrado na posição: "+retorno);
                    }
                }
            break;
         
            case 3:
                System.out.print("Informe o número a ser removido: ");
                valor= in.nextInt();
                if(valor%2==0){
                    retorno= Remover(par,quantidadePar,valor);
            if(retorno==-2){
                System.out.println("Vetor vázio!");
            }else if(retorno==-1){
                System.out.println("Valor não encontrado!");
            }else{
                quantidadePar=retorno;  
            }
        }else{
            retorno= Remover(impar,quantidadeImpar,valor); 
            if(retorno==-2){
                System.out.println("Vetor vázio!");
            }else if(retorno==-1){
                System.out.println("Valor não encontrado!");
            }else{
                quantidadeImpar=retorno;
            }
         }
            break;
        
        case 4:
            Exibir(par,quantidadePar);
            break;
            
        case 5:
            Exibir(impar,quantidadeImpar);
            break;
        
        case 0:
            System.out.println("Fim do programa!");
            break;
        
        default:
            System.out.println("Opção inválida!");
      }  
    }while(escolha!=0);
}
    public static int inserirOrdenado(int[] vetor, int quantidade, int procurar){
        int i,j;
        if(quantidade==0){//lista vázia
            System.out.println("Vetor vázio");
            vetor[quantidade]= procurar;
            quantidade= quantidade+1;
            return quantidade;
        }else{//lista não vázia
            if(quantidade==vetor.length){//vetor cheio
                return -2;//indica que o vetor está cheio
            }else{
                if(procurar>vetor[quantidade-1]){//inserir no funal do vetor
                    vetor[quantidade]=procurar;
                    quantidade=quantidade+1;
                    return quantidade;
                }else{
                    for(i=0;i<=quantidade-1;i=i+1){//se der erro coloca igual depois do i
                        if(vetor[i]==procurar){
                            return -1;
                        }
                        if(vetor[i]>procurar){
                            break;
                        }
                    }
                    for(j=quantidade-1; j>=i;j=j-1){//mover o os valores no vetor
                        vetor[j+1]= vetor[j];
                    }
                    vetor[i]=procurar;
                    quantidade=quantidade+1;
                    return quantidade;
                }
            }
        }
    }
    public static void Exibir(int[]vetor, int quantidade){
        int i;
        if(quantidade==0){
            System.out.println("Vetor vázio!");
        }else{
        for(i=0;i<quantidade;i=i+1){
            System.out.println(vetor[i] +"");
            }
            System.out.println("");
        }
    }
    public static int BuscaBinaria(int[] vetor,int quantidade,int procurar){
        int inicio,meio,fim;
        inicio=0;
        fim=quantidade-1;
        do{
            meio= (inicio+fim)/2;
            if(procurar == vetor[meio]){
                return meio;
            }else if(procurar<vetor[meio]){
                fim=meio-1;
            }else{
                inicio= meio+1;
            }
        }while(inicio<=fim);
        return-1;
    }
    public static int Remover(int[] vetor,int quantidade,int procurar){
        int pos,i;
        if(quantidade==0){//vetor vázio
            return -2;
        }else{
            pos= BuscaBinaria(vetor,quantidade,procurar);//faz a busca no vetor
            if(pos==-1){
                return -1;//não achou
            }else{//achou!
              for(i=pos;i<quantidade;i=i+1){//caso der erro, colaca igual depois do i
                 vetor[i]=vetor[i+1]; 
              }
              quantidade=quantidade-1;
              return quantidade;
            }
        }
    }
}
