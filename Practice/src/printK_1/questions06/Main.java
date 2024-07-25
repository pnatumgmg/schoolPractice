package printK_1.questions06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		//1
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "postgrestest";
		
		//3
		String sql = """
				 	select c.社員番号,c.名前,a.名前 as 部署名
					  from 社員 c
					  join 部署 a
					    on c.部署ID = a.部署ID
				""";
		
		//4
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				int id = result.getInt("社員番号");
				String name = result.getString("名前");
				String Department = result.getString("部署名");
				
				System.out.println("%d:%s:%s".formatted(id,name,Department));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
