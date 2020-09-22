package in.java8;

import java.util.Arrays;

public class StreamFilterBasic {
	public static void main(String[] args) {
		String[] elements = {"banana","apple","papaya","orange","kiwi","grapes","watermelon","musk melon","pineapple","mango"};
		Arrays.asList(elements).stream().filter(e->e.length()>6).forEach(System.out::println);
	}

}
