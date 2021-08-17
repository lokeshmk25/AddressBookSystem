package com.bridgeLabz;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("welcome to Address Book program");
        PersonDetails obj = new PersonDetails();
        obj.setFirstName("lokesh");
        obj.setLastName('M');
        obj.setAddress("kanni kovil street,oomerabad");
        obj.setCity("Chennai");
        obj.setState("TamilNadu");
        obj.setZip(635808);
        obj.setPhoneNumber(987654210);
        obj.setEmail("lokeshmk@gmail.com");

        System.out.println("FirstName:" +obj.getFirstName());
        System.out.println("LastName:" +obj.getLastName());
        System.out.println("Address:" +obj.getAddress());
        System.out.println("City:" +obj.getCity());
        System.out.println("State:" +obj.getState());
        System.out.println("zip:" +obj.getZip());
        System.out.println("phonenumber:"+obj.getPhoneNumber());
        System.out.println("Email:" +obj.getEmail());

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
            this.address=address;
        }
        public String getCity(){
            return city;
        }
        public void setCity(String city){
            this.city=city;
        }
        public String getState(){
            return state;
        }
        public void setState(String state){
            this.state = state;
        }
        public int getZip(){
            return zip;
        }
        public void setZip(int zip){
            this.zip=zip;
        }
        public long getPhoneNumber(){
            return phoneNumber;
        }
        public void setPhoneNumber(long phoneNumber){
            this.phoneNumber=phoneNumber;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email=email;
        }
    }




}
