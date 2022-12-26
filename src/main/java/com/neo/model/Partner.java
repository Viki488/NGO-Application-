package com.neo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PARTNER_DETAILS")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Partner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="partner_Id")
	private Long partnerId;
	
	@Column(name="partner_organisation")
	private String partnerOrganisation;
	
	@Column(name="partner_contact")
	private String partnerContact;
	
	@Column(name="partner_website")
	private String partnerWebsite;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="login_Id")
	private Login login;
	
	@Embedded
    private  Address address;

}
