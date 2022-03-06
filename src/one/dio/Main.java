package one.dio;

public class Main {

    public static void main(String[] args) { //Instanciar é criar o objeto na memória!


        Endereco endereco = new Endereco("rua 2", "ap 10", "Centro");
        //Vendedor vendedor = new Vendedor();//new é que da o comando para a criação do objeto na memória!

        Vendedor vendedor = new Vendedor("Vendedor", "111.654.644-20", endereco, 1000d);
        vendedor.calculaBonificacao(0.1d);


        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Operador de Caixa", "2002.2002", endereco, 1500d);

        System.out.println(vendedor);
        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();

        gerente.setNome("Gerente");
        gerente.setDocumento("11.111.64554");
        gerente.setHorasTrabalhadas(40);
        gerente.setValorHora(75d);
        gerente.setEndereco(endereco);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(0.2);

        System.out.println(gerente);

       }
}
