package nus.iss.tut13.model;

import java.time.LocalDate;
import java.time.Period;

public class contactInfo 
{
 
    private String name;
    private String job;
    private String email;
    private int phoneNumber;
    private LocalDate dateOfBirth;
    private String id;
    private int age;

    public contactInfo() {
    }
    public contactInfo(String name, String job, String email, int phoneNumber, LocalDate dateOfBirth) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth=dateOfBirth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        int calculateAge =0;
        if(dateOfBirth!=null)
        {
            calculateAge= Period.between(dateOfBirth, LocalDate.now()).getYears();
        }
        this.dateOfBirth = dateOfBirth;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "contactInfo [name=" + name + ", job=" + job + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    

}
