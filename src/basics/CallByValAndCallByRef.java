package basics;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef call = new CallByValAndCallByRef();
		call.valueCall(10,20);
		
		call.p = 60;
		call.q = 50;
		
	}
	
	public int valueCall(int a, int b){
		int c = a + b;
		return c;
		
	}

}
