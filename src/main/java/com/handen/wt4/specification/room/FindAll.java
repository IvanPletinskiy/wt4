package com.handen.wt4.specification.room;

import com.handen.wt4.specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindAll implements Specification {

    @Override
    public String toSql() {
        return "";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.emptyList();
    }
}
