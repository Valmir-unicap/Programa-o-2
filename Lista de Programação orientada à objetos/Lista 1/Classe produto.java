package p2lista1pooq1a;
import java.util.Scanner;
/*
 @author valmito
 */
public class Produto implements Comparable<Produto>{//permite comparar produtos, verifica se há produtos iguais;
    private String codigo;
    private String detalhe;
    private String fornecedor;
    private double preço;
    private int estoque;
    
    public Produto(String codigo, String detalhe, String fornecedor, double preço, int estoque){//construtor!
        this.codigo= codigo;
        this.detalhe= detalhe;
        this.fornecedor= fornecedor;
        this.preço= preço;
        this.estoque= estoque;
    }
    private void setCodigo(String codigo){
        this.codigo= codigo;
    }
    private String getCodigo(){
        return this.codigo;
    }
    private void setDetalhe(String detalhe){
        this.detalhe= detalhe;
    }
    private String getDetalhe(){
        return this.detalhe;
    }
    private void setFornecedor(String fornecedor){
        this.fornecedor= fornecedor;
    }
    private String getFornecedor(){
        return this.fornecedor;
    }
    private void setPreço(double preço){
        this.preço= preço;
    }
    private double getPreço(){
        return this.preço;
    }
    private void setEstoque(int estoque){
        this.estoque= estoque;
    }
    private int getEstoque(){
        return this.estoque;
    }
    public String toString(){//Exibição final!
        return "codigo do produto: "+this.codigo+" ,da descrição: "+this.detalhe+" ,do fornecedor: "+this.fornecedor+" ,custa: R$"+this.preço+" ,possui no estoque: "+this.estoque+" quantidades.";
    }
    @Override
    public int compareTo(Produto codigo2){//Permite a comparação do que eu desejar.
        return this.codigo.compareTo(codigo2.codigo);//comparação entre dois codigos
    }
    public void aplicarDesconto(double preço){
        Scanner in= new Scanner(System.in);
        int porcentagem;
        double calcular,total;
        System.out.print("Infome, a procentagem de desconto: ");
        porcentagem= in.nextInt();
        while(porcentagem<=0 || porcentagem>100){
            System.out.print("Inválido, digite novamente: ");
            porcentagem= in.nextInt();
        }
        preço= getPreço();
        calcular= (porcentagem * preço)/100;
        total= preço-calcular;
        this.setPreço(total);
    }
    public void aplicarAumento(double preço){//deve ser maior que o preço atual.
        Scanner in= new Scanner(System.in);
        double aumento;
        System.out.print("Informe o aumento, do novo preço: ");
        aumento= in.nextDouble();
        while(aumento<=0 || aumento<=this.getPreço()){
            System.out.print("Inválido, digite novamente: ");
            aumento= in.nextDouble();
        }
            this.setPreço(aumento);
        }
    public void atualizarEstoque(int estoque){
       Scanner in= new Scanner(System.in);
       int estoqueNovo;
        System.out.print("Informe a nova quantidade, de estoque: ");
        estoqueNovo= in.nextInt();
        while(estoqueNovo<=0 || estoqueNovo<=this.getEstoque() && estoqueNovo>=this.getEstoque()){
            System.out.print("Inválido, digite novamente: ");
            estoqueNovo= in.nextInt();
        }
        this.setEstoque(estoqueNovo);
    }
    public void venderProduto(int estoque){
        Scanner in= new Scanner(System.in);
        int quantidade,calcula;
        System.out.print("Informe a quantidade, que deseja comprar: ");
        quantidade= in.nextInt();
        while(quantidade<=0 || quantidade>this.getEstoque()){
            System.out.print("Inválido, digite novamente: ");
            quantidade= in.nextInt();
        }
        calcula= this.getEstoque()-quantidade;
        this.setEstoque(calcula);
    }
}
