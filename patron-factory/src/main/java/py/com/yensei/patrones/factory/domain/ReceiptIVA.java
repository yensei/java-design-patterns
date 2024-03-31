package py.com.yensei.patrones.factory.domain;


public class ReceiptIVA extends Receipt{

    @Override
    public Double getTaxAmountIVA() {
        TaxType type = getTaxType();
        switch (type) {
            case IVA_10:
                return getAmount() * 1.10; // Agrega 10% al monto
            case IVA_5:
                return getAmount() * 1.05; // Agrega 5% al monto
            default:
                return getAmount();            
        }
    }

}
