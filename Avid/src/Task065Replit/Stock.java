package Task065Replit;

/**
 * Created by Ilian on 7/25/2017.
 */
public class Stock {
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    public Stock(String tickerSymbol,
                 String companyName,
                 int price,
                 int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;


    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap() {
        this.marketCap = totalShares * price;
    }

    public void adjustPrice(double change){
        price = (int)(price * (change + 100)/100);

    }
    public String toString(){

        String str = "Ticker Symbol: " + tickerSymbol + "\n" + "Company: " + companyName + "\n"
                    + "Current Price: " + price + "\n" + "Market Cap: " + getMarketCap();

        return str;
    }
}
