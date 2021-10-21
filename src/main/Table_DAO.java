package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.St_Vo;

public class Table_DAO {

   static Connection conn = null;
   static PreparedStatement pst = null;
   static ResultSet rs = null;
   int cnt = 0;
   static String code1 = "";
   static String pw1 = "";
   static String trName = "";

   public static void getConn() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
         String dbid = "hr";
         String dbpw = "hr";

         conn = DriverManager.getConnection(url, dbid, dbpw);

         System.out.println("1. 로그인 연결 성공");

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void close() {
      try {
         if (rs != null) {
            rs.close();
         }
         if (pst != null) {
            pst.close();
         }
         if (conn != null) {
            conn.close();
         }

      } catch (SQLException e) {
         e.printStackTrace();
      }

   }

   public ArrayList<St_Vo> Select() {

      St_Vo vo = null;
      ArrayList<St_Vo> arr = new ArrayList<St_Vo>();

      try {

         getConn();

         String sql = "SELECT * FROM student";

         pst = conn.prepareStatement(sql);

         ResultSet rs = pst.executeQuery();

         while (rs.next()) {
            
            String st_code = rs.getString(1);
            String st_Teamcode = rs.getString(2);
            String st_Name = rs.getString(3);
            String st_Pw = rs.getString(4);
            int st_Score = rs.getInt(5);
            int st_Major = rs.getInt(6);


            vo = new St_Vo(st_code, st_Teamcode, st_Name, st_Pw, st_Score, st_Major);
            arr.add(vo);
         }

      } catch (Exception e) {

         e.printStackTrace();

      } finally {

         close();
      }

      return arr;
   }

}