<%-- 
    Document   : first1
    Created on : Oct 30, 2017, 9:25:15 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />

<title>Senses</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<style type='text/css'>.nivoSlider {
	position:relative;
}
.nivoSlider img {
	position:absolute;
	top:0px;
	left:0px;
}
/* If an image is wrapped in a link */
.nivoSlider a.nivo-imageLink {
	position:absolute;
	top:0px;
	left:0px;
	width:100%;
	height:100%;
	border:0;
	padding:0;
	margin:0;
	z-index:60;
	display:none;
}
/* The slices in the Slider */
.nivo-slice {
	display:block;
	position:absolute;
	z-index:50;
	height:100%;
}
/* Caption styles */
.nivo-caption {
	position:absolute;
	left:0px;
	bottom:0px;
	background:#000;
	color:#fff;
	opacity:0.8; /* Overridden by captionOpacity setting */
	width:100%;
	z-index:89;
}
.nivo-caption p {
	padding:5px;
	margin:0;
}
.nivo-caption a {
	display:inline !important;
}
.nivo-html-caption {
    display:none;
}
/* Direction nav styles (e.g. Next & Prev) */
.nivo-directionNav a {
	position:absolute;
	top:45%;
	z-index:99;
	cursor:pointer;
}
.nivo-prevNav {
	left:0px;
}
.nivo-nextNav {
	right:0px;
}
/* Control nav styles (e.g. 1,2,3...) */
.nivo-controlNav a {
	position:relative;
	z-index:99;
	cursor:pointer;
}
.nivo-controlNav a.active {
	font-weight:bold;
}

*
{
border: 0;
margin: 0;
}

img
{
border: 0px;
}

body{
	font: 12px Arial, Helvetica, sans-serif;
	background: url(images/bg.png);
	line-height: 18px;
}

#bg { background: url(images/bg.jpg) ;}

#bg_top_bg { background: url(images/bg_top_bg.png) top repeat-x;}

#bg_top { background: url(images/bg_top.png) center top no-repeat;}

#bg_bot { background: url(images/bg_bot.png) center bottom no-repeat ;}
	
#main {
	width: 988px;
	margin: 0px auto;
	background:url(images/main.jpg) right top no-repeat;}

#header { 
	width:1000px;
	height: 142px;
}

#logo {	
		padding: 0px 0px 0px 130px;
}

#logo H2 {

		font-family: Arial, Helvetica, sans-serif;
		color:#dddddd;
		font-size:18px;
		font-style:italic;
		background: no-repeat;
		}

#logo a {
	text-decoration: none;
	font-style: italic;
	font-size: 14px;
	color: #dddddd;
}
	
#logo H2 a{
	font-size: 12px;
	font-family: Arial, Helvetica, sans-serif;
	font-weight:100;
	text-align:left;
}

#buttons{
	text-align:center;
	height: 82px;
	padding-left: 0px;
	background: url(images/buttons.png) left top no-repeat;
	padding: 0px 0px 0px 300px;
}

#buttons a {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 14px;
	font-weight: 100;
	display: block;
	float: left;
	text-decoration: none;
	color: #DDDDDD;
	text-align: center;
	padding-top: 32px;
	height: 50px;
	
}

.but {
	width: 140px;
}

#buttons .but:hover {
	background: url(images/but_hover.png) center center no-repeat;
	color:#000000;
	}
	
.but_t {background: url(images/but_hover.gif) center bottom no-repeat;}


	
.top { height:408px;
		width: 984px;
		background: url(images/top.jpg) 15px no-repeat #000000;
		margin-top: 16px;}

		
.circl_all {
		height: 58px; 
		vertical-align:top;
		padding: 27px 0px 0px 113px;
		background: url(images/circl_all.png) 113px 27px no-repeat; }

.circl {
	height: 21px;
	width: 21px;
	margin: 0px 102px 0px 0px;
	float: left;
	display:block; }
.circl:hover {
	background: url(images/circl_hover.png) left top no-repeat; }



#content{
	background: url(images/content.png);
	padding: 0px 0px 0px 0px;
	color: #000000;
}

.razd_h { height: 30px;
			background: url(images/razd_h.gif) 15px repeat-x;}

.home_box {
	float: left;
	width: 288px;
	padding: 13px 15px 13px 15px;
	}
	
.all_box {background: url(images/all_box.gif) left repeat-y; }
	
.razd_lr_h { background: url(images/razd_lr.gif) 620px repeat-y;}

.razd_lr { background: url(images/razd_lr.gif) 657px repeat-y;}


#left{
	width: 640px;
	float: left;
	margin-left: 0px;
}


#left_h{
	width: 590px;
	float: left;
	margin-left: 0px;
}

