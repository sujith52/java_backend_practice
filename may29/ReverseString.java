package com.sujith;

public class ReverseString {
	public String reverseString(String str) {

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {

            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        return new String(charArray);
    }
    public static void main(String[] args) {

    	ReverseString obj = new ReverseString();

        String result = obj.reverseString("Java");

        System.out.println(result);
    }
}
