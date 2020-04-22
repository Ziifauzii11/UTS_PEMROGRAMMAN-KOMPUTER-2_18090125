/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dokumen;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author Dwi Fauzi
 */
public class Koneksi {
    static Connection Koneksi;
    public static Connection sambungDB(){
        try{
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/db_arsip","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return Koneksi;
    }
}
