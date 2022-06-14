public class BMExercicio05 {
    public static void main(String[] args) {
        TimeCampeonato time = new TimeCampeonato();
        time.nomeTime = "Time de testes";
        time.registraJogador("Harry");
        time.registraJogador("Rony");
        time.registraJogador("Hermione");
        time.registraJogador("Dumbledore");
        time.registraJogador("Snape");
        time.jogarPartida(2, 1);
        time.jogarPartida(1, 1);
        time.jogarPartida(0, 1);
        time.jogarPartida(2, 0);
        time.mostrarStatus();
        time.mostrarJogadores();
    }
}

class TimeCampeonato{
    public String nomeTime;
    private int ultimoIndice = 0;
    private int numeroPartidas;
    private int numeroVitorias;
    private int numeroDerrotas;
    private int numeroJogadores = 5;
    private String[] nomeJogadores = new String[numeroJogadores];


    public void registraJogador(String jogador){
        nomeJogadores[ultimoIndice] = jogador;
        ultimoIndice++;
    }

    public void jogarPartida(int pontosTime, int pontosOponente){
        numeroPartidas++;
        if(pontosTime == pontosOponente){
            System.out.println("Empate!");
        }
        else if(pontosTime > pontosOponente){
            numeroVitorias++;
            System.out.println("Vitoria!");
        }
        else{
            numeroDerrotas++;
            System.out.println("Vitoria!");
        }
    }

    public void mostrarStatus(){
        System.out.println("Time " + nomeTime);
        System.out.println("Partidas jogadas: " + numeroPartidas + " Vitorias: " + numeroVitorias + " Derrotas: " + numeroDerrotas);
    }

    public void mostrarJogadores(){
        System.out.println("Jogadores:");
        for(int i = 0; i < numeroJogadores; i++){
            System.out.println(nomeJogadores[i]);
        }
    }
}
