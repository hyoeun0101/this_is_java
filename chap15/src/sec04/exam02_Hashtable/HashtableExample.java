package sec04.exam02_Hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "124");
		map.put("winter", "125");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��� �Է����ּ���.");
			System.out.print("���̵�: ");
			String id = scanner.nextLine();
			
			System.out.print("��й�ȣ: ");
			String pw = scanner.nextLine();
			System.out.println();
			
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
	}

}
