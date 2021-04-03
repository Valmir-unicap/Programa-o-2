package lista2vetor;
import java.util.Scanner;
public class Lista2Vetor {
    public static void main(String[] args) {
        System.out.println("Curso Fera");
        System.out.println("");
        String[] nome= new String[50];
        double[] nota1= new double[50];
        double[] nota2= new double[50];
        double[] media= new double[50];
        double[] situacao= new double[50];//coloquei esse vetor, para definir: abaixo ou acima da media.
        preencher(nome,nota1,nota2,media);
        MediaTurma(media);
        AbaixoMedia(media,situacao,nome);
        AcimaMedia(media,situacao,nome);
        MaiorMedia(media);
    }
    public static void preencher(String[]nome, double[] nota1, double[] nota2, double[] media){
       Scanner in= new Scanner(System.in);
       int i;
       for(i=0; i<nome.length; i=i+1){
           System.out.print("Digite o nome do aluno: "+(i+1)+": ");
           nome[i]= in.nextLine();
           System.out.println("");
           } 
           int j;
           for(j=0; j<nota1.length; j=j+1){
               System.out.print("Digite a primeira nota do aluno "+nome[j]+": ");
               nota1[j]= in.nextDouble();
               while(nota1[j]>10.0){//validação
                   System.out.print("Digite novamente, a primeira nota do aluno "+nome[j]+": ");
                   nota1[j]= in.nextDouble();
           }
               System.out.println("");
           }
           int k;
           for(k=0; k<nota2.length; k=k+1){
               System.out.print("Digite a segunda nota do aluno "+nome[k]+": ");
               nota2[k]= in.nextDouble();
               while(nota2[k]>10.0){//validação
                   System.out.print("Digite novamente, a segunda nota do aluno "+nome[k]+": ");
                   nota2[k]= in.nextDouble();
               }
               System.out.println("");
           }
           int w;
           for(w=0; w<media.length; w=w+1){
               media[w]= (nota1[w]*2 + nota2[w]*3)/5;
               System.out.println("O aluno " +nome[w]+ " obteve a média: "+media[w]);
               System.out.println("");
           }
    }
    public static void MediaTurma(double[] media){
       int i; 
       double soma=0, calcula;
       for(i=0; i<media.length; i=i+1){
           soma= soma + media[i];//somando todas as medias
       }
           calcula= soma/media.length;//a soma de todas as medias dividindo pela quantidade de alunos.
           System.out.println("A média da turma é de: "+calcula);
           System.out.println("");
    }
    public static void AbaixoMedia(double[] media, double[] situacao, String[] nome){//media do aluno[i] < media da turma. Soma + 1.
        int i, j;
        double soma=0, calcula=0;
        for(i=0; i<media.length; i=i+1){
            soma= soma + media[i];//soma a quantidade de medias
            calcula= soma/media.length;//media da turma
            }
            for(j=0; j<situacao.length; j=j+1){
            if(media[j]<calcula){ //media menor da turma
                System.out.println("Ficaram abaixo da média da turma: o aluno "+nome[j]+".");
                System.out.println("");  
          }  
        }
    }
    public static void AcimaMedia(double[] media, double[] situacao, String[] nome){//media do aluno[i] >= media da turma. Soma + 1.
      int i, j;
        double soma=0, calcula=0;
        for(i=0; i<media.length; i=i+1){
            soma= soma + media[i];//soma a quantidade de medias
            calcula= soma/media.length;//media da turma
            }
            for(j=0; j<situacao.length; j=j+1){
            if(media[j]>=calcula){ //media maior da turma
                System.out.println("Ficaram acima ou na média da turma: o aluno "+nome[j]+".");
                System.out.println(""); 
            }
        }
    }
    public static void MaiorMedia(double[] media){
        int i, k;
        double maior= 0;
        for(i=0; i<media.length; i=i+1){ 
            if(media[i]>maior){//media tem que ser maior que zero.
            maior= media[i];//maior recebe media. Ele pesquisa o vetor por completo e compara cada um.
            System.out.println("A maior media é: "+maior);
            }
        }
    }    
}
