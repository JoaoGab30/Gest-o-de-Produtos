import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    // Método que exibe os preços com desconto de cada produto
    public void exibirPrecosComDesconto(double porcentagem) {
        System.out.println("Preços com " + porcentagem + "% de desconto:");
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println(produto.getNome() + " - Preço com desconto: R$ " + precoComDesconto);
        }
    }

    // Método para adicionar um produto ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Método para remover um produto do estoque
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
}