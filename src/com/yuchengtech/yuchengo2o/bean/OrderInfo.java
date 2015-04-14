package com.yuchengtech.yuchengo2o.bean;

import java.io.Serializable;

import org.json.JSONObject;

/**
 * 订单信息
 * 
 * @author 袁帅 Create on 2015-04-14
 */
public class OrderInfo implements Serializable {

	/**
	 * Java的序列化机制是通过在运行时判断类的serialVersionUID来验证版本一致性的。在进行反序列化时，
	 * JVM会把传来的字节流中的serialVersionUID与本地相应实体
	 * （类）的serialVersionUID进行比较，如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常。
	 */
	private static final long serialVersionUID = 1L;

	public String order_id; // 订单号
	public String order_custom_name; // 订单人姓名
	public String order_custom_tel; // 订单人电话
	public String order_amount; // 订单金额
	public String order_time; // 订单时间
	public String order_address; // 订单地址
	public String order_total; // 订单产品数量
	public Integer is_order_handle; // 订单是否已处理
	public Integer is_order_paid; // 订单是否已支付
	public Integer is_order_sent; // 订单是否已发货

	public OrderInfo() {
	}

	public OrderInfo(JSONObject jsonObject) {
		order_id = jsonObject.optString("orderid");
		order_custom_name = jsonObject.optString("truename");
		order_custom_tel = jsonObject.optString("tel");
		order_amount = jsonObject.optString("price");
		order_time = jsonObject.optString("time");
		order_address = jsonObject.optString("address");
		order_total = jsonObject.optString("total");
		is_order_handle = jsonObject.optInt("handle");
		is_order_paid = jsonObject.optInt("paid");
		is_order_sent = jsonObject.optInt("sent");

	}

	/**
	 * @return 订单号
	 */
	public String getOrderid() {
		return order_id;
	}

	/**
	 * @param 订单号
	 */
	public void setOrderid(String orderid) {
		this.order_id = orderid;
	}

	/**
	 * @return 订单人姓名
	 */
	public String getCustomerName() {
		return order_custom_name;
	}

	/**
	 * @param 订单人姓名
	 */
	public void setCustomerName(String customerName) {
		this.order_custom_name = customerName;
	}

	/**
	 * @return 订单人电话
	 */
	public String getCustomerTel() {
		return order_custom_tel;
	}

	/**
	 * @param 订单人电话
	 */
	public void setCustomerTel(String customerTel) {
		this.order_custom_tel = customerTel;
	}

	/**
	 * @return 订单金额
	 */
	public String getOrderAmount() {
		return order_amount;
	}

	/**
	 * @param 订单金额
	 */
	public void setOrderAmount(String amount) {
		this.order_amount = amount;
	}

	/**
	 * @return 订单时间
	 */
	public String getOrderTime() {
		return order_time;
	}

	/**
	 * @param 订单时间
	 */
	public void setOrderTime(String time) {
		this.order_time = time;
	}

	/**
	 * @return 订单地址
	 */
	public String getOrderAddress() {
		return order_address;
	}

	/**
	 * @param 订单地址
	 */
	public void setOrderAddress(String addr) {
		this.order_address = addr;
	}

	/**
	 * @return 产品数量
	 */
	public String getOrderTotal() {
		return order_total;
	}

	/**
	 * @param 产品数量
	 */
	public void setOrderTotal(String total) {
		this.order_total = total;
	}

	/**
	 * @return 订单是否已处理
	 */
	public int getIsHandle() {
		return is_order_handle;
	}

	/**
	 * @param 订单是否已处理
	 */
	public void setOrderIsHandle(int handle) {
		this.is_order_handle = handle;
	}

	/**
	 * @return 订单是否已支付
	 */
	public int getIsPaid() {
		return is_order_paid;
	}

	/**
	 * @param 订单是否已支付
	 */
	public void setOrderIsPaid(int paid) {
		this.is_order_paid = paid;
	}

	/**
	 * @return 订单是否已发货
	 */
	public int getIsSent() {
		return is_order_sent;
	}

	/**
	 * @param 订单是否已发货
	 */
	public void setOrderIsSent(int sent) {
		this.is_order_sent = sent;
	}

}
