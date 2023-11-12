public class Calculadora extends Metodos{
    public Calculadora(){

    }

    private double numero1;
    private double numero2;
    private double total;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal(){
        return this.total;
    }

    @Override
    public double somar(double n1, double n2) {
        double resultado = n1 + n2;
        return resultado;
    }

    @Override
    public double elevadoA2(double n1){
        double resultado = n1 * n1;
        return resultado;
    }

    @Override
    public double dividir(double n1, double n2){
        if (n2 == 0) {
            throw new ArithmeticException("Não é possivel dividir por 0!");
        }
        return n1 / n2;
    }
}
