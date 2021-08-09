package com.techment.logic_building_exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Question{
	private String ques;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	
	
	public Question(String ques, String opt1, String opt2, String opt3, String opt4, String ans) {
		super();
		this.ques = ques;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
	}


	@Override
	public String toString() {
		return "Question:\n" + ques + "\n(a)\t" + opt1 + "\n(b)\t" + opt2 + "\n(c)\t" + opt3 + "\n(d)\t" + opt4;
	}
	
	
	
	
	
}

class Quiz{
	HashMap<String , Question > mcqDB = new HashMap<>();
	
	public Question add(String id, Question q)
	{
		return mcqDB.put(id, q);
	}
	
	public void show(String id) {
		System.out.println(mcqDB.get(id));
	}
	
	public void check(String id) {
		Set<Entry<String, Question>> set = mcqDB.entrySet();
		Iterator<Entry<String, Question>> itr = set.iterator();
		
		while(itr.hasNext()) {
			
		}
	}
}

public class Exercise24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		Question q1 = new Question(" 1 + 1", "3", "4", "2", "1", "2");
		Question q2 = new Question(" 4 X 5", "9", "20", "6", "12", "20");
		Question q3 = new Question(" 5! ", "120", "5", "25", "50", "120");
		
//		System.out.println(q1.toString());
		
		quiz.add("1", q1);
		quiz.add("2", q2);
		quiz.add("3", q3);
		
		
	}

}
