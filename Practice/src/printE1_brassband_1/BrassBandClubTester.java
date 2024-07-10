package printE1_brassband_1;

public class BrassBandClubTester {
	public static void main(String[] args) {
		//2
		BrassBandClub tama = new BrassBandClub(1,"タマちゃん","フルート");
		BrassBandClub hana = new BrassBandClub(3,"はな輪","サックス");
		BrassBandClub maru = new BrassBandClub(2,"丸子","リコーダー");
		BrassBandClub yama = new BrassBandClub(1,"やまだ","シンバル");
		BrassBandClub nogu = new BrassBandClub(2,"野ぐち","チューバ");
		
		BrassBandClub[]  bbcs = {tama,hana,maru,yama,nogu};
		
		/**Q3 1-1
		 * 1回目実行結果
		 * printE1_brassband_1.BrassBandClub@279f2327
		 * printE1_brassband_1.BrassBandClub@2ff4acd0
		 * printE1_brassband_1.BrassBandClub@54bedef2
		 * printE1_brassband_1.BrassBandClub@5caf905d
		 * printE1_brassband_1.BrassBandClub@27716f4
		 */
		//1-3
		for(BrassBandClub a : bbcs) {
			System.out.println(a);
		}
		
		//2-2
		BrassBandClub maruv2 = new BrassBandClub(2,"丸子","リコーダー");
		
		//2-3
		BrassBandClub.containsMember(maruv2, bbcs);
	}
}