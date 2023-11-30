package Acceso_BD_Relacionales;

// importamos las instacias necesarias
import java.sql.*;
import java.util.Scanner;

public class Consulta_BD {

    // Declaramos variable estática para la conexión al MySQL
    public static Connection conn= null;

    // Declaración variable estáticas para el scanner
    public static  Scanner sc = new Scanner(System.in);

    //metodo principal
    public static void main(String[] args) throws SQLException {
        //Creamos el objeto escanner para poder pedir datos al usuario por teclado
        Scanner sc = new Scanner(System.in);
        // 1. Declaromos una variable opcion y le asignamos valor 0
        int opcion=0;

        // Cremos un Bucle DO-WHILE para:
            // - Para que nada mas ejecutar el programa al usuario le salga directamente el menu de ejecuacion
            //   con las diferentes Consultas que aparecen, dentro del bucle tambien hay un Switch donde
            //   se explicara su función a continuation.... " No seas impaciente :) "
        do {
            // Mostramos el menu opciones al Usuario
            System.out.println("0. Salir del Programa");
            System.out.println("1. conectar SGBD");
            System.out.println("2. Procede a mostrar todos registros correspondientes a los campos: emp_no, oficio y dept_no");
            System.out.println("3. Repite el paso anterior mostrando además el campo dnombre");
            System.out.println("4. Insertar datos en la tabla Departamentos o Empleados");
            System.out.println("5. Actualizar datos de la tabla Departamento o Empleados");
            System.out.println("6. Eliminar datos de la tabla Departamentos o Empleados");

            // preguntamos al usuario que opcion del menu quiere ejecutar
            System.out.println("introduzca una opcion: ");
            opcion =sc.nextInt(); // y gracias a la variable creada anteriormente se podra almacenar lo que introduzca el usario

            // Swith sirve para ejecutar cada una de las opciones del Menu, y ejecutará un case u otro depndiendo de la opcion elegida por el usuario
            // que gracias a la variable  opcion y el objeto scanner podemos almacenar el valor ingresado por usuario y ahi el progrma ejecutara un case o otro.
            // Cada case del Switch tiene un metodo donde ejecutara cada consulta que aparecera en el menu, (él case 0 es para salir de progrma)
            switch (opcion){
                case 0:
                    // Directamente, te muestra un mensaje dandote las gracias por usar el programa
                    // ahi el programa ya finaliza su Ejecucion
                    System.out.println("gracias por usar el prgrama");
                    break;
                case 1:
                    // Este metodo sirve para connecar con la BBDD
                    conectarBD();
                    break;
                case 2:
                    // Metodo que Te muestra la consulta de la opcion 1 del menu
                    mostrar_consulta();
                    break;
                case 3:
                    // Metodo que Te muestra la consulta de la opcion 2 del menu
                    mostrar_consulta_dos_tablas();
                    break;
                case 4:
                    // Este case es para INSERTAR datos dentro de la Tabla, opcion 4 del menu
                    // Como hay dos tablas hemos Creado un MENU para que el usuario Elija que tabla quiere insertar Datos.
                    System.out.println("");
                    System.out.println("En que tabla quieres INSERTAR datos:");
                    System.out.println("1- Tabla Departamentos");
                    System.out.println("2- Tabla Empleados");

                    // Mediante el objeto scanner se le preguntara y luego se almacenara en una variable que tabla quiere insertar los datos
                    System.out.println("introduzca una opcion: 1 o 2");
                    int elecion= sc.nextInt();

                    // Una vez elegida la opcion con una Condicional como IF le indicamos al programa que ejecute un metodo o otro para  insertar datos a la tabla
                    if (elecion == 1 ){
                        insertar_datos_departementos();  // Metodo para insertar datos dentro de la tabla departamentos.
                    } else if (elecion == 2) {
                        insertar_datos_empleados();     // Metodo para insertar datos dentro de la tabla empleados.
                    }else {
                        System.out.println("La opcion que has ingresado NO existe"); // si no elige una de los opciones: sele motrara un mensaje de error
                    }
                    break;
                case 5:
                    // Este case es para ACTUALIZAR datos dentro de la Tabla, opcion 5 del menu
                    // Como hay dos tablas hemos Creado un MENU para que el usuario Elija que tabla quiere ACTUALIZAR Datos.
                    System.out.println("");
                    System.out.println("En que tabla quieres ACTUALIZAR datos:");
                    System.out.println("1- Tabla Departamentos");
                    System.out.println("2- Tabla Empleados");

                    // Mediante el objeto scanner se le preguntara y luego se almacenara en una variable que tabla quiere actualizar los datos
                    System.out.println("introduzca una opcion: 1 o 2");
                    elecion= sc.nextInt();

                    // Una vez elegida la opcion con una Condicional como IF le indicamos al programa que ejecute un metodo o otro para actualizar datos a la tabla
                    if (elecion == 1 ){
                        actualizar_datos_departementos(); // METODO PARA ACTUALIZAR DATOS DE LA TABLA DEPARTAMENTOS
                    } else if (elecion == 2) {
                        actualizar_datos_empleados();     // Metodo para actualizar datos de la tabla emplados
                    }else {
                        System.out.println("La opcion que has ingresado NO existe"); // Si no elige una de los opciones: sele motrara un mensaje de error
                    }
                    break;
                case 6:
                    // Este case es para ACTUALIZAR datos dentro de la Tabla, opcion 4 del menu
                    // Como hay dos tablas hemos Creado un MENU para que el usuario Elija que tabla quiere ELIMINAR Datos.
                    System.out.println("");
                    System.out.println("En que tabla quieres ELIMINAR datos:");
                    System.out.println("1- Tabla Departamentos");
                    System.out.println("2- Tabla Empleados");

                    // Mediante el objeto scanner se le preguntara y luego se almacenara en una variable que tabla quiere ELIMINAR los datos
                    System.out.println("introduzca una opcion: 1 o 2");
                    elecion= sc.nextInt();

                    // Una vez elegida la opcion con una Condicional como IF le indicamos al programa que ejecute un metodo o otro para ELIMINAR datos a la tabla
                    if (elecion == 1 ){
                        // EN este metodo de se probado ALGO DIFERENTE que en los demás metodos de eliminar, insertar y Actualizar datos.
                        // En este metodo en vez de pedir el id del dato de la tabla que see quiere eliminar DENTRO del metodo, pues este caso se ha PEDIDO FUERA del metodo.
                        System.out.println("Introduzca el dept_no del deaprtamento qu quieres eliminar");
                        int dept_no = sc.nextInt();

                        // METODO PARA ELIMINAR DATOS DE LA TABLA DEPARTAMENTOS, entre parentesis tiene ya alacenada el valor del dept_no  que quiere
                        // eliminar de la tabla que lo ingreso anteriormente el usuario
                        eliminar_datos_departementos(dept_no);

                    } else if (elecion == 2) {
                        eliminar_datos_empleados(); // METODO PARA ELIMINAR DATOS DE LA TABLA Empleados, en este caso el valor que se qiuere elimnar esta dentro del metodo
                    }else {
                        System.out.println("La opcion que has ingresado NO existe"); // Si no elige una de los opciones: sele motrara un mensaje de error
                    }
                    break;

            }
        }while(opcion != 0); // Este bucle comenzará ejecutándose siempre que la condición entre paréntesis ( opcion != 0) sea verdadera.


    }

