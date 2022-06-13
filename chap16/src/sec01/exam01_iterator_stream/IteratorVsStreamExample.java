package sec01.exam01_iterator_stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorVsStreamExample {
	List<String> list = Arrays.asList("hong","sin","gam");
	
	Iterator<String> iter = list.iterator();
	while(iter.hasNext()) {
		String name = iter.next();
		System.out.println(name);
	}
	
}

