<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello World!</h1>
	<form action="createTask" method="post">
	<label>Enter description</label>
		<input type="text" name="description" placeholder="enter task description" /> 
		<input type="submit" value="Create Task" />
	</form>
</body>
</html>
