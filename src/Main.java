/**
 * La clase Principal, por donde empieza la ejecución del proyecto
 *
 * @author Admin
 * @version 1.0 since 31/07/2020
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(1000);
    }

    /**
     *
     * @param cantidad No lo usamos para nada. Se creó este parámetro para ver
     * como añadir un parámetro con el fin de repasar la refactorización
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
