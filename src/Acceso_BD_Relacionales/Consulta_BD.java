package Acceso_BD_Relacionales;

import java.sql.*;
import java.util.Scanner;

public class Consulta_BD {

    public static Connection conn= null;

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int opcion=0;

        do {

            System.out.println("0. Salir del Programa");
            System.out.println("1. conectar SGBD");
            System.out.println("2. Procede a mostrar todos registros correspondientes a los campos: emp_no, oficio y dept_no");
            System.out.println("3. Repite el paso anterior mostrando además el campo dnombre");
            System.out.println("4. Insertar datos en la tabla departamentos");
            System.out.println("5. Insertar datos en la tabla empleados");

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
                    insertar_datos_tabla_departamentos();
                case 5:
                    insertar_datos_tabla_empledos();
                    break;
            }
        }while(opcion != 0);

    }

    private static void insertar_datos_tabla_departamentos() {

    }

    private static void insertar_datos_tabla_empledos() throws SQLException {
        asignar_bd();

        PreparedStatement ps = conn.prepareStatement("INSERT INTO empleados VALUES(?,?,?,?,?,?,?,?)");
        System.out.println("introduzca el emp_no");
        int emp_no=sc.nextInt();
        System.out.println("introduzca apellido");
        String apellido= sc.next();
        System.out.println("introduzca oficio");
        String oficio = sc.next();
        System.out.println("introduzca dir");
        int dir= sc.nextInt();
        System.out.println("introduzca fecha");
        String fecha_alt= sc.next();
        System.out.println("introzca salario");
        float salario = sc.nextFloat();
        System.out.println("introzca comisiion");
        float comision = sc.nextFloat();
        System.out.println("introduzca dept_no");
        int dept_no_empleados= sc.nextInt();

        ps.setInt(1, emp_no);
        ps.setString(2, apellido);
        ps.setString(3, oficio);
        ps.setInt(4, dir);
        ps.setString(5, fecha_alt);
        ps.setFloat(6, salario);
        ps.setFloat(7, comision);
        ps.setInt(8, dept_no_empleados);
        ps.executeUpdate();
        System.out.println("registro insertado correctamente");

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
        System.out.println("ahi estan las columnas de la tabla: empleados");
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
