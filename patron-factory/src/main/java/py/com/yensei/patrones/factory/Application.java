package py.com.yensei.patrones.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import py.com.yensei.patrones.factory.domain.Receipt;
import py.com.yensei.patrones.factory.domain.ReceiptType;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Receipt iva10Percent = ReceiptFactory.getReceiptIVA10();
		iva10Percent.setAmount(10000.0);
		iva10Percent.setId(1);
		iva10Percent.setReceiptType(ReceiptType.CREDIT);		


		System.out.println(iva10Percent + " TAX = "+ iva10Percent.getTaxAmountIVA()); // datos de la factura + el monto con impue5os

		Receipt iva5Percent = ReceiptFactory.getReceiptIVA5();
		iva5Percent.setAmount(10000.0);
		iva5Percent.setId(1);
		iva5Percent.setReceiptType(ReceiptType.CREDIT);


		System.out.println(iva5Percent + " TAX = "+ iva5Percent.getTaxAmountIVA()); // datos de la factura + el monto con impuestos


		Receipt taxFree = ReceiptFactory.getReceiptTaxFree();
		taxFree.setAmount(10000.0);
		taxFree.setId(2);		
		taxFree.setReceiptType(ReceiptType.CASH);		

		System.out.println(taxFree + " TAX = "+ taxFree.getTaxAmountIVA()); // datos de la factura + el monto con impuestos

	}

}
