package jvm.mem.stack;
/**
 * VM Args: -Xss128k ���������ջ�Ĵ�СΪ128k
 * @author juno
 * �ڵݹ������޴�������ջ�����ջᵼ��StackOverFlow
 */
public class StackOverFlowErrTest {
	
	private int stackLength = 1;
	public void stackLeak() {
		System.out.println(stackLength);
		Long a = new Long(0);
		stackLength++;
		stackLeak();
		
	}

	public static void main(String[] args) {
		StackOverFlowErrTest sof = new StackOverFlowErrTest();
		
			sof.stackLeak();
	
	}

}