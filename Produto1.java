public class Produto1 extends Produto {

    public Produto1(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }
}