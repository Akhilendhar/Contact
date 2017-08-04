package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Create {
	public static final Map<ArrayList<Integer>, Contactdetails> mapobj = new LinkedHashMap<>();
	public static ArrayList<Integer> arrayobj;

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
		Integer id = null;
		int option = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean check = true;
			do {
				try {
					System.out.println("enter emp id");
					id = sc.nextInt();
					check = false;
				} catch (Exception e) {
					System.out.println("enter the valid data");
					sc.next();
					continue;
				}
			} while (check);
			System.out.println("enter the name");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("enter the email");
			String email = sc.next();
			email = checkEmail(email);
			boolean check1 = true;
			long phonenumber = 0;
			do {
				try {
					System.out.println("enter the phonenumber");
					phonenumber = sc.nextLong();
					check1 = false;
				} catch (Exception e) {
					System.out.println("enter the valid data");
					sc.next();
					continue;
				}
			} while (check1);
			System.out.println("enter the address");
			String address = sc.nextLine();
			address = sc.nextLine();
			arrayobj = new ArrayList<>();
			arrayobj.add(id);
			Contactdetails co = new Contactdetails(name, email, phonenumber, address);
			mapobj.put(arrayobj, co);
			System.out.println("do you want to add more contacts press 1");
			option = sc.nextInt();
			if (option != 1) {
				break;
			}
		}
		for (Entry<ArrayList<Integer>, Contactdetails> o : Create.mapobj.entrySet()) {
			ArrayList<Integer> key = o.getKey();
			Contactdetails cn = o.getValue();
			System.out.println(key.get(0) + "Details");
			System.out
					.println(cn.getName() + "---" + cn.getEmail() + "---" + cn.getAddress() + "---" + cn.getPhonenum());
		}
	}
}
