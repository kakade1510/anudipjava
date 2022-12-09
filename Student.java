package com.hibertest.HiberTest.entitiesentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@AllArgsConstructor
@NoArgsConstructor
@Data  // used for getter,setter
@Entity  // used for create table as class name
public class Student {
	@Id     // used for Primary key
	@GeneratedValue  // used for auto_increment
	@Column(name="st_id") // used for change table name
	private int sid;
	
	@Column(length=50) // used for length fix size
	@NonNull           // used for not null
	private String sname;
	
	@Column(length=10)
    @NonNull
	private String contact;
	

}
