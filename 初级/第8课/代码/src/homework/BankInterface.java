package homework;

public interface BankInterface {
	//���ӿͻ�
	void addCustomer(CustomerInterface customer);
	//���ҿͻ� ture/false
	boolean loadCustomer(CustomerInterface customer);
	//ɾ���ͻ�
	void deleteCustomer(CustomerInterface customer);
	//���ظ����еĿͻ�����
	int numCustomer();
}
