package Clases;

public class Consumidor extends Thread{
	int elem;
	Buffer buffer;
	
	Consumidor (Buffer b, int i) {
		buffer = b;
	}
	
	public void run () {
		try {
			elem = buffer.extraer();
		} catch (Exception e) {}
		return;
	}
}
