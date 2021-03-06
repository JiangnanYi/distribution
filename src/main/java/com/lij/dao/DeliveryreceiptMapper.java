package com.lij.dao;

import com.lij.entity.Deliveryreceipt;
import com.lij.entity.DeliveryreceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryreceiptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    long countByExample(DeliveryreceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int deleteByExample(DeliveryreceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String delivervreceiptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int insert(Deliveryreceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int insertSelective(Deliveryreceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    List<Deliveryreceipt> selectByExample(DeliveryreceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    Deliveryreceipt selectByPrimaryKey(String delivervreceiptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Deliveryreceipt record, @Param("example") DeliveryreceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Deliveryreceipt record, @Param("example") DeliveryreceiptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Deliveryreceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryreceipt
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Deliveryreceipt record);
}