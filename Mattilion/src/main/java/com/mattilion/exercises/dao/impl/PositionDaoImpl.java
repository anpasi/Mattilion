package com.mattilion.exercises.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mattilion.exercises.dao.PositionDao;
import com.mattilion.exercises.dto.Employee;
import com.mattilion.exercises.dto.Position;
import com.mattilion.exercises.util.CustomHibernateDaoSupport;

@Repository("positionIdDao")
public class PositionDaoImpl extends CustomHibernateDaoSupport implements PositionDao {

	@Override
	public Position findByPositionId(Long positionId) {
		return (Position) getHibernateTemplate().get(Position.class, positionId);
	}

	@Override
	public List<Position> getAll() {
		 return (List<Position> ) getHibernateTemplate().loadAll(Position.class);
	}

}
