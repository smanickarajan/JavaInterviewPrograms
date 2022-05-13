package abstractclassconcepts;

public class MainClass {

	public static void main(String[] args) {
		childclass obj1 = new childclass();
		System.out.println(obj1.num);
		obj1.show();
		obj1.display();
		obj1.Read();

		childclass2 obj2 = new childclass2();
		System.out.println(obj2.num);
		obj2.show();
		obj2.display();
		obj2.Read();
		obj2.write();
		obj2.learn();

		AbstractConcept obj3 = new childclass();
		obj3.display();
		obj3.show();

		AbstractConcept obj4 = new childclass2();
		obj4.display();
		obj4.show();
		obj4.Read();
		ParentClass obj5 = new childclass2();
		obj5.learn();
		obj2.sing();
	}

}
