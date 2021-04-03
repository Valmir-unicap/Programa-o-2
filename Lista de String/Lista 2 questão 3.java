package p2lista2stringq3;
import java.util.Scanner;
public class P2Lista2StringQ3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String[]nomes= new String[3];//coloca 30
        double[]medias= new double[3];//coloca 30
        String[]situacao= new String[3];//coloca 30
        preencherNome(nomes);
        calcularMedia(medias,nomes);
        situacaoAlunos(situacao,medias,nomes);
        String procurar;
        int retorna;
        System.out.print("Digite o nome do aluno, que deseja procurar: ");
        procurar= in.nextLine();
        retorna= consultar(nomes,procurar);
        if(retorna==-1){
            System.out.println("Não está matriculado!");
        }else{
            System.out.println("Aluno matriculado!");
            exibirDados(nomes,medias,situacao,procurar);
        }
    }
    public static void calcularMedia(double[]medias,String[]nomes){
        Scanner in= new Scanner(System.in);
        int i, recebe;
        recebe= medias.length;
        double[]nota1= new double[recebe];//criei novo vetor, para armazenar a quantidade de notas, de cada aluno
        double[]nota2= new double[recebe];//criei novo vetor, para armazenar a quantidade de notas, de cada aluno
        for(i=0;i<medias.length;i=i+1){
            System.out.println("");
            System.out.print("Digite a primeira nota, de "+nomes[i]+": ");
            nota1[i]= in.nextDouble();
            while(nota1[i]>10.0 && nota1[i]<0){//validação
                System.out.print("Nota inválida! Digite novamente: ");
                nota1[i]= in.nextDouble();
            }
            System.out.println("");
            System.out.print("Digite a segunda nota, de "+nomes[i]+": ");
            nota2[i]= in.nextDouble();
            while(nota2[i]>10.0 && nota2[i]<0){//validação
                System.out.print("Nota inválida! Digite novamente: ");
                nota2[i]= in.nextDouble();
            }
            medias[i]= ((nota1[i]*2)+(nota2[i]*3))/5;//calcular a média, de cada aluno
            System.out.println("");
            System.out.println("A média de "+nomes[i]+" é: "+medias[i]);
            System.out.println("");
        }
    }
    public static void preencherNome(String[]nomes){
        Scanner in= new Scanner(System.in);
        int i;
        boolean passa;
        for(i=0;i<nomes.length;i=i+1){
            System.out.print("Aluno "+(i+1)+", digite o nome: ");
            nomes[i]= in.nextLine();
            passa= validarNome(nomes[i]);//possição [i], pois ele vai validar vários nomes
            while(passa==false){//validação
                System.out.print("Nome inválido, digite novamente: ");
                nomes[i]= in.nextLine();
                passa= validarNome(nomes[i]);//forço até que seja true
            }
        }
        System.out.println("");
    }
    public static boolean validarNome(String nomes){
        int i,tamanho;
        char recebe;
        tamanho= nomes.length();
        for(i=0;i<tamanho;i=i+1){
            recebe= nomes.charAt(i);
            recebe= Character.toLowerCase(recebe);//ignoro se for maisculo ou minusculo
            if(Character.isLetter(recebe) == Character.isSpaceChar(recebe)){//bug se tiver apenas espaços, ele considera.
                return false;//se no nome não tiver letras ou espaço, tal nome é inválido
            }
        }
        return true;//contém letras e espaços, tal nome é válido 
    }
    public static void exibirDados(String[]nomes,double[]medias,String[]situacao,String procurar){
        int i,receber;
        receber= consultar(nomes,procurar);//retornei o contador, pois ele contém a posição onde o nome é igual
        for(i=0;i<nomes.length;i=i+1){
            System.out.println("Aluno "+nomes[receber]+" obteve média "+medias[receber]+" e foi "+situacao[receber]);
            break;//parei, pois se não ele iria exibir a mesma coisa, várias vezes.
        }
        System.out.println("");
    }
    public static void situacaoAlunos(String[]situacao,double[]medias,String[]nomes){//resolver erro no if's
        int i;
        for(i=0;i<medias.length;i=i+1){
            if(medias[i]>7){//aprovado
                situacao[i]= "aprovado";//a posição desse i, recebe aprovado;
                System.out.println("Aluno "+nomes[i]+", está "+situacao[i]);
            }
            if(medias[i]<=7 && medias[i]>3){//recuperação
                situacao[i]= "em recuperação";//a posição desse i, recebe em recuperação;
                System.out.println("Aluno "+nomes[i]+", está "+situacao[i]);
            }
            if(medias[i]<=3){//reprovado
                situacao[i]= "reprovado";//a posição desse i, recebe reprovado;
                System.out.println("Aluno "+nomes[i]+", está "+situacao[i]);
            }
        }
        System.out.println("");
    }
    public static int consultar(String[]nomes,String procurar){//resolver contador - deu certo
        int i,contador2=0;
        for(i=0;i<nomes.length;i=i+1){
            if(procurar.equals(nomes[i])){//aqui comparo!
                //devo retorar a posicao exata do i;
                return contador2;//deve retorna a posição do vetor, que foi encontrada;
            }
            contador2=contador2+1;
        }
        return -1;//não encontrou
    }
}
