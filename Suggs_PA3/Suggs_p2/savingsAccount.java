class savingsAccount
{
	static double annualInterestRate;
	private double savingsBalance;

	public savingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}

	public double calculateMonthlyInterest()
	{
		return savingsBalance*annualInterestRate/12;
	}

	public void modifyInterestRate(double rate)
	{
		 annualInterestRate = rate;
	}

	public void addSavingsBalance(double amt)
	{
		savingsBalance = savingsBalance + amt;
	}

	public double getSavingsBalance()
	{
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
}


class specialSavings extends SavingsAccount
{
	public specialSavings(double savingsBalance) 
	{
		super(savingsBalance);
		
		if(savingsBalance>10000)
		{
			modifyInterestRate(10);
		}
	}

	public void deposit(double amt)
	{
		addSavingsBalance(amt);
	
		if(getSavingsBalance()+amt>10000)
		{
			modifyInterestRate(10);
		}
	}

	public boolean withdraw(double amt)
	{
		if(getSavingsBalance()<=amt)
		{
			setSavingsBalance(getSavingsBalance() - amt);
			return true;
		}
		else
			return false;
	}
}

class savingAccountTest
{
	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new savingsAccount(2000);
		SavingsAccount saver2 = new savingsAccount(3000);

		saver1.modifyInterestRate(4);

		Double saver1MI = saver1.calculateMonthlyInterest();
		Double saver2MI = saver2.calculateMonthlyInterest();

		System.out.println("MonthlyInterest of saver1 = "+saver1MI);
		System.out.println("MonthlyInterest of saver2 = "+saver2MI);

		saver1.modifyInterestRate(5);

		saver1.addSavingsBalance(saver1MI);
		saver2.addSavingsBalance(saver2MI);

		System.out.println("MonthlyInterest of saver1 for next month = "+saver1MI);
		System.out.println("MonthlyInterest of saver2 for next month = "+saver2MI);
	}
}

class specialSavingTest
{
	public static void main(String[] args)
	{
		SpecialSavings saver1 = new specialSavings(2000);
		SpecialSavings saver2 = new specialSavings(3000);

		saver1.deposit(200);
		saver1.deposit(400);
		saver2.deposit(1400);

		System.out.println("Saver1 balance: "+saver1.getSavingsBalance());
		System.out.println("Saver1 interest: "+saver1.calculateMonthlyInterest());
		System.out.println("Saver2 balance: "+saver2.getSavingsBalance());
		System.out.println("Saver2 interest: "+saver2.calculateMonthlyInterest());

		saver1.withdraw(500);
		saver2.withdraw(700);


		System.out.println("Saver1 balance: "+saver1.getSavingsBalance());
		System.out.println("Saver1 interest: "+saver1.calculateMonthlyInterest());
		System.out.println("Saver2 balance: "+saver2.getSavingsBalance());
		System.out.println("Saver2 interest: "+saver2.calculateMonthlyInterest());
	}
}

