/**
* Esta clase  simula el comportamiento de una cuenta bancaria:
* @author Omar Ortega
* @version 1.0
* since 22/02/2024
* 
*/
package cuentas;

/**
* Atributos
*/
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
    * Constructor vacio
    * 
    */
    public CCuenta()
    {
    }
    
    /**
	 * Primer Commit
	 * Constructur con los siguientes parametros
	 * @param nom String, nombre del titular
	 * @param cue String, numero de cuenta
	 * @param sal double, saldo de la cuenta
	 * @param tipo double, tipo de interes
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
	/**
	 * @return el saldo de la cuenta
	 */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
    * @param cantidad Es el dinero a ingresar en la cuenta
    * @throws Exception Lanza este error si la cantida recibida es negativa
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
    * @param cantidad Es el dinero a quitar o retirar de una cuenta
    * @throws Exception Lanza este error si la cantidad a retirar es negativa o es superior al saldo disponible
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return el nombre del titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre del titular a pasarle como parametro
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * Segundo Commit
	 * @return el cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta, numero de cuenta a pasar como parametro
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Tercer Commi
	 * @param saldo a pasar como parametro
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Cuarto Commit
	 * @return el tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres a pasar como parametro
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
