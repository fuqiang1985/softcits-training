package one;
@FunctionalInterface
public interface FunInterface {
	static void foo(){
		System.out.println("�෽��");
	}
	default void bar(){
		System.out.println("Ĭ�Ϸ���");
	}
	void test();
	//void test2();
}
