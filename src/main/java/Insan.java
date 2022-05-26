public class Insan {
    public String yaş;
    private int yas;
    private String isim;

    public Insan()
    {
        yas = (-1);
        isim = "İsimsiz";
    }
    Insan(int alinanYas, String alinanIsim)
    {
        yas = alinanYas;
       isim = alinanIsim;

    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setYas (int yas) {
        this.yas= yas;
    }
    public int getYas() {
        return yas;
    }

}
