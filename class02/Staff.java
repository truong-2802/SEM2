package com.class02;

public abstract class Staff {
    String name;
    String email;
    int salary;
    int id;

    public  void  setSalary(int sal){
        this.salary=sal;
    }

    public abstract void inputData();
    public abstract void display();
    public abstract void updateData();
    public int  getId(){return this.id;}
    public void setId(int id){this.id=id;}
    public  abstract  int getTotalBonusOfCompany();
    public abstract void  updateNewSalary();

}
