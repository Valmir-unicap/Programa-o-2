package p2lista1stringq4;
import java.util.Scanner;
public class P2Lista1StringQ4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int i,tamanho;
        String frase, frase2;
        char obtem;
        System.out.print("Digite uma frase: ");
        frase= in.nextLine();
        tamanho= frase.length();
        char[]armazenar= new char[tamanho];//criei um vetor, pois deve armazea mais de uma letra.
        for(i=0;i<tamanho;i=i+1){
            obtem= frase.charAt(i);
            obtem= Character.toLowerCase(obtem);
            switch(obtem){//aqui ele vai, verificar e substituir.
                case 'a':
                    armazenar[i]='@';
                    break;
                case 'e':
                    armazenar[i]='$';
                    break;
                case 'i':
                    armazenar[i]='&';
                    break;
                case 'o':
                    armazenar[i]='*';
                    break;
                case 'u':
                    armazenar[i]='#';
                    break;
                default: armazenar[i]= obtem;
            }
        }
        frase2= new String(armazenar);//criando uma frase, com vetor com as letras armazenadas.
        System.out.println("Frase Criptografada: "+frase2);
    }
}
