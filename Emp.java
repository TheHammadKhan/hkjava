class Emp {
    int emp_no;
    String name, department;
    double basic, DA, HRA, gross;

    Emp(int no, String n, String d, double b) {
        emp_no = no;
        name = n;
        department = d;
        basic = b;
        DA = 0.1 * basic;
        HRA = 0.2 * basic;
        gross = basic + DA + HRA;
    }

    public static void main(String[] args) {
        Emp[] e = {
            new Emp(1,"A","IT",20000),
            new Emp(2,"B","HR",25000),
            new Emp(3,"C","Sales",30000)
        };

        Emp max = e[0];

        for (int i = 1; i < e.length; i++) {
            if (e[i].gross > max.gross)
                max = e[i];
        }

        System.out.println(max.name + " " + max.gross);
    }
}
