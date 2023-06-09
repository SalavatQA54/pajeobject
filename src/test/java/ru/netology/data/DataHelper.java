package ru.netology.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCode(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    public static String getCardFirst() {
        return "5559 0000 0000 0001";
    }

    public static String getCardSecond() {
        return "5559 0000 0000 0002";
    }

    public static String getInvalidCard() {
        return "5559 0000 0000 0003";
    }

    @Value
    public static class Card {
        private String card;
    }
}