.text{
	padding: 0px 0px 15px 0px;
}

.img_l {	float:left;
		margin: 5px 22px 3px 0px;
}

.img_r {	float: right;
		margin: 9px 10px 3px 10px;
}


 h1{
	font-family: Arial, Helvetica, sans-serif;
	font-size:14px;
	font-weight: 100;
	color: #000000;
	text-align: left;
	padding: 0px 0px 0px 0px;
	line-height:normal;
}

.read {
	font-size:12px;
	color: #FF0000;
	text-decoration: none;
	display:block;
	line-height: 17px;
	width: 66px;
	text-align: center;
	float: right;
	font-weight:bold;
	font-style: italic;
	
}

.read:hover {
	font-size:12px;
	text-decoration: underline;
}

.box_more {
	background:url(images/box_more.png) left top no-repeat;
	height:	111px;
	padding: 0px 15px 0px 15px;

	}
.box_more_l { float:left;
				width: 780px;
				padding-top: 15px;
				color: #000000;
				font-size: 18px;
				line-height: 25px;
				}
				
.box_more_r { float: right;
				width: 155px;
				padding-top: 30px;
				}
.but_more {
	width: 156px;
	height: 30px;
	padding-top: 13px;
	background: url(images/but_more.gif) left top no-repeat;
	display:block;
	font-size:18px;
	color:#FFFFFF;
	text-align: center;
	text-decoration: none;
	}
	
.but_more:hover {
	background: url(images/but_more_hov.gif) left top no-repeat;}


	
#bottom {
	background: url(images/bottom.png) 43px 30px no-repeat;
	color: #FFFFFF;
}

#bottom_bot {
	background: url(images/bottom_bot.png) 43px bottom no-repeat;
	color: #FFFFFF;
}

#bottom h1 { 
	color: #ffffff;
	font-size: 14px;
	font-weight: 100;
	text-align: center;
	padding: 5px 0px 5px 0px;
			}

#b_col1 {
	width: 253px;
	float: left;
	margin-left: 43px;
}
#b_col2 {
	width: 253px;
	float: left;
	margin-left: 85px;
}
#b_col3 {
	width: 253px;
	float: left;
	margin-left: 85px;
	text-align: left;
}


.box_us {
width: 244px;
background: url(images/box_us.gif) 0px bottom repeat-x;
}

.box_us_l {
width: 27px;
float: left;
padding-top:3px;}

.box_us_r {
width: 217px;
float: left;}


.spis_bot {
	list-style:none;
	padding: 0px 0px 0px 34px;}

.spis_bot li {
	padding: 7px 0px 0px 18px;
	background: url(images/fish2.gif) 0px 12px no-repeat;
	}
	
.spis_bot a {
	color:#ffffff;
	text-decoration:none;
	font-weight: 100;
	display: block;
	font-weight:bold;}
.spis_bot a:hover {
	text-decoration: underline;
	}
	
.fu_i {
	padding: 0px 14px 0px 0px;
	vertical-align: middle ;
}

#b_col3 ul {
	list-style:none;
	padding: 0px 0px 0px 52px;}

#b_col3 li {
	padding: 8px 0px 2px 0px;
	background: none;
	}
	
#b_col3 li a {
	color:#FFFFFF;
	text-decoration: none;
	font-weight: bold;}
	
#b_col3 li a:hover {
	text-decoration: underline;
}

#footer{
	height: 75px;
	font-size: 11px;
	color: #ffffff;
	text-align: center;
	padding: 30px 0px 0px 0px;
	background: url(images/footer.jpg) 0px 15px no-repeat;
}

#footer a{
	color: #ffffff;
	font-size: 11px;
	text-decoration: none;
}

#footer a:hover{
	color: #ffffff;
	font-size: 11px;
	text-decoration: underline;
}

.lh {
	line-height: 22px;
}


/*=================================*/
/* Nivo Slider Demo
/* November 2010
/* By: Gilbert Pellegrom
/* http://dev7studios.com
/*=================================*/


#slider-wrapper {
    width: 954px;
    height: 378px;
    margin:0 auto;
	padding-top: 15px;
}

#slider {
	position:relative;
    width: 954px;
    height: 378px;
	background:url(images/loading.gif) no-repeat 50% 50%;
}
#slider img {
	position:absolute;
	top:0px;
	left:0px;
	display:none;
}
#slider a {
	border:0;
	display:block;
}

.nivo-controlNav {
	position:absolute;
	left: 400px;
	bottom:-52px;

}
.nivo-controlNav a {
	display:block;
	width:22px;
	height:22px;
	background:url(images/circl.jpg) no-repeat;
	text-indent:-9999px;
	border:0;
	margin-right:3px;
	float:left;
}
.nivo-controlNav a.active {
	background-position:0 -22px;
		background:url(images/circl_hover.png) no-repeat;
}

