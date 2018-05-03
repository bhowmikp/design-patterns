public class Client {

  public static void main(String [] args) {

    StockMediator nyse = new StockMediator();

		GoldmanSachs broker = new GoldmanSachs(nyse);

		JPMorgan broker2 = new JPMorgan(nyse);

		broker.saleOffer("MSFT", 100);
		broker.saleOffer("GOOG", 50);

		broker2.buyOffer("MSFT", 100);
		broker2.saleOffer("NRG", 10);

		broker.buyOffer("NRG", 10);

		nyse.getStockOfferings();

  }

}
