package com.nendejan.swag.models.data;

import com.nendejan.swag.models.Shift;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
/**
 * Created by nico on 6/30/2017.
 */

@Repository
@Transactional
public interface ShiftDao extends CrudRepository<Shift, Integer> {
}



