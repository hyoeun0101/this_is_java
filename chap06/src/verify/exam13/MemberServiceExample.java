package verify.exam13;

public class MemberServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService mem = new MemberService();
		boolean result = mem.login("hong", "12345");
		
		if(result) {
			System.out.println("·Î±×ÀÎ");
		}else {
			System.out.println("no");
		}

	}

}
