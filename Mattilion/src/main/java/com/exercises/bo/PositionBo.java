package com.exercises.bo;

import java.util.List;

import com.exercises.dto.Position;

/**
 * 
 * Business class for Position Entity
 * 
 * 
 * @author Antonio
 *
 */
public interface PositionBo {

	/***
	 * 
	 * Returns the position by id
	 * 
	 * @param the id of the position
	 * @return
	 */
	Position findByPositionId(Long positionId);
	
	/***
	 * 
	 * Return all positions
	 * @return
	 */
	List<Position> getAll();

	
}
