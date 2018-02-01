#!/bin/bash


# compile the code into the bin folder
javac  ./src/hohuan/addressbook/*.java -d ./bin


java -classpath ./bin hohuan.addressbook.AddressBook ' '



