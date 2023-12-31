package com.wanted.preonboardingbackend.dto.responseDto;

import com.wanted.preonboardingbackend.entity.Apply;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ApplyResponseDto {
    private Long applyId;
    private Long recruitId;
    private Long memberId;

    public ApplyResponseDto(Apply apply) {
        this.applyId = apply.getId();
        this.recruitId = apply.getRecruit().getId();
        this.memberId = apply.getMember().getId();
    }
}
