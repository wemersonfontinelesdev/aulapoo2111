public abstract class Funcionario {
    private String nome;
    private  String cpf;

    public Funcionario( String nome, String cpf){
        this.nome = nome;
        this.cpf= cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodo abstrato para calcular saláriIO

    public  abstract  double calcularSalario();
    @Override
    public String toString(){
        return "Nome"+ nome + "CPF"+ cpf;

    }
}
