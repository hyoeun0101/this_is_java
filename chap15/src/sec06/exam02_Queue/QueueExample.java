package sec06.exam02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> msgQ = new LinkedList<Message>();
		
		msgQ.offer(new Message("sendMail","hong"));
		msgQ.offer(new Message("sendSMS","sin"));
		msgQ.offer(new Message("sendKakaotalk","kim"));
		msgQ.offer(new Message("sendMail","Lee"));
		
		while(!msgQ.isEmpty())
		{
			Message message = msgQ.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"에게 메일을 전송합니다.");break;
			case "sendSMS":
				System.out.println(message.to+"에게 SMS를 전송합니다.");break;
			case "sendKakaotalk":
				System.out.println(message.to+"에게 카카오톡을 전송합니다.");break;
			}
		}
	}

}
