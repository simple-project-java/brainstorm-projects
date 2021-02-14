package vehicle.custdealer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import vehicle.custdealer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
