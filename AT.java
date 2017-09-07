interface IAT {

}

class Unknown implements IAT{
	Unknown(){};
}

class People implements IAT{
	String child;
	IAT mom;
	IAT dad;
	
	People(String child, IAT mom, IAT dad) {
		this.child = child;
		this.mom = mom;
		this.dad = dad;
	}
}

class ExamplesIAT{
	ExamplesIAT() {};
	
	IAT unknown = new Unknown();
	
	IAT jane = new People("Jane", this.unknown, this.unknown);
	IAT tim = new People("Tim", this.unknown, this.unknown);
	IAT kim = new People("Kim", this.jane, this.tim);
	IAT pat = new People("Pat", this.unknown, this.unknown);
	IAT dan = new People("Dan", this.kim, this.pat);
	
}