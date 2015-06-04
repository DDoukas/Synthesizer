package Midi;

/**
 * Exception, thrown when symmetry actions are executed over atonal rows that
 * contain duplicate or not all the 12 notes
 */
// memo: rwta ama prepei na dwsoume credits kapou
public class SymmetryActionOnNonValidAtonalRow extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2767450086273572250L;

	// Parameterless Constructor

	public SymmetryActionOnNonValidAtonalRow() {
	}

	// Constructor that accepts a message
	public SymmetryActionOnNonValidAtonalRow(String message) {
		super(message);
	}

	public SymmetryActionOnNonValidAtonalRow(Throwable cause) {
		super(cause);
	}

	public SymmetryActionOnNonValidAtonalRow(String message, Throwable cause) {
		super(message, cause);
	}
}