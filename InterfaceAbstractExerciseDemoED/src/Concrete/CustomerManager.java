package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerManager;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager {
    @Override
    public void register(Customer customer) {
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Kaydedildi");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Guncellendi");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Silindi");
    }
}
