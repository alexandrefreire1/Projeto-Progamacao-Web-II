package com.api.farmacia.singleton;

public class SingleObject {

	private static SingleObject instancia = new SingleObject();
	
	private SingleObject(){}
	
	public static SingleObject getInstancia() {
		return instancia;
	}
	
	public void showMessage() {
		System.out.println("Singleton - Design Pattern");
	}
}
