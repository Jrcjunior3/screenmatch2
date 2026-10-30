public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incluindoNoPlano;
    public double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    public int duracaoEmMinuto;

    public int gettotalDeAvaliacao(){
        return totalDeAvaliacao;
    }
    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
    }
    public void avalia (double nota  ) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}