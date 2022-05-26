public class deneme{
    public static void main (String args[])
    {
        Insan i1 = new Insan(21, "Veli");
        Insan i2 = new Insan(30, "Ali");

        Bisiklet b1 = new Bisiklet();

        b1.in();
        b1.bin(i2);
        b1.bin(i2);
        b1.in();
        b1.bin(i2);

    }
}