package p2lista2stringq4;
import java.util.Scanner;
public class P2Lista2StringQ4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String nome1,nome2;
        System.out.print("Digite o primeiro nome: ");
        nome1= in.nextLine();
        int tamanho1;
        tamanho1= nome1.length();
        System.out.print("Digite o segundo nome: ");
        nome2= in.nextLine();
        int tamanho2;
        tamanho2= nome2.length();
        comparar(tamanho1,tamanho2,nome1,nome2);   
        }
        public static void comparar(int tamanho1,int tamanho2,String nome1,String nome2){
                if(tamanho1==tamanho2){//Um nome é igual, quando possui a mesma quantidade de letras.
                int geral;
                geral= tamanho1=tamanho2;//aqui recebo a igualdade de tamanho1 e tamanho2
                int w,contador=0;
                char[]recebeu1= new char[tamanho1];//criei vetor, para percorrer e verificar cada letra
                char[]recebeu2= new char[tamanho2];//criei vetor, para percorrer e verificar cada letra
                for(w=0;w<geral;w=w+1){
                    recebeu1[w]= nome1.charAt(w);
                    recebeu2[w]= nome2.charAt(w);
                    recebeu1[w]= Character.toLowerCase(recebeu1[w]);//ignoro se for maisculo ou minusculo
                    recebeu2[w]= Character.toLowerCase(recebeu2[w]);//ignoro se for maisculo ou minusculo
                    if(recebeu1[w]==recebeu2[w]){//confiro cada letra
                        contador=contador+1;//vou contando + 1 para saber se é igual ao tamanho do nome
                    }
                }
                if(geral==contador){//se for igual é porque o nome é igual
                    System.out.println("É igual!");
                }else{
                    System.out.println("Não é igual!");
                }
            }else{
                System.out.println("Não é igual! ");
            }    
        }
    }
