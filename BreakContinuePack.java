package packsome;

public class BreakContinuePack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =1;
		System.out.println("Out side for");
		for(i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i==50) {
				break;
			}
//			System.out.println(i);
			
			
			
			for(int j =1; j <= 10; j++) {
				if(j == 5) {
					continue;
				}else {
					System.out.println(j);
				}
			}
		}

	}

}
