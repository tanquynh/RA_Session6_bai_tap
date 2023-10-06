package BT5;

import java.util.Scanner;

public class Student {
// 1. Fields
    private int studentId;
    private String studentName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private static int count = 1;
// Contructor
    public Student() {
        this.studentId = Student.count++;
    }

    public Student(int studentId, String studentName, int age, String gender, String address, String phoneNumber) {

        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }
// 3. Methods
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên học sinh");
        studentName = sc.nextLine();
        System.out.println("Nhập số tuổi   ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính");
        gender = sc.nextLine();
        System.out.println("Nhập địa chỉ    ");
        address = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        phoneNumber = sc.nextLine();
    }

    public void displayData() {
        System.out.println("Mã HS : " + studentId);
        System.out.println("Tên HS : " + studentName);
        System.out.println("Tuổi HS : " + age);
        System.out.println("Giới tính : " + gender);
        System.out.println("Địa chỉ : " + address);
        System.out.println("Số điện thoại : " + phoneNumber);

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber()

    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
