package sec04.exam01_field;

public class UsingThis {
	public int field = 10;
	
	class Inner{
		int field = 20;
		void method() {
			MyFunctionInterface fi;
			fi = ()->{
				System.out.println(field);//20
				System.out.println(UsingThis.this.field);
				System.out.println(this.field);
				
			};
			fi.method();
		}
	}

}
