package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Fabricantes;

/**
 * @author Jose
 *
 */
public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long>{

}
