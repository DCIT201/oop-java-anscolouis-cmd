package com.host.vehicle;
import com.Composite.classes.Customer;

import java.util.Scanner;

//Achieving inheritance
public class Motorcycle extends Vehicle {
    //these are special fields for the class Host.Car which  will be encapsulated
    private int motorcycleRating;
    private String motorcycleColor;
    private String motorcycleKeyCode;
    Scanner input = new Scanner(System.in);

    //class Constructor
    public Motorcycle(){
         super("VehicleIdNotAssigned","ModelNotAssigned",0.0,false);
     }

    //providing Getters and setters for the private fields.
    public int getMotorcycleRatingRating(){
        return motorcycleRating;
    }
    public String getMotorcycleColor(){
        return motorcycleColor;
    }
    public String getMotorcycleKeyCode(){
        return motorcycleKeyCode;
    }
    public void setMotorcycleDetails(int motorcycleRating ,String motorcycleColor){
        this.motorcycleRating= motorcycleRating;
        this.motorcycleColor = motorcycleColor;
    }

    // generating carKeyCode
    void generateMotorcycleKeyCode(){
        switch (getMotorcycleRatingRating()){
            case 5:
                this.motorcycleKeyCode="KY315";
                break;
            case 4:
                this.motorcycleKeyCode="KY325";
                break;
            case 3:
                this.motorcycleKeyCode="KY335";
                break;
            case 2:
                this.motorcycleKeyCode="KY345";
                break;
            case 1:
                this.motorcycleKeyCode="KY355";
                break;
            case 0:
                this.motorcycleKeyCode="KY302";
                break;
            default:
                this.motorcycleKeyCode="KY312";
        }
    }

    //fields to be used for rental cost calculation
     protected long cost , averageDays , mentainanceFee , averageDaysWeight , totalCost ;
    public void calculateRentalCost(int days){
        if ((days >=(87-14))&&(days <=87)){
            mentainanceFee= 240 ;
            averageDays= (73+87)/2;
            averageDaysWeight= (averageDays)+50;
            cost = 14 * averageDaysWeight;
                totalCost = cost+ mentainanceFee;
                System.out.println("Your rental cost is "+totalCost);
        }else if((days >=(73-14 ))&&(days < 73)){
            mentainanceFee= 235;
            averageDays= (73+59)/2;
            averageDaysWeight= (averageDays)+50;
            cost = 14 * averageDaysWeight;
            totalCost = cost+ mentainanceFee;
            System.out.println("Your rental cost is "+ totalCost);
        }else if ((days >=(59-14 ))&&(days < 59)){
            mentainanceFee= 230;
            averageDays= (45+59)/2;
            averageDaysWeight= (averageDays)+50;
            cost = 14 * averageDaysWeight;
            totalCost = cost+ mentainanceFee;
            System.out.println("Your rental cost is "+totalCost);
        }else if ((days >=(45-14 ))&&(days < 45)){
            mentainanceFee= 225;
            averageDays= (45+31)/2;
            averageDaysWeight= (averageDays)+50;
            cost = 14 * averageDaysWeight;
            totalCost = cost+ mentainanceFee;
            System.out.println("Your rental cost is "+totalCost);
        } else if ((days >=(31-14 ))&&(days < 31)) {
            mentainanceFee= 220;
            averageDays= (17+31)/2;
            averageDaysWeight= (averageDays)+50;
            cost = 14 * averageDaysWeight;
            totalCost = cost+ mentainanceFee;
            System.out.println("Your rental cost is "+totalCost);
        } else if ((days < 17)&&(days!=0)) {
            mentainanceFee= 215;
            averageDays= (17+1)/2;
            averageDaysWeight= (averageDays)+50;
            cost = 14 * averageDaysWeight;
            totalCost = cost+ mentainanceFee;
            System.out.println("----------------------------------------------------------------------\n"+
                    "Your rental cost is "+totalCost);
        }else {
            System.out.println("----------------------------------------------------------------------\n"+
                    "Its seem you have enter an exceeding number of days");
        }
    }
        boolean isAvailable;
    public void isAvailableForRental(){
        System.out.println("1.Customer please i would like you to enter the specfic " +
                "type of motorcycle you want");
         Scanner input = new Scanner(System.in);
             String type= input.nextLine();
           String lowerCaseOfType = type.toLowerCase();
        String statement = "This type of MotorCycle is available in our garage.";
        String statement1 ="this type of MotorCycle is not available";
        switch (lowerCaseOfType){
            case "cruiser":
                System.out.println(statement);
                isAvailable= true;
                break;
            case "sport bike":
                System.out.println(statement);
                isAvailable= true;
                break;
            case "adventure bikes":
                System.out.println(statement);
                isAvailable= true;
                break;
            case "tricycle":
                System.out.println(statement);
                isAvailable= true;
                break;
            default:
                System.out.println(statement1);
                isAvailable= false;
        }
    }

