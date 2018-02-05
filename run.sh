#!/bin/bash

# clean old files
rm  ./bin/hohuan/addressbook/*.class

# compile the code into the bin folder
javac  ./src/hohuan/addressbook/*.java -d ./bin


java -classpath ./bin hohuan.addressbook.AddressBook 



