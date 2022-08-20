package api;

public class Chefe extends Funcionario implements InterfaceFunc {

  private double salario;

  public Chefe(String nome, String matricula) {
    super(nome, matricula);
  }

  public void calcularSalario() {
    this.salario = ((22.90 * 8) * 30);
    this.salario += this.salario * 0.25;
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
