package com.cybertek.package1;

//import com.cybertek.package2.*;
//import com.cybertek.package2.Class2;

public class Class1 {

	public static void main(String[] args) {
		
		// There 3 ways to access package from outside the package
		//1st one is import package.*
		//2nd one is import package.className
		//3rd one is fully qualified name

		com.cybertek.package2.Class2 c1 = new com.cybertek.package2.Class2(); //this is not efficient way.
		
	}

}
