<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<p>${myData}</p>
<form action = "spring/logs" method = "post">
<input type="text" name = "name">
<input type = "submit"> Click
</form>
</body>
</html>
