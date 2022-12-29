package com.mylearning.org;

public class AbstractClassImpl  extends AbstractScenario{

	public static void main(String[] args) {
		
		AbstractScenario as = new AbstractClassImpl();
		as.greeting();
		as.test();

	}

	@Override
	void test() {
		System.out.println("this is Test");
		
	}

}
