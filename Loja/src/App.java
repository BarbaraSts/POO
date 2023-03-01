public class App {
    public static void main(String[] args) throws Exception {
        
        ProdutoLivro produtoLivro = new ProdutoLivro("Bridgerton", 28.90, "Julia Quinn");

        System.out.println(produtoLivro.getNome());
        System.out.println(produtoLivro.CalcularPreco());
        System.out.println(produtoLivro.getAutor());

        System.out.println("\n");
        ProdutoEletronico ProdutoEletronico = new ProdutoEletronico("Micro-Ondas", 518.32, "Toshiba", "SmartPlace");

        System.out.println(ProdutoEletronico.getNome());
        System.out.println(ProdutoEletronico.CalcularPreco());
        System.out.println(ProdutoEletronico.getMarca());
        System.out.println(ProdutoEletronico.getModelo());

    }
}