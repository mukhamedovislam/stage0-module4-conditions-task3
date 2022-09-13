package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
	        double taxes = 0;
    if(salary <= 10000 && salary > 0){
      taxes = (double) salary * 0.15;
      System.out.println(salary - taxes);
    } else if (10000 < salary && salary <= 20000){
      taxes = (double) salary * 0.18;
      System.out.println(salary - taxes);
    } else if (salary > 20000){
      taxes = (double) salary * 0.2;
      System.out.println(salary - taxes);
    } else if (salary < 0){
      System.out.println("wrong input!");
    }
    }
}
