package com.hanchunhui.mapper;

import com.hanchunhui.pojo.TbItem;
import com.hanchunhui.pojo.TbItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int countByExample(TbItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int deleteByExample(TbItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int insert(TbItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int insertSelective(TbItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    List<TbItem> selectByExample(TbItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    TbItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbItem record);
}