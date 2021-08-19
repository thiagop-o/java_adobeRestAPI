package com.viltgroup.adobeRestApi.entity;

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
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @CreatedDate
    private LocalDateTime created;
    private String name;
    private boolean isDefaultGroup;
    @OneToMany(mappedBy = "groups")
    @JoinColumn(name = "users_id")
    private User users;


}
