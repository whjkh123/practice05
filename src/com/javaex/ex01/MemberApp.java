package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member user01 = new Member();
		Member user02 = new Member();
		Member user03 = new Member();

		user01.setId("jws");
		user02.setId("yjs");
		user03.setId("lhr");

		user01.setName("정우성");
		user02.setName("유재석");
		user03.setName("이효리");

		user01.setPoint(50000);
		user02.setPoint(30000);
		user03.setPoint(40000);

		user01.showInfo();
		user02.showInfo();
		user03.showInfo();

	}

}
