public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente() {
        super();
    }

    public CuentaCorriente(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public String toString() {
        return "CuentaCorriente: " + super.toString();
    }

    @Override
    public double calcularInteres() {
        return this.getSaldo() * CuentaBancaria.INTERES_ANUAL_BASICO;
    }
}
