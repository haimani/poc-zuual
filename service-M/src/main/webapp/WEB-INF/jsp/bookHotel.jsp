<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<h1 style="color: green"> BOOK HOTEL </h1>

<body>

<c:if test="${hotelBookSuccess==true}">
 <div> Hotel Successfully Booked with Hotel Name : ${savedHotel.hotelName} - ${savedHotel.location} - ${savedHotel.roomNo}</div>
</c:if>

<c:url var="hotel_url" value="/hotel/bookHotel" />

<form:form action="${hotel_url}" method="post" modelAttribute="hotel">
 <table border="0">
   <tr>
      <th><form:label path="hotelName"> HOTEL NAME : </form:label> </th>
      <td><form:input type="text" path="hotelName"/></td>
      <td><font color="red" size="5">${hotelNameMsg}</font></td>
   </tr>
   
   <tr>
      <th><form:label path="location">HOTEL LOCATION : </form:label> </th>
      <td><form:input type="text" path="location"/></td>
      <td><font color="red" size="5">${locationMsg}</font></td>
   </tr>
   
   <tr>
      <th><form:label path="roomNo">HOTEL ROOM NO : </form:label> </th>
      <td><form:input type="text" path="roomNo"/></td>
      <td><font color="red" size="5">${roomNoMsg}</font></td>
   </tr>
   
   <tr>
   <th></th>
   <td> <input type="submit" value="Submit"/></td>
   </tr>
   
 </table>

</form:form>
</body>
</html>