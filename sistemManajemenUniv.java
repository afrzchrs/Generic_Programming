import java.util.Scanner;

public class sistemManajemenUniv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manager<uniUser> userManager = new manager<>();
        manager<uniCourse> courseManager = new manager<>();

        while (true) {
            System.out.println("\n==== Sistem Manajemen Universitas Sederhana ====");
            System.out.println("1. Tambah Data Pengguna");
            System.out.println("2. Tambah Data Course");
            System.out.println("3. Lihat Data Semua Pengguna");
            System.out.println("4. Lihat Data Semua Course");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");

            int input = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (input) {
                case 1:
                    System.out.println("Pilih jenis pengguna yang ingin ditambah:");
                    System.out.println("1. Mahasiswa");
                    System.out.println("2. Professor");
                    System.out.print("Pilihan: ");
                    int input_user = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (input_user == 1) {
                        Student student = new Student();
                        System.out.print("Masukkan nama mahasiswa: ");
                        student.setName(scanner.nextLine());
                        System.out.print("Masukkan NIM mahasiswa: ");
                        student.setStudentID(scanner.nextLine());
                        userManager.addItem(student);
                        System.out.println("Mahasiswa berhasil ditambahkan!");
                    } else if (input_user == 2) {
                        Professor professor = new Professor();
                        System.out.print("Masukkan nama professor: ");
                        professor.setName(scanner.nextLine());
                        System.out.print("Masukkan departemen professor: ");
                        professor.setDepartment(scanner.nextLine());
                        userManager.addItem(professor);
                        System.out.println("Professor berhasil ditambahkan!");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 2:
                    Courses course = new Courses();
                    System.out.print("Masukkan nama course: ");
                    course.setCourseName(scanner.nextLine());
                    System.out.print("Masukkan ID course: ");
                    course.setCourseID(scanner.nextInt());
                    scanner.nextLine(); // consume newline
                    courseManager.addItem(course);
                    System.out.println("Course berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.println("=== Data Semua Pengguna ===");
                    userManager.displayAllItems();
                    break;

                case 4:
                    System.out.println("=== Data Semua Course ===");
                    courseManager.displayAllItems();
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}