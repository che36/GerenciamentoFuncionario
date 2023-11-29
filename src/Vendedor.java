public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorBonificacao=" + valorBonificacao +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao / 100d);
    }
}
