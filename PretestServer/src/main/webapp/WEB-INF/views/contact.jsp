<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<html>  
<head>  
    <title>Spring 3 MVC Series - Contact Manager</title>  
</head>  
<body>   
<h2>Contact Manager</h2>  
<form:form method="POST" action="addContact.html">    
    <table>    
    <tr>       
        <td><form:label path="email">Email</form:label></td>       
        <td><form:input path="email" /></td>     
    </tr>      
    <tr>       
        <td><form:label path="password">Password</form:label></td>     
        <td><form:input path="password" /></td>   
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