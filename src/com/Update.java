package com;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Update {
	@SuppressWarnings("null")
	public static void update() {
		long newphonenumber = 0;
		int option = 0;
		String newValue = null;
		String name = null;
		String name1 = null;
		String email = null;
		String address = null;
		long phonenumber;
		boolean checkempty = Create.contactobject.isEmpty();
		if (!checkempty) {
			while (true) {
				System.out.println("which field you wanna update 1. name, 2. email 3. phonenumber 4. address");
				Scanner sc = new Scanner(System.in);
				int field = sc.nextInt();
				System.out.println("enter the name");
				name = sc.next();
				System.out.println("enter the value for your field");
				newValue = sc.next();
				for (Map.Entry<ArrayList<Integer>, Contactdetails> iterateobj : Create.contactobject.entrySet()) {
					Contactdetails cn = iterateobj.getValue();
					ArrayList<Integer> key = iterateobj.getKey();
					if (cn.getName().equals(name)) {
						name1 = iterateobj.getValue().getName();
						email = iterateobj.getValue().getEmail();
						phonenumber = iterateobj.getValue().getPhonenum();
						address = iterateobj.getValue().getAddress();
						if (field == 1) {
							Create.contactobject.put(key, new Contactdetails(newValue, email, phonenumber, address));
						} else if (field == 2) {
							Create.contactobject.put(key, new Contactdetails(name1, newValue, phonenumber, address));
						} else if (field == 3) {
							newphonenumber = Long.parseLong(newValue);
							Create.contactobject.put(key, new Contactdetails(name1, email, newphonenumber, address));
						} else if (field == 4) {
							Create.contactobject.put(key, new Contactdetails(name1, email, phonenumber, newValue));
						} else {
							System.out.println("sorry wrong details...........");

						}
						System.out.println("do you want to continue..press 1");
						option = sc.nextInt();
						if (option != 1)
							break;
					}
				}
				if (option != 1) {
					break;
				}
			}
			System.out.println("after update");
			for (Map.Entry<ArrayList<Integer>, Contactdetails> o : Create.contactobject.entrySet()) {
				ArrayList<Integer> key = o.getKey();
				Contactdetails cn = o.getValue();
				System.out.println(key.get(0) + "Details");
				System.out.println(
						cn.getName() + "---" + cn.getEmail() + "---" + cn.getAddress() + "---" + cn.getPhonenum());

			}
		} else {
			System.out.println("create the contact first");
		}
	}

}
