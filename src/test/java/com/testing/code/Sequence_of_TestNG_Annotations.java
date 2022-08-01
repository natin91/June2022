package com.testing.code;

import org.testng.annotations.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence_of_TestNG_Annotations {
	
@BeforeSuite
public void BeforeSuiteTest() {
System.out.println("This is BeforeSuite Annotation");
}


@BeforeTest
public void BeforeTestTest() {
	System.out.println("This is BeforeTest Annotation");
}

@BeforeClass
public void BeforeClassTest() {
	System.out.println("This is BeforeClass Annotation");
}
@BeforeMethod
public void BeforeMethodTest() {
	System.out.println("This is BeforeMethod Annotation");
}
@Test
public void checkTest() {
	System.out.println("This is my Test case");
}
@AfterMethod
public void AfterMethodTest() {
	System.out.println("This is AfterMethod Annotation ");
}
@AfterClass
public void AfterClassTest() {
	System.out.println("This is AfterClass Annotation");
}
@AfterClass
public void AfterTestTest () {
	System.out.println("This is AfterTest Annotation");
}

}

	




