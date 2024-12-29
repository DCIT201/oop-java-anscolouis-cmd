package com.host.vehicle;
import com.Composite.classes.Customer;

import java.util.Scanner;

public class Car extends Vehicle {
    //these are special fields for the class Host.Car which  will be encapsulated
    private int carRating;
    private String carColor;
    private String carKeyCode;
    Scanner input = new Scanner(System.in);


    //car constructor
    public Car(){
            super("VehicleIdNotAssigned","ModelNotAssigned",0.0,false);
        }

     //providing Getters and setters for the private fields.
     public int getCarRating(){
            return carRating;
     }
     public String getCarColor(){
            return carColor;
     }
      public String getCarKeyCode(){
            return carKeyCode;
      }

        public void setCarDetails(int carRating,String carColor){
            this.carRating= carRating;
            this.carColor = carColor;
        }
        // generating carKeyCode
        void generateCarKeyCode(){
            switch (getCarRating()){
                case 5:
                    this.carKeyCode="KY415";
                    break;
                case 4:
                    this.carKeyCode="KY425";
                    break;
                case 3:
                    this.carKeyCode="KY435";
                    break;
                case 2:
                    this.carKeyCode="KY445";
                    break;
                case 1:
                    this.carKeyCode="KY455";
                    break;
                case 0:
                    this.carKeyCode="KY402";
                    break;
                default:
                    this.carKeyCode="KY112";
            }
        }
    //fields to be used for rental cost calculation
    protected long cost, averageDays, mentainanceFee, averageDaysWeight, totalCost;

    public void calculateRentalCost( int days) {
        if ((days >= (87 - 14)) && (days <= 87)) {
            mentainanceFee = 450;
            averageDays = (73 + 87) / 2;
            averageDaysWeight = (averageDays) + 72;
            cost = 14 * averageDaysWeight;
            totalCost = cost + mentainanceFee;
            System.out.println("Your rental cost is " + totalCost + " cedis");
        } else if ((days >= (73 - 14)) && (days < 73)) {
            mentainanceFee = 445;
            averageDays = (73 + 59) / 2;
            averageDaysWeight = (averageDays) + 72;
            cost = 14 * averageDaysWeight;
            totalCost = cost + mentainanceFee;
            System.out.println("Response: Your rental cost is " + totalCost + " cedis");
        } else if ((days >= (59 - 14)) && (days < 59)) {
            mentainanceFee = 440;
            averageDays = (45 + 59) / 2;
            averageDaysWeight = (averageDays) + 72;
            cost = 14 * averageDaysWeight;
            totalCost = cost + mentainanceFee;
            System.out.println("Response: Your rental cost is " + totalCost + " cedis");
        } else if ((days >= (45 - 14)) && (days < 45)) {
            mentainanceFee = 435;
            averageDays = (45 + 31) / 2;
            averageDaysWeight = (averageDays) + 72;
            cost = 14 * averageDaysWeight;
            totalCost = cost + mentainanceFee;
            System.out.println("Response: Your rental cost is " + totalCost + " cedis");
        } else if ((days >= (31 - 14)) && (days < 31)) {
            mentainanceFee = 430;
            averageDays = (17 + 31) / 2;
            averageDaysWeight = (averageDays) + 72;
            cost = 14 * averageDaysWeight;
            totalCost = cost + mentainanceFee;
            System.out.println("Response: Your rental cost is " + totalCost + " cedis");
        } else if ((days < 17)&&(days!=0)) {
            mentainanceFee = 425;
            averageDays = (17 + 1) / 2;
            averageDaysWeight = (averageDays) + 72;
            cost = 14 * averageDaysWeight;
            totalCost = cost + mentainanceFee;
            System.out.println("----------------------------------------------------------------------\n"+
                    "Response: Your rental cost is " + totalCost + " cedis");
        } else {
            System.out.println("----------------------------------------------------------------------\n"+
                    "Response:Its seem you have enter an exceeding number of days");
        }
    }
          boolean isAvailable;
    public void isAvailableForRental() {
        System.out.println("1.Customer please i would like you to enter the specfic " +
                "type of car you want.");
        String type = input.nextLine();
        String lowerCaseOfType = type.toLowerCase();
        String statement = "Response: This type of car is available in our garage.";
        String statement1 = "Response: this type of track is not available";
        switch (lowerCaseOfType) {
            case "sedan":
                System.out.println(statement);
                isAvailable=true;
                break;
            case "suv":
                System.out.println(statement);
                isAvailable=true;
                break;
            case "coupe":
                System.out.println(statement);
                isAvailable=true;
                break;
            case "hatchback":
                System.out.println(statement);
                isAvailable=true;
                break;
            default:
                System.out.println(statement1);
                isAvailable=false;
        }

    }
    String carID ,model ;
    public void generateCarId(){
        String[] carId = {
                "CA1240","CA1245","CA1250","CA1255","CA1260","CA1265"
        };
        System.out.println("2.Customer can know the model of car you want to rent "+
                "i.e whether \"Nissan\" or maybe\"toyota\" ?");
        model = input.nextLine();
        switch (model.toLowerCase()){
            case "nissan":
                carID = carId[0];
                break;
            case "toyota":
                carID = carId[1];
                break;
            case "ford":
                carID = carId[2];
                break;
            case "benz":
                carID = carId[3];
                break;
            case "vibe":
                carID =carId[4];
                break;
            case  "suzuki":
                carID = carId[5];
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
    public void printRentalTransactionSlip1() {
        System.out.println("\n-----------------------------------------------------------------------------\n" +
                "You have been assign to the vehicle as provided by the details below.\n[Show this details to " +
                "our garage caretaker to direct you to your rent vehicle]");
        System.out.println("Car~Name: "+getModel()+"\nColor: "+getCarColor()+"\nCar~Rating: "+
                getCarRating()+ "\nCar~Id : "+getVehicleId()+"\nCarKey~Code: " +
                getCarKeyCode() +"\nTotalRent~Cost: "+getBaseRentalRate()+
                    "\n-----------------------------------------------------------------------------");
    }
}
class ImplementRentable implements Rentable {
        private Customer currentCustomer;
        private int rentalDays;

        @Override    //Achieving Composition by aggregation of Customer class
        public void rent(Customer customer, int days) {
            this.currentCustomer = customer;
            this.rentalDays = days;

            System.out.println("Please check if your details have been correctly saved\n\n" +
                    "---------------------------------------------\n" +
                    "NAME: " + customer.getName() + "\nAGE: " + customer.getAge() +
                    "\nDRIVING LICENSE: " + customer.getDvLicense() + " \nNumber Of Days: " + days +
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
