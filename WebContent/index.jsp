<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        
<%
	String regResp  =null;
	try{
	 regResp = (String)request.getSession().getAttribute("response");
	}catch(Exception e){
		
	}
%>
        <title>VIVA</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style3.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
        <script src="./js/jquery-3.4.0.min.js"></script>
        <script src="./js/user.js"></script>



<script type="text/javascript">
	$(document).ready(function() {
		<% if(regResp != null){%>
			alert("Registration : <%=regResp%>");
		<%}%>
	});
</script>
<script type="text/javascript">
	function forgotPassword() {
		var emailId = $("#loginEmailId").val();
		console.log("Forgot Password got called : " + emailId);
		if($.trim(emailId) == ""){
			alert("enter email id");
		}else{
			alert("Check your mail for password");
			$.ajax({
				type: 'post',
				url: './forgotPassword',
				data: {emailId:emailId},
				success: function (response) {
					console.log("forgot password call completed..... " + response);
				},
				error : function(data, status, er) {
					console.log("Error in forgot password jsm : " + data + " status: " + status + " er:" + er);
				}
			});
		}
	}
</script>

    </head>
    <body>
        <div class="container">
            <!-- Codrops top bar -->
            <div class="codrops-top">
                       
                <span class="right">
                   
                </span>
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <header>
                <h1>Welcome to <span>Service Hub</span></h1>
				<nav class="codrops-demos">
					
				</nav>
            </header>
            <section>				
                <div id="container_demo" >
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="./userLogin" autocomplete="on" method="post" autocomplete="off"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="email" class="uname" data-icon="u" > Email Id </label><label style="color: red;">&nbsp;*</label>
                                    <input type="email" id="loginEmailId" name="loginEmailId" placeholder="Email ID" required="required"/>
                                </p>
                                <p> 
                                    <label for="loginPassword" class="youpasswd" data-icon="p"> Password </label><label style="color: red;">&nbsp;*</label>
                                    <input type="password" id="loginPassword" name="loginPassword" placeholder="Password" disabled="disabled" /> 
                                </p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
								</p>
                                <p class="login button">
                                	<a href="javascript:void(0)" onclick="forgotPassword();">forgot password</a>
                                </p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>