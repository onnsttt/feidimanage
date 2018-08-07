package fdweb.springboot.server;

import fdweb.springboot.dao.MealMapper;
import fdweb.springboot.pojo.Meal;
import fdweb.springboot.pojo.MealExample;
import fdweb.springboot.pojo.OperatorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImp implements MealService{

    @Autowired
    MealMapper mealMapper;
    @Override
    /**
     * 更新套餐
     */
    public boolean updateMeal(Meal meal) {
        MealExample mealExample = new MealExample();
        System.out.println(meal.getName());
        mealExample.createCriteria().andNameEqualTo(meal.getName()).andOperatoridEqualTo(meal.getOperatorid());
        meal.setMealid(mealMapper.selectByExample(mealExample).get(0).getMealid());
        System.out.println(meal.getMealid());
        mealMapper.updateByPrimaryKey(meal);
        return true;
    }

    @Override
    /**
     * 新增套餐
     */
    public boolean insertMeal(Meal meal) {
        mealMapper.insert(meal);
        return false;
    }

    @Override
    /**
     * 查询套餐信息
     */
    public List<Meal> getMeal(int operatorid) {
        OperatorExample operatorExample = new OperatorExample();
        operatorExample.createCriteria().andOperatoridEqualTo(operatorid);
        return mealMapper.selectByExample(operatorExample);
    }

    @Override
    /**
     * 删除套餐
     */
    public boolean deleteMeal(Meal meal){
        mealMapper.delete(meal);
        return true;
    }

}
