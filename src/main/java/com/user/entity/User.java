package com.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="User_Table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    @NonNull
    private String name;
    @NonNull
    @Column(nullable = false)
    private String email;
    @NonNull
    private String mobile;
    @NonNull
    private String gender;
    @NonNull
    private int age;
    @NonNull
    private String nationality;
    @CreationTimestamp
    LocalDateTime creationDate;
    @UpdateTimestamp
    LocalDateTime lastUpdatedDate;
    @Version
    Integer version;

}
