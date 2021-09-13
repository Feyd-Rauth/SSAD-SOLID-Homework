package com.moofiyTv.mossapp.homework;

import java.util.List;

public class Human extends PayTaxes implements PrayNeed, SportNeed, OwnCompanyNeed, MarriageNeed, HobbyNeed{
    private String name;
    private String nickname;
    private List<String> hobbies;
    private Language language;

    protected Human(int salary) {
        super(salary);
    }
    @Override
    public int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }

    @Override
    public void getMarried() { }

    @Override
    public void ownCompany() { }

    @Override
    public void pray() { }

    @Override
    public void playSport() { }

    public static void main(String[] args) {
        Human human = new Human(120000);
        human.language = new Arabic();
        System.out.println(human.language.sayHello());

    }
}
