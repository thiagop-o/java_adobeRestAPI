package com.viltgroup.adobeRestApi.entity;

import com.viltgroup.adobeRestApi.enums.Locale;
import com.viltgroup.adobeRestApi.enums.Situation;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String firstName;
    private String lastName;
    private String accountType;
    private UUID accountId;
    private String company;
    private String email;

    @CreatedDate
    private LocalDateTime createdDate;
    private boolean isAccountAdmin;
    private Locale local;
    private Situation status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="groups_id", unique = true)
    private Group groups;

}
