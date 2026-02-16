public class EmpleadoTiempoCompleto extends Empleado{
    private double bono;

public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono){
    this.bono = bono;

}
 public double CalcularSalario(double salario, double bono){
    return salario + bono;
 }

 public String toString(String nombre, SalarioBase , bono){

    return "Nombre" + "salario base" + "bono";
 }
}
    

