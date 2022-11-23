package Entity;

public class Messenger {

	private int macode;
	private String text;

	public Messenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Messenger(int macode, String text) {
		super();
		this.macode = macode;
		this.text = text;
	}

	public int getMacode() {
		return macode;
	}

	public void setMacode(int macode) {
		this.macode = macode;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
