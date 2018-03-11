<%-- 
    Document   : testme
    Created on : Nov 9, 2017, 9:33:52 PM
    Author     : DELL
--%>
<!DOCTYPE html>
<html lang en-US>
<head>
<title>Mental Health assessment</title>
<style>
table#t1 {border:2px solid black;}
table {border-spacing:4px}
</style>
</head>
<script>
var count=0;
function d()
{
count++;
}
function e()
{
alert("Let's Start up a rough Analysis for the test you taken. \n\
Make sure you have answered all the questions for an accurate analysis.\n\
Are you ready?");
alert((count/60)*100+"% is roughly the anxiety levels you are facing currently");
}
</script>
<body style="background-color:rgb(156,224,137)">
<h1 style="font-family:Rockwell Extra Bold;font-size:40px;text-align:center;"><u>MENTAL HEALTH ASSESSMENT.</u></h1><br><br>
<p style="font-size:20px;color:rgb(74,0,149);font-family:Imprint MT Shadow;">Are you thinking about seeking the help of a therapist? If certain issues have been causing problems in your life and you aren't sure how to make the necessary changes, therapy can help. With the help of a professional, you can get out of an unhealthy cognitive, emotional, and behavioral pattern.<br>

Fill out the following questionnaire truthfully, paying special attention to the specified time period to which the questions refer. The results will only be helpful if you answer in an honest and complete manner.
</p><br><br>
<div align="center">
<table id="t1" style="width:75% ">
<tr>
<td style="font-size:20px;text-align:center;">
<p><b>The questions below ask about anxiety and worrying.<br>

