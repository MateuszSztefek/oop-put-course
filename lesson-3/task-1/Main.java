public class Main
{
    public static void main(String[] args) {
        Currency eur = new Euro(15f);
        
        System.out.println(eur.balance());
        
        eur = eur.addedCurrency(14.63f, "EUR");
        eur = eur.subtractedCurrency(20.41f, "USD");
        eur = eur.subtractedCurrency(201.65f, "EUR");
        
        System.out.println(eur.balance());
    }
}
