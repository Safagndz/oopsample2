public class Bisiklet {

    Insan binmisInsan;

    public Bisiklet()
    {
        binmisInsan = null;
    }

    public Bisiklet(Insan gelenInsan)
    {
        binmisInsan = gelenInsan;
    }

    public void bin( Insan gelenInsan)
    {
        if(binmisInsan == null)
        {
            binmisInsan = gelenInsan;
            System.out.println(binmisInsan.getIsim()
            + " başarıyla bindi.");
        }
        else
        {
            System.out.println("Zaten "+ binmisInsan.getIsim()
                    + " binmiş!");
        }
    }
    public void in()
    {
        if(binmisInsan == null)
        {
            System.out.println("Zaten bisiklet boş!");
        }
        else
        {
            String isim = binmisInsan.getIsim();
            binmisInsan = null;
            System.out.println(isim + "indi!");

    }
}}
