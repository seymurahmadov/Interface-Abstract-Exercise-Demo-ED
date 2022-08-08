package Entities;

import Abstract.ICustomerManager;
import Abstract.IEntity;

import java.time.LocalDate;

public class Customer implements IEntity {
    private int customerId;
    private String firstName;
    private String lastName;
    private LocalDate birth;
    private String nationalityId;

    public Customer(){

    }

    public Customer(int customerId,String firstName, String lastName, LocalDate birth, String nationalityId){
        this.setCustomerId(customerId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirth(birth);
        this.setNationalityId(nationalityId);

    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
