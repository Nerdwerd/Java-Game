package main;

import java.awt.*;

public class Main extends Canvas implements Runnable {

	private static final long serialVersionUID = 3196520274556633778L;

	public final int WIDTH = 400;
	public final int HEIGHT = 400;
	private Thread thread;
	private boolean running = false;
	
	public static void main(String[] args) {
		new Main();

	}
	
	public Main() {
		new Window(WIDTH, HEIGHT, "Epic Game", this);
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		
		
	}
	
}
