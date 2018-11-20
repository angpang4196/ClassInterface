package com.biz.interfaces.remocon;

/*
 * 프로젝트 지시서
 * 1. TvRCon클래스를 tvRCon 객체로 생성하라.
 * 2. tvRCon 객체에 있는 volUp(), volDown(), chUp(), chDown(), power() method를 사용해서 나머지 코드를 구현
 */
public class RemoconExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TvRCon tvRCon = new TvRCon();
		
		tvRCon.volUp();
		tvRCon.volDown();
		tvRCon.chUp();
		tvRCon.chDown();
		tvRCon.power();

	}

}
