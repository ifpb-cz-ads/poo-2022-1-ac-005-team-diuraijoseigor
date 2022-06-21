public class CBBAtividadePratica4{
    public static void main(String[] args) {
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();

        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");

        System.out.println(ana.getNome());

        System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());
    }
}

class RegistraAluno{
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    public String getNome(){
        return nome;
    }

    public void setNome(String temp){
        nome = temp;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String temp){
        endereco = temp;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int temp){
        idade = temp;
    }

    public void setNotaMatematica(double temp){
        notaMatematica = temp;
    }

    public void setNotaPortugues(double temp){
        notaPortugues = temp;
    }

    public void setNotaGeografia(double temp){
        notaGeografia = temp;
    }

    public double getMedia(){
        double resultado;
        resultado = (notaMatematica + notaPortugues + notaGeografia)/3;
        return resultado;
    }

    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
}