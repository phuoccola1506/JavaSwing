/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kncsdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TGDD
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/quanlysinhvien"; // Thay 'ten_csdl' bằng tên CSDL của bạn
    private static final String USER = "root"; // Thay 'root' bằng tên người dùng CSDL
    private static final String PASSWORD = ""; // Thay '' bằng mật khẩu CSDL của bạn

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Đăng ký driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Kết nối đến cơ sở dữ liệu
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối CSDL thành công!");
        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Kết nối CSDL thất bại: " + e.getMessage());
        }
        return connection;
    }
}
