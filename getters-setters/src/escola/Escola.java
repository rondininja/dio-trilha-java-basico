package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Junior");
        felipe.setIdade(12);
        felipe.setSexo("masculino");

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos. Seu sexo é " + felipe.getSexo());
    }
}
