package com.nendejan.swag.models.data;

import com.nendejan.swag.models.Employee;
import com.nendejan.swag.models.EmployeeCategory;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by nico on 7/1/2017.
 */
@Repository
@Transactional
public interface EmployeeCategoryDao extends CrudRepository<EmployeeCategory, Integer> {}

