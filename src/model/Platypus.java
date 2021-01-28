package model;

//animal class by Jenni 

public class Platypus {
	private String name;
	private String color;
	private int age;
	

	public Platypus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Platypus (String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Platypus [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	public String speak() {
		return "*angry purr*";
	}
	
}
	
	

