
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua do Funcionario", "Complemento do Funcionario", "bairro do funcionario");
        String rua = endereco.getRua();
        System.out.println(rua);
        endereco.setRua("Rua do Funcionario Fulano");
        String rua1 = endereco.getRua();

        System.out.println(rua1);
        System.out.println(endereco);
    }
}
