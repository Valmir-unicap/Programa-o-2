package p2lista1stringq2;
import java.util.Scanner;
public class P2Lista1StringQ2 {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       int i,tamanho,contador=0;
       String frase;
       char recebe, procura;
        System.out.print("Digite uma frase: ");
        frase= in.nextLine();
        tamanho= frase.length();
        System.out.print("Digite um caractere, que deseja procurar: ");
        procura= in.next().charAt(0);
        procura= Character.toLowerCase(procura);
        for(i=0;i<tamanho;i=i+1){
            recebe= frase.charAt(i);
            recebe= Character.toLowerCase(recebe);
            if(procura==recebe){
                contador=contador+1;
            }
        }
        System.out.println("Aparece "+contador+" vezes.");
    }
}
