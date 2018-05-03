public class StockOffer {

  private int stockShares = 0;
  private String stockSymbol = "";
  private int colleagueCode = 0;

  public StockOffer(int stockShares, String stockSymbol, int colleagueCode) {
    this.stockShares = stockShares;
    this.stockSymbol = stockSymbol;
    this.colleagueCode = colleagueCode;
  }

  public int getStockShares () { return stockShares; }
  public String getStockSymbol () { return stockSymbol; }
  public int getColleagueCode () { return colleagueCode; }

}
