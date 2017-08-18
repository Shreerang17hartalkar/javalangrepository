package com.cic;

final class CustomImmutable
{
	private int i;

	 CustomImmutable(int i) {
		this.i = i;
	}
	 
	 public CustomImmutable modify(int i)
	 {
		 if(this.i==i)
		 {
			 return this;
		 }
		 else
		 {
			 return new CustomImmutable(i); //create CustomImmutable obj with that value
		 }
			 
	 }
	 public static void main(String[] args) {
		CustomImmutable ci = new CustomImmutable(10);
		CustomImmutable ci1 = ci.modify(100);
		CustomImmutable ci2 = ci.modify(10);
		System.out.println(ci==ci1);//false
		System.out.println(ci==ci2);//true
		System.out.println("This is our Immutable class");
		System.out.println("Using final class");
		
	}
	

}

