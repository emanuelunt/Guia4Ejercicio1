/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia4ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hogar
 */
public class Guia4Ejercicio1 {

    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver"); // a) Cargar el driver MariaDB.

            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost/registrodb", "root", "");// b) Establecer la conexión a la base de datos previamente creada.
            
            //c) Insertar 3 alumnos
            String sql1 = "INSERT INTO alumno (idAlumno, dni, apellido, nombre, fechaNacimiento, estado) VALUES (1, 12345678, 'Pérez', 'Juan', '2000-05-15', 1);";
            String sql2 = "INSERT INTO alumno (idAlumno, dni, apellido, nombre, fechaNacimiento, estado) VALUES (2, 23456789, 'Gómez', 'María', '2001-08-21', 1);";
            String sql3 ="INSERT INTO alumno (idAlumno, dni, apellido, nombre, fechaNacimiento, estado) VALUES (3, 34567890, 'López', 'Pedro', '2002-03-10', 1);";
            
//            PreparedStatement ps = conexion.prepareStatement(sql1);
//            int resultado = ps.executeUpdate();
//            ps = conexion.prepareStatement(sql2);
//            resultado = ps.executeUpdate();
//            ps = conexion.prepareStatement(sql3);
//            resultado = ps.executeUpdate();
//            System.out.println(resultado);
            
           // d) Insertar 4 materias
//            sql1 = "INSERT INTO materia (nombre, anio, estado) VALUES ('Laboratorio III', 2023, 1);";
//            sql2 = "INSERT INTO materia (nombre, anio, estado) VALUES ('Matemáticas Avanzadas', 2023, 1);";
//            sql3 ="INSERT INTO materia (nombre, anio, estado) VALUES ('Historia del Arte', 2023, 1);";
//            String sql4 ="INSERT INTO materia (nombre, anio, estado) VALUES ('Programación Web', 2023, 1);";
//           PreparedStatement ps = conexion.prepareStatement(sql1);
//           int resultado = ps.executeUpdate();
//            ps = conexion.prepareStatement(sql2);
//            resultado = ps.executeUpdate();
//            ps = conexion.prepareStatement(sql3);
//            resultado = ps.executeUpdate();
//            ps = conexion.prepareStatement(sql4);
//            resultado = ps.executeUpdate();
//            System.out.println(resultado);

           //e) Inscribir a los 3 alumnos en 2 materias cada uno.
//           sql1 = "INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES (8, 2, 4);";
//           sql2 = "INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES (4, 2, 3);";
//           PreparedStatement ps = conexion.prepareStatement(sql1);
//           int resultado = ps.executeUpdate();
//           ps = conexion.prepareStatement(sql2);
//           resultado = ps.executeUpdate();
           
//           sql1 = "INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES (10, 6, 4);";
//           sql2 = "INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES (7, 6, 5);";
//           ps = conexion.prepareStatement(sql1);
//           resultado = ps.executeUpdate();
//           ps = conexion.prepareStatement(sql2);
//           resultado = ps.executeUpdate();
            
//           sql1 = "INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES (9, 9, 2);";
//           sql2 = "INSERT INTO inscripcion (nota, id_alumno, id_materia) VALUES (7, 9, 3);";
//           ps = conexion.prepareStatement(sql1);
//           resultado = ps.executeUpdate();
//           ps = conexion.prepareStatement(sql2);
//           resultado = ps.executeUpdate();
           
           // f) Listar los datos de los alumnos con calificaciones superiores a 8.
//           sql1 = "SELECT dni,apellido, nombre , nota FROM alumno,inscripcion WHERE (idAlumno = id_alumno) AND nota>8;";
//           PreparedStatement ps = conexion.prepareStatement(sql1);
//           ResultSet resultado = ps.executeQuery();
//           
//           while(resultado.next()){
//               System.out.println("DNI: " + resultado.getInt("dni"));
//               System.out.println("Apellido: " + resultado.getString("apellido"));
//               System.out.println("Nombre: " + resultado.getString("nombre"));
//               System.out.println("Nota: " + resultado.getInt("nota"));
//               System.out.println("-------------------------------------------------");
//           }
           

          // g) Desinscribir un alumno de una de la materias.
          sql1 = "DELETE FROM inscripcion WHERE id_alumno=9 and id_materia = 3;";
          PreparedStatement ps = conexion.prepareStatement(sql1);
          int resultado = ps.executeUpdate();
          System.out.println("Filas Borradas: " + resultado);

        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el Driver: " + ex.toString());
        } catch (SQLException ex) {
            System.out.println("Error al conectar la base de datos: " + ex.toString());
        }
    }
}
