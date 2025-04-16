package pl.juhas.hotelowo_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@With
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address{
    @Id
    @GeneratedValue
    private Long id;

    private String street;
    private String city;
    private String postalCode;
    private String country;
}
