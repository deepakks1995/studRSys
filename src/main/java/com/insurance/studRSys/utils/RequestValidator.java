package com.insurance.studRSys.utils;

import org.springframework.stereotype.Service;
import java.lang.reflect.Field;


@Service
public class RequestValidator<T> {

    /**
     * This function uses reflection to extract values of all fields and checks
     * whther any of them is null or not
     * @param obj
     * @return true is all fields are non null
     */
    public boolean validate(T obj) {
        for(Field field: obj.getClass().getDeclaredFields()){
            field.setAccessible(true);
            try {
                if (field.get(obj) == null) return false;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}
