<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.html">Bull Horn</a>
    </div>
    <div>
      <ul class="nav navbar-nav">
        <li><a href="AddPost.html">Post</a></li>
        <li><a href="GetPost">Posted</a></li>
        <li><a href="search.html">Search</a></li>
         <li><a href="sendmsg.html">Send Msg</a></li>
         <li><a href="GetMyProfile">My Profile</a></li>
        <li><a href="signin.html">Sign In</a></li>
        <li><a href="signup.html">Sign Up</a></li>
        <li><a href="SignOut">SignOut</a></li>
      </ul>
    </div>
  </div>
</nav>

Hello ${sessionScope.user.firstname}, ${sessionScope.user.lastname}<br>
Your address is: ${sessionScope.user.address.street},  ${sessionScope.user.address.city},  ${sessionScope.user.address.state},  ${sessionScope.user.address.zipcode}
</body>
</html>