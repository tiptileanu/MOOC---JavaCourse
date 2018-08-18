public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance=balanceAtStart;
    }

    public String toString() {
        return
                "The card has " + this.balance + " euros";
    }
    
    public void payEconomical() {
        if (balance>=2.5){
            this.balance-=2.5;
        }
        
    }

    public void payGourmet() {
        if(balance>=4){
            this.balance-=4;
        }   
    }
    
    public void loadMoney(double amount) {
        if(amount>=0){
            if((balance+amount)>=150){
                balance=150;
            } else
                balance+=amount;
        }
        
    }
}
