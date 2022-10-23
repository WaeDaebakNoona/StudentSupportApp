/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Naritaa
 */
public class Students {
    private String name;
    private String surname;
    private int age;
    private int grade;
    private String username;
    private String password;

    public Students(String name, String surname, int age, int grade, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Students{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", grade=" + grade + ", username=" + username + ", password=" + password + '}';
    }
    
    
    
    
    
    
}
