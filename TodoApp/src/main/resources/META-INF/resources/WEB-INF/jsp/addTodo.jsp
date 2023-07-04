<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Todo</title>
</head>
<body>
    <div class="container">
        <form:form method="post" modelAttribute="todo">
            <h4>
                Enter Todo details
            </h4>
            <form:input type="text" path="description" placeholder="Description" required="required"/>
            <form:input type="hidden" path="id"/>
            <form:input type="hidden" path="done"/>
            <button type="submit" class="btn btn-success">Submit</button>
        </form:form>
    </div>
        <script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>