package com.application.demo;

class A {

    private String username;
    private String password;

//    public A(String username, String password){
//        this.username = username;
//        this.password = password;
//    }

    // getters and setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "A{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
