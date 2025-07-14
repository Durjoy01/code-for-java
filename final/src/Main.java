import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Accounts ac1 = new Accounts(201,"ihsanulpro","pass1",500);
		Accounts ac2 = new Accounts(202,"Nadia","pass2",600);
		Accounts ac3 = new Accounts(203,"Cynthia","pass3",700);
		
		ArrayList<Accounts> ac = new ArrayList<Accounts>();
		ac.add(ac1);
		ac.add(ac2);
		ac.add(ac3);
		
		Bank bank = new Bank("NSU BANK","Bashundhara","Dhaka");
		bank.setAccounts(ac);
		
		try {
			bank.withdraw(200,201,"pass1");
			System.out.println("Done!");
		}catch(InvalidAmountException ex) {
			System.out.println(ex);
		}catch(InsufficientBalanceException ex) {
			System.out.println(ex);
		}catch(InvalidUserException ex) {
			System.out.println(ex);
		}catch(UnAutharizedUserException ex) {
			System.out.println(ex);
		}
		

	}

}