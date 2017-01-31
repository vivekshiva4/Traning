package cn;

import cn.EnumClass.day;

public class Test {

	public static void main(String[] args) {
		System.out.println("Days in a Week are  ");
		for(day d:day.values()){
			
			System.out.println(d);
			
			day d1=day.Monday;
			System.out.println(d1);
		}
	}

}
