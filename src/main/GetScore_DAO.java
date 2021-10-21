package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import vo.Sc_Vo;
import vo.St_Vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetScore_DAO {

	static Connection conn = null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;
	static int cnt = 0;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			conn = DriverManager.getConnection(url, dbid, dbpw);

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

	public int getChapterScore(String ST_CODE, String CH_CODE) {

		int sc_Score = 0;

		String sql = "";

		Sc_Vo sc_VO = null;

		try {

			getConn();

			System.out.println("1. 연결 test");

			sql = "SELECT sc_score FROM student_chapter WHERE st_code = ? and ch_code = ?";

			System.out.println("2. 연결 test");

			pst = conn.prepareStatement(sql);

			System.out.println("3. 연결 test");

			pst.setString(1, ST_CODE);
			pst.setString(2, CH_CODE);

			System.out.println("4. 연결 test");

			rs = pst.executeQuery();

			System.out.println("5. 연결 test");

			while (rs.next()) {
				sc_Score = rs.getInt(1);
			}

			System.out.println("6. 연결 test");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return sc_Score;
	}

	public St_Vo getAwardScore(String GETID) {

		String st_code = "";
		String st_Teamcode = "";
		String st_Name = "";
		String st_Pw = "";
		int st_Score = 0;
		int st_Major = 0;
		String sql = "";

		St_Vo vo = null;

		try {

			getConn();

			System.out.println("1. 연결");

			sql = "select * from student where st_code = ?";

			System.out.println("2. 연결");

			pst = conn.prepareStatement(sql);

			System.out.println("3. 연결");

			pst.setString(1, GETID);

			System.out.println("4. 연결");

			rs = pst.executeQuery();

			System.out.println("5. 연결");

			while (rs.next()) {
				st_code = rs.getString(1);
				st_Teamcode = rs.getString(2);
				st_Name = rs.getString(3);
				st_Pw = rs.getString(4);
				st_Score = rs.getInt(5);
				st_Major = rs.getInt(6);

				vo = new St_Vo(st_code, st_Teamcode, st_Name, st_Pw, st_Score, st_Major);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	public ArrayList<St_Vo> selectALL() {
		ArrayList<St_Vo> arr = new ArrayList<>();

		St_Vo vo = null;

		try {
			getConn();

			String sql = "select * from member";

			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

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
	
	public int insert2(String st_code, String st_Teamcode, String st_Name,String st_Pw, int st_Score,int st_Major) {

		try {

			getConn();
			

			String sql = "INSERT INTO student VALUES (?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(sql);

			pst.setString(1, st_code);
			pst.setString(2, st_Teamcode);
			pst.setString(3, st_Name);
			pst.setString(4, st_Pw);
			pst.setInt(5, st_Score);
			pst.setInt(6, st_Major);

			cnt = pst.executeUpdate();

		}  catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {

			close();
		}

		return cnt;

	}
	
	public int insert3(String score, String name, String chap) {

		try {

			getConn();
			
			String sql = "";
			
			if(name.equals("최상문")) {
				sql = "update student_chapter set sc_score = ? where st_code = '200101' and ch_code = ?";
			}else {
				sql = "update student_chapter set sc_score = ? where st_code = '200102' and ch_code = ?";
			}
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, score);
			pst.setString(2, chap);

			cnt = pst.executeUpdate();

		}  catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {

			close();
		}

		return cnt;

	}	
	
	public int insert4(String score, String name, String aw) {

		try {

			getConn();
			
			String sql = "";
			
			if(name.equals("최상문")) {
				sql = "update student_event set se_score = ? where st_code = '200101' and ev_code = ?";
			}else {
				sql = "update student_event set se_score = ? where st_code = '200102' and ev_code = ?";
			}
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, score);
			pst.setString(2, aw);

			cnt = pst.executeUpdate();

		}  catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {

			close();
		}

		return cnt;

	}	
}
	
//	public int insert(String st_code, String st_Teamcode, 
//			String st_Name,String st_Pw, int st_Score,int st_Major) {
//
//		try {
//
//			getConn();
//
//			if (conn != null) {
//				System.out.println("DB연결성공");
//			} else {
//				System.out.println("DB열결실패");
//			}
//
//			String sql = "insert into student values (?,?,?,?,?,?)";
//
//			pst = conn.prepareStatement(sql);
//
//			// 4.데이터베이스에 명령하려고 하는 SQL문에 오류가 없는지 검사
//
//			pst.setString(1, st_code);
//			pst.setString(2, st_Teamcode);
//			pst.setString(3, st_Name);
//			pst.setString(4, st_Pw);
//			pst.setInt(5, st_Score);
//			pst.setInt(6, st_Major);
//
//			cnt = pst.executeUpdate();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//
//			close();
//
//		}
//
//		return cnt;
//	}
//
//}