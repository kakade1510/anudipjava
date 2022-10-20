package MutiThread.com;

class MyThread extends Thread{
	Friendship frd;
	String friendsName; 
	//@override 
		public void run() {
			frd.classroom(friendsName);
			
		}
		MyThread (Friendship frd, String friendsName){
			this.frd=frd;
			this.friendsName=friendsName;
		}
}


