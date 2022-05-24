package section06.exam09_arrayCopy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];//초기값 null
		
		//System.arraycopy
		//(원본배열,원본배열 시작 인덱스, 새배열, 새배열 시작 인덱스, 복사할 개수)
		//얕은 복사: 객체의 번지 값이 복사.
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for(int i=0; i< newIntArray.length;i++)
		{
			System.out.println(newIntArray[i]);
		}
	}

}
