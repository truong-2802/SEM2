package com.class02;


import com.class2.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyManagement {
    List<Staff> list;
    int currentId = 0;

    public CompanyManagement() {
        list = new ArrayList<>();

    }

    public void addNewPerson() {
        System.out.println("1. Add new  Director");
        System.out.println("2. Add new Employee");
        System.out.println("3. Add new Manager");
        Scanner input = new Scanner(System.in);
        System.out.println("Add New Person: ");
        int choose = input.nextInt();

        Staff newStaff = null;

        switch (choose){
            case 1:{
                newStaff = new Director();
            }
            break;
            case 2:{
                newStaff=new Employee();
            }
            break;
            case 3:{
                newStaff=new Manager();
            }
            break;
        }
        newStaff.setId(++currentId);
        newStaff.inputData();
        list.add(newStaff);
    }

    public void displayAll() {
        for (Staff item : list) {
            item.display();
        }
    }

    Staff findShapeById() {
        System.out.print("Enter id to find: ");
        Scanner input = new Scanner(System.in);
        int findId = input.nextInt();

        for (Staff item : list) {
            if(findId == item.getId()){
                item.display();
                return item;
            }
        }
        return null;
    }
    public void updateStaff(){
        Staff findStaff=this.findShapeById();
        if(findStaff!=null){
            findStaff.updateData();
        }else{
            System.out.println("not found");
        }
    }
    public  void getTotalBonusOfCompany(){
        int total=0;
        for (Staff item : list){
            total+=item.getTotalBonusOfCompany();
        }
        System.out.println("Total bonus:"+ total);
    }
    public void updateNewSalary(){
        Staff findStaff=this.findShapeById();
        if(findStaff!=null){
            findStaff.updateNewSalary();

        }else {
            System.out.println("not found");
        }
    }
}
