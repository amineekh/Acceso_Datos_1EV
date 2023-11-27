package Acceso_BD_Relacionales;

import java.sql.*;
import java.util.Scanner;

public class Consulta_BD {

    public static Connection conn= null;
    public static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        do {

            System.out.println("0. Salir del Programa");
            System.out.println("1. conectar SGBD");
            System.out.println("2. Procede a mostrar todos registros correspondientes a los campos: emp_no, oficio y dept_no");
            System.out.println("3. Repite el paso anterior mostrando además el campo dnombre");
            System.out.println("4. Insertar datos en la tabla Departamentos o Empleados");
            System.out.println("5. Actualizar datos de la tabla Departamento o Empleados");
            System.out.println("6. Elimanar datos de la tabla Departementos o Empleados");
            System.out.println("introduzca una opcion: ");
            opcion =sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("gracias por usar el prgrama");
                    break;
                case 1:
                    conectarBD();
                    break;
                case 2:
                    mostrar_consulta();
                    break;
                case 3:
                    mostrar_consulta_dos_tablas();
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("En que tabla quieres INSERTAR datos:");
                    System.out.println("1- Tabla Departamentos");
                    System.out.println("2- Tabla Empleados");
                    System.out.println("introduzca una opcion: 1 o 2");
                    int elecion= sc.nextInt();

                    if (elecion == 1 ){
                        insertar_datos_departementos();
                    } else if (elecion == 2) {
                        insertar_datos_empleados();
                    }else {
                        System.out.println("La opcion que has ingresado NO existe");
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("En que tabla quieres ACTUALIZAR datos:");
                    System.out.println("1- Tabla Departamentos");
                    System.out.println("2- Tabla Empleados");
                    System.out.println("introduzca una opcion: 1 o 2");
                    elecion= sc.nextInt();

                    if (elecion == 1 ){
                        actualizar_datos_departementos();
                    } else if (elecion == 2) {
                        actualizar_datos_empleados();
                    }else {
                        System.out.println("La opcion que has ingresado NO existe");
                    }
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("En que tabla quieres ELIMINAR datos:");
                    System.out.println("1- Tabla Departamentos");
                    System.out.println("2- Tabla Empleados");
                    System.out.println("introduzca una opcion: 1 o 2");
                    elecion= sc.nextInt();

                    if (elecion == 1 ){
                        System.out.println("Introduzca el dept_no del deaprtamento qu quieres eliminar");
                        int dept_no = sc.nextInt();
                        eliminar_datos_departementos(dept_no);

                    } else if (elecion == 2) {
                        eliminar_datos_empleados();
                    }else {
                        System.out.println("La opcion que has ingresado NO existe");
                    }
                    break;

            }
        }while(opcion != 0);


    }

    private static void eliminar_datos_empleados() throws SQLException {
        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("delete from empleados where emp_no=?");
        System.out.println("Introduzca el dept_no del empleado qu quieres eliminar");
        int emp_no = sc.nextInt();

        ps.setInt(1, emp_no);
        ps.executeUpdate();

        System.out.println("empleado ELIMINADO correctamnte");
    }

    private static void eliminar_datos_departementos(int dept_no) throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("delete from departamentos where dept_no=?");

        ps.setInt(1, dept_no);
        ps.executeUpdate();

        System.out.println("departamento ELIMINADO correctamnte");
    }

    private static void actualizar_datos_empleados() throws SQLException {
        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("UPDATE empleados SET apellido= 'Jimenez' WHERE emp_no=?");
        System.out.println("Introduzca emp_no del empleado que quieres actualizar");
        int emp_no= sc.nextInt();

        ps.setInt(1, emp_no);
        ps.executeUpdate();

        System.out.println("empleado ACTUALIZADO correctamente");

    }

    private static void actualizar_datos_departementos() throws SQLException {
        asignar_bd();

        // Solicitar datos al usuario
        System.out.println("Introduzca emp_no del empleado que quieres actualizar:");
        int dept_no = sc.nextInt();
        System.out.println("Introduzca el nombre de la columna que desea actualizar (ej: dep_no, dnombre, loc):");
        String columna = sc.next();
        System.out.println("Introduzca el nuevo valor para la columna " + columna + ":");
        String nuevoValor = sc.next();

        //PreparedStatement ps = conn.prepareStatement("UPDATE departamentos SET loc= 'Los Angeles' WHERE dept_no=?");

        PreparedStatement ps = conn.prepareStatement("UPDATE empleados SET " + columna + " = "+nuevoValor+" WHERE emp_no = ?");

        ps.setInt(1, dept_no);
        // Establecer los valores de los parámetros
        ps.setString(1, nuevoValor);
        ps.executeUpdate();

        System.out.println("departamento ACTUALIZADO correctamente");

    }


    private static void insertar_datos_empleados() throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into empleados values(?,?,?,?,?,?,?,?)");
        System.out.println("Introduzca emp_no");
        int emp_no= sc.nextInt();
        System.out.println("Introduzca apellido");
        String apellido = sc.next();
        System.out.println("Introduzca oficio");
        String oficio= sc.next();
        System.out.println("Introduzca Dir");
        int dir = sc.nextInt();
        System.out.println("Introduzca Fecha");
        String fecha = sc.next();
        System.out.println("Introduzca salario");
        double salario = sc.nextDouble();
        System.out.println("Introduzca Comision");
        double comision = sc.nextDouble();
        System.out.println("Introduzca dept_no");
        int dept_no = sc.nextInt();

        ps.setInt(1, emp_no);
        ps.setString(2, apellido);
        ps.setString(3, oficio);
        ps.setInt(4, dir);
        ps.setString(5, fecha);
        ps.setDouble(6, salario);
        ps.setDouble(7, comision);
        ps.setInt(8, dept_no);
        ps.executeUpdate();

        System.out.println("Registro Datos insertados correctamente en la tabla: EMPLEADOS");

    }

    private static void insertar_datos_departementos() throws SQLException {
        asignar_bd();
        PreparedStatement ps = conn.prepareStatement("insert into departamentos values(?,?,?)");
        System.out.println("inserta dept_no");
        int dept_no= sc.nextInt();
        System.out.println("inserta dnombre");
        String dnombre= sc.next();
        System.out.println("inserta loc");
        String loc = sc.next();

        // Establecer los valores de los parámetros
        ps.setInt(1, dept_no);
        ps.setString(2, dnombre);
        ps.setString(3, loc);

        ps.executeUpdate();

        System.out.println("datos insertados en la tabla DEPARTAMENTOS correctamente");

    }


    private static void mostrar_consulta_dos_tablas() throws SQLException {
        asignar_bd();

        String query  = "SELECT empleados.emp_no, empleados.oficio, empleados.dept_no, departamentos.dnombre FROM empleados INNER JOIN departamentos ON empleados.dept_no = departamentos.dept_no";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        // Procesar los resultados
        while (rs.next()) {
            int empNo = rs.getInt("emp_no");
            String oficio = rs.getString("oficio");
            int deptNo = rs.getInt("dept_no");
            String dnombre= rs.getString("dnombre");

            // Puedes imprimir o hacer cualquier otra cosa con los datos
            System.out.println("emp_no: " + empNo + ", oficio: " + oficio + ", dept_no: " + deptNo + ", dnombre: " + dnombre);
        }

        System.out.println("");
        System.out.println("ahi estan los datos de la tabla : empleados y departamento");
        System.out.println("");
    }

    private static void mostrar_consulta() throws SQLException {
        asignar_bd();

        String query  = "select emp_no, oficio, dept_no from empleados";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        // Procesar los resultados
        while (rs.next()) {
            int empNo = rs.getInt("emp_no");
            String oficio = rs.getString("oficio");
            int deptNo = rs.getInt("dept_no");

            // imprimir los datos
            System.out.println("emp_no: " + empNo + ", oficio: " + oficio + ", dept_no: " + deptNo);
        }

        System.out.println("");
        System.out.println("ahi estan los datos de la tabla: empleados");
        System.out.println("");
    }
    private static void asignar_bd() throws SQLException {
        System.out.println("");
        conectarBD();
        String query = "use acceso_datos";
        Statement st = conn.createStatement();
        st.executeUpdate(query);
        System.out.println("base de datos asignada");
    }


    private static void conectarBD() throws SQLException {
        String url =  "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pssw= "admin";
        conn= DriverManager.getConnection(url, user, pssw);
        System.out.println("conexion establecida");
    }



}
