package Map;

import java.util.Objects;

public class Person {
	
	String name;
	int id;
	
	public Person(String name, int id) {
		this.name= name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person)obj;
		return id == other.getId() && Objects.equals(name, other.getName());
	}

	@Override
	public String toString() {
		
		return "id : "+id+", name : "+name;
	}
	
	

}
