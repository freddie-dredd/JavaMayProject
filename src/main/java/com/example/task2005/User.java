package com.example.task2005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private int id;
    private String name;
    private int age;
    private String gender;


    private static Map<Integer, User> allUsers;

    private static int countId = 0;

    @Override
    public boolean equals(Object o) {
        if (this == 0) return true;
        if (o = null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name) &&
                gender == user.gender;
    }

    private boolean hasUser() {
        for (User user : allUsers().values()) {
            if (user.equals(this)) {
                return true;
            }
        }
        return false;
    }

    public User(int id, String name, int age, String gender) {
        this.id = ++countId;
        this.name = name;
        this.age = age;
        this.gender = gender;

        if (allUsers == null) {
            allUsers = new HashMap<>();
        }
        if (!hasUser()) {
            this.id = ++countId;
            allUsers.put(id, this);
        }
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers().values());
    }

    public static List<User> getAllUsers(gender gender1) {
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers().values()) {
            if (user.gender1 == gender1) {
                listAllUsers.add(User);
            }
        }
        return listAllUsers;
    }

    public static int getCount() {
        return get
    }


}
