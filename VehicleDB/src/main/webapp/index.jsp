<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="addVehicle">
    <input type="text" name="vid" placeholder="Vehicle ID"><br>
    <input type="text" name="vname" placeholder="Vehicle Name"><br>
    <input type="text" name="vcolor" placeholder="Vehicle Color"><br>
    <input type="text" name="vyear" placeholder="Vehicle Date"><br>
    <input type="submit">
    <br>
    </form>
    <h2>-----------Mention Id For Details </h2>
    
    <form action="getById" >
        <input type="text" name="vid" placeholder="Enter Vid">
        <input type="submit">
    </form>
   <h2>${value1}</h2>
    <br>
    <h2>----------Get Vehicle By Color------------</h2>
   <form action="getByColor" >
        <input type="text" name="vcolor" placeholder="Enter Vcolor">
        <input type="submit">
    </form>
    <h2>${value2}</h2>
</body>
</html>