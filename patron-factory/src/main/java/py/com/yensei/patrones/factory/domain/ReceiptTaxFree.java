package py.com.yensei.patrones.factory.domain;

public class ReceiptTaxFree extends Receipt{

    @Override
    public Double getTaxAmountIVA(){
        return getAmount(); // El monto es exenta, no se agrea ningún impuesto
    }

}
