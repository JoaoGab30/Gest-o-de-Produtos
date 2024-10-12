import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Criando produtos de diferentes tipos
        Produto produto1 = new Produto1("Produto A", 100.0);
        Produto produto2 = new Produto2("Produto B", 200.0);
        Produto produto3 = new Produto1("Produto C", 150.0);
        Produto produto4 = new Produto2("Produto D", 300.0);

        // Criando uma lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        // Aplicando um desconto de 10% em todos os produtos e exibindo os preços
        System.out.println("Aplicando 10% de desconto:");
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(10);
            System.out.println(produto.getNome() + " - Preço com desconto: R$ " + precoComDesconto);
        }

        // Teste adicional para verificar o limite de desconto no Produto2
        System.out.println("\nAplicando 60% de desconto (máximo de 50% para Produto2):");
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(60); // Produto2 tem limite de 50%
            System.out.println(produto.getNome() + " - Preço com desconto: R$ " + precoComDesconto);
        }
    }
}
