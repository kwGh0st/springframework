<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Poppins&family=Ubuntu:wght@700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="./public/styles.css">
  <title>Newsletter Signup</title>
</head>
<body>
  <div class="signup">
    <form action="/" method="POST">
        <h1>Signup to My Newsletter!</h1>
        <input class="top" name="fName" type="firstName" placeholder="First Name">
        <input class="middle" name="lName" type="lastName" placeholder="Last Name">
        <input class="bottom" name="emailAddress" type="emailAddress" placeholder="Email Address" >
        <button type="submit">Sign me</button>
    </form>
  </div>
</body>
</html>