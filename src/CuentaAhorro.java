public class CuentaAhorro extends  CuentaBancaria {
    private final double  saldoMinimo=1000d;

    public CuentaAhorro() {
        super();
    }

    public CuentaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public String toString() {
        return "CuentaAhorro: " + super.toString();
    }

    @Override
    public double calcularInteres() {
        if (this.getSaldo()<saldoMinimo) {
            return this.getSaldo()* (CuentaBancaria.INTERES_ANUAL_BASICO/2);
        }
        else  return this.getSaldo() * (CuentaBancaria.INTERES_ANUAL_BASICO*2);
    }
}
