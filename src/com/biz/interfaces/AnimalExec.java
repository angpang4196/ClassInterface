package com.biz.interfaces;

public class AnimalExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		AnimalInterface tigerImp = new Tiger();
		AnimalInterface lionImp = new Lion();
		
		// ZooKeeper에 있는 food(Lion lion) method 호출
		zookeeper.food(lion);
		
		// ZooKeeper에 있는 food(Tiger tiger) method 호출
		zookeeper.food(tiger);
		
	}

}
