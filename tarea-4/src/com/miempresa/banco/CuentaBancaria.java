package com.miempresa.banco;

public abstract class CuentaBancaria {
    protected Persona titular;
    protected String CBU;
    protected double saldo;

    // Constructor
    public CuentaBancaria(Persona titular) {
        this.titular = titular;
        this.CBU = generarCBUNumerico(); // Genera un CBU numérico único
        this.saldo = 0; // El saldo inicial es 0
    }

    // Método para generar CBU numérico de 22 dígitos
    public String generarCBUNumerico() {
        StringBuilder cbu = new StringBuilder();
        for (int i = 0; i < 22; i++) {
            int digit = (int) (Math.random() * 10); // Genera un dígito entre 0 y 9
            cbu.append(digit);
        }
        return cbu.toString();
    }

    // Métodos abstractos que deben implementarse en las clases hijas
    public abstract void depositar(double monto);

    public abstract void retirar(double monto);

    // Método para obtener el saldo de la cuenta
    public double getSaldo() {
        return saldo;
    }

    // Método para obtener el titular de la cuenta
    public Persona getTitular() {
        return titular;
    }

    // Método para obtener el CBU de la cuenta
    public String getCBU() {
        return CBU;
    }

    // Método para transferir dinero entre cuentas (con conversión de divisas)
    public void transferir(CuentaBancaria cuentaDestino, double monto, double tasaCambio) {
        if (saldo >= monto) {
            saldo -= monto;
            cuentaDestino.depositar(monto * tasaCambio); // Aplica la tasa de cambio en la transferencia
            System.out.println("Transferencia realizada de " + monto + " a " + cuentaDestino.getCBU());
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }
}
