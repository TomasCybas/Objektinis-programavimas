package namudarbas9.Uzduotis1;

import java.util.Arrays;

public class Staff {
     StaffMember[] staffList;



    public Staff() {
        this.staffList = new StaffMember[0];
    }



        public void addStaffMember(StaffMember staff){
        this.staffList = Arrays.copyOf(staffList, this.staffList.length + 1);
        this.staffList[this.staffList.length - 1] = staff;
    }

    public double payDay(){
        double totalSalary = 0;
        for (int  i = 0; i < staffList.length; i++){
            double salary = staffList[i].pay();
            if (salary > 0) {
                System.out.println(staffList[i]);
                System.out.println("Išmokėta: " + salary);
            }
            totalSalary += salary;
        }
        return totalSalary;
    }
}


