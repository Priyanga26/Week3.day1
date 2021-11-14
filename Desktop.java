package org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	
	{

		System.out.println("Single Inheritance _Desktopsize");
	}

	public static void main(String[] args) {

		Desktop Desk =new Desktop();
		Desk.computerModel();
		Desk.desktopSize();
		
		
	}

}
