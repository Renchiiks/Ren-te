
public class OperatorsMath {

	
	public static void main(String[] args) {
		double num1 = 0.4;
		double num2 = 0.3;
		double resultSum;
		double resultDestr;
		double resultMultipl;
		double resultSubst;
		char operatorsSum = '+';
		char operatorsDestr = '-';
		char operatorsMultipl = '*';
		char operatorsSubstr = '/';
	    
		resultSum = num1 + num2;
		resultDestr = num1 - num2;
		resultMultipl = num1 * num2;
		resultSubst = num1 / num2;
		System.out.println(num1 + " "+operatorsSum+" "+num2+" = "+resultSum);
		System.out.println();
		System.out.println(num1 + " "+operatorsDestr+" "+num2+" = "+resultDestr);
		System.out.println();
		System.out.println(num1 + " "+operatorsMultipl+num2+" = "+resultMultipl);
		System.out.println();
		System.out.println(num1 + " "+operatorsSubstr+num2+" = "+resultSubst);
		System.out.println();
		
		int a = 10;
		int b = 3;
		int x = a % b;
		System.out.println("x = "+x);
		
		int i = 5;
		i++;
		System.out.println(i);
		
		int k = 2;
		//return increment result
		int p = ++k;
		
		System.out.println("p after incriment: "+p);
		
		int o=2;
		int f = o++;
		
		System.out.println("f after incriment: "+f);
		
		
		
	

	}

}
