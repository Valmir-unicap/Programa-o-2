package p2lista2poo;
import java.util.Scanner;
public class Data implements Comparable <Data>{
    private int ano;
    private int mes;
    private int dia;

    public Data(int ano,int mes, int dia){//Construtor!
        boolean retorno;
        retorno= validarData(ano,mes,dia);
        if(retorno==true){
            this.ano= ano;//ano válido!
            this.mes= mes;//mes válido!
            this.dia= dia;//dia válido!
        }else{
            this.ano= 1;//ano inválido!
            this.mes= 1;//mes inválido!
            this.dia= 1;//dia inválido!
        }
    }
    
    private void setAno(int ano){
        this.ano= ano;
    }
    private int getAno(){
        return this.ano;
    }
    private void setMes(int mes){
        this.mes= mes;
    }
    private int getMes(){
        return this.mes;
    }
    private void setDia(int dia){
        this.dia= dia;
    }
    private int getDia(){
        return this.dia;
    }
    
    private boolean validarData(int ano, int mes, int dia){//validação Geral!
        boolean retorno1, retorno2,retorno3;
        retorno1= validarAno(ano);
        retorno2= validarMes(mes);
        retorno3= Bissexto(ano);
        if(retorno1==false){
            return false;//ano inválido!
        }
        if(retorno2==false){//mes inválido!
            return false;
        }else{//validar dia através do més.
            if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){//janeiro,março,maio,julho,agosto,outubro,dezembro
                if(dia>=1 && dia<=31){
                    return true;//válido!
                }else{
                    return false;//inválido!
                }
            }
            if(mes==4 || mes==6 || mes==9 || mes==11){//abril,junho,setembro,novembro
                if(dia>=1 && dia<=30){
                    return true;//válido!
                }else{
                    return false;//inválido!
                }
            }
            if(mes==2){
                if(retorno3==false){//não é bissexto!
                    if(dia>=1 && dia<=28){
                        return true;//inválido!
                    }else{
                        return false;
                    }
                }
                if(retorno3==true){//é bissexto!         
                    if(dia>=1 && dia<=29){
                        return true;//válido!
                    }else{
                        return false;//inválido!
                    }
                }
            }
            return false;
        }
    }
    
    private boolean validarAno(int ano){
        if(ano>=0){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean validarMes(int mes){
        if(mes>=1 && mes<=12){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Bissexto(int ano){
        if(ano%4==0){
           return true;//é bissexto
        }else{
            return false;//não bissexto
        }
    }
    
    public String toString(){
        return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
    }
    
    @Override
    public int compareTo(Data data2) {
        if(this.getAno() == data2.getAno() && this.getMes()==data2.getMes() && this.getDia()==data2.getDia()){
            return 0;
        }else if(this.getAno() > data2.getAno()){
                return 1;
        }else if(this.getAno() < data2.getAno()){
            return -1;
        }else if(this.getMes() > data2.getMes()){
            return 1;
        }else if(this.getMes() < data2.getMes()){
            return -1;
        }else if(this.getDia() > data2.getDia()){
            return 1;
        }else{
        return -1;
        }
    }
    
    public void exibir(int dia, int mes, int ano){
        if(mes==1){
            System.out.println(+dia+" de Janeiro de "+ano);
        }else if(mes==2){
            System.out.println(+dia+" de Fevereiro de "+ano);
        }else if(mes==3){
            System.out.println(+dia+" de Março de "+ano);
        }else if(mes==4){
            System.out.println(+dia+" de Abril de "+ano);
        }else if(mes==5){
            System.out.println(+dia+" de Maio de "+ano);
        }else if(mes==6){
            System.out.println(+dia+" de Junho de "+ano);
        }else if(mes==7){
            System.out.println(+dia+" de Julho de "+ano);
        }else if(mes==8){
            System.out.println(+dia+" de Agosto de "+ano);
        }else if(mes==9){
            System.out.println(+dia+" de Setembro de "+ano);
        }else if(mes==10){
            System.out.println(+dia+" de Outubro de "+ano);
        }else if(mes==11){
            System.out.println(+dia+" de Novembro de "+ano);
        }else if(mes==12){
            System.out.println(+dia+" de Dezembro de "+ano);
        }
    }
    
    /*public void acrescentar(int dia,int mes, int ano){
        Scanner in= new Scanner(System.in);
        int numero, recebe, recebe2,contador=0;
        System.out.print("Informe quantos dias, deseja acrescentar: ");
        numero= in.nextInt();
        recebe= this.getDia()+numero;
        int i;
        for(i=this.getDia();i<recebe;i=i+1){
            contador=contador+1;
        }
        if(contador<30){
            recebe2=this.getMes()+1;
        }
    }*/
}
