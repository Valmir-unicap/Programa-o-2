package p2lista3poo;
/*
 * @author valmito
 */
import java.util.Scanner;
public class bomPreco {
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
       int tam;
        System.out.println("Digite o tamanho de cadastros a ser realizado: ");
        System.out.print("Tamanho: ");
        tam= in.nextInt();
        while(tam<=0){
            System.out.println("Inválido, digite novamente: ");
            tam= in.nextInt();
        }
        System.out.println("");
        Loja bomPreco;//puxo da minha Loja
        bomPreco= new Loja(tam);//defino o tamanho do cadastro, a ser realizado
        Produto P;//puxo da minha classe Produto
        int escolha;
        String codigo,situacao,fornecedor;
        double preço;
        int estoque;
        do{
            System.out.println("1-Cadastra um novo produto:");
            System.out.println("2-Exibir dados de todos os produtos");
            System.out.println("3-Exibir dados de um produto, de um dado fornecedor");
            System.out.println("4-Alterar preço de produto");
            System.out.println("5-Atualizar estoque");
            System.out.println("6-Realizar a venda do produto");
            System.out.println("0-Sair do programa");
            System.out.print("Escolha uma opção: ");
            escolha= in.nextInt();
            System.out.println("");
        switch(escolha){
                
            case 1:
                in.nextLine();//fiz isso, para não ocorrer bug.
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
               estoque= in.nextInt();
               while(estoque<=0){
                   System.out.print("Inválido, digite novamente: ");
                   estoque= in.nextInt();
               }
                System.out.println("");
                P= new Produto(codigo,situacao,fornecedor,preço,estoque);//criação do objeto cadastro
                bomPreco.cadastrar(P);//Realização do cadastro!
                System.out.println(""); 
                break; 
                
            case 2:
                bomPreco.exibir();//exibir todos os produtos
                System.out.println("");
                break;
                
            case 3:
                //exibir dados de todos os produtos de um dado fornecedor
                //falta fazer
                break;
        
            case 4:
                int opcao;
                System.out.println("1-Aumento");
                System.out.println("2-Desconto");
                System.out.print("Escolha um das opções: ");
                opcao= in.nextInt();
                while(opcao<=0 && opcao>2){
                    System.out.println("Opão inválida, digite novamente: ");
                    opcao= in.nextInt();
                }
                in.nextLine();//fiz isso, para não ocorrer bug.
                System.out.print("Informe o código do produto: ");
                codigo= in.nextLine();
                bomPreco.alterarPreço(codigo, opcao);
                System.out.println("");
                break;
                
            case 5:
                in.nextLine();//fiz isso, para não ocorrer bug.
                System.out.print("Digite o código do produto: ");
                codigo= in.nextLine();
                bomPreco.atualizarEstoque(codigo);
                System.out.println("");
                break;
                
            case 6:
                in.nextLine();//fiz isso, para não ocorrer bug.
                System.out.print("Informe o código do produto: ");
                codigo= in.nextLine();
                bomPreco.RealizarVenda(codigo);
                System.out.println("");
                break;
                
            case 0:
                System.out.println("Fim do programa");
                System.out.println("");
                break;
                
            default:
                System.out.println("Opção inválida!");
                System.out.println("");
                break;
                
            } 
        }while(escolha!=0);
    }
}
