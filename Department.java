import java.util.*;

interface Department {
    void printDept();
}

class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    void getHostel(String h, String l, int r) {
        hostelName = h;
        hostelLocation = l;
        numberOfRooms = r;
    }

    void printHostel() {
        System.out.println(hostelName + " " + hostelLocation + " " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject, deptName, deptHead;
    double avgMarks;

    void getData(String n, String r, String e, double m, String d, String h) {
        studentName = n;
        regdNo = r;
        electiveSubject = e;
        avgMarks = m;
        deptName = d;
        deptHead = h;
    }

    public void printDept() {
        System.out.println(deptName + " " + deptHead);
    }

    void printData() {
        System.out.println(studentName + " " + regdNo + " " + electiveSubject + " " + avgMarks);
        printHostel();
        printDept();
    }
}

class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            int ch = sc.nextInt();

            if (ch == 1) {
                Student s = new Student();
                s.getData(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
                s.getHostel(sc.next(), sc.next(), sc.nextInt());
                list.add(s);
            } else if (ch == 2) {
                String r = sc.next();
                for (Student s : list) {
                    if (s.regdNo.equals(r)) {
                        list.remove(s);
                        break;
                    }
                }
            } else if (ch == 3) {
                for (Student s : list) {
                    s.printData();
                }
            } else break;
        }
    }
}
