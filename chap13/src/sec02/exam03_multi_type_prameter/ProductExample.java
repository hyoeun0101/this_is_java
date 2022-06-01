package sec02.exam03_multi_type_prameter;

public class ProductExample {

	public static void main(String[] args) {
		Product<TV,String> product = new Product<TV, String>();
		
		product.setKind(new TV());
		product.setModel("½º¸¶Æ® TV");
		TV tv = product.getKind();
		String tvModel = product.getModel();
		
		Product<Car,String> product2 = new Product<Car,String>();
		product2.setKind(new Car());
		product2.setModel("µðÁ©");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}	

}
