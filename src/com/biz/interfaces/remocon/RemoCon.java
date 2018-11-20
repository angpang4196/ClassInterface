package com.biz.interfaces.remocon;

/*
 *  인터페이스의 2번째 목적
 *  여러 팀원이 나누어서 프로젝트를 진행할 때 
 *  클래스 선언과 관련된 문서를 공유하지만 
 *  클래스를 작성하는 과정에서 일부 method를 
 *  누락시키는 경우가 많다.
 *  
 *  method가 누락되면 각 팀언이 작성한 파일(*.java)을 통합하여 
 *  테스트를 하는 과정에서 누락된 method때문에 오류가 발생한다.
 *  
 *  이 때 프로젝트가 시작되는 단계에서 코드는 없고 이름만 있는
 *  method들을 interface에 정리 해 두고 관련된 클래스를 만들 때
 *  이 interface를 implements 하면 자동으로 꼭 필요한 method들의 모형을 작성하도록 할 수 있다.
 *  
 *  interface = 클래스 선언 설계도
 */
public interface RemoCon {
	
	public void volUp();
	public void volDown();
	public void chUp();
	public void chDown();
	public void power();

}
