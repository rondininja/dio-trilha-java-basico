public class SistemaCadastro {
    public static void main(String[] args) {
        //uma pessoa foi criada em sistema
        Pessoa marcos = new Pessoa("123", "Marcos");

        //definindo o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e o cpf do marcos?

        //imprimindo o marcos sem nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
