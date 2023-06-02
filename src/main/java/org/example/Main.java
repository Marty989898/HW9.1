package org.example;

public class Main {
        public static void main(String[] args) {
        Post post = new Post();
        post.name = "Максим";
        post.passport = "8888 № 88888888";
        post.patronymic = "Александрович";
        post.surname = "Авдеев";
        post.phone = "88005553535";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}