package namudarbas9.Uzduotis1;

import namudarbas9.Uzduotis1.StaffMember;

public class Staff {
     StaffMember[] staffList;


    public Staff(int i) {
        this.staffList = new StaffMember[i];
    }


    int j = 0;
    public void addStaffMember(StaffMember staff){
        this.staffList[j] = staff;
        j++;
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


