package com.example.friendsbook;

public class Friend {
    /*
    For this assignment you are to create a Friends book.
    In this program you should be able to do the following actions:
    create a friend
    Select a friend and see their properties
    Delete a friend
    Display all the friends.
    Friends should be objects  I will let you decide how you want to code them.
    You decide which fields you think are best.
     */
    private String name;

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAge() {
        return age;
    }

    public String getContacts() {
        return contacts;
    }

    public String getHobbies() {
        return hobbies;
    }

    private String nickname;
    private String age;
    private String contacts;
    private String hobbies;

    Friend(){
        name = "";
        nickname = "";
        age = "";
        contacts = "";
        hobbies = "";
    }

    Friend(String name, String nickname, String age, String contacts, String hobbies){
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.contacts = contacts;
        this.hobbies = hobbies;
    }

    public  String toString(){
        return name;
    }
}
