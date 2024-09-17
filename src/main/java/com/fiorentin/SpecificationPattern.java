package com.fiorentin;

import com.fiorentin.specifications.OtherSpecification;
import com.fiorentin.specifications.PasswordValidSpecification;
import com.fiorentin.specifications.AgeBetweenSpecification;
import com.fiorentin.entities.User;

/**
 *
 * @author vanderlei.fiorentin
 */
public class SpecificationPattern {

    public static void main(String[] args) {
        User user = new User("João", "Silva", 18, "admin", "admin@gmail.com", "Password@123456");

        boolean isSatisfied = new AgeBetweenSpecification(18, 120)
                .and(new PasswordValidSpecification())                
                .isSatisfiedBy(user);
        
        isSatisfied &= new OtherSpecification()
                .not()
                .isSatisfiedBy(user.firstName());

        if (isSatisfied) {
            System.out.println("User valid!");
        } else {
            System.out.println("User invalid!");
        }
    }
}
