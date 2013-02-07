package br.com.cpa.unit.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import br.com.cpa.controller.IndexController;

public class IndexControllerTest {

	private IndexController controller;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		controller = new IndexController();
	}

	@Test
	public void deveriaIndex() {
		// given

		// when
		controller.index();

		// then
	}

}