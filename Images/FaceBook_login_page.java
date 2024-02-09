<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        #heading{
            color: rgb(98, 98, 240);
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            font-size: 25px;
            margin-left: 600px;
        }
        #abc{
            height: 350px;
            width: 400px;
            background-color: white;
            box-shadow: 0 10px 10px rgba(0, 0, 0, 0.5), 0 10px 20px 0 rgba(0, 0, 0, 0.10);  
            border-radius: 10px; 
            margin-left: 530px;
        }
        input{
            height: 50px;
            width: 300px;
            border-color: rgb(113, 208, 239);
            border-width: 2px;
            border-radius: 5px;
            margin-top: 20px;
            margin-left: 24px;
        }
        input:hover{
            border-color: blue;
        }
        .box{
            padding-left: 40px;
            font-size: 15px;
        }
        button{
            height: 50px;
            width: 350px;
            font-size:15px;
            border-color: rgb(113, 208, 239);
            border-radius: 5px;
            margin-left: 24px;
        }
        #login{
            background-color: rgb(2, 2, 247);
            color: aliceblue;
        }
        a{
            font-size: 15px;
            margin-left: 140px;
        }
        .create-account{
            height: 50px;
            width: 200px;
            background-color: green;
            color: white;
            margin-left: 110px;
        }
        .last{
            margin-left: 600px;
            font-size: 15px;
        }
        
    </style>
</head>
<body style="background-color: rgb(240, 240, 248);">
    <div id="heading">
        <h1>Facebook</h1>
    </div>

    <div id="abc">
    <form>
        <input class="box" type="text" placeholder="Email or Password"><br>

        <input class="box" type="password" placeholder="Password" maxlength="10"><br><br>

        <button class="login" id="login">Log In</button><br><br>

        <a href="#">Forget password?</a><br><hr>

        <button class="create-account" id="create">Create new account</button>
    </form>
    </div>
    <p class="last"><strong>Create page for celebrity,</strong> brand or business.</p>

</body>
</html>