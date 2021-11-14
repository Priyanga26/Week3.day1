package week3.day1;

public class SmartPhone extends AndriodPhone {

	public void connectWhatsapp() {
 System.out.println("Conncet Whatsapp");
	}
public void takeVideo() {
System.out.println("MethodOverriding_Takevideo");

	}
	
	public static void main(String[] args) {
		
		
		SmartPhone sp =new SmartPhone();
		
		sp.takeVideo();
		
	}
}
