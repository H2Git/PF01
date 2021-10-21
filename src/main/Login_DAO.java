package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Login_DAO {

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

	public boolean LoginCheck(String code, String pw) {

		code1 = code;
		pw1 = pw;
		System.out.println(code1 + " " + pw1);
		boolean check = false;
		PreparedStatement pstmt = null;
		String sql = "";
		String dbpwd = "";

		try {

			getConn();

			System.out.println("2. 값은 들어 왔어 " + code + " " + pw);
			System.out.println(code1);
			if (code.length() == 6) {
				sql = "select st_pw from student where st_code = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, code);
				rs = pstmt.executeQuery();
				if (rs.next())
					dbpwd = rs.getString("st_pw");

				if (dbpwd.equals(pw))
					check = true;

			} else {
				sql = "select tr_pw from teacher where tr_code = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, code);
				rs = pstmt.executeQuery();
				if (rs.next())
					dbpwd = rs.getString("tr_pw");

				if (dbpwd.equals(pw))
					check = true;

			}

			System.out.println("3. check 값 >> " + check + "들어갈꺼야");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			close();
		}
		return check;
	}

	public static String getCode() {
		return code1;
	}

	public static String getPw() {
		return pw1;
	}

	public static String getTrName(String code) {

		code1 = code;

		System.out.println(code1);
		PreparedStatement pstmt = null;
		String sql = "";
		String a = "";

		try {

			getConn();
			System.out.println("4. 값은 들어 왔어 " + code);
			System.out.println(code1);
			sql = "select tr_name from teacher where tr_code = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			System.out.println(rs.next());

			trName = rs.getString("tr_name");
			System.out.println("5" + trName);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			close();
		}
		return trName;
	}

}