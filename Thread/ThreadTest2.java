class Gildong extends Thread {
	public Gildong() {
		// 3. run()메소드 호출 : 멤버간의 호출
		
		this.start(); // 부모 클래스가 아닌 현재 클래스의 run 실행
	}

	@Override
	public void run() {
		// 동시(기다리지않고) 실행할 문장
		System.out.println("길동 스레드 안의 run()");
	}

}// class Gildong

class Juwon implements Runnable {
	public Juwon() {
		// 4. run()메소드 호출 : 멤버간의 호출
		Thread t = new Thread(this);
		t.start();
		new Thread(this).start();
	}

	@Override
	public void run() {
		// 동시(기다리지않고) 실행할 문장
		System.out.println("주원 스레드 안의 run()");
	}

}// class Juwon

public class ThreadTest2 {

	public static void main(String[] args) {
		// 1. Gildong클래스에 있는 스레드 호출 (객체 먼저 생성해야한다.)
		// Gildong 클래스 == Thread 클래스이기 때문에
		Gildong g = new Gildong(); // Thread 객체 생성
		g.start(); // 시작
		// new Gildong().start();// 가능하다.

		// 2. Juwon클래스에 있는 스레드 호출 (객체 먼저 생성해야한다.)
		Juwon j = new Juwon(); // 스레드 객체가 아니고 Runnable 객체이다. ==> 역할: run 메소드의 위치 표한하는 인터페이스
		Thread t = new Thread(j); // 별도의 스레드 객체 생성이 필요하다.
		t.start();
		;// j에 정의되어있는 run() 메소드를 호출한다.
		// new Thread(j).start();// 가능하다.

	}

}