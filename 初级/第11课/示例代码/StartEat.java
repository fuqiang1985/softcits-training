
public class StartEat {
	public static void main(String[] args){
		//����һ��ԭʼ��EatMc�����������ɱ��������
		Eat target = new EatMc();
		
		//���ɴ������
		Eat eat =(Eat) EatProxyFactory.getProxy(target);
		//����eat���ⷽ����prepareTable �� cleanTable�ᱻ�Զ�����
		eat.eat("humbuger");
		//����eat���ⷽ����prepareTable �� cleanTable�ᱻ�Զ�����
		eat.drink();
	}

}