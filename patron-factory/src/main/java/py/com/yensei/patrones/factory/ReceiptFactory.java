package py.com.yensei.patrones.factory;

import py.com.yensei.patrones.factory.domain.Receipt;
import py.com.yensei.patrones.factory.domain.ReceiptIVA10;
import py.com.yensei.patrones.factory.domain.ReceiptIVA5;
import py.com.yensei.patrones.factory.domain.ReceiptTaxFree;

public class ReceiptFactory {

    public static Receipt getReceiptIVA10() {
        Receipt r = new ReceiptIVA10();
        return r;
    }


    public static Receipt getReceiptIVA5() {
        Receipt r = new ReceiptIVA5();
        return r;
    }

    public static Receipt getReceiptTaxFree(){
        return new ReceiptTaxFree();
    }

}
