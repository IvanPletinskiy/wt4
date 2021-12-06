package com.handen.wt4.builder;

import com.handen.wt4.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
