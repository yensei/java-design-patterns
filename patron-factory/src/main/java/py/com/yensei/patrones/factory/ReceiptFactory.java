package py.com.yensei.patrones.factory;

import py.com.yensei.patrones.factory.domain.Receipt;
import py.com.yensei.patrones.factory.domain.ReceiptIVA;
import py.com.yensei.patrones.factory.domain.ReceiptTaxFree;
import py.com.yensei.patrones.factory.domain.TaxType;

public class ReceiptFactory {

    public static Receipt getReceiptIVA10() {
        Receipt r = new ReceiptIVA();
        r.setTaxType(TaxType.IVA_10);
        return r;
    }


    public static Receipt getReceiptIVA5() {
        Receipt r = new ReceiptIVA();
        r.setTaxType(TaxType.IVA_5);
        return r;
    }

    public static Receipt getReceiptTaxFree(){
        return new ReceiptTaxFree();
    }

}
