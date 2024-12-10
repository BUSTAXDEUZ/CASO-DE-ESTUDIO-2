/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabia
 */
public class GestionUsuarios {
    private Empleado[] empleados;
    private int contador;

    public GestionUsuarios() {
        empleados = new Empleado[5];
        contador = 0;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (contador < empleados.length) {
            empleados[contador++] = empleado;
        } else {
            System.out.println("No se pueden agregar más empleados.");
        }
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                System.out.println(empleado);
            }
        }
    }

    public Empleado buscarEmpleadoPorNombre(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado != null && empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public double calcularSalarioPromedio() {
        double totalSalario = 0;
        int numEmpleados = 0;
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                totalSalario += empleado.getSalario();
                numEmpleados++;
            }
        }
        return numEmpleados > 0 ? totalSalario / numEmpleados : 0;
    }

    public Empleado buscarSalarioMasAlto() {
        Empleado maxSalarioEmpleado = null;
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                if (maxSalarioEmpleado == null || empleado.getSalario() > maxSalarioEmpleado.getSalario()) {
                    maxSalarioEmpleado = empleado;
                }
            }
        }
        return maxSalarioEmpleado;
    }

    public Empleado buscarSalarioMasBajo() {
        Empleado minSalarioEmpleado = null;
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                if (minSalarioEmpleado == null || empleado.getSalario() < minSalarioEmpleado.getSalario()) {
                    minSalarioEmpleado = empleado;
                }
            }
        }
        return minSalarioEmpleado;
    }
}