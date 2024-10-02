package com.miempresa.banco;

public class CuentaDolares extends CuentaBancaria {

    public CuentaDolares(Persona titular) {
        super(titular);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositado " + monto + " dólares.");
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retirado " + monto + " dólares.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
