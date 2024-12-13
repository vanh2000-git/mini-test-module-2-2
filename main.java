import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        FulltimeEmployee fe1 = new FulltimeEmployee(01,"Nguyễn Một",23,"0123456alo","123@gmail.com",200000,50000,5000000);
        FulltimeEmployee fe2 = new FulltimeEmployee(02,"Nguyễn Hai",23,"0123457alo","1234@gmail.com",500000,0,5500000);
        FulltimeEmployee fe3 = new FulltimeEmployee(03,"Nguyễn Ba",30,"0124457alo","124@gmail.com",7000000,0,85000000);
        ParttimeEmployee pe1 = new ParttimeEmployee(04,"Trần 1", 18,"0123457789","email@gmail.com",800);
        ParttimeEmployee pe2 = new ParttimeEmployee(05,"Trần 2", 19,"0123447789","email1@gmail.com",750);
        ParttimeEmployee pe3 = new ParttimeEmployee(06,"Trần 3", 28,"0122457789","email2@gmail.com",600);
        Employee[] emp = new Employee[]{fe1,fe2,fe3,pe1,pe2,pe3};
        FulltimeEmployee[] fe = new FulltimeEmployee[]{fe1,fe2,fe3};
        ParttimeEmployee[] pe = new ParttimeEmployee[]{pe1,pe2,pe3};
        double totalSalary = 0;
        double totalPESalary = 0;
        for(Employee employee : emp){
            if (employee instanceof FulltimeEmployee){
                totalSalary += ((FulltimeEmployee) employee).getIncome();
            } else if (employee instanceof ParttimeEmployee){
                totalSalary += ((ParttimeEmployee) employee).getIncome();
            }
        }
        double averageSalary = totalSalary/emp.length;
        for(ParttimeEmployee employee : pe){
            totalPESalary += employee.getIncome();
        }
        List<FulltimeEmployee> fulltimeEmployeesUnderAverageSalary = Arrays.stream(fe).filter(feua -> feua.getIncome() < averageSalary).collect(Collectors.toList());
        System.out.println("Lương trung bình của toàn bộ nhân viên là: " + averageSalary);
        System.out.println("Danh sách những nhân viên fulltime có số lương dưới trung bình:");
        fulltimeEmployeesUnderAverageSalary.forEach(feua ->
                System.out.println(feua.getFullName() + ": " + feua.getIncome()));
        System.out.println("Tông lương phải trả cho tòan bộ nhân viên Parttime: " + totalPESalary);
    }
}
