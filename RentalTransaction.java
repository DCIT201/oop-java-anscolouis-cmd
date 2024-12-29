package com.Composite.classes;
import com.host.vehicle.Car;
import com.host.vehicle.Motorcycle;
import com.host.vehicle.Track;

public class RentalTransaction extends Car {
    Motorcycle motorcycle =new Motorcycle();
    Track track =new Track();

    public void printRentalTransactionSlip3() {
        System.out.println("----------------------------------------------------------\n" +
                "You have been assign to this vehicle as provided by the detail below.\n[Show this details to " +
                "our garage caretaker to direct you on the Host.Vehicle to take]");
        System.out.println("Car~Name: "+ getModel()+"\nColor: "+track.getTrackColor()+"\nCar~Rating: "+
                track.getTrackRating()+ "\nCar~Id : "+track.getVehicleId()+"\nCarKey~Code: " +
                track.getTrackKeyCode() +"\nTotalRent~Cost: "+track.getBaseRentalRate()/*+
                      "Duration~Assigned"+ main.days+" days"*/);
    }



}
