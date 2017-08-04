package com;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Delet {
	public static void delete() {
		ArrayList<Integer> key = null;
		Contactdetails cn = null;
		boolean checkempty = Create.mapobj.isEmpty();
		if (checkempty == false) {
			System.out.println("which contact you wants to delete enter the name");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			for (Map.Entry<ArrayList<Integer>, Contactdetails> o : Create.mapobj.entrySet()) {
				key = o.getKey();
				cn = o.getValue();
				if (cn.getName().equals(name))
					break;
			}
			Create.mapobj.remove(key);
			if (Create.mapobj.isEmpty()) {
				System.out.println("object removed");
			} else {
				for (Map.Entry<ArrayList<Integer>, Contactdetails> o : Create.mapobj.entrySet()) {
					Contactdetails ch = null;
					ch = o.getValue();

					System.out.println("remaining details");
					System.out.println(
							ch.getName() + "---" + ch.getEmail() + "---" + ch.getAddress() + "---" + ch.getPhonenum());
				}

			}
		} else {
			System.out.println("create the contact first");
		}
	}

}
