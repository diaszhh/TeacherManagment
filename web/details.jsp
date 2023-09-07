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
    <%
        Teacher teacher = (Teacher) request.getAttribute("uchitel");
    %>
    <div class="row mt-3">
        <div class="col-6">
            <form action="/edit-teacher?id=<%=teacher.getId()%>" method="post">
               <input type="hidden" name="idd" value="<%=teacher.getId()%>>">
                <div class="row">
                    <div class="col-12">
                        <label>NAME:</label>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <input type="text" value="<%=teacher.getName()%>" name="teacherName" class="form-control">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>SURNAME:</label>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <input type="text" value="<%=teacher.getSurname()%>" name="teacherSurname" class="form-control">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <label>RATING:</label>
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <select class="form-select" name="teacherRating">
                            <option><%=teacher.getRating()%></option>
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
                </div>
                <div class="row mt-3">
                    <div class="col-12">
                        <button class="btn btn-success btn-sm" value="change" name="action">CHANGE</button>
                        <button class="btn btn-danger btn-sm" value="delete" name="action">DELETE</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
