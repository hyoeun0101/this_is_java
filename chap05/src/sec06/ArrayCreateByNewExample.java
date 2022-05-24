package sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
		}
		
		System.out.println();
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
		arr2[0] = 0.1;
		
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
		
		String[] arr3 = new String[3];
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]:"+arr3[i]);
		}
		arr3[0] = "1¿ù";
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]:"+arr3[i]);
		}
	}

}
