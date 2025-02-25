package com.capgeminitraining.springbootlearning.DTO;


    public class UserDTO {
        String firstName;
        String lastName;

        UserDTO(String firstName, String lastName) {
            this.firstName=firstName;
            this.lastName=lastName;
        }

        //getter
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        //setters
        public void setFirstName(String firstName) {
            this.firstName=firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

