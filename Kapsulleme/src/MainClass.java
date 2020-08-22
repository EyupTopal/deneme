public class MainClass {
    public static void main (String[]args){
        Ogrenci ogr=new Ogrenci ("Eyup", "Topal", 21,2);
        System.out.println (ogr.getOgrenciAdi ()+"  "+ ogr.getOgrenciSoyadi ()+"  "+ ogr.getOgrenciNo ()+"  "+ ogr.getOgrenciSinif ());
    }
}
