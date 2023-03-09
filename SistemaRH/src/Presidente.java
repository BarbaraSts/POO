import java.math.BigDecimal;

public class Presidente extends Funcionario{
    private BigDecimal cotaAcao;

    public Presidente(int idFuncionario, String nomeFuncionario, BigDecimal salario, BigDecimal cotaAcao) {
        super(idFuncionario, nomeFuncionario, salario);
        this.cotaAcao = cotaAcao;
    }

    public BigDecimal getCotaAcao() {
        return cotaAcao;
    }

    @Override
    public BigDecimal calculoSalario(){
        return getSalario().add(cotaAcao);
    }
    
    public String toString(){
        return "\nNome do Funcionário: " + nomeFuncionario + "\nID do Funcionário: " + idFuncionario + "\nSalário do Funcionário: " + calculoSalario() + "\nValor da Cota: " + cotaAcao;
}
}
