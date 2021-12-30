/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasakhir;

import java.sql.DriverManager;

/**
 *
 * @author putik
 */
public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if(koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/tu_vaksin";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
                System.out.println("Koneksi Error");
            }
        }
        return koneksi;
    }
    
    public static void main(String[] args) {
        getKoneksi();
    }
}
