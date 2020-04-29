package CoreConcept;

public class InheritanceTest {

	public static void main(String[] args) {

		//A a=new B();
	}

}

class AA{
private void getMSg(){
		System.out.println("private");
	}
}

class BB extends AA{
public void	getMSg(){
		System.out.println("public");
	}
}
