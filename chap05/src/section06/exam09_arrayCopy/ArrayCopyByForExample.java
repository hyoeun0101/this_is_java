package section06.exam09_arrayCopy;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];//�ʱⰪ null
		
		//System.arraycopy
		//(�����迭,�����迭 ���� �ε���, ���迭, ���迭 ���� �ε���, ������ ����)
		//���� ����: ��ü�� ���� ���� ����.
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for(int i=0; i< newIntArray.length;i++)
		{
			System.out.println(newIntArray[i]);
		}
	}

}
