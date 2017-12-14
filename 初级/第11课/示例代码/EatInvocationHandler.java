import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EatInvocationHandler implements InvocationHandler{
	//��Ҫ������Ķ���
	private Object target;

	//ִ�ж�̬�����������з���ʱ�����ᱻ���ִ�����µ�invoke����
	//����������
	//proxy - ����̬�������
	//method - ��������ִ�еķ���
	//args - �������Ŀ�귽��ʱ�����ʵ��
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		TableAction ta = new TableAction();
		ta.prepareTable();
		
		//��target������Ϊ��������ִ��method����
		Object result = method.invoke(target, args);
		
		ta.cleanTable();
		return result;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	

}
