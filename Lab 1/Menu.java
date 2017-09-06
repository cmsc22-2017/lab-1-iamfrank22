interface Menu {}

class Soup implements Menu{
	Information info;
	boolean isVegetarian;
	
	Soup(Information info, boolean isVegetarian) {
		this.info = info;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements Menu{
	Information info;
	boolean isVegetarian;
	String dressing;
	
	Salad(Information info, boolean isVegetarian, String dressing) {
		this.info = info;
		this.isVegetarian = isVegetarian;
		this.dressing = dressing;
	}
} 

class Sandwich implements Menu{
	Information info;
	String bread;
	Filling filling;
	
	Sandwich(Information info, String bread, Filling filling) {
		this.info = info;
		this.bread = bread;
		this.filling = filling;
	}
}

class Information{
	String name;
	int price;
	
	Information(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class Filling {
	String a;
	String b;
	
	Filling(String a, String b) {
		this.a = a;
		this.b = b;
	}
}

class ExamplesMenu {
	ExamplesMenu(){};
	
	Information a1 = new Information("Corn Soup", 90);
	Information a2 = new Information("Veggie Salad", 150);
	Information a3 = new Information("Tuna Sandwich", 50);
	
	Filling f1 = new Filling("Ham", "Cheese");
	Filling f2 = new Filling("Peanut Butter", "Jelly");
	
	Menu soup = new Soup(this.a1, false);
	Menu salad = new Salad(this.a2, true, "Mayonnaise");
	Menu sandwich = new Sandwich(this.a3, "Elorde", f2);
}