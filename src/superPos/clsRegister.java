package superPos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class clsRegister{
    int id_admin;
    String nama;
    String username;
    String password;
    String alamat;
    String nohp;
    
    public String sql;
    public Connection conn;
    public Statement res;
    
    public void daftar(){
        try {
            sql = "INSERT into admin values ('"+id_admin+"','"+nama+"','"+username+"','"+password+"','"+alamat+"','"+nohp+"')";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void cancel(){
        try {
            JOptionPane.showMessageDialog(null, "Tidak Jadi Regsiter");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
     public void login(){
         try {
             JOptionPane.showMessageDialog(null, "Silahkan Login");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
             System.out.println(e.getMessage());
         }
     }
     
      public void aksesdata() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/superpos", "root", "newpass");
            res = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            System.out.println(e.getMessage());

        }
    }
}
