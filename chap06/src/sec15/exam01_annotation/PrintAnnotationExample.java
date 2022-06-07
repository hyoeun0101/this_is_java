package sec15.exam01_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		//Service�� �� ���� �޼ҵ� �ֳ� ����
		//-> �޼ҵ� ������ �迭�� ����
		Method[] methods = Service.class.getDeclaredMethods();
		for(Method method: methods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class);
				System.out.println("["+method.getName()+"]");
				for(int i=0;i<printAnno.number();i++) {
					System.out.print(printAnno.value());
				}
				System.out.println();
				try {
					method.invoke(new Service());
				}catch(Exception e) {}
				System.out.println();
			}
		}
	}
}
