package springApplication.customers;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue
    private UUID id;

    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String gender;
    private Integer age;
    private Date lastSeen = new Date();

}

