package test;

/*
 * 2013/10/28
 * 
 * 這個範例是安全的Thread
 * 注意！這是存取pure object的範例
 * 
 * */

public class SafedThread {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = new Runnable(){
			public void run(){
				pjo.getInstance().addArr("thread" + System.currentTimeMillis());
			}
		};
		
		
		for(int i=0; i<100; i++){
			Thread t = new Thread(runnable);
			if(i==10){
				t.sleep(1000);
			}
			t.start();
		}
				
	}

	

}