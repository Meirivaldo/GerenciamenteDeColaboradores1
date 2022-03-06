package one.dio;

public abstract class FuncionarioCLT {

    protected String nome;
    protected String documento;

    protected Endereco Endereco;

    protected double valorSalario;

    protected FuncionarioCLT() {
    }

    public FuncionarioCLT(String nome, String documento, Endereco endereco, double valorSalario) {
        this.nome = nome;
        this.documento = documento;
        this.Endereco = endereco;
        this.valorSalario = valorSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public one.dio.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(one.dio.Endereco endereco) {
        Endereco = endereco;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", Endereco=" + Endereco +
                ", valorSalario=" + valorSalario +
                '}';
    }
}
