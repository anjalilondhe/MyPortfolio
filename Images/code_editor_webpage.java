<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JQuery</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <style>
        body{
            background-color:rgb(216, 239, 216, 1);
        }
        .container{
            width:95%;
            height: 230px;
            background-color: rgba(24, 71, 24, 0.9);
            margin-left: 28px;
            margin-top: 25px;
        }
        .main{
            margin-left: 10px;
        }
        i{
            margin-right: 10px;
        }
        p{
            color:rgb(161, 229, 161);
        }
        button{
            padding: 5px 14px;
            background-color:rgb(6, 112, 6) ;
            color: rgb(161, 229, 161);
            border-color: rgb(161, 229, 161);
            margin-top: 5px;
        }
        h2{
            color: rgb(161, 229, 161);
        }
        .list span{
            border: solid black;
            color: rgb(161, 229, 161);
            border-color: rgb(161, 229, 161);
            padding: 5px 7px;
        }
        .main .list{
            display: inline;
        }
        /*.container1{
            width: 95%;
            height: 180px;
            margin-top: 15px;
            display: flex;
            background-color: antiquewhite;
            margin-left: 28px;
        }*/
        .container1 div{
            height: 180px;
            width: 180px;
            background-color: aqua;
            display: inline-block;
            margin-left: 100px;
            border-radius: 100px;
            margin-left: 150px;
            color: white;
            background-color: rgb(92, 148, 92);
        }
        .container2{
            width: 100%;
            height: 80px;
            background-color: lightgreen;
            margin-top: 30px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="main">
            <button>Free</button>
            <h2>Online Code Editor (JQuery)</h2>
            <p><i class="fa-sharp fa-solid fa-chart-simple" style="color:rgb(161, 229, 161);"></i>Beginner</p>
            <p><i class="fa-regular fa-clock" style="color: rgb(161, 229, 161);"></i>20 hours</p>
            <p>Skills</p>
            <div class="list">
                <span>HTML</span>
                <span>CSS</span>
                <span>JQuery</span>
                <span>Web Development</span>
                <span>Website Housing</span>
            </div>
        </div>
    </div>
    <div class="container1">
        <div><p><pre style="margin-top: 40px;font-size:15px">          1 
       Create the 
   structural aspect 
   of a code editor 
   using HTML, CSS.
    </pre></p></div>
    <div style="margin-top: 35px;"><p><pre style="margin-top: 40px;font-size:15px">          2
   Implementation of
 core functionalities
   and other small 
   features using
       Jquery
     </pre></p></div>
     <div><p><pre style="margin-top: 40px;font-size:15px">          3
  Publish to GitHub
   and host your
    deployed code 
       editor
     </pre></p></div>
     </div>
     </div>
    </div>
    <div class="container2">
        <button style="float: right;padding:12px 20px;margin-top:px;color:white">View the Project</button>
    </div>    
</body>
</html>