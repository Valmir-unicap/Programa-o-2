package p2lista1stringq5;
import java.util.Scanner;
public class P2Lista1StringQ5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String nome, nome2;
        System.out.print("Informe seu nome: ");//bug! se o usuário digitar somente espaços, ele considera.
        nome= in.nextLine();
        boolean resultado;
        resultado= validar(nome);
        while(resultado==false){//se for false, deve pedir pra o usuário digitar novamente.
            System.out.println("Nome inválido! ");
            System.out.print("Digite novamente: ");
            nome= in.nextLine();
            resultado= validar(nome);//força até que seja true.
            }
        System.out.println("Nome válido! ");//é true!
        char recebe;
        int i,tamanho;
        tamanho= nome.length();
        char[]armazenado= new char[tamanho];
        for(i=0;i<tamanho;i=i+1){
            recebe= nome.charAt(i);
            recebe= Character.toUpperCase(recebe);//aqui considero que é maiscula
            armazenado[i]=recebe;//meu vetor é igual ao nome
        }
        nome2= new String(armazenado);//criando uma nova frase com as letras armazenadas
        System.out.println("Exibir nome: "+nome2);
    } 
    public static boolean validar(String nome){
        int i,tamanho;
        char recebe;
        tamanho= nome.length();
        for(i=0;i<tamanho;i=i+1){
            recebe= nome.charAt(i);
            while(Character.isLetter(recebe) == Character.isSpaceChar(recebe)){//igual define que numa string, contém ambos.
                return false;
            }
        }
        return true;
    }
}
