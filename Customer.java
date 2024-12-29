package com.Composite.classes;

public class Customer {
    private String name;
    private int age;
    private String dvLicense;

    public Customer(String name, int age, String dvLicense) {
        this.name = name;
        this.age = age;
        this.dvLicense = dvLicense;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDvLicense() {
        return dvLicense;
    }

   // Implementing  rental eligibility checks
     //Checking for validity in age and driving license
   public boolean rntEli;
    public void rentalEligibility(){
        if ((age >=18)&&(dvLicense.contains("DVL"))) {
            System.out.println("Personal details validation passed [Service Granted]");
            rntEli=true;
        }else{
            System.out.println("Due some reasons this service can not offered to you ");
            this.name= "null";
            this.age =0;
            this.dvLicense= "null";
        }
    }
}
