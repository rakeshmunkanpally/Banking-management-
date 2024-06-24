package com.TrainerPoolManagement.Models.DAO.ImplService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TrainerPoolManagement.Models.DAO.Repositories.AssociateRepository;

import com.TrainerPoolManagement.Models.DAO.Repositories.secondaryCategoryId;
import com.TrainerPoolManagement.Models.DAO.Repositories.tertiaryCategory;
import com.TrainerPoolManagement.Models.DAO.Services.Iinterface;
import com.TrainerPoolManagement.Models.Pojos.Associate;
import com.TrainerPoolManagement.Models.Pojos.GetAllDetails;
import com.TrainerPoolManagement.Models.Pojos.SecondaryCategory;
import com.TrainerPoolManagement.Models.Pojos.SolutionTeamFilter;
import com.TrainerPoolManagement.Models.Pojos.TertiaryCategory;

@Service
public class TrainerDetailBL implements Iinterface {

	@Autowired
	AssociateRepository associateRepository;
	
	@Autowired
	secondaryCategoryId secondaryCategoryId;
	
	@Autowired
	tertiaryCategory tertiaryCategory;
	

	@Override
	public List<Object> filtereddata(SolutionTeamFilter filter) {
		List<Object> list = associateRepository.findAssociatesWithLocationAndCategories(filter.getLocationId(),
				filter.getPrimaryCategoryId(), filter.getSecondaryCategoryId(), filter.getTertiaryCategoryId());
		return list;
	}

	@Override
	public List<Object[]> Allfiltereddata(List<Object> associateIds) {
		List<Object[]> list2 = associateRepository.findAssociatesWithDetails(associateIds);
		return list2;
	}

	@Override
	public void UpdateStatusAndReason(GetAllDetails details) {
		associateRepository.updateStatusAndReason(details.getAssociateId(), details.getStatusCode(),details.getReasonCode());
			

	}

	@Override
	public Associate findassociateid(String id) {
	    Optional<Associate> optional = associateRepository.findById(id);
	    if(optional.isPresent()) {
	        return optional.get();
	    } else {
	        return null;
	    }
	}

	@Override
	public List<SecondaryCategory> getprimarydetails(String primaryCategoryId) {
		List<SecondaryCategory> resList=secondaryCategoryId.findByPrimaryCategoryPrimaryCategoryId(primaryCategoryId);
		
		return resList;
	}

	@Override
	public List<TertiaryCategory> getsecondarydetails(String secondaryCategoryId) {
	List<TertiaryCategory> resultlist=	tertiaryCategory.findBySecondaryCategorySecondaryCategoryId(secondaryCategoryId);
		
		return resultlist;
	}

	

}
