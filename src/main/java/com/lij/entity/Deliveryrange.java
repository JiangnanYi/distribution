package com.lij.entity;

import java.math.BigDecimal;

public class Deliveryrange {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.rangeID
     *
     * @mbg.generated
     */
    private String rangeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.dePID
     *
     * @mbg.generated
     */
    private String depid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.areaID
     *
     * @mbg.generated
     */
    private String areaid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.rangeName
     *
     * @mbg.generated
     */
    private String rangename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.deliveiyPrice
     *
     * @mbg.generated
     */
    private BigDecimal deliveiyprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column deliveryrange.Comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.rangeID
     *
     * @return the value of deliveryrange.rangeID
     *
     * @mbg.generated
     */
    public String getRangeid() {
        return rangeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.rangeID
     *
     * @param rangeid the value for deliveryrange.rangeID
     *
     * @mbg.generated
     */
    public void setRangeid(String rangeid) {
        this.rangeid = rangeid == null ? null : rangeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.dePID
     *
     * @return the value of deliveryrange.dePID
     *
     * @mbg.generated
     */
    public String getDepid() {
        return depid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.dePID
     *
     * @param depid the value for deliveryrange.dePID
     *
     * @mbg.generated
     */
    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.areaID
     *
     * @return the value of deliveryrange.areaID
     *
     * @mbg.generated
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.areaID
     *
     * @param areaid the value for deliveryrange.areaID
     *
     * @mbg.generated
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.rangeName
     *
     * @return the value of deliveryrange.rangeName
     *
     * @mbg.generated
     */
    public String getRangename() {
        return rangename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.rangeName
     *
     * @param rangename the value for deliveryrange.rangeName
     *
     * @mbg.generated
     */
    public void setRangename(String rangename) {
        this.rangename = rangename == null ? null : rangename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.deliveiyPrice
     *
     * @return the value of deliveryrange.deliveiyPrice
     *
     * @mbg.generated
     */
    public BigDecimal getDeliveiyprice() {
        return deliveiyprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.deliveiyPrice
     *
     * @param deliveiyprice the value for deliveryrange.deliveiyPrice
     *
     * @mbg.generated
     */
    public void setDeliveiyprice(BigDecimal deliveiyprice) {
        this.deliveiyprice = deliveiyprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column deliveryrange.Comment
     *
     * @return the value of deliveryrange.Comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column deliveryrange.Comment
     *
     * @param comment the value for deliveryrange.Comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}