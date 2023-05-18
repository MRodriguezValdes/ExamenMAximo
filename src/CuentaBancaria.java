public abstract class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    static final double INTERES_ANUAL_BASICO = 0.05d;


    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.setNumeroCuenta(numeroCuenta);
        this.setSaldo(saldo);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad){
        this.saldo += cantidad;
    }
    public void retirar(double cantidad){
        this.saldo -= cantidad;
    }

    @Override
    public String toString() {
        return  "IBAN: " + numeroCuenta + " SALDO: " + saldo;
    }

    public static void traspaso(CuentaBancaria cuenta1 , CuentaBancaria cuenta2, double cantidad){

        // Esta podria ser  una alternativa a crear otro metodo anadir.
        if ( cantidad < 0 ){
            cuenta1.ingresar(cantidad);
            cuenta2.ingresar(-cantidad);
        }
        else{
            cuenta1.retirar(cantidad);
            cuenta2.ingresar(cantidad);
        }


    }
    public abstract  double calcularInteres();
}
