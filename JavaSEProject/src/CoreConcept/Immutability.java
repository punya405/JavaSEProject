package CoreConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Immutability {
	private final int a;
	private final String s;
	
	private final Address add;
	
	
	
	public Immutability(int a, String s,Address add) {
		super();
		this.a = a;
		this.s = s;
		//this.add=new Address(add.add);
		this.add=add;
	}



	public int getA() {
		return a;
	}



	public String getS() {
		return s;
	}



	public Address getAdd() {
		return add;
	}



	public static void main(String[] args) {
		Address ad=new Address("bbsr");
		Immutability im=new Immutability(2, "punyasloka",ad);
		//im.a=8;
		//im.add=new Address("blore");
		ad.add="blore";
		System.out.println(im.add.add);
		//im.a=19;
		//im.s="sjshj";
		int a[]= {1,2,4,3,5};
	rotateArray(a);	
	System.out.println(Arrays.toString(a));
	
	employeeSortByName();
	}



	private static void employeeSortByName() {
		
	List<Employee> empLst=	Arrays.asList(new Employee("punyasloka", "12345"),new Employee("Diha", "34352"),new Employee("buban", "8976"));
		
	Map<Employee,Integer> map=new HashMap<Employee,Integer>();
	
	for(Employee emp:empLst) {
		map.put(emp, Integer.parseInt(emp.getId()));
	}
	
	List<Map.Entry<Employee, Integer>> entSet=new ArrayList<Map.Entry<Employee, Integer>>(map.entrySet());
	
	Collections.sort(entSet,(e1,e2)->{
		return e1.getValue().compareTo(e2.getValue());
	});
	
	entSet.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	}



	private static void rotateArray(int[] a) {

		int temp=a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}
	
	
	

}

class Address{
	String add;
	
	Address(String add){
		this.add=add;
	}

	public String getAdd() {
		return add;
	}
	
}

class Employee{
	String name;
	String id;
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
