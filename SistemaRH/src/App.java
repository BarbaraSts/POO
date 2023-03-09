import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        
        var engenheiro = new Engenheiro(1, "Barbara", new BigDecimal(10000), "Engenheiro De Produção", 133);
        System.out.println(engenheiro);

        var gerente = new Gerente(2, "Thiago", new BigDecimal(4000), "Gerente Financeiro", new BigDecimal(10));
        System.out.println(gerente);

        var presidente = new Presidente(3, "Barbara", new BigDecimal(10000), new BigDecimal(100));
        System.out.println(presidente);
    }
}
