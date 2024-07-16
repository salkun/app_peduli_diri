/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_peduli_diri;

/**
 *
 * @author Salik Elhanan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class koneksi {
    private String url="jdbc:mysql://localhost/db_peduli_diri";
    private String user = "root";
    private String password = "";
    private Connection con;
    
    public void connect(){
        try{
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public Connection getCon(){
        return con;
    }
}
