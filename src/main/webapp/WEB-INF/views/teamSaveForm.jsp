<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>   
<title>팀등록</title>
</head>
<body>
    <h2>팀등록</h2>
     
  
 

        <form id="frm" name="frm">
           
                이름:<input id="name" type="text" placeholder="팀 이름을 입력하세요. " name="name"/><br>
                                             
        </form>
            <input type="button" value=등록 onclick="saveTeam()" />
  



<script src="/js/team.js"></script>    
</body>
</html>