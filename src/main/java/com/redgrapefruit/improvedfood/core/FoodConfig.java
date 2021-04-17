package com.redgrapefruit.improvedfood.core;

import java.util.Set;
import java.util.HashSet;

/**
 * A food config contains all unique information about a type of food.<br>
 * TODO: Replace hard-coded configs using builders with a custom JSON resource
 */
public class FoodConfig {
    // FoodComponent properties
    /**
     * How many hunger bars this food will fill
     */
    private final int hunger;
    /**
     * How long will hunger bars acquired from eating this food last
     */
    private final float saturationModifier;

    // Unique properties
    /**
     * At what point in the rot counter the item is considered rotten
     */
    private final int rotState;
    /**
     * At what speed will the rot process go
     */
    private final int rotSpeed;
    /**
     * At what point in the overdue counter the item is considered overdue
     */
    private final int overdueState;
    /**
     * At what speed will the overdue process go
     */
    private final int overdueSpeed;
    /**
     * For how many ticks/second will the rot process be slowed down when the food is salted
     */
    private final int saltEfficiency;
    /**
     * For how many ticks/second will the rot and overdue processes be slowed down when the food is put in a fridge
     */
    private final int fridgeEfficiency;
    /**
     * The category of this food
     */
    private final FoodCategory category;
    /**
     * A {@link HashSet} containing all possible effects for this food item
     */
    private final Set<FoodEffectConfig> effects;

    private FoodConfig(int hunger, int saturationModifier, int rotState, int rotSpeed, int overdueState, int overdueSpeed, int saltEfficiency, int fridgeEfficiency, FoodCategory category, Set<FoodEffectConfig> effects) {
        this.hunger = hunger;
        this.saturationModifier = saturationModifier;
        this.rotState = rotState;
        this.rotSpeed = rotSpeed;
        this.overdueState = overdueState;
        this.overdueSpeed = overdueSpeed;
        this.saltEfficiency = saltEfficiency;
        this.fridgeEfficiency = fridgeEfficiency;
        this.category = category;
        this.effects = effects;
    }

    public int getHunger() {
        return hunger;
    }

    public float getSaturationModifier() {
        return saturationModifier;
    }

    public int getRotState() {
        return rotState;
    }

    public int getRotSpeed() {
        return rotSpeed;
    }

    public int getOverdueState() {
        return overdueState;
    }

    public int getOverdueSpeed() {
        return overdueSpeed;
    }

    public int getSaltEfficiency() {
        return saltEfficiency;
    }

    public int getFridgeEfficiency() {
        return fridgeEfficiency;
    }

    public FoodCategory getCategory() {
        return category;
    }

    public Set<FoodEffectConfig> getEffects() {
        return effects;
    }

    public static class Builder {
        private int hunger;
        private int saturationModifier;
        private int rotState;
        private int rotSpeed;
        private int overdueState;
        private int overdueSpeed;
        private int saltEfficiency;
        private int fridgeEfficiency;
        private FoodCategory category;
        private final Set<FoodEffectConfig> effects;

        public Builder() {
            effects = new HashSet<>();
        }

        public Builder hunger(int hunger) {
            this.hunger = hunger;
            return this;
        }

        public Builder saturationModifier(int saturationModifier) {
            this.saturationModifier = saturationModifier;
            return this;
        }

        public Builder rotState(int rotState) {
            this.rotState = rotState;
            return this;
        }

        public Builder rotSpeed(int rotSpeed) {
            this.rotSpeed = rotSpeed;
            return this;
        }

        public Builder overdueState(int overdueState) {
            this.overdueState = overdueState;
            return this;
        }

        public Builder overdueSpeed(int overdueSpeed) {
            this.overdueSpeed = overdueSpeed;
            return this;
        }

        public Builder saltEfficiency(int saltEfficiency) {
            this.saltEfficiency = saltEfficiency;
            return this;
        }

        public Builder fridgeEfficiency(int fridgeEfficiency) {
            this.fridgeEfficiency = fridgeEfficiency;
            return this;
        }

        public Builder category(FoodCategory category) {
            this.category = category;
            return this;
        }

        public Builder effect(FoodEffectConfig effect) {
            this.effects.add(effect);
            return this;
        }

        public FoodConfig build() {
            return new FoodConfig(hunger, saturationModifier, rotState, rotSpeed, overdueState, overdueSpeed, saltEfficiency, fridgeEfficiency, category, effects);
        }
    }
}
