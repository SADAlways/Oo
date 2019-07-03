package design.Stabuck;

import java.util.ArrayList;

/**
 * @author ming
 * @date 2019/7/2--2019
 */
public class HelloWord {
	public static final int ONE = 1;
	public void testyou(){

	}
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println();
		System.out.println("args = [" + args + "]");
		System.out.println("HelloWord.main");
		System.out.println("HelloWord.main");
		System.out.println("");
		String[] arr = {"ada","dad","adas"};
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (String s : arr) {
			System.out.println(s);
		}
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
		}
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (Object o : list) {

		}
		for (int i = 0; i < list.size(); i++) {
			
		}
		for (int i = list.size() - 1; i >= 0; i--) {

		}
		if (list == null) {

		}
		if (list != null) {

		}
		if (list != null) {

		}
		if (list == null) {

		}

	}
}
