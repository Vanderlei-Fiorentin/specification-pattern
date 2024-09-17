package com.fiorentin.specifications;

import com.fiorentin.entities.User;

/**
 *
 * @author vanderlei.fiorentin
 */
public class AgeBetweenSpecification extends AbstractSpecification<User> {

    private final int min;
    private final int max;

    public AgeBetweenSpecification(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.age() >= min && user.age() <= max;
    }

}
