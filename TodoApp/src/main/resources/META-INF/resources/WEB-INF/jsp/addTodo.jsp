<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet" >
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Todo</title>
</head>
<body>
<%@ include file="common/navbar.jspf" %>
    <div class="container">
        <form:form method="post" modelAttribute="todo">
            <h4>
                Enter Todo details
            </h4>
            <fieldset>
                <form:label path="description">Description</form:label>
                <form:input type="text" path="description" required="required"/>
                <form:errors type="text" path="description" cssClass="text-warning"/>
            </fieldset>
            <fieldset class="mb-3">
            	<form:label path="targetDate">Target Date</form:label>
            	<form:input type="text" path="targetDate" required="required"/>
            	<form:errors path="targetDate" cssClass="text-warning"/>
            </fieldset class="mb-3">
            <form:input type="hidden" path="id"/>
            <form:input type="hidden" path="done"/>
            <button type="submit" class="btn btn-success">Submit</button>
        </form:form>
    </div>
        <%@ include file="common/footer.jspf" %>

        <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
        <script type="text/javascript">
        	$('#targetDate').datepicker({
        	    format: 'yyyy-mm-dd'
        	});
        </script>
</body>
</html>