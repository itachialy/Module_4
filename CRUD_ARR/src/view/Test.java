package view;

import controller.StudentController;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Xem danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Tìm sinh viên theo ID");
            System.out.println("4. Cập nhật sinh viên");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Tìm sinh vin theo Tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc dòng mới
            switch (choice) {
                case 1:
                    studentController.findAll();
                    break;
                case 2:
                    studentController.addStudent();
                    break;
                case 3:
                    studentController.findById();
                    break;
                case 4:
                    studentController.save();
                    break;
                case 5:
                    studentController.delete();
                    break;
                case 6:
                    studentController.findByName();
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Tùy chọn không hợp lệ, vui lòng chọn lại.");
            }
            System.out.println();
        } while (choice != 0);

        sc.close();
    }
}
