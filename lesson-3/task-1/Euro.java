public class Euro implements Currency{
    private float balance;
    
    Euro(float value){
        this.balance = value;
    }
    
    public Currency addedCurrency(float value, String currency){
        if ("EUR".equals(currency)){
            return new Euro(balance + value);
        }else if ("USD".equals(currency)){
            return new Euro(balance + (value*dollarExchangeRate()));
        }else{
            System.out.println("Undefined currency");
            return new Euro(balance);
        }
            
    }
    
    public Currency subtractedCurrency(float value, String currency){
        if ("EUR".equals(currency)){
            if (balance - value < 0){
                System.out.println("Not enough money");
                return new Euro(balance);
            }else{
                return new Euro(balance - value);
            }
            
        }else if ("USD".equals(currency)){
            if (balance - (value*dollarExchangeRate()) < 0){
                System.out.println("Not enough money");
                return new Euro(balance);
            }else{
                return new Euro(balance - (value*dollarExchangeRate()));
            }
            
        }else{
            System.out.println("Undefined currency");
            return new Euro(balance);
        }
    }
    
    public String abbreviation(){
        return "EUR";
    }
    public String symbol(){
        return "€";
    }
    public String balance(){
        return Float.toString(balance);
    }
    public float dollarExchangeRate(){
        return 1.05f;
    }
    
}