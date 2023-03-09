import java.math.BigDecimal;

public class Engenheiro extends Funcionario{
    private String departamentoEng;
    private int CREA;
    
    public Engenheiro(int idFuncionario, String nomeFuncionario, BigDecimal salario, String departamentoEng, int cREA) {
        super(idFuncionario, nomeFuncionario, salario);
        this.departamentoEng = departamentoEng;
        CREA = cREA;
    }

    @Override
    public BigDecimal calculoSalario(){
        return getSalario().multiply(new BigDecimal(0.5)).add(getSalario());
    }

    public String getDepartamentoEng() {
        return departamentoEng;
    }

    public int getCREA() {
        return CREA;
    }

    public String toString(){
        return "Nome do Funcionário: " + nomeFuncionario + "\nID do Funcionário: " + idFuncionario + "\nSalário do Funcionário: " + calculoSalario() + "\nDepartamento do Engenheiro: " + departamentoEng + "\nCREA: " + CREA;
    }
}
