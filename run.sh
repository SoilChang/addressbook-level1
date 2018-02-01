#!/bin/bash


# compile the code into the bin folder
javac  ./src/seedu/addressbook/AddressBook.java -d ./bin


java -classpath ./bin seedu.addressbook.AddressBook ' '



