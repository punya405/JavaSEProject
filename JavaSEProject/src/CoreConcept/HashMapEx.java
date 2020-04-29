package CoreConcept;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		 HashMap<Student, String> map = new HashMap<>(); 
		  
	        Student one = new Student(1, "Geeks1"); // key1 
	  
	        Student two = new Student(1, "Geeks2"); //	 key2 
	        
	  
	        // put keys in map 
	        map.put(one, one.getname()); 
	        map.put(two, two.getname()); 
	        System.out.println(map.size());
	}

}

class Student{
	
	private int rollno; 
    private String name; 

    // Constructor 
    public Student(int rollno, String name) 
    { 
        this.rollno = rollno; 
        this.name = name; 
    } 

    public String getname() 
    { 
        return this.name; 
    } 

    public int getmarks() 
    { 
        return this.rollno; 
    } 

    public void setname(String name) 
    { 
        this.name = name; 
    } 

    public void setmarks(int rollno) 
    { 
        this.rollno = rollno; 
    } 

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	} 

    // Equal objects must produce the same 
    // hash code as long as they are equal 
   
}
