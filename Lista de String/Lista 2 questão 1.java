package p2lista2stringq1;
import java.util.Scanner;
public class P2Lista2StringQ1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String cpf,cpf2;
        System.out.print("Digite seu o número do CPF: ");
        cpf= in.nextLine();
        boolean retorno;
        retorno= valida(cpf);
        while(retorno==false){
            System.out.print("CPF inválido! Digite novamente: ");
            cpf= in.nextLine();
            retorno= valida(cpf);//forçar até que seja true;
        }
        System.out.println("CPF válido!");//se for true ele exibe;
        int i,tamanho;
        tamanho= cpf.length();
        char[] receber= new char[15];
        for(i=0;i<tamanho;i=i+1){
            receber[i]= cpf.charAt(i);//recebo o tamanho da string == 11;
            receber[i]='X';
            receber[3]='.';
            receber[7]='.';
            receber[12]='-';
            receber[13]='X';//aqui tou acrescentando + um x
            receber[14]='X';//aqui também arescenta + um x
        }
        cpf2= new String(receber);
        System.out.print(cpf2);
    }
    public static boolean valida(String cpf){
        int i,tamanho,contador=0;
        char receber;
        tamanho= cpf.length();
        for(i=0;i<tamanho;i=i+1){
            receber= cpf.charAt(i);
            if(Character.isDigit(receber)){//se tiver números, soma+1;
                contador=contador+1;
           }else{
                return false;//se não tiver número, cpf é inválido.
            }
        }
        if(contador==11){ //cpf é valido quando tem 11 números
            return true;        
        }
        return false;
    }
}
