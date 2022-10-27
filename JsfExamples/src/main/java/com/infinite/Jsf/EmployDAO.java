package com.infinite.Jsf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable{
	public List<Employ> showEmploy(){
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "sravani", "java", "Developer",85422.22));
		employList.add(new Employ(2, "siri", "java", "Expert",85422.22));
		employList.add(new Employ(3, "Hari", "java", "programmer",85422.22));
		employList.add(new Employ(4, "santhi", "java", "Tester",85422.22));
		employList.add(new Employ(5, "sai", "java", "Manager",85422.22));
		return employList;

	}

}
