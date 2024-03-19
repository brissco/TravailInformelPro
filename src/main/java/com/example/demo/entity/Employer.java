package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Employer {
    @Id
    private Integer userId;
    private String companyName;
    private String sector;
    @Lob
    private String hiringHistory;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;
}
