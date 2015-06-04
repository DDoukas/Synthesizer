package Player;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Midi.Algorithmic;
import Midi.Atonal;
import Midi.Composition;
import Midi.Free;
import Midi.Note;

public class Collection implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8695929870480157180L;
	private String name = null;
	private List<Composition> collection = new ArrayList<Composition>();

	public Collection(String name) {
		this.name = name;
	}

	public Collection(List<Composition> collection) {
		this.collection = collection;
	}

	public ArrayList<Note> getNotes(int x) {
		return collection.get(x).getNotes();
	}

	public void addSong(Composition x) {
		collection.add(x);
	}

	public void deleteSong(int x) {
		collection.remove(x);
	}

	public void saveCollection() throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(name + ".txt");
		for (int i = 0; i <= collection.size() - 1; i++) {
			writer.println(collection.get(i).getNotes() + ","
					+ collection.get(i).getOnomSinth() + ","
					+ collection.get(i).getCompName() + ","
					+ collection.get(i).getEidos());
		}
		writer.close();
	}

	public void openCollection(String k) throws IOException {
		/*BufferedReader br = new BufferedReader(new FileReader(k));
		String arx;
		while ((arx = br.readLine()) != null) {
			String[] p = arx.split(",");
			k = p[3];
			if (k.equals("Free")) {
				//Free tragoudi = new Free(p[0], p[1], p[2], p[3]);
				//collection.add(tragoudi);
			} else if (k.equals("Atonal")) {
				//Atonal tragoudi = new Atonal(p[0], p[1], p[2], p[3]);
				//collection.add(tragoudi);
			} else {
				//Algorithmic tragoudi = new Algorithmic(p[0], p[1], p[2], p[3]);
				//collection.add(tragoudi);
			}
		}
		br.close();*/
	}

}
