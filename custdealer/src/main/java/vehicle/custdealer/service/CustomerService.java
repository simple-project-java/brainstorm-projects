package vehicle.custdealer.service;

import org.springframework.stereotype.Service;
import vehicle.custdealer.model.Customer;
import vehicle.custdealer.repository.CustomerRepository;

import java.util.Optional;


@Service
public class CustomerService {
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);

    }

    public Customer getAllCustomer() {
        customerRepository.findAll();

    }
    public Customer findCustomerbyId(Integer  id) {
          Optional<Customer> cust = customerRepository.findById(id);
          return cust;
    }
}
