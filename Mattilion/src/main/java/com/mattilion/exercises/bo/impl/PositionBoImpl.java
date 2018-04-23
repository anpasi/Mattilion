package com.mattilion.exercises.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mattilion.exercises.bo.PositionBo;
import com.mattilion.exercises.dao.PositionDao;
import com.mattilion.exercises.dto.Position;

@Service("positionBo")
public class PositionBoImpl implements PositionBo {

	@Autowired
	PositionDao positionDao;
	
	@Override
	public Position findByPositionId(Long positionId) {
		return positionDao.findByPositionId(positionId);
	}

	@Override
	public List<Position> getAll() {
		return positionDao.getAll();
	}

}
