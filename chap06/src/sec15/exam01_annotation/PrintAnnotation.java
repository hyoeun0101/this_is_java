package sec15.exam01_annotation;

import java.lang.annotation.*;

//메소드에만 적용가능
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 3;

}
