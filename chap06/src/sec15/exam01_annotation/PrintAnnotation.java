package sec15.exam01_annotation;

import java.lang.annotation.*;

//�޼ҵ忡�� ���밡��
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 3;

}
