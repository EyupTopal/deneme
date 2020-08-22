public abstract class  Hayvan {
    private String renk;
    public Hayvan(String renk);
        {
            this.renk=renk;
        }
    abstract void bacakSayisi(int sayi);
    public void renkYaz(){
    System.out.println(renk);
        }
}
