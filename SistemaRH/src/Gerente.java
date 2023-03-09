import java.math.BigDecimal;

public class Gerente extends Funcionario{
    private String area;
    private BigDecimal bonus;

    public Gerente(int idFuncionario, String nomeFuncionario, BigDecimal salario, String area, BigDecimal bonus) {
        super(idFuncionario, nomeFuncionario, salario);
        this.area = area;
        this.bonus = bonus;
    }

    @Override
    public BigDecimal calculoSalario(){
        return getSalario().add(bonus);
    }

    public String getArea() {
        return area;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public String toString(){
        return "\nNome do Funcionário: " + nomeFuncionario + "\nID do Funcionário: " + idFuncionario + "\nSalário do Funcionário: " + calculoSalario() + "\nÁrea do Gerente: " + area + "\nBônus: " + bonus;
    }

    
}
