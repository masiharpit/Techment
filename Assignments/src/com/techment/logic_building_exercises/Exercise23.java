package com.techment.logic_building_exercises;

class BMI{
	float weight;
	float height;
	
	BMI(float w, float h){
		this.weight = w;
		this.height = h;
	}
	
	void calculateBMI() {
		float range = weight/(height*height);
		
		if(range < 18.5) {
			System.out.println("Underweight");
		}else if(range >= 18.5 && range <25) {
			System.out.println("Normal");
		}else if(range>=25 && range <30) {
			System.out.println("Overweight");
		}else {
			System.out.println("Obese");
		}
	}
	
}
public class Exercise23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI bmi1 = new BMI(70, 172);
		bmi1.calculateBMI();
	}

}
