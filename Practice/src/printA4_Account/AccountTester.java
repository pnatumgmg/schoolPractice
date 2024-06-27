package printA4_Account;

public class AccountTester {
	static int compBalance(Account a, Account b) {
		if (a.getBalance() == b.getBalance()) {
			return 0;
		} else if (a.getBalance() > b.getBalance()) {
			return 1;
		} else {
			return -1;
		}
	}

	static void verificationBalance(Account a, Account b) {
		System.out.println();
		switch (compBalance(a, b)) {
		case 0:
			System.out.println("%sと%sの普通預金残高は同じ"
					.formatted(a.getName(), b.getName()));
			break;
		case 1:
			System.out.println("%sのほうが普通預金残高が多い"
					.formatted(a.getName()));
			break;
		case -1:
			System.out.println("%sのほうが普通預金残高が多い"
					.formatted(b.getName()));
			break;
		}
	}

	public static void main(String[] args) {
		//1-1
		Account nobi = new Account("のびた", 12345, 30000);
		TimeAccount sune = new TimeAccount("すねお", 33333, 20000, 100000);
		Account dora = new Account("どらえもん", 99999, 50000);

		//1-28
		nobi.show("最初なので改行しない");
		sune.show();
		dora.show();

		//1-3
		/*問題の回答
		System.out.println();
		switch (compBalance(nobi,sune)) {
		case 0:
			System.out.println("%sと%sの普通預金残高は同じ"
					.formatted(nobi.getName(),sune.getName()));
			break;
		case 1:
			System.out.println("%sのほうが普通預金残高が多い"
					.formatted(nobi.getName()));
			break;
		case -1:
			System.out.println("%sのほうが普通預金残高が多い"
					.formatted(sune.getName()));
			break;
		}
		*/

		//同じこと書きたくない＞＜
		verificationBalance(nobi, sune);

		//1-4
		sune.cancel();

		//1-5
		dora.transfer(nobi, 20000);

		//1-6
		/*問題の回答
		System.out.println();
		switch (compBalance(nobi,sune)) {
		case 0:
			System.out.println("%sと%sの普通預金残高は同じ"
					.formatted(nobi.getName(),sune.getName()));
			break;
		case 1:
			System.out.println("%sのほうが普通預金残高が多い"
					.formatted(nobi.getName()));
			break;
		case -1:
			System.out.println("%sのほうが普通預金残高が多い"
					.formatted(sune.getName()));
			break;
		}
		*/

		//同じこと書きたくない＞＜
		verificationBalance(nobi, sune);

		//1-7
		nobi.show();
		sune.show();
		dora.show();
	}
}
