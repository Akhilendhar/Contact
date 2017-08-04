package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			System.out.println("select the option");
			System.out.println("1. create ");
			System.out.println("2. update");
			System.out.println("3. search");
			System.out.println("4. delete");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				Create.create();
				break;
			case 2:
				Update.update();
				break;
			case 3:
				Search.serach();
				break;
			case 4:
				Delet.delete();
				break;

			default:
				System.exit(0);
			}
		}

	}
}
