package p2lista1stringq3;
import java.util.Scanner;
public class P2Lista1StringQ3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String frase;
        int i,tamanho;
        int contador1=0, contador2=0, contador3=0, contador4=0;
        char passa;
        System.out.print("Digite uma frase: ");
        frase= in.nextLine();
        tamanho= frase.length();
        for(i=0;i<tamanho;i=i+1){
            passa= frase.charAt(i);
            passa= Character.toLowerCase(passa);
            if(passa==' '){//quantidade de espaços em branco
                contador1=contador1+1;
            }
            if(passa>='a' && passa<='z' || passa>='A' && passa<='Z'){//quantidade de letras
                contador3=contador3+1;
            }
            if(passa=='@' || passa=='#' || passa=='!' || passa=='$' || passa=='*' || passa=='&' || passa=='%' || passa=='+' || passa=='-'){//quantidade de digitos
                contador4=contador4+1;
            }
            if(passa>='0' && passa<='9'){//quantidade de digitos entre 0 até 9
                contador2=contador2+1;
            }
        }
        System.out.println("Contém "+contador1+" espaços em brancos.");
        System.out.println("Contém "+contador2+" digitos.");
        System.out.println("Contém "+contador3+" letras.");
        System.out.println("Contém "+contador4+" simbolos.");
    }
}
