<%--
  Created by IntelliJ IDEA.
  User: Rabia
  Date: 10/10/2019
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<style>
    body {font-family: Arial, Helvetica, sans-serif;}
    * {box-sizing: border-box}

    /* Full-width input fields */
    input[type=text], input[type=password] {
        width: 100%;
        padding: 15px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: darkred;
    }

    input[type=text]:focus, input[type=password]:focus {
        background-color: orangered;
        outline: none;
    }

    hr {
        border: 1px solid indianred;
        margin-bottom: 25px;
    }

    /* Set a style for all buttons */
    button {
        background-color: red;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
        opacity: 0.9;
    }

    button:hover {
        opacity:1;
    }

    /* Extra styles for the cancel button */
    .cancelbtn {
        padding: 14px 20px;
        background-color: mediumvioletred;
    }

    /* Float cancel and signup buttons and add an equal width */
    .cancelbtn, .signupbtn {
        float: left;
        width: 50%;
    }

    /* Add padding to container elements */
    .container {
        padding: 16px;
    }

    /* Clear floats */
    .clearfix::after {
        content: "";
        clear: both;
        display: table;
    }

    /* Change styles for cancel button and signup button on extra small screens */
    @media screen and (max-width: 300px) {
        .cancelbtn, .signupbtn {
            width: 100%;
        }
    }
</style>
<body>

<form action="callservlet" method="post">
    <div class="container">
        <h1>Student Enrollement Signup Form </h1>

        <hr>
        Username:<input type="text" placeholder="Enter Username" name="Username" required>
        Password:<input type="password" placeholder="Enter Password" name="Password" required>
        Firstname:<input type="text" placeholder="Enter Firstname" name="Firstname" required>
        Lastname:<input type="text" placeholder="Enter Lastname" name="Lastname" required>
        DateofBirth:<input type="text" placeholder="Enter date of birth" name="DateofBirth" required>
        Email:<input type="text" placeholder="Enter Email" name="Email" required>







        <div class="clearfix">
            <button type="button" class="cancelbtn">Cancel</button>
            <button type="submit" class="signupbtn"> Submit </button>
        </div>

    </div>

</form>

</body>
</html>