class ContaBancariaSimplifacada {
    
    String nomeDoCorrentista;
    float saldo;
    boolean contaEEspecial;

    void abreContaSimples(String nome){

        nomeDoCorrentista = nome;
        saldo = 0.00f;
        contaEEspecial = false;
    }

    void abreContaEspecial(String nome){
        nomeDoCorrentista = nome;
        saldo = 0.00f;
        contaEEspecial = true;
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
        System.out.println(nomeDoCorrentista);
        System.out.print("O saldo é ");
        System.out.println(saldo);
        if(contaEEspecial){
            System.out.println("A conta é especial.");
        }
        else{
            System.out.println("A conta é comum ");
        }
        if(contaEEspecial && saldo < 0){
            
            System.out.println("Sua conta está negativa");
        }

    }

}






public class BMExercio03 {
    
    public static void main(String[] args){


        ContaBancariaSimplifacada c1;
        c1 = new ContaBancariaSimplifacada();
        c1.abreContaSimples("Maria");
        ContaBancariaSimplifacada c2 = new ContaBancariaSimplifacada();
        c2.abreContaEspecial("João");
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

