package com.miempresa.banco;

public class Main {
    public static void main(String[] args) {
        // Crear banco
        Banco banco = new Banco();

        // Crear personas
        Persona persona1 = new Persona("Juan", "Perez", "12345678", "Buenos Aires", "CABA");
        Persona persona2 = new Persona("Maria", "Gomez", "87654321", "Cordoba", "Cordoba");

        // Crear cuentas en pesos y dólares
        CuentaPesos cuentaPesos1 = new CuentaPesos(persona1);
        CuentaPesos cuentaPesos2 = new CuentaPesos(persona2);
        CuentaDolares cuentaDolares1 = new CuentaDolares(persona1);
        CuentaDolares cuentaDolares2 = new CuentaDolares(persona2);

        // Agregar cuentas al banco
        banco.agregarCuenta(cuentaPesos1);
        banco.agregarCuenta(cuentaPesos2);
        banco.agregarCuenta(cuentaDolares1);
        banco.agregarCuenta(cuentaDolares2);

        // Depositar dinero
        cuentaPesos1.depositar(1000);
        cuentaPesos2.depositar(1000);
        cuentaDolares1.depositar(100);
        cuentaDolares2.depositar(100);

        // Retirar dinero
        cuentaPesos1.retirar(400);
        cuentaDolares1.retirar(50);

        // Depositar 20 dólares
        cuentaDolares2.depositar(20);

        // Intentar retirar más de lo que hay en la cuenta
        cuentaPesos1.retirar(5000);

        // Transferir dinero de dólares a pesos
        cuentaDolares1.transferir(cuentaPesos2, 50, 350); // 1 USD = 350 ARS

        // Transferir dinero de pesos a dólares
        cuentaPesos2.transferir(cuentaDolares2, 500, 0.00286); // 1 ARS = 0.00286 USD

        // Buscar cuentas por provincia
        banco.buscarCuentasPorProvincia("Buenos Aires");

        // Buscar cuentas por ciudad
        banco.buscarCuentasPorCiudad("CABA");
    }
}
