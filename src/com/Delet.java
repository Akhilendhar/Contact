package com;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Delet {
	public static void delete() {
		ArrayList<Integer> key = null;
		Contactdetails cn = null;
		boolean checkempty = Create.contactobject.isEmpty();
		if (checkempty == false) {
			System.out.println("which contact you wants to delete enter the name");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			for (Map.Entry<ArrayList<Integer>, Contactdetails> o : Create.contactobject.entrySet()) {
				key = o.getKey();
				cn = o.getValue();
				if (cn.getName().equals(name))
					break;
			}
			Create.contactobject.remove(key);
			if (Create.contactobject.isEmpty()) {
				System.out.println("object removed");
			} else {
				for (Map.Entry<ArrayList<Integer>, Contactdetails> contactiteraorobj : Create.contactobject
						.entrySet()) {
					Contactdetails contactprintobj = null;
					contactprintobj = contactiteraorobj.getValue();
					System.out.println("remaining details");
					System.out.println(contactprintobj.getName() + "---" + contactprintobj.getEmail() + "---"
							+ contactprintobj.getAddress() + "---" + contactprintobj.getPhonenum());
				}

			}
		} else {
			System.out.println("create the contact first");
		}
	}

}
