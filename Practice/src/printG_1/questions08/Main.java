package printG_1.questions08;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		//(1)
		String text = """
				昔々、ある所にお爺さんとお婆さんがいました。
				お爺さんは山へ芝刈りにお婆さんは川へ洗濯に行きました。
				お婆さんが川で洗濯をしていると大きな桃が流れてきました。
				""";
		//(2)
		text = text.trim();
		String[] textSplit = text.split("[にへとがはでを。、]");
		
		//(3)
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		//(4)
		int maxView = 0;
		
		//(5)
		for(String a:textSplit) {
			String kari = a.trim();
			if(hMap.containsKey(kari)) {
				int nowView = hMap.get(kari) + 1;
				hMap.put(kari, nowView);
				if (nowView > maxView) {
					maxView = nowView;
				}
			}else{
				hMap.put(a, 1);
			}
		}
		//(6)
		System.out.println("頻出単語のカウント(降順):");
		for (int i = maxView;i > 0;i--) {
			for (String a: hMap.keySet()) {
				if(i == hMap.get(a)){
					System.out.println(a + "：" + hMap.get(a));
				}
			}
		}
	}
}
