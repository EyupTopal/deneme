public class Main {
    public static void main(String[] args) {
int [] valuearray1 = new int[3];
int []  valuearray2 = valuearray1;
        System.out.println ("value array 1 "+ valuearray1);
        System.out.println ("value array 2 "+ valuearray2);

        valuearray1 [0] =3;
        valuearray2 [1]= 6;
        valuearray1 [2]= 11;
        System.out.println ("value array 1 "+ valuearray1);
        System.out.println ("value array 2 "+ valuearray2);
    }
}
