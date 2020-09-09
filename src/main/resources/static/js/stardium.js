let index = {
		
		init: function(){
			let _this = this;
			console.log(this);		// this : index 객체
			// 리스너
			$("#btn-save").on("click", () => {

				// 콜백 스택
				this.save();	// 위 함수를 Arrow Function으로 바꿈으로써 this가 index 객체 가리키도록 됨

			});
		},
     save:function(){
    	 let data = {
    			 name:$("#name").val(), 
    	         location:$("#location").val()
    	         
    	 };
        
    	 $.ajax({
    		 type:"POST",
    		 url:"/stardium", 	 
    		 data: JSON.stringify(data),
			 contentType: "application/json; charset=utf-8",
			 dataType: "json"	
    		 
    	 }).done(function(res){
    		 
    		 alert("등록성공");
    		 location.href="/";
    		 
    	 }).fail(function(error){
    		 alert("등록실패");  
    	     console.log(error);
    	 });  
     }
		
}
index.init();