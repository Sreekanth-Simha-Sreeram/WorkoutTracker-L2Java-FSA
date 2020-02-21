package com.workout.hibernate.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.workout.hibernate.dao.UserServiceDao;
import com.workout.hibernate.model.WorkoutCategory;
import com.workout.hibernate.model.WorkoutCollection;

@Component
@Service ("userService")

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserServiceDao userServiceDao;
	@Transactional

	public void addWorkout(WorkoutCollection workoutCollection) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void editWorkout(int workoutId) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteWorkout(int workoutId) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public List<WorkoutCollection> viewWorkout(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void addCategory(WorkoutCategory workoutCategory) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void editCategory(int categoryId) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public List<WorkoutCategory> viewCategory(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void startWorkout(int workoutId, int userId) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void endWorkout(int workoutId, int userId) {
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	public void generateReport(Date startDate, Date endDate) {
		// TODO Auto-generated method stub

	}

}
