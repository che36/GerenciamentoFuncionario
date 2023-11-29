public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Double valorHora;
    private Endereco endereco;
    private Double valorRemuneracao;
    private Integer horasTrabalhadas;

    public void calculaRemuneracao() {
        this.valorHora = this.valorRemuneracao * this.valorHora;
    }

}
