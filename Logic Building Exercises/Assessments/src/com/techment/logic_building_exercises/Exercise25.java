package com.techment.logic_building_exercises;

class Star extends Thread{
	public void run() {
	
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("*");
		}
	}
}

class Dollar extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("$");
		}
	}
}

public class Exercise25 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star star = new Star();
		Dollar dollar = new Dollar();
		star.start();
		dollar.start();
		
	}

}