In the last 6 months, have you experienced any of the following symptoms? If so, how often?<b></p>
</td>
</tr>
</table>
</div>
<br>
<br>
<br>
<table style="width:100%;">
<tr>
<th colspan="3">QUESTIONS</th>
<th>Never</th>
<th>A few times</th>
<th>Sometimes</th>
<th>Often</th>
<th>Constantly</th>
</tr>
<tr>
<td colspan="3">1.I was very anxious, worried or scared about a lot of things in my life.</td>
<div style=" text-align : center">
<td style=" text-align : center"><input type="radio" name="q1"</td>
<td style=" text-align : center"><input type="radio" name="q1"</td>
<td style=" text-align : center"><input type="radio" name="q1"></td>
<td style=" text-align : center"><input type="radio" name="q1"></td>
<td style=" text-align : center"><input type="radio" name="q1" onclick="d()"></td>
</div>
</tr>
<tr>
<td colspan="3">2.I felt that my worry was out of my control.</td>
<td style=" text-align : center"><input type="radio" name="q2"</td>
<td style=" text-align : center"><input type="radio" name="q2"</td>
<td style=" text-align : center"><input type="radio" name="q2"></td>
<td style=" text-align : center"><input type="radio" name="q2"></td>
<td style=" text-align : center"><input type="radio" name="q2" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">3.I felt restless, agitated, frantic, or tense.</td>
<td style=" text-align : center"><input type="radio" name="q3"</td>
<td style=" text-align : center"><input type="radio" name="q3"</td>
<td style=" text-align : center"><input type="radio" name="q3"></td>
<td style=" text-align : center"><input type="radio" name="q3"></td>
<td style=" text-align : center"><input type="radio" name="q3" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">4.I had trouble sleeping - I could not fall or stay asleep, and/or didn't feel well-rested when I woke up.</td>
<td style=" text-align : center"><input type="radio" name="q4"</td>
<td style=" text-align : center"><input type="radio" name="q4"</td>
<td style=" text-align : center"><input type="radio" name="q4"></td>
<td style=" text-align : center"><input type="radio" name="q4"></td>
<td style=" text-align : center"><input type="radio" name="q4" onclick="d()"></td>
</tr>
</table>
<br><br><br>
<div align="center">
<table id="t1" style="width:75% ">
<tr>
<td style="font-size:20px;">
<p><b>Sometimes, people experience a sudden, unexpected wave of intense anxiety or panic, usually lasting not more than 15 minutes.<br>
In the past 6 months, did you experience such an attack with any of the following symptoms? If so, how strong were the symptoms?<b></p>
</td>
</tr>
</table>
</div>
<br><br><br>
<table style="width:100%;">
<tr>
<th colspan="4"></th>
<th>Not at all</th>
<th>Mild</th>
<th>Moderate</th>
<th>Severe</th>
</tr>
<tr>
<td colspan="4">5.I was very anxious, worried or scared about a lot of things in my life.</td>
<td style=" text-align : center"><input type="radio" name="q5"</td>
<td style=" text-align : center"><input type="radio" name="q5"</td>
<td style=" text-align : center"><input type="radio" name="q5"></td>
<td style=" text-align : center"><input type="radio" name="q5" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">6.I felt that my worry was out of my control.</td>
<td style=" text-align : center"><input type="radio" name="q6"</td>
<td style=" text-align : center"><input type="radio" name="q6"</td>
<td style=" text-align : center"><input type="radio" name="q6"></td>
<td style=" text-align : center"><input type="radio" name="q6" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">7.I felt restless, agitated, frantic, or tense.</td>
<td style=" text-align : center"><input type="radio" name="q7"</td>
<td style=" text-align : center"><input type="radio" name="q7"</td>
<td style=" text-align : center"><input type="radio" name="q7"></td>
<td style=" text-align : center"><input type="radio" name="q7" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">8.I had trouble sleeping - I could not fall or stay asleep, and/or didn't feel well-rested when I woke up.</td>
<td style=" text-align : center"><input type="radio" name="q8"</td>
<td style=" text-align : center"><input type="radio" name="q8"</td>
<td style=" text-align : center"><input type="radio" name="q8"></td>
<td style=" text-align : center"><input type="radio" name="q8" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">9.I had pain in my chest, almost like I was having a heart attack.</td>
<td style=" text-align : center"><input type="radio" name="p"</td>
<td style=" text-align : center"><input type="radio" name="p"</td>
<td style=" text-align : center"><input type="radio" name="p"></td>
<td style=" text-align : center"><input type="radio" name="p" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">10.I felt sick to my stomach, like I was going to throw up, or had diarrhea.</td>
<td style=" text-align : center"><input type="radio" name="p1"</td>
<td style=" text-align : center"><input type="radio" name="p1"</td>
<td style=" text-align : center"><input type="radio" name="p1"></td>
<td style=" text-align : center"><input type="radio" name="p1" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">11.I felt dizzy, my head was spinning, or felt like I was going to faint.</td>
<td style=" text-align : center"><input type="radio" name="p2"</td>
<td style=" text-align : center"><input type="radio" name="p2"</td>
<td style=" text-align : center"><input type="radio" name="p2"></td>
<td style=" text-align : center"><input type="radio" name="p2" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">12.I had cold or hot flashes.</td>
<td style=" text-align : center"><input type="radio" name="p3"</td>
<td style=" text-align : center"><input type="radio" name="p3"</td>
<td style=" text-align : center"><input type="radio" name="p3"></td>
<td style=" text-align : center"><input type="radio" name="p3" onclick="d()"></td>
</tr>
<td colspan="4">13.I was scared that I would lose control, go crazy, or die.</td>
<td style=" text-align : center"><input type="radio" name="p4"</td>
<td style=" text-align : center"><input type="radio" name="p4"</td>
<td style=" text-align : center"><input type="radio" name="p4"></td>
<td style=" text-align : center"><input type="radio" name="p4" onclick="d()"></td>
</tr>
</table>
<br>
<p>14.How frequently did you experience panic attacks in the last 6 months?<br>
<input type="radio" name="q1" onclick="d()">Several times a day<br>
<input type="radio" name="q1">Once or twice a day<br>
<input type="radio" name="q1">A few times a week<br>
<input type="radio" name="q1">Less than few times a week<br>
<input type="radio" name="q1">Never<br></p><br><br><br>
<div align="center">
<table id="t1" style="width:75% ">
<tr>
<td style="font-size:20px;text-align:center;">
<p><b>In the next set of questions, we will be asking whether you experienced a traumatic event, and how you reacted to it.<br>

How did you experience the traumatic event?</b></p></td>
</tr>
</table>
</div><br><br><br>

