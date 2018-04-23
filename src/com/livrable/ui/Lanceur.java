package com.livrable.ui;

import com.livrable.impl.MyClass;
import com.livrable.impl.MySecondClass;

public class Lanceur {

	public static void main (String... Syrille) {
		// TODO Auto-generated method stub
		
		MyClass myClass = new MyClass();
		myClass.autrMethode();
		int result1 = myClass.laSomme(10, 15);
		System.out.println(result1);
		System.out.println(myClass.presentation());
		
		MySecondClass mySecondClass = new MySecondClass();
		mySecondClass.autrMethode();
		int result2 = mySecondClass.laSomme(15, 20);
		System.out.println(result2);
		System.out.println(mySecondClass.presentation());
		
	}

}
