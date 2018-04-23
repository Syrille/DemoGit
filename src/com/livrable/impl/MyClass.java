package com.livrable.impl;

import com.livrable.inter.AutreInterface;
import com.livrable.inter.MyInterface;

public class MyClass implements MyInterface, AutreInterface  {

	@Override
	public int laSomme(int val1, int val2) {
		// TODO Auto-generated method stub
		return val1+val2;
	}
	@Override
	public String presentation() {
		// TODO Auto-generated method stub
		return "Je viens de la classe : MyClass";
	}
	

}
