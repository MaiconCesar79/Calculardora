public abstract class Metodos implements iOperacoes{

    @Override
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public int subtrair(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public double subtrair(double n1, double n2) {
        return n1-n2;
    }

    @Override
    public int multiplicar(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public double multiplicar(double n1, double n2) {
        return n1*n2;
    }

    @Override
    public double dividir(int n1, int n2) {
        return n1/n2;
    }

    @Override
    public double dividir(double n1, double n2) {
        return n1/n2;
    }

    @Override
    public double elevadoA2(double n1) {
        return n1*n1;
    }
}
