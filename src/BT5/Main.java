package BT5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;
        int choice;
        do {
            System.out.println("---------MENU---------");
            System.out.println("Nhập 1: Hiển thị danh sách sinh viên");
            System.out.println("Nhập 2: Thêm sinh viên");
            System.out.println("Nhập 3: Sửa thông tin sinh viên bằng mã sinh viên");
            System.out.println("Nhập 4: Xóa sinh viên");
            System.out.println("Nhập 5: Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng mới sau nextInt()

            switch (choice) {
                case 1:
                    displayAllStudent(students, studentCount);
                    break;
                case 2:
                    addStudent(students, studentCount);
                    studentCount++;
                    break;
                case 3:
                    updateStudent(students, studentCount);
                    break;
                case 4:
                    deleteStudent(students, studentCount);
                    studentCount--;
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không đúng");
                    break;
            }
        } while (choice != 5);
    }

    public static void displayAllStudent(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên trống");
        } else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println("Sinh viên thứ " + (i + 1) + " là:");
                students[i].displayData();
                System.out.println("-------------------------");
            }
        }
    }

    public static void addStudent(Student[] students, int studentCount) {
        if (studentCount == students.length) {
            System.out.println("Danh sách sinh viên đầy, không thể thêm mới");
        } else {
            Student student = new Student();
            student.inputData();
            students[studentCount] = student;
            studentCount += 1;
            System.out.println("Thêm sinh viên thành công");
        }
    }

    public static void updateStudent(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên trống");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã HS cần sửa");
            int studentId = sc.nextInt();
            boolean found = false;
            sc.nextLine();
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getStudentId() == studentId) {
                    System.out.println("Thông tin sinh viên cần sửa:");
                    students[i].displayData();
                    System.out.println("Nhập thông tin sinh viên mới:");
                    students[i].inputData();
                    System.out.println("Sửa thông tin sinh viên thành công");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy học sinh có mã " + studentId + " trong danh sách.");
            }
        }
    }

    public static void deleteStudent(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách sinh viên trống");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã HS cần xóa");
            int studentId = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng mới
            boolean found = false;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getStudentId() == studentId) {
                    System.out.println("Thông tin học sinh cần xoá:");
                    students[i].displayData();
                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    studentCount--;
                    System.out.println("Xoá học sinh thành công.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy học sinh có mã " + studentId + " trong danh sách.");
            }
        }
    }
}
