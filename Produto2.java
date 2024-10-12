public class Produto2 extends Produto {
    private static final double DESCONTO_MAXIMO = 50.0; // Limite de desconto em %

    public Produto2(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        if (porcentagem > DESCONTO_MAXIMO) {
            porcentagem = DESCONTO_MAXIMO;
        }
        return preco - (preco * porcentagem / 100);
    }
}