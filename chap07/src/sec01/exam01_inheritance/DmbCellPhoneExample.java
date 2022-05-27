package sec01.exam01_inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰","검정",10);
		
		//상속받은 필드- CellPhone의 필드
		System.out.println("모델:"+dmb.model);
		System.out.println("색상: "+dmb.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: "+dmb.channel);
		
		//상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("네 안녕하세요. 전 홍길동인데요");
		dmb.sendVoice("아 네 반갑습니다");
		dmb.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
		
	}

}
