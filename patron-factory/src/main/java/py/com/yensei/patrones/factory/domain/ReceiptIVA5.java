package py.com.yensei.patrones.factory.domain;


public class ReceiptIVA5 extends Receipt{

    @Override
    public Double getTaxAmountIVA() {
        return getAmount() * 1.05; // Agrega 5% al monto
    }
}
