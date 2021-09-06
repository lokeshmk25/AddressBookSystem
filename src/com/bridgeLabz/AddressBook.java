package com.bridgeLabz;

import java.util.Scanner;


public class AddressBook {
    Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("welcome to Address Book program");
            Contact1();
            AddressBook addressBook = new AddressBook();
            addressBook.askuser();
        }

        public static void Contact1() {
            AddressBook.PersonDetails person1 = new AddressBook.PersonDetails();
            person1.setFirstName("lokesh");
            person1.setLastName('M');
            person1.setAddress("kanni kovil street,oomerabad");
            person1.setCity("Chennai");
            person1.setState("TamilNadu");
            person1.setZip(635808);
            person1.setPhoneNumber(987654210);
            person1.setEmail("lokeshmk@gmail.com");

            System.out.println("FirstName:" + person1.getFirstName());
            System.out.println("LastName:" + person1.getLastName());
            System.out.println("Address:" + person1.getAddress());
            System.out.println("City:" + person1.getCity());
            System.out.println("State:" + person1.getState());
            System.out.println("zip:" + person1.getZip());
            System.out.println("phonenumber:" + person1.getPhoneNumber());
            System.out.println("Email:" + person1.getEmail());

            System.out.println("Would like to add any details");

        }

        static class PersonDetails {
            private String firstName;
            private char lastName;
            private String address;
            private String city;
            private String state;
            private int zip;
            private long phoneNumber;
            private String email;

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public char getLastName() {
                return lastName;
            }

            public void setLastName(char lastName) {
                this.lastName = lastName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public int getZip() {
                return zip;
            }

            public void setZip(int zip) {
                this.zip = zip;
            }

            public long getPhoneNumber() {
                return phoneNumber;
            }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
    private void askuser() {
        System.out.println("Select an action");
        System.out.println("1.Add a new person");
        Scanner sc = new Scanner(System.in);
        int choice =sc.nextInt();
        switch (choice){
            case 1:
                addAPerson();
                System.out.println("\n");
                askuser();
                break;
            default:
                break;
        }
    }
    void addAPerson() {
        System.out.println("Enter the first and last name");
        String firstName = sc.next();
        String lastName = sc.next();

        System.out.println("Enter complete Address");
        sc.nextLine();
        String address = sc.nextLine();

        System.out.println("Enter city,state and zip");
        String city = sc.next();
        String state = sc.next();
        String zip = sc.next();

        System.out.println("Enter phone Number");
        String phoneNumber = sc.next();

        PersonDetails person2 = new PersonDetails();
    }

}

