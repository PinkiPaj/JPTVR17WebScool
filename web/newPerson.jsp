<%-- 
    Document   : newPerson
    Created on : Oct 3, 2019, 9:35:52 AM
    Author     : pupil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Создание нового пользователя</h1>
        <form action="addPerson" method="POST">
            Имя: <input type="text" name="name"><br>
            Фамилия: <input type="text" name="surname"><br>
            Статус: <select name="status">
                <option value="Tither">Учитель</option>
                <option value="Pupil">Ученик</option>
                    </select><br>
            <input type="submit" value="Добавить пользователя">
        </form>
    </body>
</html>
