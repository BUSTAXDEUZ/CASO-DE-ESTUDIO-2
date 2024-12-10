/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fabia
 */
import javax.swing.JOptionPane;

public class ECP02 {
    public static void main(String[] args) {
        GestionUsuarios gestion = new GestionUsuarios();
        boolean continuar = true;

        while (continuar) {
            String menu = "Seleccione una opción:\n" +
                          "1. Agregar un nuevo empleado\n" +
                          "2. Mostrar la información de todos los empleados\n" +
                          "3. Buscar un empleado por nombre\n" +
                          "4. Calcular el salario promedio de todos los empleados\n" +
                          "5. Buscar el empleado con el salario más alto\n" +
                          "6. Buscar el empleado con el salario más bajo\n" +
                          "7. Salir";
            String opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento del empleado:");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));
                    Empleado empleado = new Empleado(nombre, edad, departamento, salario);
                    gestion.agregarEmpleado(empleado);
                    break;

                case "2":
                    
                    gestion.mostrarEmpleados();
                    break;

                case "3":
                    
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre del empleado a buscar:");
                    Empleado empleadoEncontrado = gestion.buscarEmpleadoPorNombre(nombreBuscar);
                    if (empleadoEncontrado != null) {
                        JOptionPane.showMessageDialog(null, "Empleado encontrado: " + empleadoEncontrado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                    }
                    break;

                case "4":
                    
                    double salarioPromedio = gestion.calcularSalarioPromedio();
                    JOptionPane.showMessageDialog(null, "El salario promedio es: " + salarioPromedio);
                    break;

                case "5":
                    
                    Empleado empleadoSalarioAlto = gestion.buscarSalarioMasAlto();
                    if (empleadoSalarioAlto != null) {
                        JOptionPane.showMessageDialog(null, "Empleado con el salario más alto: " + empleadoSalarioAlto);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    }
                    break;

                case "6":
                    
                    Empleado empleadoSalarioBajo = gestion.buscarSalarioMasBajo();
                    if (empleadoSalarioBajo != null) {
                        JOptionPane.showMessageDialog(null, "Empleado con el salario más bajo: " + empleadoSalarioBajo);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    }
                    break;

                case "7":
                  
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}