public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorRemuneracao() * (porcentagemBonificacao / 100) + 100d;
    }
}
