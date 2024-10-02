package com.miempresa.banco;

public class CuentaPesos extends CuentaBancaria {

    public CuentaPesos(Persona titular) {
        super(titular);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositado " + monto + " pesos.");
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retirado " + monto + " pesos.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
