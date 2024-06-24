package com.TrainerPoolManagement.Controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.event.internal.DefaultResolveNaturalIdEventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TrainerPoolManagement.Models.DAO.ImplService.TrainerDetailBL;
import com.TrainerPoolManagement.Models.Pojos.GetAllDetails;
import com.TrainerPoolManagement.Models.Pojos.SecondaryCategory;
import com.TrainerPoolManagement.Models.Pojos.SolutionTeamFilter;
import com.TrainerPoolManagement.Models.Pojos.TertiaryCategory;

@RestController
@CrossOrigin
public class AssociateController {

	@Autowired
	TrainerDetailBL detailBL;

	@GetMapping("/filtereddata")
	public ResponseEntity<Object> filtereddata(@RequestBody SolutionTeamFilter filter) {
		List<Object> list = detailBL.filtereddata(filter);
		System.out.println(list);

		List<Object[]> list2 = detailBL.Allfiltereddata(list);
		System.out.println(list2);

		return ResponseEntity.of(Optional.of(list2));

	}

	@PutMapping("/updateStatusandreason")
	public ResponseEntity<Object> updatestatus(@RequestBody GetAllDetails details) {
	    if(detailBL.findassociateid(details.getAssociateId()) == null) {
	        return ResponseEntity.of(Optional.of("id not present"));
	    } else {
	        detailBL.UpdateStatusAndReason(details);
	        return ResponseEntity.of(Optional.of("ok updated"));
	    }
	}
	
	@GetMapping("/secondryCategory/{primaryCategoryId}")
	public ResponseEntity<Object> getPrimaryCategory(@PathVariable("primaryCategoryId") String primaryCategoryId){
		System.out.println("hello");
		
		
		
	List<SecondaryCategory>reslist=detailBL.getprimarydetails(primaryCategoryId);
	List<String> resultList=new ArrayList<>();
	for (Iterator iterator = reslist.iterator(); iterator.hasNext();) {
		SecondaryCategory result = (SecondaryCategory) iterator.next();
		String res=result.getSecondaryCategoryDesc();
		resultList.add(res);	
		}
		
		return ResponseEntity.of(Optional.of(resultList));
		
		
	}
	
	@GetMapping("/tertiarydetails/{secondrycategoryId}")
	public ResponseEntity<Object> getTertiaryCategory(@PathVariable("secondrycategoryId") String secondrycategoryId){
	List<TertiaryCategory> result=detailBL.getsecondarydetails(secondrycategoryId);
	List<String> resultList=new ArrayList<>();
	String str=null;
	for (Iterator iterator = result.iterator(); iterator.hasNext();) {
		TertiaryCategory tertiaryCategory = (TertiaryCategory) iterator.next();
		str=tertiaryCategory.getTertiaryCategoryDesc();
		resultList.add(str);
	}
	
	return ResponseEntity.of(Optional.of(resultList));
	}

			
	    	
	}



	    
	     
	

