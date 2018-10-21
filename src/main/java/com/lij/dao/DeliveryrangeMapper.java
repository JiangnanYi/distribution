package com.lij.dao;

import com.lij.entity.Deliveryrange;
import com.lij.entity.DeliveryrangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryrangeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    long countByExample(DeliveryrangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int deleteByExample(DeliveryrangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String rangeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int insert(Deliveryrange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int insertSelective(Deliveryrange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    List<Deliveryrange> selectByExample(DeliveryrangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    Deliveryrange selectByPrimaryKey(String rangeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Deliveryrange record, @Param("example") DeliveryrangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Deliveryrange record, @Param("example") DeliveryrangeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Deliveryrange record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Deliveryrange record);
}