package com.sys.signup;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Document(collection="customers")
@Getter
@Setter
public class User {
	

	@JsonProperty("_id")
    @Id
    private String id;
	  @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("email")
	    private String email;
	    
	    @JsonProperty("phone")
	    private String phone;
	    
	    @JsonProperty("password")
	    private String password;
	    
	    @JsonProperty("cart")
	    private List<Item> cart;

	    @JsonProperty("orderedItems")
	    private List<Item> orderedItems;
	    
	    @JsonProperty("likedItems")
	    private List<Item> likedItems;

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
					+ ", cart=" + cart + ", orderedItems=" + orderedItems + ", likedItems=" + likedItems + "]";
		}    
}