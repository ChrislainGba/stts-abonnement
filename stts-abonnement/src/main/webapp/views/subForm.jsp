<%@ taglib uri="/struts-tags" prefix="s"%>
<s:if test="%{type=='GSM'}">
	<s:textfield name="abonnement.fidelio" label="Fidelio"></s:textfield>
</s:if>
<s:elseif test="%{type=='INT'}">
	<s:textfield name="abonnement.debit" label="D�bit"></s:textfield>
</s:elseif>