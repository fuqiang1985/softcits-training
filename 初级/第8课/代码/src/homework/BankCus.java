package homework;

public class BankCus {

	public static void main(String[] args) {
		Customer cus1 = new Customer();
		cus1.setFirstName("��");
		cus1.setLastName("��");
		
		Customer cus2 = new Customer();
		cus2.setFirstName("��");
		cus2.setLastName("��");

		Customer cus3 = new Customer();
		cus3.setFirstName("��");
		cus3.setLastName("��");
		
		Bank bank = new Bank();
		bank.addCustomer(cus1);
		bank.addCustomer(cus2);
		bank.addCustomer(cus3);
//		System.out.println(bank.getCustomers());
		
		bank.deleteCustomer(cus1);
//		System.out.println("�Ƿ�����û�: " + bank.loadCustomer(cus1));
		
		System.out.println(bank.getCustomers());
		
		System.out.println("��ǰ�ͻ�����: "+bank.numCustomer());
		
	}

}
