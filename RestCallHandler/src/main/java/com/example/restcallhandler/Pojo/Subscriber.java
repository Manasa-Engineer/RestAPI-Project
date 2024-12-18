package com.example.restcallhandler.Pojo;

import jakarta.persistence.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Subscriber {

    @Id
    int id;
    String name;
    String phoneNumber ;
    String email;
    @OneToOne
    protected BillingAccount accountDetails;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
