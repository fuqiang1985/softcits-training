import java.lang.reflect.Proxy;

public class EatProxyFactory {
	//Ϊ�����target�������ɶ�̬�������
	public static Object getProxy(Object target){
		//����һ��InvocationHandler����
		EatInvocationHandler eatIH = new EatInvocationHandler();
		
		//���뱻�������
		eatIH.setTarget(target);
				
		//����������һ����̬����
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), eatIH);
	}

}
