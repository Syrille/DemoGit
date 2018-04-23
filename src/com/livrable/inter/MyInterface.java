package com.livrable.inter;

public interface MyInterface {
	
	public int laSomme(int val1, int val2);
	
	public default String presentation() {
		return "Je viens de l'interface : MyInterface";
		
	}

}
