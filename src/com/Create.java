package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Create {
	public static final Map<ArrayList<Integer>, Contactdetails> contactobject = new LinkedHashMap<>();
	public static ArrayList<Integer> keyobject;

	public static String checkEmail(String email) {
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
		} else {
			System.out.println("invalid email id");
			System.out.println("enter a valid email");
			String mail = new Scanner(System.in).next();
			checkEmail(mail);
		}
		return email;
	}

	public static void create() {
		Integer empid = null;
		int option = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean check = true;
			do {
				try {
					System.out.println("enter emp id");
					empid = sc.nextInt();
					check = false;
				} catch (Exception e) {
					System.out.println("enter the valid data");
					sc.next();
					continue;
				}
			} while (check);
			System.out.println("enter the name");
			String empname = sc.nextLine();
			empname = sc.nextLine();
			System.out.println("enter the email");
			String empemail = sc.next();
			empemail = checkEmail(empemail);
			boolean check1 = true;
			long empphonenumber = 0;
			do {
				try {
					System.out.println("enter the phonenumber");
					empphonenumber = sc.nextLong();
					check1 = false;
				} catch (Exception e) {
					System.out.println("enter the valid data");
					sc.next();
					continue;
				}
			} while (check1);
			System.out.println("enter the address");
			String empaddress = sc.nextLine();
			empaddress = sc.nextLine();
			keyobject = new ArrayList<>();
			keyobject.add(empid);
			Contactdetails co = new Contactdetails(empname, empemail, empphonenumber, empaddress);
			contactobject.put(keyobject, co);
			System.out.println("do you want to add more contacts press 1");
			option = sc.nextInt();
			if (option != 1) {
				break;
			}
		}
		for (Entry<ArrayList<Integer>, Contactdetails> contactobjiterator : Create.contactobject.entrySet()) {
			ArrayList<Integer> key = contactobjiterator.getKey();
			Contactdetails contactprintobj = contactobjiterator.getValue();
			System.out.println(key.get(0) + "Details");
			System.out.println(contactprintobj.getName() + "---" + contactprintobj.getEmail() + "---"
					+ contactprintobj.getAddress() + "---" + contactprintobj.getPhonenum());
		}
	}
}