<table style="width:100%;">
<tr>
<th colspan="4"></th>
<th>No</th>
<th>Yes</th>
</tr>
<tr>
<td colspan="4">15.Did you purposely avoid situations or activities in which you might experience a panic attack?</td>
<td style=" text-align : center"><input type="radio" name="p5"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="p5"</td>
</tr>
<tr>
<td colspan="4">16.Directly - I was a victim of a traumatic event.</td>
<td style=" text-align : center"><input type="radio" name="p6"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="p6"</td>
</tr>
<tr>
<td colspan="4">17.I witnessed it in person (happening to someone else).</td>
<td style=" text-align : center"><input type="radio" name="p7"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="p7"</td>
</tr>
<tr>
<td colspan="4">18.I learned about it happening to a close family member or friend.</td>
<td style=" text-align : center"><input type="radio" name="p8"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="p8"</td>
</tr>
<tr>
<td colspan="4">19.I was exposed to it as a result of my job (e.g. paramedic, police officer, fire fighter etc.).</td>
<td style=" text-align : center"><input type="radio" name="p9"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="p9"</td>
</tr>
<tr>
<td colspan="4">20.I am haunted by memories, flashbacks, or nightmares about the event.</td>
<td style=" text-align : center"><input type="radio" name="r"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r"</td>
</tr>
<tr>
<td colspan="4">21.I lost trust in humanity and myself, and began expecting the worst of others and of situations.</td>
<td style=" text-align : center"><input type="radio" name="r1"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r1"</td>
</tr>
<tr>
<td colspan="4">22.I frequently felt fear, guilt, shame, or blamed myself or others for what happened.</td>
<td style=" text-align : center"><input type="radio" name="r2"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r2"</td>
</tr>
<tr>
<td colspan="4">23.I lost interest in activities that I used to enjoy.</td>
<td style=" text-align : center"><input type="radio" name="r3"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r3"</td>
</tr>
<tr>
<td colspan="4">24.I became irritable or enraged because of minor issues (or for no reason at all).</td>
<td style=" text-align : center"><input type="radio" name="r4"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r4"</td>
</tr>
<tr>
<td colspan="4">25.I became reckless or took unncessary risks.</td>
<td style=" text-align : center"><input type="radio" name="r5"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r5"</td>
</tr>
<tr>
<td colspan="4">26.I became excessively vigilant, tense, "on guard" or jumpy.</td>
<td style=" text-align : center"><input type="radio" name="r6"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r6"</td>
</tr>
<tr>
<td colspan="4">27.I had trouble focusing, concentrating, or remembering things.</td>
<td style=" text-align : center"><input type="radio" name="r7"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r7"</td>
</tr>
<tr>
<td colspan="4">28.I purposely avoided anything that reminded me of the event (e.g. certain people, places, objects, activities).</td>
<td style=" text-align : center"><input type="radio" name="r8"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r8"</td>
</tr>
<tr>
<td colspan="4">29.I was unable to feel happiness, contentment, joy, or love, or had trouble connecting with people.</td>
<td style=" text-align : center"><input type="radio" name="r9"</td>
<td style=" text-align : center" onclick="d()"><input type="radio" name="r9"</td>
</tr></table><br><br><br>
<div align="center">
<table id="t1" style="width:75% ">
<tr>
<td style="font-size:20px;text-align:center;">
<p><b>The next set of questions focuses on feelings of sadness.<br>

