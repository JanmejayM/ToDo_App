<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ToDo_App</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-3">

<table class="table table-striped table-hover table-bordered table-responsive-md">
<thead class="table-dark">
<tr>
<td >S.No</td>
<td >Brief</td>
<td >Description</td>


</tr>
</thead>
<c:forEach var="task" items="${TaskList}">


<tr>
<td class="table-light">${task.getId()}</td>
<td class="table-light">${task.getBrief()}</td>
<td class="table-light">${task.getDetails()}</td>
</tr>


</c:forEach>



</table>


</div>






</body>
</html>
