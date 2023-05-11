package com.example.kr_1_spring.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "quests")
public class Quests {

    @Id
    @Column(name = "quest_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questId;


    @Column(name = "quest_title")
    private String questTitle;

    @Column(name = "quest_text")
    private String questText;

    @Column(name = "person_id")
    private String  personId;

    @Column(name = "reward")
    private int reward;

    @Column(name = "penalty")
    private int penalty;

    @Column(name = "time_of_started")
    private String timeOfStarted;

    @Column(name = "time_for_quest_in_minutes")
    private int timeForQuestInMinutes;

    @Column(name = "place_id")
    private String placeId;

    @Column(name = "model_id")
    private String modelId;

    @Column(name = "level_difficulty")
    private int levelDifficulty;

    @Column(name = "quest_status")
    private String  questStatus;

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getQuestTitle() {
        return questTitle;
    }

    public void setQuestTitle(String questTitle) {
        this.questTitle = questTitle;
    }

    public String getQuestText() {
        return questText;
    }

    public void setQuestText(String questText) {
        this.questText = questText;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String  personId) {
        this.personId = personId;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public String getTimeOfStarted() {
        return timeOfStarted;
    }

    public void setTimeOfStarted(String timeOfStarted) {
        this.timeOfStarted = timeOfStarted;
    }

    public int getTimeForQuestInMinutes() {
        return timeForQuestInMinutes;
    }

    public void setTimeForQuestInMinutes(int timeForQuestInMinutes) {
        this.timeForQuestInMinutes = timeForQuestInMinutes;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public int getLevelDifficulty() {
        return levelDifficulty;
    }

    public void setLevelDifficulty(int levelDifficulty) {
        this.levelDifficulty = levelDifficulty;
    }

    public String getQuestStatus() {
        return questStatus;
    }

    public void setQuestStatus(String questStatus) {
        this.questStatus = questStatus;
    }

}
