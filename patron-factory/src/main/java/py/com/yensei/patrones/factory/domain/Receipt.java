package py.com.yensei.patrones.factory.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @ToString @NoArgsConstructor
public abstract class Receipt {
    private Integer id;
    private Double amount;
    private ReceiptType receiptType;
    
    // cada clase hija debe implementar
    public abstract Double getTaxAmountIVA();
}
