<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>   
<title>선수 등록</title>
</head>
<body>
    <h2>선수등록</h2>
     
        <form id="frm" name="frm">
                 <input type="hidden" name="teamId" value="{{loginUser.id}}"/>
			    <input type="hidden" name="stardiumId" value="{{id}}"/>
               선수이름: <input id="name" type="text" placeholder="이름을 입력하세요. " name="name"/> <br>
                포지션:<input id="position" type="text" placeholder="포지션을 입력하세요. " name="position"/><br>
                백넘버:<input id="number" type="text" placeholder="선수번호를 입력하세요" name="number"/>
           
                               <!--   <input type="submit" value="등록">-->                   
        </form>
            <input type="button" value=등록 onclick="savePlayer()" />
  



<script src="/js/stardium.js"></script>    
</body>
</html>