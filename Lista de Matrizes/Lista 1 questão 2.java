package p2lista1matrizq2;
import java.util.Scanner;
public class P2Lista1MatrizQ2 {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       double recebe;
       int recebeAbaixo;
       String[]nomes= new String[5];//coloca 20
       double[][]notas= new double[5][3];//coloca 20 no primeiro bloco
       preencher(nomes,notas);
       calcularMedia(notas);
       exibir(nomes,notas);
       recebe= turma(notas);
       System.out.println("");
       System.out.println("A média da turma é: "+recebe);
       recebeAbaixo= AbaixoMediaTurma(notas);
       System.out.println("A quantidade de alunos, que ficaram abaixo da média foram: "+recebeAbaixo);
       ExbirSituaTurma(notas);
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
                for(k=0;k<notas[j].length-1;k=k+1){//sobrou duas posições, usa se para preenhcer a nota 1 e 2.
                    System.out.println("Notas do aluno "+(j+1)+", avalição "+(k+1));
                    System.out.print("Digite: ");
                    notas[j][k]= in.nextDouble();
                    while(notas[j][k]>10.1){
                        System.out.print("Inválido, digite novamente: ");
                        notas[j][k]= in.nextDouble();
                    }
                }
            } 
        }
    public static void calcularMedia(double[][]notas){
        int i, k ; 
        for(i=0;i<notas.length;i=i+1){
            System.out.println("");
            System.out.println("Aluno: "+(i+1));
            System.out.println("");
            for(k=0;k<notas[i].length-2;k=k+1){//sobrou uma posição
                notas[i][2]= ((notas[i][0]*2)+(3*notas[i][1]))/5;//calculo da média, com as condições
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
    public static double turma(double[][]notas){
        int i,k;
        double soma=0, calcula;
        for(i=0;i<notas.length;i=i+1){
        for(k=0;k<notas[i].length-2;k=k+1){
                soma= soma + notas[i][2];//somando todas as médias
            }
        }
        calcula= soma/notas.length;//dividindo a soma das médias pela a quantidade de alunos;
        return calcula;
    }
    public static int AbaixoMediaTurma(double[][]notas){
        int i,k;
        double recebe; 
        int baixo=0;
        recebe= turma(notas);
        for(i=0;i<notas.length;i=i+1){
            for(k=0;k<notas[i].length-2;k=k+1){
                if(notas[i][2]<recebe){//aqui verifico a media que ficou abaixo, da media da turma.
                    baixo= baixo +1;
                }
            }
        }
        return baixo;
    }
    public static void ExbirSituaTurma(double[][]notas){
        int i,k;
        double recebe, situacao,situacao2;
        recebe= turma(notas);
        for(i=0;i<notas.length;i=i+1){
            for(k=0;k<notas[i].length-2;k=k+1){
                if(notas[i][2]<recebe){//aqui comparo a media dos alunos com a media da turma
                    if(notas[i][2]<notas[i+1][2]){
                       situacao= notas[i][2]; 
                        System.out.println("A menor média da turma foi: "+situacao); 
                    }   
                }
                if(notas[i][2]>recebe){
                    if(notas[i][2]>notas[i+1][2]){
                        situacao2= notas[i][2];
                        System.out.println("A maior média da turma foi: "+situacao2);
                    }
                }  
            }
        }
        
    }
}
