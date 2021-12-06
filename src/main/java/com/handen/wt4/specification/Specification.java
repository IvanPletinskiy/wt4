package com.handen.wt4.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
