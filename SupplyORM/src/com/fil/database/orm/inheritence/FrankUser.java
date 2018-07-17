package com.fil.database.orm.inheritence;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FrankUser extends User {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
