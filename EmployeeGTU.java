/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.pkg03_vivek;

/**
 *
 * @author student
 */
public class EmployeeGTU {
    
    public static void main(String args[]){
      
        Employee eob1=new Employee();
        Employee eob2=new Employee();
        
        eob1.setId("0010");
        eob1.setName("Vivek");
        eob1.setMonthly_Salary(100);
        eob2.setId("0011");
        eob2.setName("Vishal");
        eob2.setMonthly_Salary(101);
        
        eob1.displayEmployee();
        eob2.displayEmployee();
        
        System.out.println("Yearly salary of emoloyee 1: "+(eob1.getMonthly_Salary()*12));
        System.out.println("Yearly salary of emoloyee 2: "+(eob2.getMonthly_Salary()*12));
        System.out.println("Yearly salary of emoloyee 1 with increment: "+(eob1.getMonthly_Salary()*12*1.1));
        System.out.println("Yearly salary of emoloyee 2 with increment: "+(eob2.getMonthly_Salary()*12*1.1));
    }
}


class Employee{
    String id;
    String name;
    double monthly_salary;
    
    Employee(){
        id=null;
        name=null;
        monthly_salary=0.0;
    }
    
    void setId(String id){
        this.id=id;
    }
    
    void setName(String name){
        this.name=name;
    }
    
    void setMonthly_Salary(double monthly_salary){
        this.monthly_salary=monthly_salary;
    }
    
    String getId(){
        return id;
    }
    
    String getName(){
        return name;
    }
    
    double getMonthly_Salary(){
        return monthly_salary;
    }
    
    void displayEmployee(){
        System.out.println("Employee id= "+id);
        System.out.println("Employee name= "+name);
        System.out.println("Employee monthly salary= "+monthly_salary);
        System.out.println("---------------------------------------------------------------------------------");
    }
}
