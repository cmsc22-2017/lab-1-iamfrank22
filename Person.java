class Person {
	String name;
	int age;
	String gender;
	Address address;
	
	Person(String name, int age, String gender, Address address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}

class Address {
	String city;
	String state;
	
	Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
}

class ExamplesPerson {
	ExamplesPerson(){};
	
	Address add1 = new Address("Boston", "MA");
	Address add2 = new Address("Warwick", "RI");
	Address add3 = new Address("Nashua", "NH");
	Address add4 = new Address("Cebu City", "CEBU");
	Address add5 = new Address("Tacloban", "LEYTE");

	Person t = new Person("Tim", 20, "M", add2);
	Person p = new Person("Pat", 19, "F", add1);
	Person k = new Person("Kim", 17, "F", add1);
	Person d = new Person("Dan", 22, "M", add3);
	Person r = new Person("Roldan", 21, "M", add4);
	Person f = new Person("Frank", 12, "M", add5);

}
