package com.host.vehicle;

public abstract class Vehicle {
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        // Validate vehicleId
        if (vehicleId == null || vehicleId.trim().isEmpty()) {
            throw new IllegalArgumentException("Host.Vehicle ID cannot be null or empty");
        }
        // Validate model
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        // Validate totalCost
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Total cost cannot be negative");
        }
        // Validate isAvailable
        // Since isAvailable is a boolean, it doesn't need further validation
        // Assign values if validation passes
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    //Getters and setters
    // providing these getters and setters allows us to achieve Encapsulation.
      public String getVehicleId(){
          return vehicleId;
      }
      public String getModel( ){
          return model;
      }
      public double getBaseRentalRate( ){
          return baseRentalRate;
      }
      public boolean getIsAvailable(){
          return isAvailable;
      }
      public void setDetails( String vehicleId, String model , double rentalRate , boolean availability){
          this.vehicleId = vehicleId;
          this.model= model;
          this.baseRentalRate = rentalRate;
          this.isAvailable = availability;
      }

    // Abstract methods for rental calculation
     public abstract void calculateRentalCost(int days);
    public abstract void isAvailableForRental();
}





