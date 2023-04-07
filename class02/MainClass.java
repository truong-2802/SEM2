package com.class02;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class MainClass {
    public static void main(String[] args) {
        CompanyManagement companyManagement=new CompanyManagement();
        do{
            System.out.println("1.Add New Person");
            System.out.println("2.Display All");
            System.out.println("3.Find Person By Id");
            System.out.println("4. Update Person");
            System.out.println("5. Get Total Bonus Of Company");
            System.out.println("6.Update New Salary");
            System.out.println("Choose menu");
            Scanner input= new Scanner(System.in);
            int choose= input.nextInt();
            switch (choose){
                case 1: {
                    companyManagement.addNewPerson();
                }
                break;
                case 2:{
                    companyManagement.displayAll();
                }
                break;
                case 3:{
                    Staff s= companyManagement.findShapeById();
                    if(s!=null){
                        System.out.println("found");
                    }else {
                        System.out.println("not found");
                    }
                }
                break;
                case 4:{
                    companyManagement.updateStaff();
                }
                case 5:{
//                    int total=0;
//                    for (Staff item: companyManagement.list){
//                        item.display();
//                        System.out.println("Bonus"+ item.getTotalBonusOfCompany());
//                        total += item.getBonus();
//                    }
//                    System.out.println(" Company bonus:"+ total);
                    companyManagement.getTotalBonusOfCompany();
                }
                break;
                case 6:{
                    companyManagement.updateNewSalary();
                }
            }
        }while (true);
    }
}
