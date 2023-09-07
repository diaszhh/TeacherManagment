<%--<%@ page import="DB.DBManager" %>--%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="DB.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
    <%@include file="header.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="nav.jsp" %>
    <button type="button" class="btn btn-secondary btn-sm mt-3" data-bs-toggle="modal" data-bs-target="#addTeacher">
        + ADD TEACHER
    </button>
    <div class="modal fade" id="addTeacher" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
         aria-labelledby="staticBackdropLabel" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <form action="/add-teacher" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
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

    <table class="table table-hover table-striped mt-3">
        <thead>
        <tr>
            <th>
                ID
            </th>
            <th>
                NAME
            </th>
            <th>
                SURNAME
            </th>
            <th>
                RATING
            </th>
            <th style="width: 8%">
                DETAILS
            </th>
        </tr>
        </thead>
        <tbody>
        <%
            ArrayList<Teacher> teachers = (ArrayList<Teacher>) request.getAttribute("prepodi");
            for (Teacher t : teachers) {
        %>
        <tr>
            <td>
                <%=t.getId()%>
            </td>
            <td>
                <%=t.getName()%>
            </td>
            <td>
                <%=t.getSurname()%>
            </td>
            <td>
                <%=t.getRating()%>
            </td>
            <td>
                <a href="/details?id=<%=t.getId()%>" class="btn btn-sm btn-secondary">DETAILS</a>
            </td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
