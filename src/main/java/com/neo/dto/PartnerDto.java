package com.neo.dto;

import com.neo.model.Address;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PartnerDto {
	
    private Long partnerId;
	
    @NotEmpty
	private String partnerOrganisation;

    @NotEmpty
    @Size(min=10,max=10,message = "Partner Contact No Must Be 10 Digit !!")
	private String partnerContact;
	
    @NotEmpty
    @Pattern(regexp =  "((http|https)://)(www.)?" 
                        + "[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]" 
                        + "{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)")
	private String partnerWebsite;

    
}
