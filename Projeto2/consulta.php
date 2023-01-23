<?php 
     $mysqli = new mysqli("localhost","root","jiu120701","projeto");

     if ($mysqli -> connect_errno) {
 
         echo "Falha na conexão MySQL: " . $mysqli -> connect_errorno;
 
         exit();
 
     }
 
 
     
    $query = "SELECT title, description, release_year, special_features FROM film ORDER BY title";
 
 
 
     $result = mysqli_query($mysqli, $query);
 
 
 
     echo "
 
     <table class='table table-dark table-striped'>
 
     <thead>
 
     <th>Título</th>
 
     <th>Descrição</th>

     <th>Ano de Lançamento</th>
     
     <th>Carcterística especial</th>
 
     </thead>
 
     <tbody>
 
     ";
 
     while ($row = mysqli_fetch_row($result)) {
 
         print("<tr><td>".$row[0]."</td><td>".$row[1]."</td><td>".$row[2]."</td><td>".$row[3]."</td></tr>");
 
     }
 
 
 
     echo "
 
     </tbody>
 
     </table>
 
     ";
 
 
 
     $mysqli -> close();
 
?>

