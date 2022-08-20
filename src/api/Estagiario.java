package api;

public class Estagiario extends Funcionario implements InterfaceFunc {

  private double salario;

  public Estagiario(String nome, String matricula) {
    super(nome, matricula);
  }

  @Override
  public void calcularSalario() {
    this.salario = ((7.90 * 8) * 30) + 100;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
  
  @Override
  public String toString() {
    return "[" + getMatricula() + "] - " + getNome() + " - R$" + this.salario;
  }

}
