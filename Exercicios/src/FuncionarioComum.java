public class FuncionarioComum extends Funcionario {
    private double salarioMensal;

    @Override
    public double calcularSalario() {
        return 0;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

}
