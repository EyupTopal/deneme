package Exercises_If;

public class MegaByteConverter {
    public static void main(String[] args) {
             MegaBytesAndKiloBytes(2500);
         }
            public static void MegaBytesAndKiloBytes(int x1){
            int  x2,x3,x4;
            x2=1000;
            x3=x1/x2;
            x4=(x1-x2);
            System.out.println (x3+" MB and "+x4+" KB");
        }
    }
