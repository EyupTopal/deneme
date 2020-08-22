package Sinav;

public class Frage2 {
    public static void main(String[] args) {
daysOfMonth (13);
    }
    public static void daysOfMonth(int mounth){
        switch (mounth) {
            case 1:
                System.out.println("Ocak = " + 31);
                break;
            case 2:
                System.out.println("Subat = " + 28);
                break;
            case 3:
                System.out.println ("Mart = "+ 31);
                break;
            case 4:
                System.out.println ("Nisan = "+ 30);
                break;
            case 5:
                System.out.println ("Mayis = "+ 31);
                break;
            case 6:
                System.out.println ("Haziran = "+ 30);
                break;
            case 7:
                System.out.println ("Temmuz = "+ 31);
                break;
            case 8:
                System.out.println ("Agustos = " + 31);
                break;
            case 9:
                System.out.println ("Eylül = "+ 30);
                break;
            case 10:
                System.out.println ("Ekim = "+ 31);
                break;
            case 11:
                System.out.println ("Kasim = " +30);
                break;
            case 12:
                System.out.println ("Aralik = "+ 31);
                break;
            default:
                System.out.println("Invalid Month ");

        }
    }
}
