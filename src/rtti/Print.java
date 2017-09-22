package rtti;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)		//�����ֱ⸦ ��Ÿ������
@Target(ElementType.METHOD)		//�޼ҵ忡�� ����ϰ�
public @interface Print {
	boolean enable() default true;
}