package com.aws.dnb.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class ApplicantInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long applicationID;
    @Column(unique = true)
    private Long customerSSN ;
    private String fullName;
    private Long loanAmount;
    private Long salaryAmount;
    private Long equityAmount;
    private boolean advisorAssigned;
}
