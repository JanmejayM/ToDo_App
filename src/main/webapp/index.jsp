
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ToDo_App</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="index.css" rel="stylesheet">
</head>
<body>

<h1 class="bg-dark">Make your Schedule Pre-Planned</h1>




<form class ="container"action="TaskC" method="post">
  <div class="mb-3 mt-3">
    <label for="Brief" class="form-label">Brief:</label>
    <input type="text" name="brief" class="form-control"placeholder="Enter Brief" required="required" >
  </div>
  <label for="Description">Description:</label>
<textarea class="form-control" rows="5" name="desc"></textarea><br>


<input type="submit" name="submit" value="Add" class="btn btn-primary"><br>
  
</form><br>


<div style="text-align:center;">

<form class ="container"action="TaskC" method="post">



<input type="submit" name="submit" value="Check Schedule" class="btn btn-primary">


  
</form><br>


<form class ="container"action="TaskC" method="post">



<input type="submit" name="submit" value="Clear All Records" class="btn btn-primary">


  
</form>
<img class="img-fluid img-thumbnail"alt="Image of ToDo List" src="todo-list.jpeg">

</div>





</body>
</html>