package p2lista1pooq1a;
import java.util.Scanner;
/*
 * @author valmito
 */
public class P2Lista1POOQ1A {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       Preencher1();
       Preencher2();
       //falta comparar ambos produtos, não comparei, pois os valores digitados pelo o usário, não era definidos.
    }
    public static void Preencher1(){
       Scanner in= new Scanner(System.in);
       String codigo,situacao,fornecedor;
       double preço;
       int quantidade;
       System.out.print("Digite o código do produto: ");
       codigo= in.nextLine();
       System.out.println("");
       System.out.print("Digite o a situação do produto: ");
       situacao=in.nextLine();
       System.out.println("");
       System.out.print("Digite o nome do fornecedor: ");
       fornecedor= in.nextLine();
       System.out.println("");
       System.out.print("Digite o preço do produto: ");
       preço= in.nextDouble();
       while(preço<=0){
            System.out.print("Inválido, digite novamente: ");
            preço= in.nextDouble();
       }
       System.out.println("");
       System.out.print("Digite a quantidade desse produto, no estoque: ");
       quantidade= in.nextInt();
       while(quantidade<=0){
           System.out.print("Inválido, digite novamente: ");
           quantidade= in.nextInt();
       }
        System.out.println("");
        Produto produto1= new Produto(codigo,situacao,fornecedor,preço,quantidade);
        System.out.println("Produto 1: "+produto1);
        System.out.println("");
        produto1.aplicarDesconto(preço);
        System.out.println("Exibir com desconto: "+produto1);
        System.out.println("");
        produto1.aplicarAumento(preço);
        System.out.println("Exibir aumento do preço: "+produto1);
        System.out.println("");
        produto1.atualizarEstoque(quantidade);
        System.out.println("Exibir novo estoque: "+produto1);
        System.out.println("");
        produto1.venderProduto(quantidade);
        System.out.println("Exibir novo estoque, após as vendas: "+produto1);
    }
    public static void Preencher2(){
       Scanner in= new Scanner(System.in);
       String codigo,situacao,fornecedor;
       double preço;
       int quantidade;
       System.out.print("Digite o código do produto: ");
       codigo= in.nextLine();
       System.out.println("");
       System.out.print("Digite o a situação do produto: ");
       situacao=in.nextLine();
       System.out.println("");
       System.out.print("Digite o nome do fornecedor: ");
       fornecedor= in.nextLine();
       System.out.println("");
       System.out.print("Digite o preço do produto: ");
       preço= in.nextDouble();
       while(preço<=0){
            System.out.print("Inválido, digite novamente: ");
            preço= in.nextDouble();
       }
       System.out.println("");
       System.out.print("Digite a quantidade desse produto, no estoque: ");
       quantidade= in.nextInt();
       while(quantidade<=0){
           System.out.print("Inválido, digite novamente: ");
           quantidade= in.nextInt();
       }
        System.out.println("");
        Produto produto2= new Produto(codigo,situacao,fornecedor,preço,quantidade);
        System.out.println("Produto 2: "+produto2);
        System.out.println("");
        produto2.aplicarDesconto(preço);
        System.out.println("Exibir com desconto: "+produto2);
        System.out.println("");
        produto2.aplicarAumento(preço);
        System.out.println("Exibir aumento do preço: "+produto2);
        System.out.println("");
        produto2.atualizarEstoque(quantidade);
        System.out.println("Exibir novo estoque: "+produto2);
        System.out.println("");
        produto2.venderProduto(quantidade);
        System.out.println("Exibir novo estoque, após as vendas: "+produto2);
    }
}