    // Método para eliminar datos en la tabla Empleados
    private static void eliminar_datos_empleados() throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();

        // 2. Preparamos la consulta SQL para eliminar datos en la tabla Empleados
        PreparedStatement ps = conn.prepareStatement("delete from empleados where emp_no=?");

        // 3. Solicitamos al usuario el valor del campo "emp_no" para identificar al empleado a eliminar
        System.out.println("Introduzca el dept_no del empleado qu quieres eliminar");
        int emp_no = sc.nextInt();

        // 3. Establecemos el valor del parámetro en la consulta preparada, es decir, asignamos los valores
        // introducidos por el usuario a la diferentes columunas de la tabla
        ps.setInt(1, emp_no);

        // 4. Ejecutamos la consulta para eliminar el empleado con el emp_no proporcionado
        ps.executeUpdate();
        // 5. Mostramos un mesaje que se ha realizado la eliminacion del dato correctamente
        System.out.println("empleado ELIMINADO correctamnte");
    }

    // Método para eliminar datos en la tabla Departamentos
    private static void eliminar_datos_departementos(int dept_no) throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();
        // 2. Preparamos la consulta SQL para eliminar datos en la tabla Departamentos
        PreparedStatement ps = conn.prepareStatement("delete from departamentos where dept_no=?");

        // 3. Establecemos el valor del parámetro en la consulta preparada, es decir, asignamos los valores
        // introducidos por el usuario a la diferentes columunas de la tabla
        ps.setInt(1, dept_no);
        // 4. Ejecutamos la consulta para eliminar el Departamento con el dept_no proporcionado
        ps.executeUpdate();
        // 5. Mostramos un mesaje que se ha realizado la eliminacion del dato correctamente
        System.out.println("departamento ELIMINADO correctamnte");
    }

    // Método para actualizar datos en la tabla Empleados
    private static void actualizar_datos_empleados() throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();
        // 2. Preparamos la consulta SQL para la actualización de datos en la tabla Empleados
        PreparedStatement ps = conn.prepareStatement("UPDATE empleados SET apellido= 'Jimenez' WHERE emp_no=?");
        // 3. Solicitamos al usuario el valor del campo "emp_no" para identificar al empleado a actualizar
        System.out.println("Introduzca emp_no del empleado que quieres actualizar");
        int emp_no= sc.nextInt();
        // 4. Establecemos el valor del parámetro en la consulta preparada
        ps.setInt(1, emp_no);
        // 5. Ejecutamos la consulta para actualizar los datos en la tabla Empleados
        ps.executeUpdate();
        // 6. Mostramos un mesaje que se ha realizado el actualizado del dato correctamente
        System.out.println("Empleado ACTUALIZADO correctamente");

    }
    // Método para actualizar datos en la tabla Departamentos
    private static void actualizar_datos_departementos() throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();

        // 2. Preparamos la consulta SQL para la actualización de datos en la tabla Departamentos
        PreparedStatement ps = conn.prepareStatement("UPDATE departamentos SET loc= 'Los Angeles' WHERE dept_no=? ");

        // 3. Solicitamos al usuario el valor del campo "dept_no" para identificar el Departamento a actualizar
        System.out.println("Introduzca dept_no del Departamento que quieres actualizar:");
        int dept_no = sc.nextInt();

        // 4. Establecemos el valor del parámetro en la consulta preparada
        ps.setInt(1, dept_no);
        // 5. Ejecutamos la consulta para actualizar los datos en la tabla Departamentos
        ps.executeUpdate();

        // 6. Mostramos un mesaje que se ha realizado el actualizado del dato correctamente
        System.out.println("Departamento ACTUALIZADO correctamente");

    }

    // Método para insertar datos en la tabla Empleados
    private static void insertar_datos_empleados() throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();
        // 2. Preparamos la consulta SQL para la inserción de datos en la tabla Empleados
        PreparedStatement ps = conn.prepareStatement("insert into empleados values(?,?,?,?,?,?,?,?)");

        // 3. Solicitamos datos al usuario
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

        // 4. Establecemos los valores de los parámetros en la consulta preparada, es decir, asignamos los valores
        // introducidos por el usuario a la diferentes columunas de la tabla
        ps.setInt(1, emp_no);
        ps.setString(2, apellido);
        ps.setString(3, oficio);
        ps.setInt(4, dir);
        ps.setString(5, fecha);
        ps.setDouble(6, salario);
        ps.setDouble(7, comision);
        ps.setInt(8, dept_no);

        // 7. Ejecutamos la consulta para insertar los datos en la tabla Empleados
        ps.executeUpdate();

        // 6. Mostramos un mensaje de que se han insertado correctamente los datos
        System.out.println("Registro Datos insertados correctamente en la tabla: EMPLEADOS");
    }

    // Método para insertar datos en la tabla Departamentos
    private static void insertar_datos_departementos() throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();
        // 2. Preparamos la consulta SQL para la inserción de datos en la tabla Departamentos
        PreparedStatement ps = conn.prepareStatement("insert into departamentos values(?,?,?)");
        // 3. Solicitamos datos al usuario:
        System.out.println("inserta dept_no");
        int dept_no= sc.nextInt();
        System.out.println("inserta dnombre");
        String dnombre= sc.next();
        System.out.println("inserta loc");
        String loc = sc.next();

        // 4. Establecemos los valores de los parámetros en la consulta preparada, es decir, asignamos los valores
        // introducidos por el usuario a la diferentes columunas de la tabla
        ps.setInt(1, dept_no);
        ps.setString(2, dnombre);
        ps.setString(3, loc);
        // 5. Ejecutamos la consulta para insertar los datos en la tabla Departamentos
        ps.executeUpdate();
        // 6. Mostramos un mensaje de que se han insertado correctamente los datos
        System.out.println("datos insertados en la tabla DEPARTAMENTOS correctamente");

    }

    // Método para mostrar registros de dos tablas (Empleados y Departamentos)
    private static void mostrar_consulta_dos_tablas() throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();
        // 2. Definimos la consulta SQL para seleccionar registros de las tablas Empleados y Departamentos mediante una JOIN
        String query  = "SELECT empleados.emp_no, empleados.oficio, empleados.dept_no, departamentos.dnombre FROM empleados INNER JOIN departamentos ON empleados.dept_no = departamentos.dept_no";
        // 3. Creamos un Statement para ejecutar la consulta
        Statement st = conn.createStatement();
        // 4. Ejecutamos la consulta y obtenemos un conjunto de resultados
        ResultSet rs = st.executeQuery(query);

        // 5. Procesar los resultados: El bucle while (rs.next())se utiliza para recorrer todas las filas de resultados devueltas por la consulta SQL.
        // Cada vez que se ejecuta rs.next(), el cursor avanza a la siguiente fila, y el bucle continuará hasta que no haya más filas.
        while (rs.next()) {
            // 6. Obtenemos los valores de las columnas para cada fila
            int empNo = rs.getInt("emp_no");
            String oficio = rs.getString("oficio");
            int deptNo = rs.getInt("dept_no");
            String dnombre= rs.getString("dnombre");

            // 7. Puedes imprimir o hacer cualquier otra cosa con los datos
            System.out.println("emp_no: " + empNo + ", oficio: " + oficio + ", dept_no: " + deptNo + ", dnombre: " + dnombre);
        }

        // 7. Imprimimos un mensaje indicando que la consulta ya ha sido ejecutada.
        System.out.println("");
        System.out.println("ahi estan los datos de la tabla : empleados y departamento");
        System.out.println("");
    }

    // Método para mostrar registros de la tabla Empleados
    private static void mostrar_consulta() throws SQLException {
        // 1. Asignamos la base de datos "acceso_datos"
        asignar_bd();

        // 2. Definimos la consulta SQL para seleccionar registros de la tabla Empleados
        String query  = "select emp_no, oficio, dept_no from empleados";
        // 3. Creamos un Statement para ejecutar la consulta
        Statement st = conn.createStatement();
        // 4. Ejecutamos la consulta y obtenemos un conjunto de resultados
        ResultSet rs = st.executeQuery(query);

        // Procesar los resultados: El bucle while (rs.next())se utiliza para recorrer todas las filas de resultados devueltas por la consulta SQL.
        // Cada vez que se ejecuta rs.next(), el cursor avanza a la siguiente fila, y el bucle continuará hasta que no haya más filas.
        while (rs.next()) {
            // 5. Obtenemos los valores de las columnas para cada fila
            int empNo = rs.getInt("emp_no");
            String oficio = rs.getString("oficio");
            int deptNo = rs.getInt("dept_no");

            // 6. imprimir los datos
            System.out.println("emp_no: " + empNo + ", oficio: " + oficio + ", dept_no: " + deptNo);
        }

        // 7. Imprimimos un mensaje indicando que la consulta ya ha sido ejecutada.
        System.out.println("");
        System.out.println("ahi estan los datos de la tabla: empleados");
        System.out.println("");
    }
    // Método para asignar una base de datos específica
    private static void asignar_bd() throws SQLException {
        System.out.println("");
        // 1. Llamamos al método conectarBD para establecer la conexión a la base de datos
        conectarBD();
        // 2. Definimos la consulta SQL para seleccionar la base de datos "acceso_datos"
        String query = "use acceso_datos";
        // 3. Creamos un Statement para ejecutar la consulta
        Statement st = conn.createStatement();
        // 4. Ejecutamos la consulta para cambiar a la base de datos "acceso_datos"
        st.executeUpdate(query);
        // 5. Imprimimos un mensaje indicando que la base de datos ha sido asignada
        System.out.println("base de datos asignada");
    }


    // Método para conectar a la base de datos MySQL
    private static void conectarBD() throws SQLException {
        // 1. Definimos la URL de la base de datos, el nombre de usuario y la contraseña
        String url =  "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pssw= "admin";
        // 2. Establecemos la conexión a la base de datos utilizando DriverManager
        conn= DriverManager.getConnection(url, user, pssw);
        // 3. Imprimimos un mensaje indicando que la conexión se ha establecido correctamente
        System.out.println("conexion establecida");
    }



}
