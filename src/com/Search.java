package com;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Search {
	public static void serach() {
		int count = 0;
		boolean checkempty = Create.mapobj.isEmpty();
		if (checkempty == false) {
			System.out.println("enter the name to be searched");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			for (Map.Entry<ArrayList<Integer>, Contactdetails> o : Create.mapobj.entrySet()) {
				ArrayList<Integer> key = o.getKey();
				Contactdetails cn = o.getValue();
				if (cn.getName().equals(name)) {
					count++;
					System.out.println(key.get(0) + "Details");
					System.out.println(
							cn.getName() + "---" + cn.getEmail() + "---" + cn.getAddress() + "---" + cn.getPhonenum());
				}
			}
			if (count == 0) {
				System.out.println("contact not found");
			}
		} else {
			System.out.println("create the contact first");
		}
	}
}
