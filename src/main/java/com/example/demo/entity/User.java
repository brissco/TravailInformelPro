package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.modafa.oppotunitie.Enum1.AccountStatus;
import com.modafa.oppotunitie.Enum1.UserType;
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer userId;
	    private String name;
	    private String email;
	    private String password;
	    @Enumerated(EnumType.STRING)
	    private UserType type;
	    private LocalDateTime registrationDate;
	    private String location;
	    @Enumerated(EnumType.STRING)
	    private AccountStatus status;

	    @OneToOne(mappedBy = "user")
	    private Worker worker;
	    
	    @OneToOne(mappedBy = "user")
	    private Employer employers;

	    @OneToMany(mappedBy = "sender")
	    private List<Message> sentMessages;

	    @OneToMany(mappedBy = "recipient")
	    private List<Message> receivedMessages;

	    @OneToMany(mappedBy = "user")
	    private List<UserPreference> preferences;   
}