package com.infinite.collections;

//generics only support the classes wrapper classes not primitive data type
class Container<T>{
	T value;
	void show() {
		System.out.println(value.getClass().getName());
	}
}

class Container2<T extends Number>{
	T value;
	void show() {
		System.out.println(value.getClass().getName());
	}
}
public class Generics {
public static void main(String[] args) {
	Container<Integer> obj= new Container<>();
	Container2<Number> obj1=new Container2<>();
	obj.value=10;
	//obj.value=20.2;
	//obj1.value=20;
	obj1.value=20.2;
	obj.show();
	obj1.show();
	
}
}
