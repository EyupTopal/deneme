import java.util.Random;

public class CokBoyutluDizi {
    public static void main (String []args){
     //0-Mat, 1- Türkce, 2- Fen;
        int [][]sinifNotlari=new int[40][3];
      for (int i=0; i<40; i++){
          for (int k=0; k<3; k++){
              Random rnd=new Random ();
              int not=rnd.nextInt (100)+1;

              sinifNotlari[i][k]=not;
          }
      }
      for (int i=0; i<40; i++){
          for (int k=0; k<3; k++){
              String dersIsmi=" ";
              if (k==0){
                  dersIsmi="Matematik";
              }
              if (k==1){
                  dersIsmi=" Türkce ";
              }
              else{
                  dersIsmi="Fen";
              }
              System.out.println ((i+1)+ " nci ögrencinin " +dersIsmi+ " notu = "+ sinifNotlari[i][k] );
          }
      }




    }
}
