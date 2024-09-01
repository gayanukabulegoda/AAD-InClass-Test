package lk.ijse.InClassAssignment;

import lk.ijse.InClassAssignment.dto.FoodItem;
import lk.ijse.InClassAssignment.service.PreferenceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lk.ijse.InClassAssignment.config.Config;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        PreferenceService preferenceService = context.getBean(PreferenceService.class);

        FoodItem fishBun = new FoodItem("Fish Bun", "Bakery");
        FoodItem fishPastry = new FoodItem("Fish Pastry", "Bakery");
        FoodItem chickenBun = new FoodItem("Chicken Bun", "Bakery");
        FoodItem chickenRoll = new FoodItem("Chicken Roll", "Bakery");

        preferenceService.updatePreference(fishBun);
        preferenceService.updatePreference(fishPastry);
        preferenceService.updatePreference(chickenBun);
        preferenceService.updatePreference(chickenRoll);

        System.out.println("Current Preference: " + preferenceService.getPreference().getCurrentPreference().getName());
        System.out.println("Preference History:");
        for (FoodItem item : preferenceService.getPreference().getHistory()) {
            System.out.println(item.getName());
        }
        context.close();
    }
}
