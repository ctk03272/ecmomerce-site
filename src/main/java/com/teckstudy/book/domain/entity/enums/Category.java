package com.teckstudy.book.domain.entity.enums;

public enum Category {

    NOTICE("공지사항", "10"),
    FAQ("FAQ", "20"),
    EVENT("이벤트", "30"),
    QUESTIONS("1:1문의", "40"),
    ETC("기타", "50");

    private String legacyName;
    private String legacyCode;

    Category(String legacyName, String legacyCode) {
        this.legacyName = legacyName;
        this.legacyCode = legacyCode;
    }

}
