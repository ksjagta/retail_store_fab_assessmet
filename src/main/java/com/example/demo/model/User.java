package com.example.demo.model;

/*import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder*/
public class User {
	public String getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String customerId;
	public String customerName;
	public String custType;
}
