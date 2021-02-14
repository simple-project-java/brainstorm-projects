package vehicle.custdealer.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer custId;
    private String name;
    private String purpose;
    private String email;
    private Long phoneNumber;


}
