package controller;

public class ControllerFat {
	public ControllerFat() {
		super();
	}
	
	public int fat(int n1) {
		if(n1>1) {
			int result = n1 * fat(n1 - 2);
			return result;
		}
		else {
			return 1;
		}
	}
	
}
