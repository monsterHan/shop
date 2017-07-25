package com.hanchunhui.pojo;

import java.util.Date;

public class TbItemParam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.item_cat_id
     *
     * @mbggenerated
     */
    private Long itemCatId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.updated
     *
     * @mbggenerated
     */
    private Date updated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_item_param.param_data
     *
     * @mbggenerated
     */
    private String paramData;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.id
     *
     * @return the value of tb_item_param.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.id
     *
     * @param id the value for tb_item_param.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.item_cat_id
     *
     * @return the value of tb_item_param.item_cat_id
     *
     * @mbggenerated
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.item_cat_id
     *
     * @param itemCatId the value for tb_item_param.item_cat_id
     *
     * @mbggenerated
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.created
     *
     * @return the value of tb_item_param.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.created
     *
     * @param created the value for tb_item_param.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.updated
     *
     * @return the value of tb_item_param.updated
     *
     * @mbggenerated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.updated
     *
     * @param updated the value for tb_item_param.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_item_param.param_data
     *
     * @return the value of tb_item_param.param_data
     *
     * @mbggenerated
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_item_param.param_data
     *
     * @param paramData the value for tb_item_param.param_data
     *
     * @mbggenerated
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}