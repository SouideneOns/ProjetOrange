package com.example.orange.DTO;



public class ContractDTO {

	private long id;
	private String status;
	private String creation_date;
	private String num_seq;
	private String coCode;
	private String customerID;
	private String offerID;
	private String simID;
	private String marketID;

	public ContractDTO(long id, String status, String creation_date, String num_seq, String coCode, String customerID,
			String offerID, String simID, String marketID) {
		super();
		this.id = id;
		this.status = status;
		this.creation_date = creation_date;
		this.num_seq = num_seq;
		this.coCode = coCode;
		this.customerID = customerID;
		this.offerID = offerID;
		this.simID = simID;
		this.marketID = marketID;
	}

	@Override
	public String toString() {
		return "ContractDTO [id=" + id + ", status=" + status + ", creation_date=" + creation_date + ", num_seq="
				+ num_seq + ", coCode=" + coCode + ", customerID=" + customerID + ", offerID=" + offerID + ", simID="
				+ simID + ", marketID=" + marketID + "]";
	}
	

}
