package LinkedList;

import java.util.Scanner;

public class SinglyLinkedListMainClass {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int count ;
		
		do {
			
			System.out.println("1. Display "+ "2.Add First"+ "3.Add Last");
			count = sc.nextInt();
		switch (count) {
		case 1:
			list.display();
			break;
	case 2:
			
			break;
	case 3:
		
		break;

		
		}}while(count != 0);

	}

}
