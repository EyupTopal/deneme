//import java.util.Scanner;
//
//public class Ver1<sortedArray> {
//
//    private static Scanner scanner=new Scanner(System.in);
//    public static void main(String[] args) {
//
//        int [] myIntegers= getIntegers(5);
//        int [] sorted= sortIntegers(myIntegers);
//          printArray(sorted);
////          printArray(myIntegers);
//
//        }
//        public static int[] getIntegers(int capacity){
//        int [] array=new int[capacity];
//            System.out.println("Enter "+ capacity+ "  integer values\r");
//            for (int i=0; i<array.length; i++){
//                array[i]=scanner.nextInt();
//            }
//        return array;
//        }
//        public static void printArray(int[]array ){
//        for(int i=0; i<array.length; i++){
//            System.out.println("Element "+ i+ " Content "+ array[i]);
//        }}
//        public static int[] sortIntegers(int[]array){
//        int [] sortedArray=new int [array.length];
//        for (int i=0; i<array.length; i++){
//            sortedArray[i]=array[i];
//        }
////        int[] sortedArray= Arrays.copyOf(array,array.length);
//        boolean flag =true;
//        int temp;
//        while (flag){
//        flag=false;
//        for(int i=0; i<array.length-1; i++){
//        if(array[i]<array[i+1]){
//        temp=array[i];
//        array[i]=array[i+1];
//        array[i+1]=temp;
//        flag=true;
//        }}}
//        return array;
//}
//}