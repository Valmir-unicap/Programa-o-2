package projetostring;
import java.util.Scanner;
public class ProjetoString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Válidador de CPF");
        int escolha;
        String cpf;
        boolean recebe;
        do{    
            System.out.println("");
            System.out.println("1-Validar CPF");
            System.out.println("2-Sair");
            System.out.print("Escolha: ");
            escolha= in.nextInt();in.nextLine();
            while(escolha!=1 && escolha!=2){
                System.out.print("Inválido, digite novamente: ");
                System.out.print("Escolha: ");
                escolha= in.nextInt();in.nextLine();
            }
            if(escolha==1){
            System.out.println("");
            System.out.print("Digite o cpf: ");
            cpf= in.nextLine();
            recebe= valida(cpf);
            if(recebe==false){
                System.out.println("CPF inválido!");
            }else{
                System.out.println("CPF válido!");
                }
            }
        }while(escolha!=2);
    }
    public static boolean valida(String cpf){
        int i,tamanho;
        tamanho= cpf.length();
        if(tamanho!=11){//valida se contém, 11 digitos.
            return false;
        }
        char[]passa= new char[tamanho];
        for(i=0;i<tamanho;i=i+1){
            passa[i]= cpf.charAt(i);
            if(Character.isDigit(passa[i])==false){//valida se contém, números;
                return false;
            }
        }
        
        int k,tamanho1,peso=10;//10 pois busco verificar o penultimo elemento dentre 10/11
        tamanho1= cpf.length();
        int numeros,multiplica=0,divide;
        for(k=0;k<tamanho1-2;k=k+1){//-2 pois só falta fazer a verificação do penultimo numero do cpf
            numeros= cpf.charAt(k)- '0';//representa um caractere inteiro.
            multiplica= multiplica+(numeros*peso);
            peso= peso-1;//ordem da esquerda para direita
            }
        divide= (multiplica%11);//resto da divisão por 11 é responsável pelo o calculo do verificador
        if(divide<2){//digito verificador, tem que ser maior que 2
            return false;
            }
        
        int w,tamanho2, peso2=11;//11 pois busco verificar o ultimo elemento entre 11/11
        tamanho2= cpf.length();
        int numeros2,multiplica2=0,divide2;
        for(w=0;w<tamanho2 -1;w=w+1){//-1 pois só falta fazer a verificação do ultimo numero do cpf
            numeros2= cpf.charAt(w)-'0';//representa um caractere inteiro.
            multiplica2= multiplica2+(numeros2*peso2);//somatório
            peso2= peso2 -1;//ordem da esquerda para direita
        }
        divide2= (multiplica2%11);//resto da divisão por 11 é responsável pelo o calculo do verificador
        if(divide2 <2){//digito verificador, tem que ser maior que 2.
            return false;
            }
        return true;
    }
}
