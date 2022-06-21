public class BMExercicio06 {
    
    public static void main(String[] args){


        ContaBancariaSimplifacada c1;
        c1 = new ContaBancariaSimplifacada();
        c1.abreContaSimples("Maria");
        ContaBancariaSimplifacada c2 = new ContaBancariaSimplifacada();
        c2.abreContaSimples("João");
        c1.deposita(200);
        c2.saldo =1000;

        if(c1.retira(3000)){
            System.out.println("Saque ralizado com sucesso!");
        }

        else{
            System.out.println("Saldo insuficiente!");
        }

        c1.mostradados();
        c2.mostradados();



    }


}

class ContaBancariaSimplifacada {
    
    String nomeDoCorrentista;
    float saldo;
    boolean contaEEspecial;

    void abreContaSimples(String nome){

        nomeDoCorrentista = nome;
        saldo = 100.00f;
        contaEEspecial = false;
    }

    void deposita(float valor){
        saldo = saldo +valor;
    }

    boolean retira(float valor){

        if(contaEEspecial == false){

            if(valor <=saldo){
                saldo = saldo -valor;
                return true;
            }
            else{
                return false;
            }
        }

        else{
            saldo = saldo - valor;
            return true;
        }

    }

    void mostradados(){

        System.out.print("O nome do correntista é ");
        System.out.print(nomeDoCorrentista);
        System.out.print("O saldo é ");
        System.out.print(saldo);
        if(contaEEspecial){
            System.out.print("A conta é especial.");
        }
        else{
            System.out.print("A conta é comum ");
        }

    }

}
