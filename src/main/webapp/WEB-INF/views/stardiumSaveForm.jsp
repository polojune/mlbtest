<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>   
<title>야구장 등록</title>
</head>
<body>
    <h2>야구장등록</h2>
     
  
 

        <form id="frm" name="frm">
           
                이름:<input id="name" type="text" placeholder="이름을 입력하세요. " name="name"/><br>
                
                지역:<input id="location" type="text" placeholder="지역을 입력하세요. " name="location"/>
            
                            
                               <!--   <input type="submit" value="등록">-->                   
        </form>
            <input type="button" value=등록 onclick="saveStardium()" />
  



<script src="/js/stardium.js"></script>    
</body>
</html>