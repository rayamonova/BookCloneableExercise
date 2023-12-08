package bg.smg;

public class Price {
    private double value;
    private PriceCurrency currency;

    public Price(double value, PriceCurrency currency) {
        this.value = value;
        this.currency = currency;
    }

    public Price() {
    }


    public void setValue(double value) {
        this.value = value;
    }

    public PriceCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(PriceCurrency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                ", currency=" + currency +
                '}';
    }
    public double getValue(){
        return value;
    }
}
