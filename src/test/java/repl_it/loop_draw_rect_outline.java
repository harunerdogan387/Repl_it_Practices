package repl_it;

import java.util.Scanner;

public class loop_draw_rect_outline {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String rect = "xxx\n";
   
    	for (int i=1; i <= n; i ++) {
    		rect +="x x\n";
    	}
    rect +="xxx";
    System.out.println(rect);
}
}