.nivo-directionNav a {
	display:block;
	width:30px;
	height:30px;
	background:url(images/arrows.png) no-repeat;
	text-indent:-9999px;
	border:0;
}
a.nivo-nextNav {
	background-position:-30px 0;
	right:15px;
}
a.nivo-prevNav {
	left:15px;
}

.nivo-caption {
    text-shadow:none;
    font-family: Helvetica, Arial, sans-serif;
}
.nivo-caption a { 
    color:#efe9d1;
    text-decoration:underline;
}




 </style></head>
<body>

<div id="bg">
<div id="bg_top_bg">
<div id="bg_top">
<div id="bg_bot">


<div id="main">
<!-- header begins -->
<div id="header">
	<div id="buttons">
      <a href='first' class="but but_t"  title="">Home</a>
      <a href='psychology' class="but" title="">About Psychology</a>
      <a href='login'  class="but" title="">Login</a>
      <a href='experts'  class="but" title="">Experts</a>
      <a href='register' class="but" title="">Registration</a>
     
  </div>
	<div id="logo">
    	<a href="#"></a>
      	<h2><a href="#"><small>Senses</small></a></h2>
    </div>

</div>
<!-- header ends -->
<div class="top">

			<div id="slider-wrapper">
            <div id="slider" class="nivoSlider">
                <img src='top.jpg'>
                <img src='top2.jpg'>
                <img src='top3.jpg'>
				<img src='top4.jpg'>
				<img src='top5.jpg'>
				<img src='top6.jpg'>
				<img src='top7.jpg'>
            </div>

        </div>

<script type="text/javascript" src="lib/jquery-1.4.3.min.js"></script>
    <script type="text/javascript" src="lib/jquery.nivo.slider.pack.js"></script>
    <script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script>

</div>

