package collection28_april;
class person
{
	String pname;
	int age;
	public person(String pname, int age) {
		super();
		this.pname = pname;
		this.age = age;
	}
	@Override
	public String toString() {
		return " person [pname=" + pname + ", age=" + age + "]";
	}
	 
	
}