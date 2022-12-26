package com.neo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="login_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loginId;
	
	private String loginUsername;
	
	private String loginPassword;
	
	private String longinType;
	
	
	@OneToOne(mappedBy = "login" ,cascade = CascadeType.ALL )
	private Admin admin;

}
