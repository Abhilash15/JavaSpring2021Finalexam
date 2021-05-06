/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author S542295
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
    ArrayList<Employee> a=new ArrayList<Employee>();  
    a.add(new Employee(01,"Abi",20000));    
    a.add(new Employee(02,"Sanju",26000));
    a.add(new Employee(03,"Navve",98000));
    a.add(new Employee(04,"Hari",87000));
    a.add(new Employee(05,"Manu",50000));
    System.out.println("Question 12 : Abilash Dhumala");		
    System.out.println("The original lists is :");
        for(Employee st:a){ 
            System.out.println(st.toString()); 
	} 
    System.out.println("After the sorting with employee id :");
    Collections.sort(a);  
	for(Employee st:a){  
            System.out.println(st.toString());
	}  
    System.out.println("After sorting with salary :");
    Collections.sort(a,new Comparator<Employee>(){
    public int compare(Employee arg0, Employee arg1) {
    return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
	}
        });
    for(Employee st:a){  
	System.out.println(st.toString());
	}  
    System.out.println("After sorting with employee name :");
    Collections.sort(a,new Comparator<Employee>(){
    @Override
    public int compare(Employee S1, Employee S2) {
    return S1.getEmpName().compareTo(S2.getEmpName());
        }
        });
    for(Employee st:a){  
	System.out.println(st.toString());
	}  

    }

}


