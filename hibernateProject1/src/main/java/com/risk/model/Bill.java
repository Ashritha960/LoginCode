package com.risk.model;

import javax.persistence.Id;

public class Bill {

	@Id
	private Integer bill_id;
	private String customerName;
	private String productDetails;
}
