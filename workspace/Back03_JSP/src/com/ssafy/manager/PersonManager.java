package com.ssafy.manager;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.dto.Person;

public class PersonManager {
	private List<Person> list = new ArrayList<Person>();
	
	// 싱글턴 패턴을 이용해 manager 만들고 쓸 수 있도록 했다
	private static PersonManager manager = new PersonManager();

	public PersonManager() {
	}
	
	public static PersonManager getInstance() {
		return manager;
	}
	
	// 등록
	public void regist(Person p) {
		list.add(p);
	}
	
	// 리스트 반환. 리스트의 getter
	public List<Person> getList(){
		return list;
	}

}
