
public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a1 = 'A';
		char a2 = 65;
		int i1 = 5, i2 = 10;
		boolean res1 = (i1==i2)&&(a1==a2);
		System.out.println(res1);
		
		boolean res3 = (a1==a2)|| (i1==i2);
		System.out.println(res3);
		
		boolean flag =true;
		flag = !!!!flag;
		System.out.println(flag);
		
	
		//Task
		
		double d1 = 20;
		double d2 = 80;
		double res11 = 20+80;
		double res12 = res11*25;
		int remainder =(int) res11%40;
		System.out.println("remainder is "+remainder+" and it is "+ (remainder<=20));
		
		
		
	}

}
