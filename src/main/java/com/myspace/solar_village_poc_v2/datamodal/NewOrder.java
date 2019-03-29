package com.myspace.solar_village_poc_v2.datamodal;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NewOrder implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "customer")
	private com.myspace.solar_village_poc_v2.datamodal.Customer customer;
	@org.kie.api.definition.type.Label(value = "hoaApproval")
	private com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval hoaApproval;
	@org.kie.api.definition.type.Label(value = "electricalPermit")
	private com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval electricalPermit;
	@org.kie.api.definition.type.Label(value = "structuralPermit")
	private com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval structuralPermit;
	@org.kie.api.definition.type.Label(value = "orderHistory")
	private java.util.List<com.myspace.solar_village_poc_v2.datamodal.OrderHistory> orderHistory;
	@org.kie.api.definition.type.Label(value = "orderID")
	private java.lang.String orderID;

	public NewOrder() {
	    orderID = "SV-"+String.valueOf(System.currentTimeMillis());
	    hoaApproval = new private com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval();
	}

	public com.myspace.solar_village_poc_v2.datamodal.Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(
			com.myspace.solar_village_poc_v2.datamodal.Customer customer) {
		this.customer = customer;
	}

	public com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval getHoaApproval() {
		return this.hoaApproval;
	}

	public void setHoaApproval(
			com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval hoaApproval) {
		this.hoaApproval = hoaApproval;
	}

	public com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval getElectricalPermit() {
		return this.electricalPermit;
	}

	public void setElectricalPermit(
			com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval electricalPermit) {
		this.electricalPermit = electricalPermit;
	}

	public com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval getStructuralPermit() {
		return this.structuralPermit;
	}

	public void setStructuralPermit(
			com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval structuralPermit) {
		this.structuralPermit = structuralPermit;
	}

	public java.util.List<com.myspace.solar_village_poc_v2.datamodal.OrderHistory> getOrderHistory() {
		return this.orderHistory;
	}

	public void setOrderHistory(
			java.util.List<com.myspace.solar_village_poc_v2.datamodal.OrderHistory> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public java.lang.String getOrderID() {
		return this.orderID;
	}

	public void setOrderID(java.lang.String orderID) {
		this.orderID = orderID;
	}

	public NewOrder(
			com.myspace.solar_village_poc_v2.datamodal.Customer customer,
			com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval hoaApproval,
			com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval electricalPermit,
			com.myspace.solar_village_poc_v2.datamodal.SolarOrderApproval structuralPermit,
			java.util.List<com.myspace.solar_village_poc_v2.datamodal.OrderHistory> orderHistory,
			java.lang.String orderID) {
		this.customer = customer;
		this.hoaApproval = hoaApproval;
		this.electricalPermit = electricalPermit;
		this.structuralPermit = structuralPermit;
		this.orderHistory = orderHistory;
		this.orderID = orderID;
	}

}