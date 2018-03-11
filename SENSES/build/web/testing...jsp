<html>
<title>testing..</title>
<script>
var count=0;
function d()
{
count++;
}
function e()
{
alert(count);
}
</script>

<body>
<input type="radio" name="radio" id="select" onclick="d()"/>1
<input type="radio" name="radio" id="select1" />2
<input type="radio" name="radio" id="select2" />3
<input type="radio" name="radio" id="select3" />4
<input type="radio" name="radio" id="select4" />5
<input type="submit" name="submit" value="Submit" onclick="e()"/>
</body>

</html>