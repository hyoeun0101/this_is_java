package sec05.exam01_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		
		BiConsumer<String,String> biconsumer = (t,u)-> System.out.println(t+u);
		biconsumer.accept("java", "8");
		
		
		DoubleConsumer doubleconsumer = t -> System.out.println(t);
		doubleconsumer.accept(1.4);
		
		ObjIntConsumer<String> objintconsumer = (t,u) -> System.out.println(t+u);
		objintconsumer.accept("java", 8);
		
	
	}

}
