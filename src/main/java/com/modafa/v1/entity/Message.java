package com.modafa.v1.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Message {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer messageId;

	    @ManyToOne
	    @JoinColumn(name = "senderId")
	    private User sender;

	    @ManyToOne
	    @JoinColumn(name = "recipientId")
	    private User recipient;

	    @Lob
	    private String content;
	    private LocalDateTime sendDate;
	    @Column(name = "is_read") // Renommer la colonne pour éviter le mot-clé réservé
	    private Boolean read;
}