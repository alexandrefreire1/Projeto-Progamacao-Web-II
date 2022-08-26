package com.api.farmacia.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject objeto = SingleObject.getInstancia();
		
		objeto.showMessage();
	}
}
