package com.fiorentin.specifications;

import com.fiorentin.entities.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vanderlei.fiorentin
 */
public class PasswordValidSpecification extends AbstractSpecification<User> {

    @Override
    public boolean isSatisfiedBy(User user) {
        /*
        * Ao menos uma letra maiúscula, uma minúscula, um número e um caracter especial
        */
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=.]).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.password());
        
        return !user.password().isBlank() && user.password().length() > 7 && matcher.matches();
    }

}
