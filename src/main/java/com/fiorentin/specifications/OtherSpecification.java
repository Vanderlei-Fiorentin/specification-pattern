package com.fiorentin.specifications;

/**
 *
 * @author vanderlei.fiorentin
 */
public class OtherSpecification extends AbstractSpecification<String> {

    @Override
    public boolean isSatisfiedBy(String t) {
        return t.length() > 2;
    }

}
