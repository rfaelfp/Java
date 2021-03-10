module app.financeiro {
	
	requires java.base; // único módulo que é requerio por padrão, não é necessário requerer explicitamente. 
	// requires app.calculo;
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
}