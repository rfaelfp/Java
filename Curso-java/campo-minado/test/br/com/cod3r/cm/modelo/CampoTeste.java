package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach // inicar sempre que realizado um novo teste (m�todo);
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test // anotattion necess�ria que marca que � um teste;
	void testeVizinhoRealDistancia1Esquerda () {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}
	@Test
	void testeVizinhoRealDistancia1Direita () {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}
	@Test
	void testeVizinhoRealDistancia1EmCima () {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}
	@Test
	void testeVizinhoRealDistancia1EmBaixo () {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}
	@Test
	void testeVizinhoRealDistancias2 () {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);		
	}
	@Test
	void testeNaoVizinho () {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);		
	}
	
	@Test
	void testeValorPadraoAtributoMarcado () {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao () {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	@Test
	void testeAlternarMarcacaoDuasChamadas () {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAbrirNaoMinadoNaoMarcado () {
		assertTrue(campo.abrir());
	}
	@Test
	void testeAbrirNaoMinadoMarcado () {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirMinadoMarcado () {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	@Test
	void testeAbrirMinadoENaoMarcado () {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	@Test
	void testeAbrirComVizinhos1 () {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	@Test
	void testeAbrirComVizinhos2 () {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 1);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	@Test
	void testeMarcado() {
		campo.alternarMarcacao();;
		assertEquals("x", campo.toString());
	}
	@Test
	void testeAbertoEMinado() {
		campo.abrir();
		campo.minar();
		assertEquals("*", campo.toString());
	}
	@Test
	void testeAbertoEPossuirMinasVizinhas() {
		campo.abrir();
		campo.minasNaVizinhaca();
		assertEquals(" ", campo.toString());
	}
}
