package p2lista2q2;
import java.util.Scanner;
public class P2Lista2MatrizQ2 {
    public static void main(String[] args) {
        char[]gabarito= new char[3];//coloca 100
        char[][]respostas= new char[3][3];//coloca 50 / 100
        String[]nomes= new String[3];//coloca 50
        int[]acertos= new int[3];//coloca 50
        preencher(gabarito,respostas,nomes);
        calcular(gabarito,respostas,acertos);
        aprovados(acertos,nomes,gabarito);
        reprovados(acertos,nomes,gabarito);
    }
    public static void preencher(char[]gabarito,char[][]respostas,String[]nomes){
        Scanner in= new Scanner(System.in);
        int i,k,j,w;
        System.out.println("Informe os nomes dos alunos. ");
        for(w=0;w<nomes.length;w=w+1){
            System.out.print("Aluno "+(w+1)+": ");
            nomes[w]= in.nextLine();
        }
        System.out.println("");
        System.out.println("Informe as respostas, de cada aluno.");
        System.out.println("");
        System.out.println("Todas as alternativas contem: a,b,c,d,e.");
        System.out.println("");
        for(k=0;k<respostas.length;k=k+1){
            for(j=0;j<respostas[k].length;j=j+1){
                System.out.print("Aluno "+(k+1)+" respondeu na questão "+(j+1)+": ");
                respostas[k][j]= in.next().charAt(0);
                respostas[k][j]= Character.toLowerCase(respostas[k][j]);
                while(respostas[k][j]>'e'){
                    System.out.print("Inválido, digite novamente: ");
                    respostas[k][j]= in.next().charAt(0);
                    respostas[k][j]= Character.toLowerCase(respostas[k][j]);
                }  
            }
            System.out.println("");
        }
        System.out.println("Informe o gabarito!");
        for(i=0;i<gabarito.length;i=i+1){
            System.out.print("Questão "+(i+1)+": ");
            gabarito[i]= in.next().charAt(0);
            gabarito[i]= Character.toLowerCase(gabarito[i]);
            while(gabarito[i]>'e'){
                System.out.print("Inválido, digite novamento: ");
                gabarito[i]= in.next().charAt(0);
                gabarito[i]= Character.toLowerCase(gabarito[i]);
            }
        }
        System.out.println("");
    }
    //i=50
    //k=100
    public static void calcular(char[]gabarito,char[][]respostas,int[]acertos){
        int i,k;
        for(i=0;i<respostas.length;i=i+1){
            for(k=0;k<respostas[i].length;k=k+1){
                if(respostas[i][k]==gabarito[k]){
                    acertos[i]++;//eu tinha colocado k, por isso tava dando erro. 
                }
            }
            System.out.println("Aluno "+(i+1)+" acertou: "+acertos[i]);
        }
    }
    public static void aprovados(int[]acertos,String[]nomes,char[]gabarito){
        int i;
        for(i=0;i<nomes.length;i=i+1){
            if(acertos[i]>=(gabarito.length*0.7)){
                System.out.println("Foi aprovado o aluno "+nomes[i]+", pois acertou "+acertos[i]+" questões");
                System.out.println("Gabarito preenchido: "+gabarito.length);
            }
        }
        System.out.println("");
    }
    public static void reprovados(int[]acertos,String[]nomes,char[]gabarito){
        int i;
        for(i=0;i<acertos.length;i=i+1){
            if(acertos[i]<(gabarito.length*0.7)){
                System.out.println("Foi reprovado o aluno "+nomes[i]+", pois acertou "+acertos[i]+" questões");
                System.out.println("Gabarito preenchido: "+gabarito.length);
            }
        }
        System.out.println("");
    }
}
