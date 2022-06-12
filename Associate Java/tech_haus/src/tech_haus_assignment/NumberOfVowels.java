package tech_haus_assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfVowels {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words you want to enter");
		int N = scan.nextInt();
		String str[] = new String[N];
		for (int i = 0; i<N; i++) {
			str[i]=scan.next();
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < str.length; i++) {
			Pattern p = Pattern.compile("[aeiou]");
			Matcher m = p.matcher(str[i].toLowerCase());
			int count=0;
			while(m.find()) {
				count++;
			}
			map.put(str[i], count);
		}
		Collection<Integer> set = map.values();
		int n = set.stream().max((i,j)->i.compareTo(j)).get();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(n==entry.getValue()) {
				System.out.println(entry.getKey());
			}
			
		}
		
	
	
}
}