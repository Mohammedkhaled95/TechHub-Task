package com.example.TechHub_Task.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public String calculateAge(LocalDate birthDate) {
		
		/*if ( !isValidDate(birthDate.toString())) {
			throw new RuntimeException("invalid Format");
		}*/
		
		
		LocalDate today = LocalDate.now();                         
		LocalDate birthday = birthDate;  
		 
		Period p = Period.between(birthday, today);
		 
		
		return p.getYears()+" year , "+p.getMonths()+" months , "+p.getDays()+" days";
		
	}

	private boolean isValidDate(String birthDate) {
        boolean valid = false;

        try {

            LocalDate.parse(birthDate,
                    DateTimeFormatter.ofPattern("uuuu-mm-dd")
                            .withResolverStyle(ResolverStyle.STRICT)
            );

            valid = true;

        } catch (DateTimeParseException e) {
            e.printStackTrace();
            valid = false;
        }

        return valid;
	}

	

}
