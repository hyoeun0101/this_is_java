package sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			
			fis.read();
			throw new Exception();
		}catch(Exception e){
			System.out.println("抗寇 贸府 内靛 角青.");
		}
	}
}
