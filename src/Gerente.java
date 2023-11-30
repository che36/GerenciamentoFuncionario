public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = super.getValorRemuneracao() * (porcentagemBonificacao / 100) + 100d;
    }


    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", valorHora=" + super.getValorHora() +
                ", endereco=" + super.getEndereco() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                '}';
    }
}
}
