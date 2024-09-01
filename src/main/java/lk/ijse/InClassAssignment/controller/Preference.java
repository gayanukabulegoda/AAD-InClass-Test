package lk.ijse.InClassAssignment.controller;

import lk.ijse.InClassAssignment.dto.FoodItem;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Preference {
    private final List<FoodItem> history = new ArrayList<>();
    private FoodItem currentPreference;

    public void addPreference(FoodItem item) {
        if (currentPreference != null) {
            history.add(currentPreference);
        }
        currentPreference = item;
    }
}
