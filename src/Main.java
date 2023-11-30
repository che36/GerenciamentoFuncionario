
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua do Funcionario", "Complemento do Funcionario", "bairro do funcionario");
        String rua = endereco.getRua();
        System.out.println(rua);
        endereco.setRua("Rua do Funcionario Fulano");
        String rua1 = endereco.getRua();

        System.out.println(rua1);
        System.out.println(endereco);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Cesar Vendor");
        vendedor.setDocumento("13.465.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(5d);
        System.out.println(vendedor);

        OperadorCaixa operadorDeCaixa = new OperadorCaixa("Cesar", "13245789-00", 1500d, endereco);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Cesar");
        gerente.setDocumento("123456");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(50d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);


    }
}
