package fdweb.springboot.server;

import fdweb.springboot.pojo.Meal;

import java.util.List;

public interface MealService {

    public boolean updateMeal(Meal meal);

    public boolean insertMeal(Meal meal);

    public List<Meal> getMeal(int operatorid);

    public boolean deleteMeal(Meal meal);
}
