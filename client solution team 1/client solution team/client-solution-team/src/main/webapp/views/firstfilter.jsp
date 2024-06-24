<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">

$(function(){
	$("#primaryCategoryId").change(function(){
		var pid=$("#primaryCategoryId").val();
		$.ajax({
			type:"get",
			url:"http://localhost:9005/secondryCategory/"+pid,
			dataType:"Json",
			contentType:"application/json;charset=utf-8",
			success:function(msg){
				
				$("#secCat").empty();
				$("#secCat").append("<option value="+msg[0]+">"+msg[0]+"</option>");
				$("#secCat").append("<option value="+msg[1]+">"+msg[1]+"</option>");
				
			},
			error : function(x) {
				var response = JSON
						.parse(x.responseText).message;
				document.getElementById("msg").innerText = response;
			}
			
			
			
			
			
			
		});
		
		
		
		
		
	});
	
	
	
	
});
		



</script>
<meta charset="ISO-8859-1">
<title>filter</title>
</head>
<body>
	<form:form action="validate" modelAttribute="location">
		<table>
			<tr>
				<td><label for="locationId">Location:</label> <form:select
						path="locationId">
						<form:option value="select"></form:option>
						<form:option value="L001" label="Hyderabad" />
						<form:option value="L002" label="Chennai" />
						<form:option value="L003" label="Coimbatore" />
						<form:option value="L004" label="Kochi" />
						<form:errors path="locationId"></form:errors>
					</form:select></td>
			</tr>


			<tr>
				<td><label for="primaryCategoryId">PrimaryCategory:</label> <form:select
						path="primaryCategoryId" id="primaryCategoryId">
						<form:option value="select"></form:option>
						<form:option value="P001" label="Technical" />
						<form:option value="P002" label="Non-Technical" />
						<form:errors path="primaryCategoryId"></form:errors>
					</form:select></td>
			</tr>
			
			<tr>
				<td><label for="secondaryCategoryId">SecondaryCategory:</label> <form:select
						path="secondaryCategoryId" id="secCat">
						
					</form:select>
					</td>
			</tr>
			

	<tr>
	
			
 <td><input type="submit" value="Submit"></td>
    
   </tr>
    
   

		</table>
	</form:form>













</body>
</html>
