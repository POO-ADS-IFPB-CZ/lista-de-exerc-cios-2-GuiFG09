import resources.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(101, "Mouse Gamer", 150.0, 20);
        p1.exibirInfo();

        p1.setPreco(-50); // Teste da validação
        p1.setPreco(120.0);
        p1.exibirInfo();
    }
}