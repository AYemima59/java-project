package superPos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;
public class clsLogin{
    String mUsername;
    String mPassword;
    
    public String sql;
    public Connection conn;
    public Statement res;
    
    public void masuk(){
        try {
            sql="select * from admin where username= '"+mUsername+"' and password= '"+mPassword+"'";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    public void keluar(){
        try {
            JOptionPane.showMessageDialog(null, "Berhasil Keluar");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjasi Kesalahan");
            System.out.println(e.getMessage());
        }
    }
    public void daftar(){
        try {
            JOptionPane.showMessageDialog(null, "Silahkan Daftar");
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
    
     public boolean checkLogin(String username, String password) {//manggil setelah login
        try {
            String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exception properly, e.g., show error message or log the error
            return false;
        }
    }
}
