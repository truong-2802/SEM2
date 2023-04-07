package com.class02;

import java.util.Scanner;

public class Director extends Staff {
    int salary;

    @Override
    public void inputData() {
        System.out.print(" name: ");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.print(" email: ");
        this.email = input.nextLine();

        System.out.print("salary: ");
        this.salary = input.nextInt();

        System.out.println("Set name="+ this.name);
        System.out.println("Set email"+ this.email);
        System.out.println("Set salary"+this.salary);
        System.out.println("Set id"+this.id);

    }

    @Override
    public void display() {
        System.out.println("This is an Director");
        System.out.println("Id = "+this.id);
        System.out.println(" Name :"+this.name);
        System.out.println(" Email :"+this.email);
        System.out.println(" Salary :" + this.salary);
    }

    @Override
    public void updateData() {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter name:");
        this.name=input.nextLine();

        System.out.println("Enter email:");
        this.email=input.nextLine();

        System.out.println("Enter Salary:");
        this.salary=input.nextInt();

        System.out.println("name:"+ this.name);
        System.out.println("email:"+this.email);
        System.out.println("salary"+this.salary);
    }

    @Override
    public int getTotalBonusOfCompany() {
        return this.salary*2;
    }

    @Override
    public void updateNewSalary() {
        Scanner input=new Scanner(System.in);
        System.out.println("Update new salary:");
        salary=input.nextInt();
    }


}
