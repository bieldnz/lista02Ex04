package view;
import controller.ControllerFat;;

public class Principal {
	 public static void main(String[] args) {
		 
		 ControllerFat controller =  new ControllerFat();
		 
		 int result = controller.fat(3);
		 
		 System.out.println(result);
		 
	 }
}
