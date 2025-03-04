public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Casting = ints não podem ser transformados em short, então é necessário adicionar um filtro para prosseguir mesmo assim.

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        // final é para valores constantes
        final double VALOR_DE_PI = 3.14;

    }

    /* 

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; ---- se começar com zero, pode ser necessário usar outro tipo
        long cpf = 98765432109L; ---- se começar com zero, pode ser necessário usar outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        long precisa terminar com L e float precisa terminar com F 
        
        */
}
