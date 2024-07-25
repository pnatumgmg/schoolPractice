package printK_1.questions01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		//1
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgrestest";
		
		//2
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		
		//3
		String sql = "select 費目,メモ,出金額 from 家計簿 where 出金額 >= ?";
		
		//4
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setInt(1, 3000);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				String himoku = result.getString("費目");
				String memo = result.getString("メモ");
				int outprice = result.getInt("出金額");
				
				System.out.println("%s:%s:%d".formatted(himoku,memo,outprice));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
