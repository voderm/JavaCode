package Voderm.learning;

import java.sql.*;

/**
 * @author: voderm Lee
 * @date: 2022/9/30 9:15
 */
public class MySQLDemo {
    public static void main(String[] args) {
        //加载MySQL数据库驱动程序
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException cne){cne.printStackTrace();}
        String dburl = "jdbc:mysql://127.0.0.1:3306"; //待修改
        String sql = "SELECT * FROM products WHERE id < 104";

        try (Connection conn = DriverManager.getConnection(dburl, "root", "123456")) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rst = stmt.executeQuery(sql)) {
                    while (rst.next()) {
                        System.out.println(rst.getInt(1) + "\t" + rst.getString(2) + "\t" + rst.getString(3));
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
