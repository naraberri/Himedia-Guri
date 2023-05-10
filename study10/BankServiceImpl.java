package study10;

public class BankServiceImpl implements BankService {

	private int money;
	
	@Override
	public void moneyInput(int money) {
		this.money += money;
	}

	@Override
	public void moneyOutput(int money) {
		this.money -= money;
	}

	@Override
	public void moneyPrint() {
		System.out.println(money+"원");
	}

}
