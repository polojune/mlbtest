function saveStardium(){
	
	 let data = $("#frm").serialize(); 
    	console.log(1,data);
    	
    	fetch("/stardiumSave",{
    		method:"post", 
    		body:data,
    		headers:{
    			 "Content-Type":"application/x-www-form-urlencoded; charset=utf-8"
    		}
    	}).then(function(res){
    		return res.text();
    		
    	}).then(function(res){
    		alert("야구장 등록 성공");
    		location.reload();
    	 
        
    });
   }