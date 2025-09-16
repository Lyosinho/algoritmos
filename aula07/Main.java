public class Main {
    public static void main(String[] args) {
        ListaDupla<Produto> lista = new ListaDupla<>("Produtos");

        Produto p1 = new Produto("Arroz", 10.0);
        Produto p2 = new Produto("Feijão", 8.5);
        Produto p3 = new Produto("Macarrão", 6.0);

        lista.addInicio(p1);
        lista.addFinal(p2);
        lista.addIndice(p3, 1);

        System.out.println("Lista após inserções:");
        lista.imprimeLista();

        Produto removido = lista.removeIndice(1);
        System.out.println("\nProduto removido: " + removido);

        Produto p4 = new Produto("Café", 15.0);
        Produto p5 = new Produto("Açúcar", 5.0);
        lista.addInicio(p4);
        lista.addFinal(p5);

        System.out.println("\nLista final:");
        lista.imprimeLista();
    }
}
