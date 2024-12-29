package com.host.vehicle;

import com.Composite.classes.Customer;

public interface Rentable {
    //some interface methods to implemented in each vehicle class.
     void rent(Customer customer , int days);
     void returnVehicle();
}
