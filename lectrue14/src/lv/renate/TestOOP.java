package lv.renate;

import lv.renate.reapeatjavaClass.*;

public class TestOOP {
	
	
	public static void main(String[] args){
		
		MyClass newObj = new MyClass();
		MyClass newObj2 = new MyClass();
		String strObj = "hello";
		String strObj2 = "hello";
		
		System.out.println(newObj.equals(newObj2));
		System.out.println(strObj.equals(strObj2));
		
		
		System.out.println(newObj.x);
		
		//MyClassMethods myObjMethod = new MyClassMethods();
		//myObjMethod.myMethod();
//		myObjMethod.myStringMethod();
//		System.out.println(myObjMethod.myStringMethod());
		MyClassMethods myObjMethod = new MyClassMethods();
		double numberDouble = 0;
		numberDouble = myObjMethod.returnDouble();
		System.out.println(numberDouble);
		
		System.out.println(myObjMethod.returnChar(20, 100));
		
		MyClassConstructor myConstructorObj1 = new MyClassConstructor(1993L, "E46");
		MyClassConstructor myConstructorObj2 = new MyClassConstructor(1893L, "E46");
		MyClassConstructor myConstructorObj3 = new MyClassConstructor(1863L, "E46");
		MyClassConstructor myConstructorObj4 = new MyClassConstructor(1893L, "E46");
		
		
		System.out.println(myConstructorObj1.getModelName().equals(myConstructorObj4.getModelName()));
		
		EncapsClass objEncaps = new EncapsClass();
		System.out.println(objEncaps.getUser());
		objEncaps.setUser("Renate");
		System.out.println(objEncaps.getUser());
		
		ImplemantInteface objInteface = new ImplemantInteface();
		objInteface.sendEmail();
		System.out.println(objInteface.sendEmailCount());
		System.out.println(objInteface.sendEmailCount());
		
		MyEnums status = MyEnums.HIGH;
		
		System.out.println("This object is to " + status);
		System.out.println(MyEnums.LOW);
		
		switch(status){
		case LOW:
			System.out.println("Low status");
			break;
		case MEDIUM:
			System.out.println("Medium status");
			break;
		case HIGH:
			System.out.println("High status");
			break;
		default:
			System.out.println("No status");
		}
		
		String numberStr = "456";
		int numberInt = Integer.parseInt(numberStr);
		int result = 30 + numberInt;
		System.out.println(numberInt);
		System.out.println(result);
		
		
		String numberStrValue = "20";
		Integer valueInt = Integer.valueOf(numberStrValue);
		System.out.println(valueInt);
		
		
		
		ClassExtendsAbstractClass objAbstractClass = new ClassExtendsAbstractClass();
		objAbstractClass.sleep();
		objAbstractClass.abstractMethod();
		
		
		
		
	
	}

}
