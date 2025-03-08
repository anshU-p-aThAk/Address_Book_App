package com.spring.addressBook.service;

import com.spring.addressBook.dto.AddressBookDTO;
import com.spring.addressBook.model.AddressBook;

import java.util.List;

public interface IAddressBookService {
    List<AddressBook> getAddressBookData();
    AddressBook getAddressBookDataById(long id);
    AddressBook createAddressBookData(AddressBookDTO empPayrollDTO);
    boolean updateAddressBookData(AddressBook AddressBook, AddressBookDTO updatedAddressBookDTO);
    void deleteAddressBookData(long id);
}