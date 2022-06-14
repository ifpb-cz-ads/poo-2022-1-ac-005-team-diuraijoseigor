# BMExercicio01


inicio modelo

public class Lampada{
    
    int voltagem;//indica a quantidade de volts da Lâmpada.
    String tipoLampada;//indica o tipo da Lâmpada.
    boolean estadoLampada;//indica o estado da Lâmpada se está acessa ou não.
    int precoLampada;//indica o preço da Lâmpada.

    public void precoLampada(){

        início
        imprime "preço da lampada é %d";

        fim 

    }//mostra o preço da Lâmpada.
    
    public void acenderLampada(){

        início

        estadoLampada= aceso;
        
        fim

    }//acende  Lâmpada

    public void apagarLampada(){

        início

        estadoLampada= apagado;

        fim

    }//apaga Lâmpada

    public void mostrarInfo(){

        início

        imprime informações da lampada

        fim 

    }//mostra as informações da Lâmpada.


}

fim do modelo

---

# BMExercicio02


class TimeCampeonato{

    String nomeTime;
    boolean estaNoCampeonato;
    int numeroJogadores;
    String[] nomeJogadores = new String[numeroJogadores];
    int numeroPartidas;
    int numeroVitorias;
    int numeroDerrotas;

    void registraJogador(){}
    void jogarPartida(){}
    void mostrarStatus(){}
    void mostrarJogadores(){}
    
}


fim do modelo

---

# BMExercicio08

Erros: linhas 13 e 14, o nome do método deixa a entender que avaliará as variáveis num1 e num2 e retornará o maior, porém, ele retorna true se num1 for maior que num2 e falso caso contrário.

---

# BMExercicio09

Erro: linha 3, não há um tipo para o método main, logo, a linha 9 também está errada já que na linha 3 não tem um 
> boolean main(String[] args)
