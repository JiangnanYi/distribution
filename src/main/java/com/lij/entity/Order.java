package com.lij.entity;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.orderID
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.carID
     *
     * @mbg.generated
     */
    private String carid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.cuID
     *
     * @mbg.generated
     */
    private String cuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.postPName
     *
     * @mbg.generated
     */
    private String postpname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.postPTel
     *
     * @mbg.generated
     */
    private String postptel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.postPAddr
     *
     * @mbg.generated
     */
    private String postpaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.getPName
     *
     * @mbg.generated
     */
    private String getpname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.getPTel
     *
     * @mbg.generated
     */
    private String getptel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.getPAddr
     *
     * @mbg.generated
     */
    private String getpaddr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.goodsName
     *
     * @mbg.generated
     */
    private String goodsname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.goodsWeight
     *
     * @mbg.generated
     */
    private Integer goodsweight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.orderType
     *
     * @mbg.generated
     */
    private String ordertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.orderState
     *
     * @mbg.generated
     */
    private String orderstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.trdnsportPrice
     *
     * @mbg.generated
     */
    private Long trdnsportprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.deliveryPrice
     *
     * @mbg.generated
     */
    private Long deliveryprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.totalPrice
     *
     * @mbg.generated
     */
    private String totalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.Comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.orderID
     *
     * @return the value of order.orderID
     *
     * @mbg.generated
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.orderID
     *
     * @param orderid the value for order.orderID
     *
     * @mbg.generated
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.carID
     *
     * @return the value of order.carID
     *
     * @mbg.generated
     */
    public String getCarid() {
        return carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.carID
     *
     * @param carid the value for order.carID
     *
     * @mbg.generated
     */
    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.cuID
     *
     * @return the value of order.cuID
     *
     * @mbg.generated
     */
    public String getCuid() {
        return cuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.cuID
     *
     * @param cuid the value for order.cuID
     *
     * @mbg.generated
     */
    public void setCuid(String cuid) {
        this.cuid = cuid == null ? null : cuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.postPName
     *
     * @return the value of order.postPName
     *
     * @mbg.generated
     */
    public String getPostpname() {
        return postpname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.postPName
     *
     * @param postpname the value for order.postPName
     *
     * @mbg.generated
     */
    public void setPostpname(String postpname) {
        this.postpname = postpname == null ? null : postpname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.postPTel
     *
     * @return the value of order.postPTel
     *
     * @mbg.generated
     */
    public String getPostptel() {
        return postptel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.postPTel
     *
     * @param postptel the value for order.postPTel
     *
     * @mbg.generated
     */
    public void setPostptel(String postptel) {
        this.postptel = postptel == null ? null : postptel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.postPAddr
     *
     * @return the value of order.postPAddr
     *
     * @mbg.generated
     */
    public String getPostpaddr() {
        return postpaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.postPAddr
     *
     * @param postpaddr the value for order.postPAddr
     *
     * @mbg.generated
     */
    public void setPostpaddr(String postpaddr) {
        this.postpaddr = postpaddr == null ? null : postpaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.getPName
     *
     * @return the value of order.getPName
     *
     * @mbg.generated
     */
    public String getGetpname() {
        return getpname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.getPName
     *
     * @param getpname the value for order.getPName
     *
     * @mbg.generated
     */
    public void setGetpname(String getpname) {
        this.getpname = getpname == null ? null : getpname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.getPTel
     *
     * @return the value of order.getPTel
     *
     * @mbg.generated
     */
    public String getGetptel() {
        return getptel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.getPTel
     *
     * @param getptel the value for order.getPTel
     *
     * @mbg.generated
     */
    public void setGetptel(String getptel) {
        this.getptel = getptel == null ? null : getptel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.getPAddr
     *
     * @return the value of order.getPAddr
     *
     * @mbg.generated
     */
    public String getGetpaddr() {
        return getpaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.getPAddr
     *
     * @param getpaddr the value for order.getPAddr
     *
     * @mbg.generated
     */
    public void setGetpaddr(String getpaddr) {
        this.getpaddr = getpaddr == null ? null : getpaddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.goodsName
     *
     * @return the value of order.goodsName
     *
     * @mbg.generated
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.goodsName
     *
     * @param goodsname the value for order.goodsName
     *
     * @mbg.generated
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.goodsWeight
     *
     * @return the value of order.goodsWeight
     *
     * @mbg.generated
     */
    public Integer getGoodsweight() {
        return goodsweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.goodsWeight
     *
     * @param goodsweight the value for order.goodsWeight
     *
     * @mbg.generated
     */
    public void setGoodsweight(Integer goodsweight) {
        this.goodsweight = goodsweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.orderType
     *
     * @return the value of order.orderType
     *
     * @mbg.generated
     */
    public String getOrdertype() {
        return ordertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.orderType
     *
     * @param ordertype the value for order.orderType
     *
     * @mbg.generated
     */
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.orderState
     *
     * @return the value of order.orderState
     *
     * @mbg.generated
     */
    public String getOrderstate() {
        return orderstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.orderState
     *
     * @param orderstate the value for order.orderState
     *
     * @mbg.generated
     */
    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.trdnsportPrice
     *
     * @return the value of order.trdnsportPrice
     *
     * @mbg.generated
     */
    public Long getTrdnsportprice() {
        return trdnsportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.trdnsportPrice
     *
     * @param trdnsportprice the value for order.trdnsportPrice
     *
     * @mbg.generated
     */
    public void setTrdnsportprice(Long trdnsportprice) {
        this.trdnsportprice = trdnsportprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.deliveryPrice
     *
     * @return the value of order.deliveryPrice
     *
     * @mbg.generated
     */
    public Long getDeliveryprice() {
        return deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.deliveryPrice
     *
     * @param deliveryprice the value for order.deliveryPrice
     *
     * @mbg.generated
     */
    public void setDeliveryprice(Long deliveryprice) {
        this.deliveryprice = deliveryprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.totalPrice
     *
     * @return the value of order.totalPrice
     *
     * @mbg.generated
     */
    public String getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.totalPrice
     *
     * @param totalprice the value for order.totalPrice
     *
     * @mbg.generated
     */
    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.Comment
     *
     * @return the value of order.Comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.Comment
     *
     * @param comment the value for order.Comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}