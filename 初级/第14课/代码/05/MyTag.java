package one;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//ʹJVM�ܹ�ͨ��������ȡ��annotation��Ϣ
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTag {
	//����������Ա��������Ա�����Է�������ʽ������
	String name() default "alex";
	int age() default 32;
}
