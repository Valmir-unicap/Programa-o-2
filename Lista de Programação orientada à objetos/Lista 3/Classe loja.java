package p2lista3poo;
/*
 * @author valmito
 */
public class Loja {
    private int contador;//começa automáticamente com 0.
    private Produto[]produtos;
    
    public Loja(int tamanho){
        produtos= new Produto[tamanho];//colocar o tamanho a ser armazenado
    }
    public int buscaSimples(Produto P){
        int i;
        if(this.contador==0){
            return -2;//vetor vázio!
        }else{
            for(i=0;i<this.contador;i=i+1){
              if(this.produtos[i].compareTo(P)==0){
                  return i;//achou!
              }  
            }
            return -1;//não achou
        }
    }
    public void cadastrar(Produto P){//não permite repetidos, ele faz isso atraves da busca
        if(this.contador< this.produtos.length){//não tem espaço livre
            int pos;
            pos= buscaSimples(P);
            if(pos==-1 || pos==-2){
                this.produtos[this.contador]=P;
                this.contador++;
                System.out.println("Inserção realizada!");
            }else{
                System.out.println("Produto repetido! Inserção não realizada.");
            }
        }else{
            System.out.println("Cadastro cheio! Inserção não realizada.");
        }
    }
    public void exibir(){
        int i;
        if(this.contador==0){
            System.out.println("Cadastro vázio!");
        }else{
            for(i=0;i<this.contador;i=i+1){
                System.out.println("Cadastro realizado!");
                System.out.println(this.produtos[i]);
            }
        }
    }
    public void alterarPreço(String codigo, int tipoAlterar){
        Produto alterar;
        alterar= new Produto(codigo,"","",0,0);
        int pos;
        pos= buscaSimples(alterar);
        if(pos==-1 || pos==-2){
            System.out.println("Produto não cadastrado");
        }else{
            if(tipoAlterar==1){
                this.produtos[pos].aplicarAumento(0);//tipo 1 de aumento//zero pois a passem de um novo número foi feita na classe produto
            }else{
                this.produtos[pos].aplicarDesconto(0);//tipo 2 de desconto//zero pois a passem de um novo número foi feita na classe produto
            }
        }
    }
    public void atualizarEstoque(String codigo){
        Produto atualizar;
        atualizar= new Produto(codigo,"","",0,0);
        int pos;
        pos= buscaSimples(atualizar);
        if(pos==-1 || pos==-2){
            System.out.println("Produto não cadastrado");
        }else{
            this.produtos[pos].atualizarEstoque(0);//zero pois a passem de um novo número foi feita na classe produto
        }
    }
    public void RealizarVenda(String codigo){
        Produto realizar;
        realizar= new Produto(codigo,"","",0,0);
        int pos;   
        pos= buscaSimples(realizar);
        if(pos==-1 || pos==-2){
            System.out.println("Produto não cadastrado");
        }else{
            this.produtos[pos].venderProduto(0);//zero pois a passem de um novo número foi feita na classe produto
        }  
    }
}
