module app.financeiro {
	
	requires java.base; // �nico m�dulo que � requerio por padr�o, n�o � necess�rio requerer explicitamente. 
	// requires app.calculo;
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
}