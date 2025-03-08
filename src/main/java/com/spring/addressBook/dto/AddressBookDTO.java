package com.spring.addressBook.dto;

import com.spring.addressBook.model.AddressBook;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {
    private String name;
    private String address;
    private long phoneNumber;

    public AddressBookDTO(AddressBook addressBook) {
        this.name = addressBook.getName();
        this.address = addressBook.getAddress();
        this.phoneNumber = addressBook.getPhoneNumber();
    }
}
