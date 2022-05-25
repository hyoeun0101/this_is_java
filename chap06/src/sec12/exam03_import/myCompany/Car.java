package sec12.exam03_import.myCompany;

import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyndai.Engine;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	//import 안할 시 패키지 다 써줘야험.
	sec12.exam03_import.hankook.Tire tire2 = new sec12.exam03_import.hankook.Tire();
	
	
	

}
