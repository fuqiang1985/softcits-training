public class Account
{
	// ��װ�˻���š��˻�����������Ա����
	private String accountNo;
	private double balance;
	public Account(){}
	// ������
	public Account(String accountNo , double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}
	// accountNo��setter��getter����
	public void setAccountNo(String accountNo)
	{
		this.accountNo = accountNo;
	}
	public String getAccountNo()
	{
		return this.accountNo;
	}

	// balance��setter��getter����
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
}