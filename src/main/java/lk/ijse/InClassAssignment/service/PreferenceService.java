package lk.ijse.InClassAssignment.service;

import lk.ijse.InClassAssignment.controller.Preference;
import lk.ijse.InClassAssignment.dto.FoodItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class PreferenceService {
    private final Preference preference = new Preference();

    public void updatePreference(FoodItem item) {
        preference.addPreference(item);
    }
}
