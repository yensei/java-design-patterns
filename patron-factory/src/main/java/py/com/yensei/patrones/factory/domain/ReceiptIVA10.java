package py.com.yensei.patrones.factory.domain;


public class ReceiptIVA10 extends Receipt{

    @Override
    public Double getTaxAmountIVA() {
        return getAmount() * 1.10; // Agrega 10% al monto
    }

}
