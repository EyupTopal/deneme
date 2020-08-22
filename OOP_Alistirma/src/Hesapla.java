public class Hesapla {
  public int faktoriyelHesapla(int sayi){
      int faktoriyel=1;
      for(int i=1; i<=sayi; i++){
          faktoriyel=faktoriyel*i;
      }
      return faktoriyel;
  }
  public boolean asalSayiKontrol(int sayi) {
      int toplam = 0;
      for (int i = 2; i < sayi; i++) {
          if (i % sayi == 0) {
              toplam = toplam + 1;
          }
      }
      if (toplam == 0) {
          return true;
      } else {return false;}
  }
        public boolean pozitifNegatif(int sayi){
             if (sayi>0){
            return true;
            }
             else{
            return false;
            }
        }
        public void kupBul(int sayi){
        int kup=0;
        kup=sayi*sayi*sayi;
            System.out.println ("küp "+sayi+"= "+kup);
        }
        public void kare(int sayi){
            int kare=0;
            kare=sayi*sayi;
            System.out.println ("kare "+sayi+"= "+kare);
        }

    }

