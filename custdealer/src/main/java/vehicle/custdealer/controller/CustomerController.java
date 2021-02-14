package vehicle.custdealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vehicle.custdealer.model.Customer;
import vehicle.custdealer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
      public Customer getCutomerById(@PathVariable ("id") Integer id) {
        Customer cust = customerService.findCustomerbyId(id);
        if (cust == null) {
            return null;
        }

        return cust;
    }

    @PostMapping("/add")
    public ResponseEntity<CustomerController> addCutomer(@RequestBody CustomerController customer) {
        customerService.createCustomer(customer);
        return  new ResponseEntity<CustomerController>.ok().;
    }
}
