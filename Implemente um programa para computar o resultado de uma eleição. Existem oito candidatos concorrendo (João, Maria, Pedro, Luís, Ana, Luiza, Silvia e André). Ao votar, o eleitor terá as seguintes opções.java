package p2lista1vetorq4;
import java.util.Scanner;
public class P2Lista1vetorQ4 {
public static void main(String[] args) {
Scanner in= new Scanner(System.in);
int escolha;
char pergunta;
int[] voto= new int[10];
do{
System.out.println("Eleições!");
System.out.println("");
System.out.println("0-Voto em branco");
System.out.println("1-Voto em João");
System.out.println("2-Voto em Maria");
System.out.println("3-Voto em Pedro");
System.out.println("4-Voto em Luis");
System.out.println("5-Voto em Ana");
System.out.println("6-Voto em Luiza");

System.out.println("7-Voto em Silvia");
System.out.println("8-Voto em André");
System.out.println("");
System.out.print("Escolha uma opção: ");
escolha= in.nextInt();
switch(escolha){
case 0:
voto[0]= voto[0]+1;
System.out.println("Foi armzenado!");
break;
case 1:
voto[1]=voto[1]+1;
System.out.println("Foi armazenado!");
break;
case 2:
voto[2]= voto[2]+1;
System.out.println("Foi armazenado!");
break;
case 3:
voto[3]= voto[3]+1;
System.out.println("Foi armazenado!");
break;
case 4:
voto[4]= voto[4]+1;
System.out.println("Foi armazenado!");
break;
case 5:
voto[5]= voto[5]+1;
System.out.println("Foi armazenado!");
break;

case 6:
voto[6]= voto[6]+1;
System.out.println("Foi armazenado!");
break;
case 7:
voto[7]= voto[7]+1;
System.out.println("Foi armazenado!");
break;
case 8:
voto[8]= voto[8]+1;
System.out.println("Foi armazenado!");
break;
default:
voto[9]= voto[9]+1;
System.out.println("Voto nulo, foi armazenado.");
}
System.out.print("Tem outro eleitor? Se sim, digite s. Se não, digite n: ");
pergunta= in.next().charAt(0);
while(pergunta!='s' && pergunta!='n'){
System.out.print("Digite novamente, s para sim. Ou n para não: ");
pergunta= in.next().charAt(0);
}
}while(pergunta!='n');
exibir(voto);
percentualVotos(voto);
}
public static void exibir(int[]voto){
int i;
for(i=0;i<voto.length; i=i+1){
System.out.println("0-Voto em branco: "+voto[0]+" votos. ");

System.out.println("1-Voto em João: " +voto[1]+ " votos.");
System.out.println("2-Voto em Maria: "+voto[2]+" votos.");
System.out.println("3-Voto em Pedro: "+voto[3]+" votos.");
System.out.println("4-Voto em Luis: "+voto[4]+" votos.");
System.out.println("5-Voto em Ana: "+voto[5]+" votos.");
System.out.println("6-Voto em Luiza: "+voto[6]+" votos.");
System.out.println("7-Voto em Silvia: "+voto[7]+" votos.");
System.out.println("8-Voto em André: "+voto[8]+" votos.");
System.out.println("9-Voto nulo: "+voto[9]+" votos.");
break;
}
}
public static void percentualVotos(int[] votos){
int resultado;
resultado=
votos[0]+votos[1]+votos[2]+votos[3]+votos[4]+votos[5]+votos[6]+votos[7]+votos[8]+votos[9];
System.out.println("A soma geral de votos: "+resultado);
}
}
