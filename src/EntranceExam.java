import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EntranceExam {
    public static final String groupA = "1. Examinee Group A";
    public static final String groupB = "2. Examinee Group B";
    public static final String groupC = "3. Examinee Group C";
    public static final String enterGroup = "Enter the group of examinee: ";
    public static final String enterOrderNumber = "Enter Order Number: ";
    public static final String enterName = "Enter name: ";
    public static final String enterAddress = "Enter address: ";
    public static final String enterAreasOfPriority = "Enter Areas Of Priority: ";
    public static final String enterMathScore = "Enter Math Scores: ";
    public static final String enterPhysicsScores = "Enter Physics Scores: ";
    public static final String enterChemistryScore = "Enter Chemistry Score: ";
    public static final String enterBiologyScore = "Enter Biology Score: ";
    public static final String enterLiteratureScore = "Enter Literature Score: ";
    public static final String enterHistoryScore = "Enter History Score: ";
    public static final String enterGeographyScore = "Enter Geography Score: ";
    public static final String noMatching = "No matching with any Examinee";
    Scanner sc = new Scanner(System.in);
    List<Examinee> examineeList = new LinkedList<>();
    private int orderNumber;
    private String name;
    private String address;
    private String areasOfPriority;

    public EntranceExam() {
        examineeList.add(new ExamineeGroupA(100, "NightWish", "Islander", "Area 1", 9.0, 8.2, 8.9));
        examineeList.add(new ExamineeGroupB(101, "Disturbed", "Silence Hill", "Area 2", 9.3, 7.7, 8.9));
        examineeList.add(new ExamineeGroupC(102, "Hozier", "Church", "Area 3", 6.8, 9.8, 7.8));
    }

    // Nhập thông tin về các thí sinh dự thi
    public Examinee inputInfoExaminee() {
        System.out.println(groupA);
        System.out.println(groupB);
        System.out.println(groupC);
        System.out.println(enterGroup);
        int selection = sc.nextInt();
        switch (selection) {
            case 1: {
                Examinee examinee = inputInfoExamineeA();
                examineeList.add(examinee);
                break;
            }
            case 2: {
                Examinee examinee = inputInfoExamineeB();
                examineeList.add(examinee);
                break;
            }
            case 3: {
                Examinee examinee = inputInfoExamineeC();
                examineeList.add(examinee);
                break;
            }
        }
        return null;
    }

    private void inputExamineeInfo() {
        System.out.println(enterOrderNumber);
        orderNumber = sc.nextInt();
        sc.nextLine();
        System.out.println(enterName);
        name = sc.nextLine();
        System.out.println(enterAddress);
        address = sc.nextLine();
        System.out.println(enterAreasOfPriority);
        areasOfPriority = sc.nextLine();
    }

    private Examinee inputInfoExamineeA() {
        inputExamineeInfo();
        System.out.println(enterMathScore);
        double mathScores = sc.nextDouble();
        System.out.println(enterPhysicsScores);
        double physicsScore = sc.nextDouble();
        System.out.println(enterChemistryScore);
        double chemistryScore = sc.nextDouble();
        ExamineeGroupA examineeGroupA = new ExamineeGroupA(orderNumber, name, address, areasOfPriority,
                mathScores, physicsScore, chemistryScore);
        return examineeGroupA;
    }

    private Examinee inputInfoExamineeB() {
        inputExamineeInfo();
        System.out.println(enterMathScore);
        double mathScores = sc.nextDouble();
        System.out.println(enterChemistryScore);
        double chemistryScore = sc.nextDouble();
        System.out.println(enterBiologyScore);
        double biologyScore = sc.nextDouble();
        ExamineeGroupB examineeGroupB = new ExamineeGroupB(orderNumber, name, address, areasOfPriority,
                mathScores, chemistryScore, biologyScore);
        return examineeGroupB;
    }


    private Examinee inputInfoExamineeC() {
        inputExamineeInfo();
        System.out.println(enterLiteratureScore);
        double literatureScore = sc.nextDouble();
        System.out.println(enterHistoryScore);
        double historyScore = sc.nextDouble();
        System.out.println(enterGeographyScore);
        double geographyScore = sc.nextDouble();
        ExamineeGroupC examineeGroupC = new ExamineeGroupC(orderNumber, name, address, areasOfPriority,
                literatureScore, historyScore, geographyScore);
        return examineeGroupC;
    }

    // Hiển thị thông tin về thí sinh
    public void displayExaminee() {
        for (int i = 0; i < examineeList.size(); i++) {
            Examinee examinee = examineeList.get(i);
            System.out.println(examinee);
        }
    }

    // Sắp xếp danh sách thí sinh theo tên sử dụng selection sort
    public void sortExamineeByName() {
        int min;
        for (int i = 0; i < examineeList.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < examineeList.size(); j++) {
                Examinee examinee = examineeList.get(i);
                if (examinee.getName().compareTo(examineeList.get(j).getName()) < 0) {
                    min = j;
                }
                if (min != i) {
                    Examinee examineeTemp = examineeList.get(min);
                    examineeList.set(min, examineeList.get(i));
                    examineeList.set(i, examineeTemp);
                }
            }
        }
        displayExaminee();
    }

    // Tìm kiếm theo số báo danh sử dụng thuật toán nhị phân
    public void findExaminee(int orderNumber) {
        Examinee examinee = findExamineeById(orderNumber);
        if (examinee == null) {
            System.out.println(noMatching);
        } else {
            System.out.println(examinee);
        }
    }

    public Examinee findExamineeById(int orderNumber) {
        sortExamineeById();
        int left = 0;
        int right = examineeList.size() - 1;
        do {
            int mid = (right + left) / 2;
            int midExamineeIndex = examineeList.get(mid).getOrderNumber();
            if (orderNumber == midExamineeIndex) {
                return examineeList.get(mid);
            } else if (orderNumber < midExamineeIndex) {
                right = mid - 1;
            } else if (orderNumber > midExamineeIndex) {
                left = mid + 1;
            }
        } while (left <= right);
        return null;
    }

    public void sortExamineeById() {
        for (int i = 0; i < examineeList.size(); i++) {
            int index = i;
            Examinee temp = examineeList.get(i);
            while (index > 0 && temp.getOrderNumber() > examineeList.get(index - 1).getOrderNumber()) {
                examineeList.set(index, examineeList.get(index - 1));
                index--;
            }
            examineeList.set(index, temp);
        }
    }

    // Chỉnh sửa thông tin của thí sinh
    public void fixInfoExaminee() {
        System.out.println(enterOrderNumber);
        int orderNumber = sc.nextInt();
        Examinee count = null;
        int k = -1;
        for (int i = 0; i < examineeList.size(); i++) {
            Examinee examinee = examineeList.get(i);
            if (examinee.getOrderNumber() == orderNumber) {
                count = examinee;
                k = i;
            }
        }
        if (count == null) {
            System.out.println(noMatching);
        } else {
            examineeList.set(k, inputInfoExaminee());
            displayExaminee();
        }
    }

    // Xóa thông tin của thí sinh
    public void deleteExaminee() {
        System.out.println(enterOrderNumber);
        int orderNumber = sc.nextInt();
        Examinee count = null;
        for (int i = 0; i < examineeList.size(); i++) {
            Examinee examinee = examineeList.get(i);
            if (examinee.getOrderNumber() == orderNumber) {
                count = examinee;
            }
        }
        if (count == null) {
            System.out.println(noMatching);
        } else {
            examineeList.remove(count);
            displayExaminee();
        }
    }
}
