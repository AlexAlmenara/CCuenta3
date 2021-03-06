/**
 * La clase CCuenta3. Esta clase hace bla y bla hola
 * bla y bla
 * bla y bla
 * @author Admin
 * @version 1.0, 31/08/2022
 * @since 31/07/2020
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío
     */
    public CCuenta() {
        
    }

    /**
     * 
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipointeres
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * 
     * @return devuelve el saldo
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresar. Este método ingresa dinero
     * @param cantidad Es el dinero a ingresar en la cuenta
     * @throws Exception Lanza este error si la cantida recibida es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad Es el dinero a quitar de la cuenta
     * @throws Exception Lanza este error si la cantidad a retirar es negativa o
     * es superios al dinero que hay en la cuenta
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /** Getter del string cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Getter del atributo nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** getter del atributo saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * getter del tipoInteres
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInteres;
    }

    /** setter del atributo cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** setter del nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** setter del saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** setter del tipo de interés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInteres = tipoInterés;
    }
}
