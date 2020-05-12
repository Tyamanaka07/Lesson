package sales;

public class Sales {
	private String name;
	private int kingaku;

	public Sales(String name, int kingaku) {
		this.name = name;
		this.kingaku = kingaku;
	}

	public String getName() {
		return name;
	}

	public int getKingaku() {
		return kingaku;
	}

	public int getSouryou() {
		if(kingaku < 3000) {
			return 500;
		}
		else
			return 0;
	}

	public int getTotal() {
		return kingaku + getSouryou();
	}

	@Override
	public String toString() {
		return name + " " + kingaku + " 送料 " + getSouryou() + "円\n";
	}


}
