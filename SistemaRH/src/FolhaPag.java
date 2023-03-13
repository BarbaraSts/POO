import java.math.BigDecimal;

public class FolhaPag {
    private BigDecimal totalFolhaPag = BigDecimal.ZERO;

    public BigDecimal getTotalFolhaPag() {
        return totalFolhaPag;
    }

    public void registrar(Funcionario funcionario){
        totalFolhaPag = totalFolhaPag.add(funcionario.calculoSalario());
    }

    public void login(Autenticavel funcionario){
        funcionario.autenticar();
    }
}