<div style="height: 47px"></div>
        <!-- content begins -->
        		<div class="cont_top"></div>
       			<div id="content">
                	<div class="all_box">
                        	<div class="home_box">
                          		<img src="images/img1.gif" class="img_l" alt="" />
                                <div style="height:15px"></div>
                            	<h1>Lorem ipsum dolor sit amet, consectetur adipiscing elit. </h1>
                                <div style="clear: both"></div>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo
                                <div style="height:5px"></div>
                                <div style="height:20px"><a href="#" class="read">Learn more</a></div>
                        	</div>
                            <div style="width: 15px; height:26px; float: left;"></div>
                        	<div class="home_box">
                         		<img src="images/img2.gif" class="img_l" alt="" />
                                <div style="height:15px"></div>
                            	<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>
                                <div style="clear: both"></div>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo
                                <div style="height:5px"></div>
                                <div style="height:20px"><a href="#" class="read">read more</a></div>
                            </div>
                            <div style="width: 15px; height:26px; float: left;"></div>
                        	<div class="home_box">
                         		<img src="images/img2.gif" class="img_l" alt="" />
                                <div style="height:15px"></div>
                            	<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>
                                <div style="clear: both"></div>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo
                                <div style="height:5px"></div>
                                <div style="height:20px"><a href="#" class="read">read more</a></div>
                            </div>
                            <div style="width: 15px; height:26px; float: left;"></div>
                        	<div class="home_box">
                         		<img src="images/img2.gif" class="img_l" alt="" />
                                <div style="height:15px"></div>
                            	<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>
                                <div style="clear: both"></div>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo
                                <div style="height:5px"></div>
                                <div style="height:20px"><a href="#" class="read">read more</a></div>
                            </div>
                            <div style="width: 15px; height:26px; float: left;"></div>
                        	<div class="home_box">
                         		<img src="images/img2.gif" class="img_l" alt="" />
                                <div style="height:15px"></div>
                            	<h1>Vestibulum nisi leo, tristique ut mollis a, placerat a risus.</h1>
                                <div style="clear: both"></div>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo
                                <div style="height:5px"></div>
                                <div style="height:20px"><a href="#" class="read">read more</a></div>
                            </div>
                            <div style="width: 15px; height:26px; float: left;"></div>
                        	<div class="home_box">
                         		<img src="images/img3.gif" class="img_l" alt="" />
                                <div style="height:15px"></div>
                            	<h1>Nam iaculis dapibus mi, luctus sagittis diam laoreet fermentum.</h1>
                                <div style="clear: both"></div>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut accumsan lacus id lacus viverra id aliquam enim mollis. Nullam ullamcorper volutpat dui et ultricies. Vestibulum vitae diam augue, in hendrerit quam. Cras suscipit, sapien at cursus egestas, odio quam condimentum felis, sit amet ultrices metus mauris ac augue. Suspendisse potenti. Sed mattis justo eget velit eleifend a posuere justo
                                <div style="height:5px"></div>
                                <div style="height:20px"><a href="#" class="read">read more</a></div>
                            </div>
                      		<div style="clear: both"></div>
               	  	</div>
                    <div style="height:20px"></div>
                    <div class="box_more">
                    	<div class="box_more_l">Donec aliquam vehicula turpis eu placerat. Nam felis sem, aliquam eget laoreet in, adipiscing eu tellus. Morbi semper suscipit turpis, sed viverra arcu ultrices vel. Curabitur congue semper mollis. Integer mauris nibh, venenatis volutpat pulvinar eu, congue id arcu. Suspendisse iaculis congue </div>
                        <div class="box_more_r">
                        	<a href="#" class="but_more">MORE INFO</a>
                        </div>
                        <div style="clear: both"></div>
                    </div>


        		</div>
    <!-- content ends -->
    <div style="height:40px"></div>
    <!-- bottom begin -->
    <div id="bottom_bot">
        <div id="bottom">
        <div id="b_col1">
              <h1>Useful Resources</h1>
                <div style="height:10px"></div>
                    <ul class="spis_bot">
                        <li><a href="#">Lorem ipsum dolor sit amet </a></li>
                        <li><a href="#">Maecenas in magna quis augue</a></li>
                        <li><a href="#">Ut a mauris nec eros consect</a></li>
                        <li><a href="#">Nam luctus felis at mauris co </a></li>
                        <li><a href="#">Aliquam sagittis ligula sit amet </a></li>
                        <li><a href="#">Quisque sit amet est id urna</a></li>
                    </ul>
                </div>
                <div id="b_col2">
                    <h1>Contact Information</h1>
                    <div style="height:20px"></div>
                    <div style="padding-left:10px">
                        <div  class="box_us">
                              <div  class="box_us_l">
                                <img src="images/fish_us1.png" alt="" />
                              </div>
                              <div  class="box_us_r">
                                    <b class="lh">1234 Some Street, Brooklyn, NY 11201</b>
                              </div>
                              <div style="clear: both; height:10px;"></div>
                        </div>
                        <div  class="box_us">
                              <div  class="box_us_l">
                                <img src="images/fish_us2.png" alt="" />
                              </div>
                              <div  class="box_us_r">
                                    <b class="lh">Phone:  1(234) 567 8910<br />
                                        Fax: 1(234) 567 8910
                                    </b>
                              </div>
                              <div style="clear: both; height:10px;"></div>
                        </div>
                        <div  class="box_us">
                              <div  class="box_us_l">
                                <img src="images/fish_us3.png" alt="" />
                              </div>
                              <div  class="box_us_r">
                                    <b class="lh">E-mail: companyname@yahoo.com</b>
                              </div>
                              <div style="clear: both; height:10px;"></div>
                        </div>
                    </div>
            </div>

            <div id="b_col3">
            	<h1>Share with Others</h1>
              	<div style="height:15px"></div>
                    <ul>
                        <li><img src="images/fu_i1.png" class=" fu_i" alt="" /><a href="#">Subscribe to Blog</a></li>
                        <li><img src="images/fu_i2.png" class=" fu_i" alt="" /><a href="#">Be a fan on Facebook</a></li>
                        <li><img src="images/fu_i3.png" class=" fu_i" alt="" /><a href="#">RSS Feed</a></li>
                        <li><img src="images/fu_i4.png" class=" fu_i" alt="" /><a href="#">Follow us on Twitter</a></li>
                    </ul>

                </div>
          	<div style="clear: both; height:20px;"></div>
        </div>
    </div>
<!-- bottom end -->
<!-- footer begins -->
            <div id="footer">
          		Copyright  2011. <!-- Do not remove -->Designed by <a href="http://www.metamorphozis.com/free_templates/free_templates.php" title="Free Web Templates">Free Web Templates</a>, coded by <a href="http://www.myfreecsstemplates.com/" title="Free CSS Templates">Free CSS Templates</a><!-- end --><br />
                <a href="#">Privacy Policy</a> | <a href="#">Terms of Use</a> | <a href="http://validator.w3.org/check/referer" title="This page validates as XHTML 1.0 Transitional"><abbr title="eXtensible HyperText Markup Language">XHTML</abbr></a> | <a href="http://jigsaw.w3.org/css-validator/check/referer" title="This page validates as CSS"><abbr title="Cascading Style Sheets">CSS</abbr></a>
             </div>
        <!-- footer ends -->
</div>



</div>
</div>
</div>
</div>

</body>
</html>



