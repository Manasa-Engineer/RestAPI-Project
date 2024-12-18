package com.example.restcallhandler.Pojo;

import jakarta.persistence.*;
import lombok.*;


@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BillingAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int billingId;
     String activationCode;
     boolean activationStatus;
     String Address;
}
