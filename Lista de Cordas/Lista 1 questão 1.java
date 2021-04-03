package p2lista1stringq1;
import java.util.Scanner;
public class P2Lista1StringQ1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String frase;
        int i,tamanho,contador=0;
        char receber;
        System.out.print("Digite uma frase: ");
        frase= in.nextLine();
        tamanho= frase.length();
        for(i=0;i<tamanho;i=i+1){
            receber= frase.charAt(i);
            receber= Character.toLowerCase(receber);
            if(receber=='a' || receber=='e' || receber=='i' || receber== 'o' || receber=='u'){
                contador= contador+1;
            }
        }
            System.out.println("Na frase acima, contém: "+contador+" vogais.");
    }
}
