/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tigergreat.transcationrecord;

/**
 *
 * @author AM I
 */
public class TranscationRecord {
    private String buyerTIN;
    private String sellerTIN;
    private double InvoiceAmount;
    private String transcationTimestamp;
    
    public TranscationRecord(String buyerTIN, String sellerTIN, double InvoiceAmount, String transcationTimestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.InvoiceAmount = InvoiceAmount;
        this.transcationTimestamp = transcationTimestamp;
       
    
}
 public String getBuyerTIN() {
        return buyerTIN;
}
  public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }
  public void setInvoiceAmount(double invoiceAmount) {
        this.InvoiceAmount = invoiceAmount;
    }
  public String getTransactionTimestamp() {
        return transcationTimestamp;
    }
    public void setTranscationTimestamp(String transcationTimestamp) {
        this.transcationTimestamp = transcationTimestamp;
    }
}