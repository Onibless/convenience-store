package store.java;

public class Customers {
        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String address;
        private double balance;

        public Customers(int id, String firstName,String lastName, String email, String  phoneNumber, String address, double balance){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber =phoneNumber;
        this.address = address;
        this.balance = balance;
}
        public int getId () { return id;}
        public void setId (int id) {this.id = id;}

        public String getFirstName() {
                return firstName;
        }
        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }
        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmail(){return email;}
        public void  setEmail(String email) {this.email = email;}

        public String getPhoneNumber () { return phoneNumber;}
        public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

        public String getAddress() { return address;}
        public void setAddress(String address) {this.address = address;}

        public double getBalance() { return balance;}
        public void setBalance(double balance) {this.balance = balance;}

        @Override
        public String toString(){
        return "Customers{" +
                "firstName='" +firstName+ '\'' +
                ",lastName='" +lastName+ '\''+
                ",email='" +email +'\''+
                ",phoneNumber='" +phoneNumber+'\''+
                ",address='" + address+'\''+
                ",balance='" + balance+'\''+
                '}';
        }


}
