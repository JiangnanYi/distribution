package com.lij.entity;

public class Association1Key {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column association_1.Ord_orderID
     *
     * @mbg.generated
     */
    private String ordOrderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column association_1.Del_deliveryReceiptID
     *
     * @mbg.generated
     */
    private String delDeliveryreceiptid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column association_1.Ord_orderID
     *
     * @return the value of association_1.Ord_orderID
     *
     * @mbg.generated
     */
    public String getOrdOrderid() {
        return ordOrderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column association_1.Ord_orderID
     *
     * @param ordOrderid the value for association_1.Ord_orderID
     *
     * @mbg.generated
     */
    public void setOrdOrderid(String ordOrderid) {
        this.ordOrderid = ordOrderid == null ? null : ordOrderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column association_1.Del_deliveryReceiptID
     *
     * @return the value of association_1.Del_deliveryReceiptID
     *
     * @mbg.generated
     */
    public String getDelDeliveryreceiptid() {
        return delDeliveryreceiptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column association_1.Del_deliveryReceiptID
     *
     * @param delDeliveryreceiptid the value for association_1.Del_deliveryReceiptID
     *
     * @mbg.generated
     */
    public void setDelDeliveryreceiptid(String delDeliveryreceiptid) {
        this.delDeliveryreceiptid = delDeliveryreceiptid == null ? null : delDeliveryreceiptid.trim();
    }
}