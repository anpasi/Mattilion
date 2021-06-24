package com.exercises.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.exercises.dao.PositionDao;
import com.exercises.dto.Employee;
import com.exercises.dto.Position;
import com.exercises.util.CustomHibernateDaoSupport;

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
