package printK_extra.questions01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AccessDB {
	private Connection conn;
	String url;
	String user;
	String password;

	public AccessDB(){
		url = "jdbc:postgresql://localhost:5432/postgres";
		user = "postgres";
		password = "postgrestest";
	}

	public void connect(){
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public void disConnect() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

	public ArrayList<M_goods> getgoodsList(){
		ArrayList<M_goods> l1 = new ArrayList<M_goods>();

		String sql = "select * from m_goods";
		connect();

		try(PreparedStatement pstmt = conn.prepareStatement(sql);){

			ResultSet result = pstmt.executeQuery();

			while(result.next()) {
				int itemcode = result.getInt("itemcode");
				String itemname = result.getString("itemname");
				int supcode = result.getInt("supcode");
				int price = result.getInt("price");
				Date d1 = result.getDate("update_date");
				String strDate = d1.toString();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = format.parse(strDate);

				l1.add(new M_goods(itemcode,itemname,supcode,price,date));
			}
		}catch (SQLException | ParseException e) {
			// TODO: handle exception
		}
		disConnect();
		return l1;
	}

	public ArrayList<M_supplier> getSupplierList() {
		ArrayList<M_supplier> l1 = new ArrayList<M_supplier>();

		String sql = "select * from m_supplier";

		connect();

		try (PreparedStatement pstmt = conn.prepareStatement(sql);){

			ResultSet result = pstmt.executeQuery();

			while(result.next()) {
				int supcode = result.getInt("supcode");
				String supname = result.getString("supname");
				String address = result.getString("address");
				String tel = result.getString("tel");
				String repName = result.getString("rep_name");
				Date d1 = result.getDate("update_date");
				String strDate = d1.toString();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date date = format.parse(strDate);

				l1.add(new M_supplier(supcode,supname,address,tel,repName,date));

			}
		} catch (SQLException | ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		disConnect();
		return l1;
	}

	public M_goods getGoods(int goodscode) {
		M_goods mg = new M_goods();
		M_supplier ms = new M_supplier();
		String sql ="""
				select g.itemname as 商品名
					  ,s.supname as 仕入先名
					  ,s.address as 仕入先住所
					  ,g.price as 価格
				  from m_goods g
				  left join m_supplier s
				    on g.supcode = s.supcode
				 where itemcode = %d
				""".formatted(goodscode);

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();

			while(result.next()) {
				String itemName = result.getString("商品名");
				String supName = result.getString("仕入先名");
				String address = result.getString("仕入先住所");
				int price = result.getInt("価格");
				mg.setItemname(itemName);
				mg.setPrice(price);
				ms.setSupname(supName);
				ms.setAddress(address);
				mg.setSup(ms);
			}
		}catch(SQLException |NullPointerException e) {
			System.out.println("a");
			e.printStackTrace();
		}
		return mg;
	}
	
	public int deleteFromM_goods(int goodscode) {
		int count = 0;
		String sql = "delete from m_goods where itemcode = %d".formatted(goodscode);
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			count = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			return -1;
		}
		return count;
	}
	
	public int insertM_goods(M_goods goods) {
		int count = 0;
		String sql = """
					insert into m_goods(ITEMCODE,ITEMNAME,SUPCODE,PRICE,UPDATE_DATE)
					values(?,?,?,?,?)
					""";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1, goods.getItemcode());
			pstmt.setString(2, goods.getItemname());
			pstmt.setInt(3, goods.getSupcode());
			pstmt.setInt(4, goods.getPrice());
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = sf.format(goods.getUpdate_date());
			java.sql.Date d2 = java.sql.Date.valueOf(strDate);
			pstmt.setDate(5,d2);
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return count;
	}
	
	public int updateM_goods(M_goods goods) {
		int count = 0;
		String sql = """
						update m_goods 
						   set itemcode = ?
						      ,itemname = ?
						      ,supcode = ?
						      ,price = ?
						      ,update_date = ?
						 where itemcode = ?
					""";
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			pstmt.setInt(1,goods.getItemcode());
			pstmt.setInt(6,goods.getItemcode());
			pstmt.setString(2, goods.getItemname());
			pstmt.setInt(3, goods.getSupcode());
			pstmt.setInt(4, goods.getPrice());
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = sf.format(goods.getUpdate_date());
			java.sql.Date d2 = java.sql.Date.valueOf(strDate);
			
			pstmt.setDate(5,d2);
			
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return -1;
		}
		return count;
	}
	
	public int searchScode(int productNumber) {
		int supCode = -1;
		String sql = """
				select supcode
				  from m_goods
				 where itemcode = ?
				""";
		
		try(PreparedStatement pstmt = conn.prepareStatement(sql);){
			
			pstmt.setInt(1,productNumber);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				supCode = result.getInt("supcode");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			return supCode;
		}
		return supCode;
	}
}