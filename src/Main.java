import java.util.Scanner;

public class Main {

    public static final String inputInfoExaminee = "1. Enter Information of Examinee";
    public static final String displayInfoExaminee = "2. Display Information of Examinee";
    public static final String sortInfoExaminee = "3. Sort Information of Examinee";
    public static final String findInfoExaminee = "4. Find Examinee by Binary Search";
    public static final String fixInfoExaminee = "5. Fix Examinee Information";
    public static final String deleteInfoExaminee = "6. Delete Examinee Information";
    public static final String exit = "7. Exit";
    public static final String enterSelection = "Enter your selection: ";
    public static final String enterOrderNumber = "Enter Order Number Of Examinee: ";

    public static void main(String[] args) {
        EntranceExam entranceExam = new EntranceExam();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            int selection = sc.nextInt();
            switch (selection) {
                case 1-> entranceExam.inputInfoExaminee();
                case 2-> entranceExam.displayExaminee();
                case 3-> entranceExam.sortExamineeByName();
                case 4 -> {
                    System.out.println(enterOrderNumber);
                    int orderNumber = sc.nextInt();
                    entranceExam.findExaminee(orderNumber);
                }
                case 5-> entranceExam.fixInfoExaminee();
                case 6-> entranceExam.deleteExaminee();
                case 7-> System.exit(0);
            }
        } while (true);

    }
    private static void menu() {
        System.out.println(inputInfoExaminee);
        System.out.println(displayInfoExaminee);
        System.out.println(sortInfoExaminee);
        System.out.println(findInfoExaminee);
        System.out.println(fixInfoExaminee);
        System.out.println(deleteInfoExaminee);
        System.out.println(exit);
        System.out.println(enterSelection);
    }
}
