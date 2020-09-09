function saveTeam(){
	
	 let data = $("#frm").serialize(); 
    	console.log(1,data);
    	
    	fetch("/teamSave",{
    		method:"post", 
    		body:data,
    		headers:{
    			 "Content-Type":"application/x-www-form-urlencoded; charset=utf-8"
    		}
    	}).then(function(res){
    		return res.text();
    		
    	}).then(function(res){
    		alert("팀등록 성공");
    		location.reload();
    	 
        
    });
   }