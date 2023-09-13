<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
  <section class="vh-100 gradient-custom" style="background-color: Black">
  <div class="container py-5 h-100">
    <div class="row justify-content-center align-items-center h-100">
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
          <div class="card-body p-4 p-md-5">
            <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Registration Form :</h3>
            
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Sginup</title>
  </head>
  <body>
  
    <div class="container">
    <form action="insertData" method="post"  ModelAttribute="Reg">

      <div class="mb-3">
        
        <input type="text" class="form-control" id="Name" name=Name placeholder="Name" required>
      </div>
      <div class="mb-3">
        
        <input type="text" class="form-control" id="Address" name="Address" placeholder="Enter Address" required>
      </div>

     <div class="mb-3">
        <input type="text" class="form-control" id="City" name="City" placeholder="Enter City" required>
      </div>

      <div class="mb-3">
        
        <input type="text" class="form-control" id="Pincode" name="Pincode" placeholder="Enter pincode" required>
      </div>
      <div class="mb-3">
        
        <input type="text" class="form-control" id="Email" name="Email" placeholder="Enter Email" required>
      </div>
      <div class="mb-3">
        
        <input type="number" class="form-control" id="Percentage" name="Percentage" placeholder="Enter Percentage" pattern="[1-9]{1}[0-9]{9}">
      </div>
      <div class="mb-3">
      
      <input type="password" class="form-control" id="Mobile" name="Mobile" placeholder="Enter Mobile">
      </div>
      <div class="mb-3">
         <div class="mb-3"><br>
       <input type="submit" class="form-control btn btn-primary" >
       
       
      </div> 
      </div>  
    </form>
  </div><!--end of container-->
    <!-- Optional JavaScript; choose one of the two! -->
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    

    
  </body>
</html>
