package com.pmumentor.model.dao;

import com.pmumentor.model.entities.Student;
import java.sql.*; // استيراد مكتبات JDBC

public class UserDAO {
    
    // معلومات اتصال JavaDB المضمنة (كما تم إعدادها في الخطوة 2)
    private static final String URL = "jdbc:derby://localhost:1527/PMUDatabase";
    private static final String USER = "app";
    private static final String PASSWORD = "app";

    public boolean registerUser(Student student) {
        // الاستعلام SQL لإضافة بيانات المستخدم في جدول USERS
        String sql = "INSERT INTO USERS (STUDENT_ID, NAME, EMAIL, PASSWORD_HASH, MAJOR, ROLE) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // تعيين قيم المتغيرات حسب ترتيبها في الاستعلام
            pstmt.setString(1, student.getStudentID());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getEmail());
            pstmt.setString(4, student.getPasswordHash());
            pstmt.setString(5, student.getMajor());
            pstmt.setString(6, student.getRole());

            // تنفيذ الاستعلام
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // إذا تم إضافة صف واحد على الأقل، يكون التسجيل ناجحاً

        } catch (SQLException e) {
            System.out.println("Error during registration: " + e.getMessage());
            // طباعة الخطأ في وحدة التحكم لتسهيل التصحيح
            e.printStackTrace(); 
            return false;
        }
    }
}