package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import assignment7.Student;

public class UniversityDatabase {
	private final Map <String, Student> UD;
	//TODO: Complete this class according to the studio instructions

	public void addStudent(String accountName, Student student) {
		UD.putIfAbsent(accountName, student);
	}

	public UniversityDatabase() {

		UD =new HashMap<String, Student>();
	}

	public int getStudentCount() {
		
		return UD.size();
	}

	public String lookupFullName(String accountName) {
		if(accountName == null) {
			return null;
		}
		else if (UD.get(accountName)==null) {
			return null;
		}
		else {
			return UD.get(accountName).getFullName();
		}
		
		
	}

	public double getTotalBearBucks() {
		double t=0;
		for (Entry<String, Student> name:UD.entrySet()) {
			t+=name.getValue().getBearBucksBalance();
		}
		
		return t;	
	}
}
