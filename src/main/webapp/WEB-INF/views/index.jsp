<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <meta http-equiv="Content-Type" content = "text/html; charset=UTF-8" />
  <title>Hello</title>
</head>
<body>
<p th:text="'안녕하세요. ' + ${data}" > 안녕하세요. 손님</p>
</body>
</html>