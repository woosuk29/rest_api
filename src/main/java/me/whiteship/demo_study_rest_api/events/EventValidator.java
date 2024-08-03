package me.whiteship.demo_study_rest_api.events;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class EventValidator {
    public void validateCheck(EventDto eventDto, Errors errors) {
        if(eventDto.getBasePrice() > eventDto.getMaxPrice() && eventDto.getMaxPrice() > 0) {
            errors.rejectValue("basePrice", "wrongBasePrice");
            errors.rejectValue("maxPrice", "maxBasePrice");
        }
    }
}
