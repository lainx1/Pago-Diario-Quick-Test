import com.squareup.moshi.Json;

import java.util.Date;

public class Transaction {
	private double amount;
	private String description;

	@Json(name = "creation_date")
	private Date creationDate;
	private String category;
	private int uuid;
	private String operation;
	private String status;

	public double getAmount(){
		return amount;
	}

	public String getDescription(){
		return description;
	}

	public Date getCreationDate(){
		return creationDate;
	}

	public String getCategory(){
		return category;
	}

	public int getUuid(){
		return uuid;
	}

	public String getOperation(){
		return operation;
	}

	public String getStatus(){
		return status;
	}
}
