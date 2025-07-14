import java.util.ArrayList;

public class Bank {
	private String name;
	private String brance;
	private String location;
	private ArrayList<Client> client;
	private ArrayList<Employee> employee;
	private ArrayList<Accounts> accounts;
	
	public Bank(String name,String brance,String location) {
		this.name = name;
		this.brance = brance;
		this.location = location;
	}

	
	public ArrayList<Client> getClient() {
		return client;
	}

	public void setClient(ArrayList<Client> client) {
		this.client = client;
	}

	public ArrayList<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}

	public ArrayList<Accounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Accounts> accounts) {
		this.accounts = accounts;
	}



	public void addClient(Client obj) {
		client.add(obj);
	}
	
	public void addEmployee(Employee obj) {
		employee.add(obj);
	}
	
	public void addAccount(Accounts obj) {
		accounts.add(obj);
	}
	
	public void removeClient(Client obj) {
		int index = client.indexOf(obj);
		client.remove(index);
	}
	
	public void removeEmployee(Employee obj) {
		int index = employee.indexOf(obj);
		employee.remove(index);
	}

	public void removeAccount(Accounts obj) {
		int index = accounts.indexOf(obj);
		accounts.remove(index);
	}
	
	public void deposite(int amount,int userId,String password) throws InvalidAmountException, UnAutharizedUserException, InvalidUserException {
		boolean flag = false;
		for (int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getUserId() == userId) {
				flag = true;
				if(accounts.get(i).getPassword().equals(password)) {
					accounts.get(i).deposit(amount, password);
				}
			}
		}
		
		if(flag==false) {
			throw new InvalidUserException("Invalid User!");
		}
	}
	
	public void withdraw(int amount,int userId,String password) throws InvalidAmountException, UnAutharizedUserException, InvalidUserException, InsufficientBalanceException {
		boolean flag = false;
		for (int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getUserId() == userId) {
				flag = true;
				if(accounts.get(i).getPassword().equals(password)) {
					accounts.get(i).withdraw(amount, password);
				}else {
					throw new InvalidUserException("Invalid User!");
				}
			}
		}
		
		if(flag==false) {
			throw new InvalidUserException("Invalid User!");
		}
	}
}