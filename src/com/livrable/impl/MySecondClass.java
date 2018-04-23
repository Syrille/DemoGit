package com.livrable.impl;

import com.livrable.inter.AutreInterface;
import com.livrable.inter.MyInterface;

public class MySecondClass implements MyInterface, AutreInterface {
	
	
	@Override
	public int laSomme(int val1, int val2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String presentation() {
		// TODO Auto-generated method stub
		return MyInterface.super.presentation();
	}
		
	}



