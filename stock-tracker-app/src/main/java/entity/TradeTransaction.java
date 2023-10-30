package entity;

public class TradeTransaction extends Transaction {
    private Tradeable assetIn;
    private Tradeable assetOut;
    private double amountIn;
    private double amountOut;

    public TradeTransaction(Double tradingFee, Tradeable assetIn, Tradeable assetOut, double amountIn, double amountOut) {
        super(tradingFee);
        this.assetIn = assetIn;
        this.assetOut = assetOut;
        this.amountIn = amountIn;
        this.amountOut = amountOut;
    }

    public Tradeable getAssetIn() {
        return assetIn;
    }

    public Tradeable getAssetOut() {
        return assetOut;
    }

    public double getAmountIn() {
        return amountIn;
    }

    public double getAmountOut() {
        return amountOut;
    }



    private void trade() {
        // #TODO
    }
}
