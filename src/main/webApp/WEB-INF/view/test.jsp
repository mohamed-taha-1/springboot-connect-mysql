<!DOCTYPE html>
<html>
<head>
    <title>Simple login form</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <style>
        html, body {
            display: flex;
            justify-content: center;
            font-family: Roboto, Arial, sans-serif;
            font-size: 15px;
        }
        form {
            border: 5px solid #f1f1f1;
        }
        input[type=text], input[type=password] {
            width: 100%;
            padding: 16px 8px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        button {
            background-color: #8ebf42;
            color: white;
            padding: 14px 0;
            margin: 10px 0;
            border: none;
            cursor: grabbing;
            width: 100%;
        }
        h1 {
            text-align:center;
            fone-size:18;
        }
        button:hover {
            opacity: 0.8;
        }
        .form-container {
            text-align: left;
            margin: 24px 50px 12px;
        }
        .container {
            padding: 16px 0;
            text-align:left;
        }
        span.psw {
            float: right;
            padding-top: 0;
            padding-right: 15px;
        }
        /* Change styles for span on extra small screens */
        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
            }}
    </style>
</head>
<body>
<form action="saveData" method="post">
    <h1>Login Form</h1>
    <div class="form-container">
        <hr/>
        <div class="container">
            <label for="uname"><strong>Username</strong></label>
            <input type="text" placeholder="Enter Username" name="fname" required>
            <label for="psw"><strong>email</strong></label>
            <input type="email" placeholder="Enter email " name="email" required>
        </div>
        <button type="submit">Login</button>

</form>


<form action="deleteData" method="post">
    <label>Enter Id: </label>
    <input type="text" name="id"><br>
    <input type="submit" value="delete">

</form>

<br>
<br>
<form action="UpdateData" method="post">
    <h1>Update Form</h1>
    <div class="form-container">
        <hr/>
        <div class="container">
            <label for="uname"><strong>Username</strong></label>
            <input type="text" placeholder="Enter Username" name="fname" required>
            <label for="psw"><strong>email</strong></label>
            <input type="email" placeholder="Enter email " name="email" required>
        </div>
        <button type="submit">update</button>

</form>


<a href="/LogPage">login</a>


</body>
</html>