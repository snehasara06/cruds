 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    Book from tomcat 9
    <h1>Employee Details</h1>
  <table>
    <tr>
      <th> ID</th>
      <th>NAME</th>
      <th>EMAIL</th>
      <th>DEPT</th>
      <th>PHONE</th>
    </tr>
   <c:forEach items="${empList}" var="empList">
      <tr>
        <td>${empList.id}</td>
        <td>${empList.name}</td>
        <td>${empList.email}</td>
        <td>${empList.dept}</td>
        <td>${empList.phone}</td>
      </tr>
    </c:forEach> 
</table>
</body>
</html> 

