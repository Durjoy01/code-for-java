public class Accounts {
	private int userId;
	private String username;
	private String password;
	private int amount;
	private int totalamount = 0;
	
	public Accounts(int userId,String username,String password,int amount) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.amount = amount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	
	public void deposit(int amount,String password) throws InvalidAmountException, UnAutharizedUserException {
		if(this.password.equals(password)) {
			if(amount>0) {
				this.amount += amount;
			}else {
				throw new InvalidAmountException("Invalid Amount!");
			}
		}else {
			throw new UnAutharizedUserException("UnAutharized User!");
		}
	}
	
	public void withdraw(int amount,String password) throws UnAutharizedUserException, InsufficientBalanceException {
		if(this.password.equals(password)) {
			if(amount <= this.amount) {
				this.amount -= amount;
			}else {
				throw new InsufficientBalanceException("Insufficient Balance!");
			}
		}else {
			throw new UnAutharizedUserException("UnAutharized User!");
		}
	}

	@Override
	public String toString() {
		return "Accounts [userId=" + userId + ", username=" + username + ", password=" + password + ", amount=" + amount
				+ ", totalamount=" + totalamount + "]";
	}
	
	

}