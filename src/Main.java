public class Main {
    public static void main(String[] args) {

        //Creamos las cuentas
        CuentaCorriente cuenta1 = new CuentaCorriente("ES6256465847",1000d);
        CuentaAhorro    cuenta2 = new CuentaAhorro("ES9956415656", 3010);

        //Mostramos las cuentas
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        //Traspaso
        CuentaBancaria.traspaso(cuenta2, cuenta1,500);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        //Calculando interes
         double interes1 = cuenta1.calcularInteres();
         double interes2 = cuenta2.calcularInteres();

        System.out.println(interes1);
        System.out.println(interes2);


         cuenta1.ingresar(interes1);
         cuenta2.ingresar(interes2);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());


    }






}