    String carID ,model ;
    double f =totalCost ;
    boolean g= isAvailable;
    public void generateMotorcycleId(){
        String[] motorcycleId = {
                "MT1240","MT1245","MT1250","MT1255","MT1260","MT1265"
        };
        System.out.println("2.Customer can know the model of motorcycle you want to rent "+
                "i.e whether \"Nissan Titan\" or maybe\"toyota tundra\" ?");
        model = input.nextLine().trim();
        String[] word =model.split("");
        String firstWord =word[0];
        switch (firstWord.toLowerCase()){
            case "chevrolet":
                carID = motorcycleId[0];
                break;
            case "toyota":
                carID = motorcycleId[1];
                break;
            case "ford":
                carID =motorcycleId[2];
                break;
            case "nissan":
                carID = motorcycleId[3];
                break;
            case "ram":
                carID =motorcycleId[4];
                break;
            case  "man":
                carID = motorcycleId[5];
                break;
            default:
                carID ="null";
                model= "NotAvailable";
                totalCost= 0;
                break;
        }
    }
    void settingDetailsOtSuper(){
        setDetails( carID ,model , totalCost  , isAvailable);

    }

    public void printRentalTransactionSlip2() {
        System.out.println("-----------------------------------------------------------------------------\n" +
                "You have been assign to this vehicle as provided by the detail below.\n[Show this details to " +
                "our garage caretaker to direct you on the Host.Vehicle to take]");
        System.out.println("Car~Name: "+getModel()+"\nColor: "+getMotorcycleColor()+"\nCar~Rating: "+
                getMotorcycleRatingRating()+ "\nCar~Id : "+getVehicleId()+"\nCarKey~Code: " +
                getMotorcycleKeyCode() +"\nTotalRent~Cost: "+getBaseRentalRate()+
                "\n-----------------------------------------------------------------------------");
    }

}
class implementRentable1 implements Rentable {
    private Customer currentCustomer;
    private int rentalDays;

    @Override     //Achieving Composition by aggregation of Customer class
    public void rent(Customer customer, int days) {
        this.currentCustomer = customer;
        this.rentalDays = days;

        System.out.println("Please check if your details have been correctly saved\n\n" +
                "---------------------------------------------\n" +
                "NAME: " + customer.getName() + " AGE: " + customer.getAge() +
                " DRIVING LICENSE: " + customer.getDvLicense() + " Number Of Days: " + days +
                "\n---------------------------------------------\n.Enter \"Yes\" if everything is right");

        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Sure, you can move to the proceeding terms.");
        } else {
            System.out.println("[Service terminated]. Please try again later.");
        }
    }

    @Override
    public void returnVehicle() {
        System.out.println("Host.Vehicle returned successfully for customer: " + currentCustomer.getName());
        this.currentCustomer = null;  // Resetting the current customer
        this.rentalDays = 0;  // Resetting the rental days
    }

}