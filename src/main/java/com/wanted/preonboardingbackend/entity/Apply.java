package com.wanted.preonboardingbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Apply {

    @Id
    @Column(name = "apply_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruid_id", nullable = false)
    private Recruit recruit;

    public Apply (Recruit recruit, Member member) {
        this.member = member;
        this.recruit = recruit;
    }
}
