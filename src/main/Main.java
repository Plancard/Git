package main;

import calc.Calculator;

public class Main {

	public static void main(String[] args) {
		System.out.println("로컬 저장소 사용");
		
		System.out.println("원격 저장소 사용가능");
		
		System.out.println("코드 시작");
		
		System.out.println("코드 끝");
		

		System.out.println("새 코드 시작");
		System.out.println("끝");

		System.out.println("팀 코드");

		Calculator c = new Calculator();
		
		int addResult = c.add(5, 10);
		System.out.println(addResult);
		
		int subResult = c.subtract(10, 9);
		System.out.println(subResult);
		
		System.out.println("ㄴㄴ");
		
	}

}
