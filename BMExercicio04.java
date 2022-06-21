class Lampada{

    private int voltagem;
    private String tipoLampada;
    private boolean estadoLampada;
    
    public Lampada(int voltz,String tipo){

        this.voltagem=voltz;
        this.tipoLampada=tipo;
       this.estadoLampada=false;
    }
    public void preco(int precoLampada){

      System.out.println("O preco da lampada e: " +  precoLampada + " reais");

    }
    
    public void acenderLampada(){


        this.estadoLampada = true;
        

    }

    public void apagarLampada(){

        this.estadoLampada = false;

    }

    public void mostrarInfo(){
        
    preco(12);
    System.out.println("Tipo da lampada e: " + this.tipoLampada);
    System.out.println("A voltagem da lampada e: " + this.voltagem);
    System.out.println("A lampada esta acessa: " +this.estadoLampada);
    }


}

public class BMExercicio04{

    public static void main(String[] args){

        Lampada l1 = new Lampada(220,"led");

        l1.acenderLampada();
        l1.mostrarInfo();


    }
}