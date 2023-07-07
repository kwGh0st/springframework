<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List of Todos</title>
</head>
<body>
<%@ include file="common/navbar.jspf" %>
<div class="container">
    <h1>Welcome ${name}</h1>
    <hr>
    <div>
        <h3>Your todos are:</h3>
    </div>
    <table class="table">
        <thead>
            <tr>
                <th>id</th>
                <th>Description</th>
                <th>Target Date</th>
                <th>Is Done?</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td> ${todo.id} </td>
                    <td> ${todo.description} </td>
                    <td> ${todo.targetDate }</td>
                    <td> ${todo.done} </td>
                    <td> <a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a> </td>
                    <td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a> </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
    </div>
    <%@ include file="common/footer.jspf" %>
</body>
</html>