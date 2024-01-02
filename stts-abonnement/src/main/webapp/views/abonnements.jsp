<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-jquery-tags" prefix="jq" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Abonnement</title>
<jq:head/>
<link rel="stylesheet" type="text/css" href="css/style.css"/>
<script type="text/javascript">
	$(function(){
		getSunFonction($("#typeAb").value());
	});
	function getSubForm(type){
		$.get("getSubForm?type="+type, function(data){
			console.log(data);
			if (data.trim() !== "") {
	            $("#subForm").html(data);
	        } else {
	            console.error("Received empty data from the server.");
	        }
	    }).fail(function(jqXHR, textStatus, errorThrown) {
	        console.error("Error during the AJAX request:", textStatus, errorThrown);
	    });
	}
</script>
</head>
<body>
	<div class="cadre">
		<s:form action="save" method="POST">
			<s:textfield name="abonnement.idAb" label="ID Ab"></s:textfield>
			<jq:datepicker name="abonnement.dateAbonnement" label="Date Ab"></jq:datepicker>
			<s:textfield name="abonnement.sole" label="Sole"></s:textfield>
			<s:checkbox name="abonnement.actif" label="Actif"></s:checkbox>
			<s:select list="typesAb" name="abonnement.type" label="Type Ab" onchange="getSubForm(this.value)"></s:select>
			<tbody id="subForm"></tbody>
			<s:submit value="save"></s:submit>
		</s:form>
	</div>
	<div class="cadre">
		<table class="table1">
			<tr>
				<th>ID</th><th>Date</th><th>Solde</th><th>Type</th><th>Actif</th><th>Fidélio</th><th>Débit</th>
			</tr>
			<s:iterator value="abonnements">
				<tr>
					<td><s:property value="idAb"/></td>
					<td><s:property value="dateAbonnement"/></td>
					<td><s:property value="solde"/></td>
					<!--td><s:property value="class.simpleName"/></td-->
					<td><s:property value="type"/></td>
					<td><s:property value="actif"/></td>
					<td><s:property value="fidelio"/></td>
					<td><s:property value="debit"/></td>
				</tr>
			</s:iterator>
			
		</table>
	</div>
</body>
</html>