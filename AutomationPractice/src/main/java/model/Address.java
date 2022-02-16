package model;

import Utils.ReadPropertyFile;

import java.util.HashMap;
import java.util.Map;

public enum Address {
    Company,
    Street,
    City,
    State,
    ZipCode,
    PhoneNumber;

    public static Map getAddress() {
        Map<Address, String> address = new HashMap<>();
        address.put(Company, ReadPropertyFile.getValue("company"));
        address.put(Street, ReadPropertyFile.getValue("address"));
        address.put(City, ReadPropertyFile.getValue("city"));
        address.put(State, ReadPropertyFile.getValue("state"));
        address.put(ZipCode, ReadPropertyFile.getValue("zipcode"));
        address.put(PhoneNumber, ReadPropertyFile.getValue("number"));
        return address;
    }
}
