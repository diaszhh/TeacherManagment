<%@ page import="DB.DBManager" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="DB.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="header.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="nav.jsp" %>
    <div class="row mt-3">
        <form action="/add-teacher" method="post">
            <div class="col-6 mx-auto">
                 <div class="row">
                     <div class="col-12">
                         <label>NAME: </label>
                     </div>
                 </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" name="teacherName" class="form-control">
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <label>SURNAME: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <input type="text" name="teacherSurname" class="form-control">
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <label>RATING: </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-12">
                        <select class="form-select" name="teacherRating">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                        </select>
                    </div>
                    <div class="row mt-2">
                        <div class="col-12">
                            <button class="btn btn-success btn-sm">ADD TEACHER</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
