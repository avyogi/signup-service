package com.sys.signup;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Document(collection="items")
@Getter
@Setter
public class Item {
	
	@JsonProperty("_id")
    @Id
    private String id;
	
	@JsonProperty("itemId")
    private String itemId;
    
    @JsonProperty("itemName")
    private String itemName;
    
    @JsonProperty("brand")
    private String brand;
    
    @JsonProperty("unitsInStock")
    private Integer unitsInStock;
    
    @JsonProperty("unitsOnOrder")
    private Integer unitsOnOrder;
    
    @JsonProperty("discontinued")
    private boolean discontinued;
	
}