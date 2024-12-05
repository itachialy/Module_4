package view;

import controller.StudentController;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu() {
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Hiển thị tất cả sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Cập nhật sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới

            switch (choice) {
                case 1:
                    studentController.findAll();
                    break;
                case 2:
                    studentController.addStudent();
                    break;
                case 3:
                    studentController.updateStudent();
                    break;
                case 4:
                    studentController.deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

}
