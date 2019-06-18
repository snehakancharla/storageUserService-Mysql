package com.stackroute.storageservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private String userId;
    private String emailId;
    @NotNull
    private String firstName;
    @NotNull
    private String password;
    @NotNull
    private String mobileNo;
    @NotNull
    private String aadharNo;
}
