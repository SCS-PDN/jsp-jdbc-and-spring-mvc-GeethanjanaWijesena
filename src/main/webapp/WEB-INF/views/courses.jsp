<table>
    <c:forEach var="course" items="${courses}">
        <tr>
            <td>${course.name}</td>
            <td><form method="post" action="register">
                <input type="hidden" name="courseId" value="${course.id}" />
                <input type="submit" value="Register" />
            </form></td>
        </tr>
    </c:forEach>
</table>
