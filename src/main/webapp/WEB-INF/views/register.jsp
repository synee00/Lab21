<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>GC Coffee Registration</h1>
	<form action="/summary" autocomplete=off >
		<p>First Name: <input name="fname" autofocus required/></p>
		<p>Last Name: <input name="lname" required/></p>
		<p>Email: <input type="email" name="email" required/></p>
		<p>Phone Number (###-###-####): <input pattern='([\d]{3}\-[\d]{3}\-[\d]{4})' name="number" required/></p>
		<p>Password: <input type="password" name="password" min="6" required/></p>
		
		<button type="submit">Submit</button>
	</form>

</body>
</html>