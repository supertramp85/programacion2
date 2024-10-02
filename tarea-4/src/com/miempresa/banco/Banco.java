package com.miempresa.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public void buscarCuentasPorProvincia(String provincia) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getTitular().getProvincia().equalsIgnoreCase(provincia)) {
                System.out.println("Cuenta con CBU: " + cuenta.getCBU());
            }
        }
    }

    public void buscarCuentasPorCiudad(String ciudad) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getTitular().getCiudad().equalsIgnoreCase(ciudad)) {
                System.out.println("Cuenta con CBU: " + cuenta.getCBU());
            }
        }
    }
}