In the past year, did you experience any of the following symptoms for at least 2 weeks? If so, how strong were they?</td>
</tr>
</table>
</div><br><br><br>
<table style="width:100%;">
<tr>
<th colspan="4"></th>
<th>Not at all</th>
<th>Mild</th>
<th>Moderate</th>
<th>Severe</th>
</tr>
<tr>
<td colspan="4">30.I frequently felt sad, like I couldn't go on.</td>
<td style=" text-align : center"><input type="radio" name="e"</td>
<td style=" text-align : center"><input type="radio" name="e"</td>
<td style=" text-align : center"><input type="radio" name="e"></td>
<td style=" text-align : center"><input type="radio" name="e" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">31.I stopped having fun doing things that I used to enjoy.</td>
<td style=" text-align : center"><input type="radio" name="e1"</td>
<td style=" text-align : center"><input type="radio" name="e1"</td>
<td style=" text-align : center"><input type="radio" name="e1"></td>
<td style=" text-align : center"><input type="radio" name="e1" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">32.I lost or gained weight without trying to, or my appetite changed.</td>
<td style=" text-align : center"><input type="radio" name="g"</td>
<td style=" text-align : center"><input type="radio" name="g"</td>
<td style=" text-align : center"><input type="radio" name="g"></td>
<td style=" text-align : center"><input type="radio" name="g" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">33.I felt slowed down compared to my usual pace.</td>
<td style=" text-align : center"><input type="radio" name="l"</td>
<td style=" text-align : center"><input type="radio" name="l"</td>
<td style=" text-align : center"><input type="radio" name="l"></td>
<td style=" text-align : center"><input type="radio" name="l" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">34.I felt exhausted.</td>
<td style=" text-align : center"><input type="radio" name="n"</td>
<td style=" text-align : center"><input type="radio" name="n"</td>
<td style=" text-align : center"><input type="radio" name="n"></td>
<td style=" text-align : center"><input type="radio" name="n" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">35.I felt worthless or guilty.</td>
<td style=" text-align : center"><input type="radio" name="n1"</td>
<td style=" text-align : center"><input type="radio" name="n1"</td>
<td style=" text-align : center"><input type="radio" name="n1"></td>
<td style=" text-align : center"><input type="radio" name="n1" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">36.I kept thinking about death or taking my own life.</td>
<td style=" text-align : center"><input type="radio" name="k"</td>
<td style=" text-align : center"><input type="radio" name="k"</td>
<td style=" text-align : center"><input type="radio" name="k"></td>
<td style=" text-align : center"><input type="radio" name="k" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">37.The sadness I was feeling made it difficult for me to function in my personal, social, or work life.</td>
<td style=" text-align : center"><input type="radio" name="a1"</td>
<td style=" text-align : center"><input type="radio" name="a1"</td>
<td style=" text-align : center"><input type="radio" name="a1"></td>
<td style=" text-align : center"><input type="radio" name="a1" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">38.I experienced an unusually elevated mood where I was extremely elated, energetic, or irritable.</td>
<td style=" text-align : center"><input type="radio" name="u"</td>
<td style=" text-align : center"><input type="radio" name="u"</td>
<td style=" text-align : center"><input type="radio" name="u"></td>
<td style=" text-align : center"><input type="radio" name="u" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">39.I had a sudden burst of confidence, or felt like I was better than anyone else.</td>
<td style=" text-align : center"><input type="radio" name="v"</td>
<td style=" text-align : center"><input type="radio" name="v"</td>
<td style=" text-align : center"><input type="radio" name="v"></td>
<td style=" text-align : center"><input type="radio" name="v" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">40.I had periods of time when I needed little or no sleep, yet functioned as well or better than usual.</td>
<td style=" text-align : center"><input type="radio" name="g"</td>
<td style=" text-align : center"><input type="radio" name="g"</td>
<td style=" text-align : center"><input type="radio" name="g"></td>
<td style=" text-align : center"><input type="radio" name="g"onclick="d()" ></td>
</tr>
<tr>
<td colspan="4">41.My mind was flooded with thoughts, and I talked more/faster than usual.	
</td>
<td style=" text-align : center"><input type="radio" name="h1"</td>
<td style=" text-align : center"><input type="radio" name="h1"</td>
<td style=" text-align : center"><input type="radio" name="h1"></td>
<td style=" text-align : center"><input type="radio" name="h1" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">42.I started to tackle multiple goals/activities at once (more than I usually would) or jumped from one interest to another in an attempt to do it all.</td>
<td style=" text-align : center"><input type="radio" name="d"</td>
<td style=" text-align : center"><input type="radio" name="d"</td>
<td style=" text-align : center"><input type="radio" name="d"></td>
<td style=" text-align : center"><input type="radio" name="d" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">43.I got involved in fun things that, in hindsight, could have had negative consequences (e.g. carefree or unprotected sex, shopping sprees, unwise investments, excessive gambling, etc.).</td>
<td style=" text-align : center"><input type="radio" name="w"</td>
<td style=" text-align : center"><input type="radio" name="w"</td>
<td style=" text-align : center"><input type="radio" name="w"></td>
<td style=" text-align : center"><input type="radio" name="w" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">44.I experienced extreme mood swings from depression to elation without any apparent reason.</td>
<td style=" text-align : center"><input type="radio" name="j"</td>
<td style=" text-align : center"><input type="radio" name="j"</td>
<td style=" text-align : center"><input type="radio" name="j"></td>
<td style=" text-align : center"><input type="radio" name="j" onclick="d()"></td>
</tr>
<tr>
<td colspan="4">45.The mood changes I experienced kept me from living my life to the fullest, or required me to be hospitalized to prevent harm to myself/others.</td>
<td style=" text-align : center"><input type="radio" name="b"</td>
<td style=" text-align : center"><input type="radio" name="b"</td>
<td style=" text-align : center"><input type="radio" name="b"></td>
<td style=" text-align : center"><input type="radio" name="b" onclick="d()"></td>
</tr>
</table><br><br><br>
<div align="center">
<table id="t1" style="width:75% ">
<tr>
<td style="font-size:20px;text-align:center;">
<p><b>In the last year, have you used the following substances? If so, how often?</td>
</tr>
</table>
</div><br><br><br>
<table style="width:100%;">
<tr>
<th colspan="3"></th>
<th>Never</th>
<th>A few times a year</th>
<th>A few times a month</th>
<th>A few times a week</th>
<th>Daily</th>
</tr>
<tr>
<td colspan="3">46.Alcohol</td>
<td style=" text-align : center"><input type="radio" name="b1"</td>
<td style=" text-align : center"><input type="radio" name="b1"</td>
<td style=" text-align : center"><input type="radio" name="b1"></td>
<td style=" text-align : center"><input type="radio" name="b1"></td>
<td style=" text-align : center"><input type="radio" name="b1" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">47.Cannabis</td>
<td style=" text-align : center"><input type="radio" name="b2"</td>
<td style=" text-align : center"><input type="radio" name="b2"</td>
<td style=" text-align : center"><input type="radio" name="b2"></td>
<td style=" text-align : center"><input type="radio" name="b2"></td>
<td style=" text-align : center"><input type="radio" name="b2" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">48.Hallucinogens (e.g. LSD, Peyote, Psilocybin, PCP)</td>
<td style=" text-align : center"><input type="radio" name="b3"</td>
<td style=" text-align : center"><input type="radio" name="b3"</td>
<td style=" text-align : center"><input type="radio" name="b3"></td>
<td style=" text-align : center"><input type="radio" name="b3"></td>
<td style=" text-align : center"><input type="radio" name="b3" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">49.Inhalants (e.g. glue, aerosols, lighter fluid, gasoline - products used for mind-altering purposes rather than what they are intended for)</td>
<td style=" text-align : center"><input type="radio" name="b4"</td>
<td style=" text-align : center"><input type="radio" name="b4"</td>
<td style=" text-align : center"><input type="radio" name="b4"></td>
<td style=" text-align : center"><input type="radio" name="b4"></td>
<td style=" text-align : center"><input type="radio" name="b4" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">50.Opioids (e.g. Heroin, Codeine, Morphine, Ocycodone)</td>
<td style=" text-align : center"><input type="radio" name="b5"</td>
<td style=" text-align : center"><input type="radio" name="b5"</td>
<td style=" text-align : center"><input type="radio" name="b5"></td>
<td style=" text-align : center"><input type="radio" name="b5"></td>
<td style=" text-align : center"><input type="radio" name="b5" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">51.Sedatives/Hypnotics/Anxiolytics (e.g. Valium, Xanax, Restoril, Ativan)</td>
<td style=" text-align : center"><input type="radio" name="b6"</td>
<td style=" text-align : center"><input type="radio" name="b6"</td>
<td style=" text-align : center"><input type="radio" name="b6"></td>
<td style=" text-align : center"><input type="radio" name="b6"></td>
<td style=" text-align : center"><input type="radio" name="b6" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">52.Stimulants (e.g. Cocaine, Ecstasy, Speed, Methamphetamine; Ritalin, Concerta, Biphetamine, Dexedrine)</td>
<td style=" text-align : center"><input type="radio" name="b7"></td>
<td style=" text-align : center"><input type="radio" name="b7"></td>
<td style=" text-align : center"><input type="radio" name="b7"></td>
<td style=" text-align : center"><input type="radio" name="b7"></td>
<td style=" text-align : center"><input type="radio" name="b7" onclick="d()"></td>
</tr>
<tr>
<td colspan="3">53.Other substance not listed</td>
<td style=" text-align : center"><input type="radio" name="b8"></td>
<td style=" text-align : center"><input type="radio" name="b8"></td>
<td style=" text-align : center"><input type="radio" name="b8"></td>
<td style=" text-align : center"><input type="radio" name="b8"></td>
<td style=" text-align : center"><input type="radio" name="b8" onclick="d()"></td>
</tr>
</table><br><br><br>
<p>54.In the last year, which of the following caused you the most problems (socially, at work/school, or in your personal life)?<br>
<input type="radio" name="a1">Alcohol<br>
<input type="radio" name="a2">Cannabis<br>
<input type="radio" name="a3">Hallucinogens<br>
<input type="radio" name="a4">Inhalants<br>
<input type="radio" name="a5">Opioids<br>
<input type="radio" name="a6">Sedatives/ Hypnotics/Anxiolytics<br>
<input type="radio" name="a7">Stimulants<br>
<input type="radio" name="a8">Other substance not listed<br>
<input type="radio" name="a9">None of the above substances caused me problems in the last 12 months.<br></p><br><br><br>
<div align="center">
<table id="t1" style="width:75% ">
<tr>
<td style="font-size:20px;text-align:center;">
<p><b>In the last 6 months, did you experience any of the following symptoms related to the use of the problematic substance (the one you indicated on the previous page)?<br>Choose No or Yes for each option.
</b></p></td>
</tr>
</table>
</div><br><br><br>
<table style="width:100%;">
<tr>
<th colspan="5"></th>
<th>No</th>
<th>Yes</th>
</tr>
<tr>
<td colspan="5">55.I tried to cut down, but ended up using it more or for longer than I intended.</td>
<td style=" text-align : center"><input type="radio" name="b11"></td>
<td style=" text-align : center"><input type="radio" name="b11" onclick="d()"></td>
</tr>
<tr>
<td colspan="5">56.I continued to use this substance despite the fact that it was affecting my relationships (e.g. having arguments with friends or family), got me into trouble at work/home, or affected my health.</td>
<td style=" text-align : center"><input type="radio" name="q11"</td>
<td style=" text-align : center"><input type="radio" name="q11" onclick="d()"></td>
</tr>
<tr>
<td colspan="5">57.I experienced cravings or withdrawal symptoms when I wasn't using it (sweating, increased pulse rate, tremors, digestive problems, hallucinations, anxiety, headache, fatigue/drowsiness, sleep problems, appetite or weight changes, restlessness, depression, irritability, concentration problems, muscle pain, fever, etc.).</td>
<td style=" text-align : center"><input type="radio" name="q12"</td>
<td style=" text-align : center"><input type="radio" name="q12" onclick="d()"></td>
</tr>
<tr>
<td colspan="5">58.I spent a lot of time covering up my use, and planning ahead to make sure I would have enough of the substance to get me through the day.</td>
<td style=" text-align : center"><input type="radio" name="q13"</td>
<td style=" text-align : center"><input type="radio" name="q13" onclick="d()"></td>
</tr>
<tr>
<td colspan="5">59.I used the substance in situations in which it was physically dangerous or risky to do so (e.g. driving a car, working with tools or sharp objects, climbing a ladder, etc.).</td>
<td style=" text-align : center"><input type="radio" name="q14"</td>
<td style=" text-align : center"><input type="radio" name="q14" onclick="d()"></td>
</tr>
<tr>
<td colspan="5">60.I had to take the substance in increasing amounts in order to achieve the effect I wanted.</td>
<td style=" text-align : center"><input type="radio" name="q15"</td>
<td style=" text-align : center"><input type="radio" name="q15" onclick="d()"></td>
</tr>
</table>
<div text-align: center><br><br>
<center><input type="submit" name="submit" value="Submit" onclick="e()"></center>
<a href='submit'><br> Detailed Analysis</br></a>
<a href='testme'><br>Reset</br></a>
</div>

</body>
</html>




