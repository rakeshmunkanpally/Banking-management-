package com.TrainerPoolManagement.Models.DAO.Services;

import java.util.List;

import com.TrainerPoolManagement.Models.Pojos.Associate;
import com.TrainerPoolManagement.Models.Pojos.GetAllDetails;
import com.TrainerPoolManagement.Models.Pojos.SecondaryCategory;
import com.TrainerPoolManagement.Models.Pojos.SolutionTeamFilter;
import com.TrainerPoolManagement.Models.Pojos.TertiaryCategory;

public interface Iinterface {

	List<Object> filtereddata(SolutionTeamFilter filter);

	List<Object[]> Allfiltereddata(List<Object> associateIds);

	void UpdateStatusAndReason(GetAllDetails details);

	Associate findassociateid(String id);
	

	List<SecondaryCategory> getprimarydetails(String primaryCategoryId);
    List<TertiaryCategory>getsecondarydetails(String secondaryCategoryId);

}
