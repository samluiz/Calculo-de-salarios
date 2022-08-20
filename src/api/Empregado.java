package api;

public class Empregado extends Funcionario implements InterfaceFunc, InterfaceEmpr {

  private double salario;
  private double valeTransporte;

  public Empregado(String nome, String matricula) {
    super(nome, matricula);
  }

  public void calcularSalario() {
    this.salario = (((22.90 * 8) * 30) + 100) + this.valeTransporte;
  }

  public void calcularVt(double distancia) {
    if (distancia <= 10.0) {
      this.valeTransporte = 100;
    }
    else if (distancia > 10.0 && distancia <= 20.0) {
      this.valeTransporte = 200;
    }
    else if (distancia > 20.0 && distancia <= 30.0) {
      this.valeTransporte = 300;
    }
    else if (distancia > 30.0 && distancia <= 40.0) {
      this.valeTransporte = 400;
    }
    else if (distancia > 40.0) {
      this.valeTransporte = 500;
    }
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
