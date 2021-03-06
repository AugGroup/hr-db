package com.aug.hrdb.services.impl;

import java.util.List;

import com.aug.hrdb.dto.RewardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aug.hrdb.entities.Reward;
import com.aug.hrdb.repositories.RewardRepository;
import com.aug.hrdb.services.RewardService;

@Transactional
@Service("rewardService")
public class RewardServiceImpl implements RewardService {
	
	@Autowired
	private RewardRepository rewardRepository;

	@Override
	public List<Reward> findAll() {
		return rewardRepository.findAll();
	}

	@Override
	public void create(Reward reward) {
		rewardRepository.create(reward);
	}

	@Override
	public void update(Reward reward) {
		rewardRepository.update(reward);
	}

	@Override
	public void delete(Reward reward) {
		rewardRepository.delete(reward);
	}

	@Override
	public Reward findById(Integer id) {
		return rewardRepository.find(id);
	}

	@Override
	public List<Reward> findByCriteria(Reward reward) {
		return rewardRepository.findByCriteria(reward);
	}

	@Override
	public  void deleteById(Integer id) {
		 rewardRepository.deleteById(id);
	}

	@Override
	public List<RewardDto> searchReward(Integer id) {
		return rewardRepository.searchReward(id);
	}

}