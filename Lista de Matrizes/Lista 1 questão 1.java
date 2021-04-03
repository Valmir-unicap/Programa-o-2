package p2lista1matriz;
import java.util.Scanner;
public class P2Lista1MatrizQ1 {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       String[]nomes= new String[3];//coloca 20
       double[][]notas= new double[3][3];//coloca 20 no primeiro bloco
       preencher(nomes,notas);
       calcular(notas);
       exibir(nomes,notas);
    }
    public static void preencher(String[]nome, double[][]notas){
        Scanner in= new Scanner(System.in);
        int i, j, k;
        for(i=0;i<nome.length;i=i+1){
            System.out.print("Digite o nome, do aluno "+(i+1)+": ");
            nome[i]= in.nextLine();
            }
            for(j=0;j<notas.length;j=j+1){
                System.out.println("");
                System.out.println("Aluno "+(j+1));
                System.out.println("");
                for(k=0;k<notas[j].length-1;k=k+1){
                    System.out.println("Notas do aluno "+(j+1)+", avalição "+(k+1));
                    System.out.print("Digite: ");
                    notas[j][k]= in.nextDouble();
                    while(notas[j][k]>10.01){//validação
                        System.out.print("Inválido, digite novamente: ");
                        notas[j][k]= in.nextDouble();
                    }
                }
            } 
        }
    public static void calcular(double[][]notas){
        int i, k ; 
        for(i=0;i<notas.length;i=i+1){
            System.out.println("");
            System.out.println("Aluno: "+(i+1));
            System.out.println("");
            for(k=0;k<notas[i].length-2;k=k+1){
                notas[i][2]= ((notas[i][0]*2)+(3*notas[i][1]))/5;
                System.out.println("A média do aluno "+(i+1)+" é: "+notas[i][2]);
            }
        }
    }
    public static void exibir(String[]nomes, double[][]notas){
        System.out.println("");
        int k , w;
            for(k=0;k<notas.length;k=k+1){
                for(w=0;w<notas[k].length;w=w+1){
                    System.out.print("O aluno "+nomes[k]+", obteve média: "+notas[k][2]);
                    break;
            }
            System.out.println("");
        }
    }
}
