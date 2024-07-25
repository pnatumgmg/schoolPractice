package printK_1.questions02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		//1
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgrestest";
		
		String sql = "update 家計簿 set 出金額 = ? where 日付 = ?";
		
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);){
			
			pstmt.setInt(1, 6000);
			Date d1 = Date.valueOf("2024-02-14");
			pstmt.setDate(2, d1);
			
			int count = pstmt.executeUpdate();
			
			System.out.println(count + "行更新しました");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
