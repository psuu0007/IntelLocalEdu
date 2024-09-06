<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jsonTest1</title>

<style type="text/css">

</style>

<script src="https://code.jquery.com/jquery-3.7.0.js" 
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" 
	crossorigin="anonymous">
</script>

<script type="text/javascript">
   $(document).ready(function () {
      $('#btnJson').on('click',function(){
   
         var drinkName1 = $('#drinkName1');
         var price1 = $('#price1');
         
         var drinkName2 = $('#drinkName2');
         var price2 = $('#price2');

         var drinkName3 = $('#drinkName3');
         var price3 = $('#price3');
        
         var jsonObjofObj = {
            'drink1' : {
                [drinkName1.attr('name')] : drinkName1.val(),
                [price1.attr('name')] : price1.val()
                },
            'drink2' : {
               [drinkName2.attr('name')] : drinkName2.val(),
               [price2.attr('name')] : price2.val()
            },
            'drink3' : {
               [drinkName3.attr('name')] : drinkName3.val(),
               [price3.attr('name')] : price3.val()
            }
         };
         
         console.log(jsonObjofObj);
      });

   });//ready끝
</script>

</head>

<body>

   <input type="button" value="json객체 생성" id="btnJson">

   <fieldset id="menu">
      <legend >메뉴판</legend>
      1음료명<input type="text" name="drinkName" id="drinkName1">
      음료가격<input type="text" name="price" id="price1">
      <hr>
      2음료명<input type="text" name="drinkName" id="drinkName2">
      음료가격<input type="text" name="price" id="price2">
      <hr>
      3음료명<input type="text" name="drinkName" id="drinkName3">
      음료가격<input type="text" name="price" id="price3">
   </fieldset> 
   
   
</body>
</html>