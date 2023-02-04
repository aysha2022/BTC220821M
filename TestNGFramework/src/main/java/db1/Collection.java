package db1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Collection {
	WebDriver dr;
	 ArrayList m1() {
		
	
	ArrayList ar=new ArrayList();
	ArrayList ar1= new ArrayList();
	ar.add (7);
	ar.add(7);
	ar.add(9);
	ar.add(19);
	ar.get(2);
	Iterator i=ar.iterator();
	while(i.hasNext()) {
		i.next();
	}
	return ar;

	}
	 ArrayList<String> actvalue(List<WebElement> elements,String attribute){
		 ArrayList<String> ar= new ArrayList<String>();
		 for(WebElement ele:elements) {
			 ar.add((ele.getAttribute("Attribute name")));
		 }return ar;
		 
	 }
	 
	ArrayList<String> expectedvalue(String[] ele) {
		ArrayList<String> a= new ArrayList<String>();
		for(String x:a) {
			a.add(x);
			
		}return a;
		 
	 }
	void compare(ArrayList<String> ar,ArrayList<String>a ) {
		Iterator i=ar.iterator();
		Iterator i2= a.iterator();
		while(i.hasNext()&&i2.hasNext()) {
			if(i.next().equals(i2.next())){
				System.out.println("passed");
			}
			else {
				System.out.println("not passed");
			}
		}
		
	}
@Test
public void test(String[] e) {
	ArrayList a=actvalue(dr.findElements(By.xpath("")),"id");
	String[]s= {"123","123"};
	
	
	ArrayList ae =expectedvalue(e);
	
	compare(a,ae);
		
	
		
	}
Vector v;
@Test
 class A{
	 public void A1() {
		 
	 
	 ArrayList a =new ArrayList();
	 a.add ("Chicken");
	 a.add ("cat");
	 a.add ("dog");
	 Collections.sort(a, new B());
	 
	 int x[]= {2,2,3,2,5,4,7};
	 HashSet h= new HashSet();
	 h.add(7);
	 	 }
}
 
 class B  implements Comparator{
	
		 
	 public int compare(Object o,Object o1) {
		if (o.toString().length()>o1.toString().length()) {
			return 1;
		}
		else if (o.toString().length()<o1.toString().length()) {
			return -1;
		}
		return 0;
	}
 }
}

	 
	 
	 
	 
	 
	 
	 
	 

