<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Pets</title>
		<!-- This JSP file shows the forms to create a dog or cat
		Each form has the get method as well as an action that leads it 
		to the correct servlet based on whether it is meant to create a dog
		or a cat. -->
	</head>
	<body>
		<div class="dog">
			<h3>Make a Dog!</h3>
			<form method="get" action="/PetIntelligence/animals/dog">
				<label>
					Name:<br>
					<input type="text" name="dogname">
				</label><br>
				<label>
					Breed:<br>
					<input type="text" name="dogbreed">
				</label><br>
				<label>
					Weight:<br>
					<input type="text" name="dogweight">
				</label><br>
				<input type="submit">
			</form>
		</div>
		<div class="cat">
			<h3>Make a Cat!</h3>
			<form method="get" action="/PetIntelligence/animals/cat">
				<label>
					Name:<br>
					<input type="text" name="catname">
				</label><br>
				<label>
					Breed:<br>
					<input type="text" name="catbreed">
				</label><br>
				<label>
					Weight:<br>
					<input type="text" name="catweight">
				</label><br>
				<input type="submit">
			</form>
		</div>
	</body>
</html>