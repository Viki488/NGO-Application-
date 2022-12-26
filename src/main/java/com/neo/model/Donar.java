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
@Table(name="DONAR_DETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Donar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long donarId;
	
	@Column(name="donar_name")
	private String donarName;
	
	@Column(name="donar_contact")
	private String doanrContact;
	
	@Column(name="donar_pan")
	private String donarPan;
	
	@Column(name="donar_gender")
	private String donarGender;
	
	@Column(name="donar_DOB")
	private String donarDOB;
	
	@Column(name="donar_amount")
	private Double donarAmount;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="login_Id")
	private Login login;
	
	@Embedded
    private  Address address;

	
	
	

}
