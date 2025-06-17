package com.recapvidai.recapvidai.core.user;

import com.recapvidai.recapvidai.Util;
import com.recapvidai.recapvidai.core.subscription.ISubscription;

import java.util.UUID;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class User {
    private UUID id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String address;
    private ISubscription subscription;

    public User(String email, String firstName, String lastName, String password, String phoneNumber, String address, ISubscription subscription) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.subscription = subscription;

    }

    public void update(String email, String firstName, String lastName, String password, String phoneNumber, String address, ISubscription subscription) {
        if(Util.isEmpty(this.email)) {
            this.email = email;
        }
        if(Util.isEmpty(this.firstName)) {
            this.firstName = firstName;
        }
        if(Util.isEmpty(this.lastName)) {
            this.lastName = lastName;
        }
        if(Util.isEmpty(this.password)) {
            this.password = password;
        }
        if(Util.isEmpty(this.phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
        if(Util.isEmpty(this.address)) {
            this.address = address;
        }
        if(this.subscription != null) {
            this.subscription = subscription;
        }
    }
}
