package study10;

public class BankController {

	public static void main(String[] args) {
		BankServiceImpl bank = new BankServiceImpl();
		
		bank.moneyPrint();
		bank.moneyInput(600000);
		bank.moneyPrint();
		bank.moneyOutput(990000);
		bank.moneyPrint();
		bank.moneyInput(200000);
		bank.moneyPrint();
		bank.moneyOutput(70000);
		bank.moneyOutput(140000);
		bank.moneyOutput(600000);
		bank.moneyPrint();
		
	}
}
