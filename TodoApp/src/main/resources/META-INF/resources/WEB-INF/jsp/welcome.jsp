<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
</head>
<body>
    <%@ include file="common/navbar.jspf" %>
    <h1>
        Welcome ${name}!
    </h1>

    <hr>

        <div><a href="list-todos">Manage</a> your todos</div>
        <%@ include file="common/footer.jspf" %>
</body>
</html>