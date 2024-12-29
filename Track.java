package com.host.vehicle;
import com.Composite.classes.Customer;

import java.util.Scanner;

     // Inheritance have been achieved here
    public class Track extends Vehicle {
         //these are special fields for the class Host.Car which  will be encapsulated
         private int trackRating;
         private String trackColor;
         private String trackKeyCode;
        Scanner input = new Scanner (System.in);

        //class Constructor
        public Track(){
            super("VehicleIdNotAssigned","ModelNotAssigned",0.0,false);
        }

         //providing Getters and setters for the private fields.
         public int getTrackRating(){
             return trackRating;
         }
         public String getTrackColor(){
             return trackColor;
         }
         public String getTrackKeyCode(){
             return trackKeyCode;
         }
         public void setTrackDetails(int trackRating ,String trackColor){
             this.trackRating= trackRating;
             this.trackColor = trackColor;
         }

         // generating TrackKeyCode
         void generateTrackKeyCode(){
             switch (getTrackRating()){
                 case 5:
                     this.trackKeyCode="KY515";
                     break;
                 case 4:
                     this.trackKeyCode="KY525";
                     break;
                 case 3:
                     this.trackKeyCode="KY535";
                     break;
                 case 2:
                     this.trackKeyCode="KY545";
                     break;
                 case 1:
                     this.trackKeyCode="KY555";
                     break;
                 case 0:
                     this.trackKeyCode="KY502";
                     break;
                 default:
                     this.trackKeyCode="KY512";
             }
         }

       //fields to be used for rental cost calculation
        protected long cost,averageDays,averageDaysWeight,totalCost;
        public void calculateRentalCost(int days) {
            long mentainanceFee;
            if ((days >= (87 - 14)) && (days <= 87)) {
                mentainanceFee = 500;
                averageDays = (73 + 87) / 2;
                averageDaysWeight = (averageDays) +75 ;
                cost = 14 * averageDaysWeight;
                totalCost = cost + mentainanceFee;
                System.out.println("Your rental cost is " + totalCost);
            } else if ((days >= (73 - 14)) && (days < 73)) {
                mentainanceFee = 495;
                averageDays = (73 + 59) / 2;
                averageDaysWeight = (averageDays)+75;
                cost = 14 * averageDaysWeight;
                totalCost = cost + mentainanceFee;
                System.out.println("Your rental cost is " + totalCost);
            } else if ((days >= (59 - 14)) && (days < 59)) {
                mentainanceFee = 490;
                averageDays = (45 + 59) / 2;
                averageDaysWeight = (averageDays) + 75;
                cost = 14 * averageDaysWeight;
                totalCost = cost + mentainanceFee;
                System.out.println("Your rental cost is " + totalCost);
            } else if ((days >= (45 - 14)) && (days < 45)) {
                mentainanceFee = 485;
                averageDays = (45 + 31) / 2;
                averageDaysWeight = (averageDays) +75;
                cost = 14 * averageDaysWeight;
                totalCost = cost + mentainanceFee;
                System.out.println("Your rental cost is " + totalCost);
            } else if ((days >= (31 - 14)) && (days < 31)) {
                mentainanceFee =480;
                averageDays = (17 + 31) / 2;
                averageDaysWeight = (averageDays) +75;
                cost = 14 * averageDaysWeight;
                totalCost = cost + mentainanceFee;
                System.out.println("Your rental cost is " + totalCost);
            } else if ((days < 17)&&(days!=0)) {
                mentainanceFee = 475;
                averageDays = (17 + 1) / 2;
                averageDaysWeight = (averageDays) +75;
                cost = 14 * averageDaysWeight;
                totalCost = cost + mentainanceFee;
                System.out.println("----------------------------------------------------------------------\n"+
                        "Your rental cost is " + totalCost);
            } else {
                System.out.println("----------------------------------------------------------------------\n"+
                        "Its seem you have enter an exceeding number of days or nothing at all");
            }
        }
         boolean isAvailable;
        public void isAvailableForRental() {
            System.out.println("1.Customer please i would like you to enter the specfic " +
                    "type of track you want");
            Scanner input = new Scanner(System.in);
            String type = input.nextLine();
             String lowercaseOfType =type.toLowerCase();
            // checking whether the type of track is available in our Garage
                String statement = "This type of track is available in our garage.";
                String statement1 ="this type of track is not available";
               switch (lowercaseOfType){
                   case "dirt":
                       System.out.println(statement);
                       isAvailable=true;
                       break;
                   case "road course":
                       System.out.println(statement);
                       isAvailable=true;
                       break;
                   case "oval":
                       System.out.println(statement);
                       isAvailable=true;
                       break;
                   case "karting":
                       System.out.println(statement);
                       isAvailable=true;
                       break;
                   default:
                       System.out.println(statement1);
                       isAvailable=false;
               }
        }
         String carID ,model ;
         double f =totalCost ;
         boolean g= isAvailable;
         public void generateTrackId(){
             String[] trackId = {
                     "TRA1240","TRA1245","TRA1250","TRA1255","TRA1260","TRA1265"
             };
             System.out.println("2.Customer can know the model of track you want to rent "+
                     "i.e whether \"Nissan Titan\" or maybe\"toyota tundra\" ?");
             model = input.nextLine().trim();
             String[] word =model.split("");
                     String firstWord =word[0];
             switch (firstWord.toLowerCase()){
                 case "chevrolet":
                     carID = trackId[0];
                     break;
                 case "toyota":
                     carID = trackId[1];
                     break;
                 case "ford":
                     carID = trackId[2];
                     break;
                 case "nissan":
                     carID = trackId[3];
                     break;
                 case "ram":
                     carID =trackId[4];
                     break;
                 case  "man":
                     carID = trackId[5];
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

         public void printRentalTransactionSlip3() {
             System.out.println("-----------------------------------------------------------------------------\n" +
                     "You have been assign to this vehicle as provided by the detail below.\n[Show this details to " +
                     "our garage caretaker to direct you on the Host.Vehicle to take]");
             System.out.println("Track~Name: "+ getModel()+"\nColor: "+getTrackColor()+"\nTrack~Rating: "+
                     getTrackRating()+ "\nTrack~Id : "+getVehicleId()+"\ntrackKey~Code: " +
                     getTrackKeyCode() +"\nTotalRent~Cost: "+getBaseRentalRate()+
                     "\n-----------------------------------------------------------------------------");
         }

    }


class implementRentable2 implements Rentable {
    private Customer currentCustomer;
    private int rentalDays;

    @Override      //Achieving Composition by aggregation of Customer class
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