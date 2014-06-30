<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>  
<head>  
    <title>방명록 작성</title>  
</head>  
<body>   
<h2>방명록 작성하기</h2>  
<form:form method="POST" action="addContact.html">    
    <table>    
    <tr>       
        <td><form:label path="email">Email</form:label></td>       
        <td><form:input path="email" /></td>     
    </tr>      
    <tr>       
        <td><form:label path="password">Password</form:label></td>     
        <td><form:input type  = "password" path="password" /></td>   
    </tr>    
    <tr>     
        <td ><form:label path="content">Content</form:label></td>     
        <td ><form:input size="100" path="content" /></td>   
    </tr>   
        
    <tr>     
        <td colspan="2">        
            <input type="submit" value="Add Contact"/>    
        </td>      
    </tr>  
    </table>   
</form:form>  
</body>  
</html>  