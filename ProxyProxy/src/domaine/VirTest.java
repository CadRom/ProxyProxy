package domaine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import jdk.jfr.Enabled;

import static org.junit.Assert.fail;



public class VirTest {

	@Test
	
	public void ScenarioDebitCent() {
		fail("pas soustraction de 100");
	}
	
	@Test
	
	public void ScenarioDebitTropEleve() {
		fail("Decouvert pas autorisé");
	}
}
