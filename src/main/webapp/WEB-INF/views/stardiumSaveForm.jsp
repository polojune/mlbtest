<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>야구장 등록</title>
</head>
<body>
    <h2>야구장등록</h2>
     
   <table>
 
    <tbody>
        <form action="/stardium" method="post">
            <tr>
                <tr>
                <td><input id="name" type="text" placeholder="이름을 입력하세요. " name="name"/></td>
                 </tr>        
                <tr>
                <td><input id="location" type="text" placeholder="지역을 입력하세요. " name="location"/></td>
                 </tr> 
                     
               <td colspan="2">
                     
                   <input type="submit" value="등록">
                </td>
            </tr>
        </form>
    </tbody>
</table>


<script src="/js/stardium.js"></script>    
</body>
</html>