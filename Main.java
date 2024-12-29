package com.host.vehicle;
import com.Composite.classes.Customer;
import com.Composite.classes.RentalAgency;

import java.util.Scanner;

public class Main {

    public int days;
    public String type;
    Scanner input = new Scanner(System.in);
        public Main() {
            System.out.println("\t\t\t\t\t\t=[Host.Vehicle~Rentals]=\n"
                    + "======================================================================\n" +
                    "Customer i would like you enter the type of vehicle you want to rent.\n"
                    + "======================================================================");
                   type = input.nextLine();
            switch (type.toLowerCase()){
                case "car":
                    Car car = new Car();
                    car.isAvailableForRental();
                    car.generateCarId();
                    System.out.println("----------------------------------------------------------------------\n" +
                            "Please note that this section is optional and also requires additional\n charges." +
                            "Enter \"Yes\" to endeavor Or \"No\" to cancel."
                            +"\n----------------------------------------------------------------------");
                     String response= input.nextLine();
                            String lowerCaseOfResponse= response.toLowerCase();
                         if(lowerCaseOfResponse.equals("yes")){
                             System.out.println("Enter the color and preferred rating you want your rent car to have[NB:" +
                                     "rating should be less than equal to 5]\nCOLOR:");
                             String color = input.nextLine();
                             System.out.println("PREFERRED~RATING:");
                             int rating= input.nextInt();
                             car.setCarDetails(rating,color);
                             car.generateCarKeyCode();
                         }else{
                             System.out.println("ok");
                         }
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("----------------------------------------------------------------------\n"+
                            "\t\tCustomer personal details section\n"+
                            "----------------------------------------------------------------------\n"+
                            "1.Customer enter your name:");
                    String name = input1.nextLine();
                    System.out.println("2.Enter customer age:");
                    int age = input1.nextInt();
                    input1.nextLine(); // Consume the leftover newline
                    System.out.println("3.Customer enter your driving license:");
                    String dvLicense = input1.nextLine();
                    Customer customer = new Customer(name, age, dvLicense);
                    customer.rentalEligibility();
                    if(customer.rntEli) {
                        System.out.println("4.Enter the number of days for rental:");
                        days = input1.nextInt();
                        car.calculateRentalCost(days);
                        ImplementRentable implementRentable = new ImplementRentable();
                        implementRentable.rent(customer,days);
                          implementRentable.returnVehicle();
                        car.settingDetailsOtSuper();
                        car.printRentalTransactionSlip1();
                        RentalAgency rentalAgency =new RentalAgency();
                        rentalAgency.outputRentalAgencyStatement();
                    }

                         break;
                case "motorcycle":
                    Motorcycle motorcycle =new Motorcycle();
                    motorcycle.isAvailableForRental();
                    motorcycle.generateMotorcycleId();
                    System.out.println("----------------------------------------------------------------------\n" +
                            "Please note that this section is optional and also requires additional\n charges." +
                            "Enter \"Yes\" to endeavor Or \"No\" to cancel."
                            +"\n----------------------------------------------------------------------");
                    String response1= input.nextLine();
                    String lowerCaseOfResponse1= response1.toLowerCase();
                    if(lowerCaseOfResponse1.equals("yes")){
                        System.out.println("Enter the color and preferred rating you want your rent car to have[NB:" +
                                "rating should be less than equal to 5]\nCOLOR:");
                        String color = input.nextLine();
                        System.out.println("PREFERRED~RATING:");
                        int rating= input.nextInt();
                        motorcycle.setMotorcycleDetails(rating,color);
                        motorcycle.generateMotorcycleKeyCode();
                    }else{
                        System.out.println("ok");
                    }
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("----------------------------------------------------------------------\n"+
                            "\t\tCustomer personal details section\n"+
                            "----------------------------------------------------------------------\n"+
                            "1.Customer enter your name:");
                    String name1 = input2.nextLine();
                    System.out.println("2.Enter customer age:");
                    int age1 = input2.nextInt();
                    input2.nextLine(); // Consume the leftover newline
                    System.out.println("3.Customer enter your driving license:");
                    String dvLicense1 = input2.nextLine();
                    Customer customer1 = new Customer(name1, age1, dvLicense1);
                    customer1.rentalEligibility();
                    if(customer1.rntEli) {
                        System.out.println("4.Enter the number of days for rental:");
                        days = input2.nextInt();
                        motorcycle.calculateRentalCost(days);
                        ImplementRentable implementRentable = new ImplementRentable();
                        implementRentable.rent(customer1,days);
                        implementRentable.returnVehicle();
                        motorcycle.settingDetailsOtSuper();
                        motorcycle.printRentalTransactionSlip2();
                        RentalAgency rentalAgency =new RentalAgency();
                        rentalAgency.outputRentalAgencyStatement();
                    }
                    break;
                case "track":
                    Track track = new Track();
                    track.isAvailableForRental();
                    track. generateTrackId();
                    System.out.println("----------------------------------------------------------------------\n" +
                            "Please note that this section is optional and also requires additional\n charges." +
                            "Enter \"Yes\" to endeavor Or \"No\" to cancel."
                            +"\n----------------------------------------------------------------------");
                    String response2= input.nextLine();
                    String lowerCaseOfResponse2= response2.toLowerCase();
                    if(lowerCaseOfResponse2.equals("yes")){
                        System.out.println("Enter the color and preferred rating you want your rent car to have[NB:" +
                                "rating should be less than equal to 5]\nCOLOR:");
                        String color = input.nextLine();
                        System.out.println("PREFERRED~RATING:");
                        int rating= input.nextInt();
                        track.setTrackDetails(rating,color);
                        track.generateTrackKeyCode();
                    }else{
                        System.out.println("ok");
                    }

                    Scanner input3 = new Scanner(System.in);
                    System.out.println("----------------------------------------------------------------------\n"+
                            "\t\tCustomer personal details section\n"+
                            "----------------------------------------------------------------------\n"+
                            "1.Customer enter your name:");
                    String name2 = input3.nextLine();
                    System.out.println("2.Enter customer age:");
                    int age2 = input3.nextInt();
                    input3.nextLine(); // Consume the leftover newline
                    System.out.println("3.Customer enter your driving license:");
                    String dvLicense2 = input3.nextLine();
                    Customer customer2 = new Customer(name2, age2, dvLicense2);
                    customer2.rentalEligibility();
                    if(customer2.rntEli) {
                        System.out.println("4.Enter the number of days for rental:");
                        days = input3.nextInt();
                        track.calculateRentalCost(days);
                        ImplementRentable implementRentable = new ImplementRentable();
                        implementRentable.rent(customer2,days);
                        implementRentable.returnVehicle();
                        track.settingDetailsOtSuper();
                       track.printRentalTransactionSlip3();
                        RentalAgency rentalAgency =new RentalAgency();
                        rentalAgency.outputRentalAgencyStatement();
                    }
                    break;
            }
        }

        public static void main(String[] args) {
          Main main = new Main();

        }
    }
