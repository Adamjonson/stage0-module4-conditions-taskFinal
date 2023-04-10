package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    //System.out.println("leap");
                    return true;

                }else {
                    //System.out.println("not leap");
                    return false;
                }
            }else {
                //System.out.println("leap");
                return true;
            }
        }else {
            return false;
            //System.out.println("not leap");
        }
    }

    public void amountOfDaysNotLeap(int month) {
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (9):
            case (11):
                System.out.println("31");
                break;
            case (4):
            case (6):
            case (8):
            case (10):
            case (12):
                System.out.println("30");
                break;
            case (2):
                System.out.println("28");
                break;
            default:
                System.out.println("wrong number!");
        }
    }
        public void amountOfDaysLeap(int month) {
            switch (month) {
                case (1):
                case (3):
                case (5):
                case (7):
                case (9):
                case (11):
                    System.out.println("31");
                    break;
                case (4):
                case (6):
                case (8):
                case (10):
                case (12):
                    System.out.println("30");
                    break;
                case (2):
                    System.out.println("29");
                    break;
                default:
                    System.out.println("wrong number!");
            }
        }
    public void printDays(int year, int month) {
       boolean leap = isLeapYear(year);
       if(leap){
           amountOfDaysLeap(month);
       }else {
           amountOfDaysNotLeap(month);
       }
    }
}

