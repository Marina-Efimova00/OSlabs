import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Process {
	private String id;
	private int prioritet;
	private int operatingTime;
	private List<Potok> potok;
	public Process(String id, int prioritet) {
		this.id = id;
		this.prioritet = prioritet;
		Random randomNumber = new Random();
		potok = new ArrayList<>();
		for (int i = 0; i < randomNumber.nextInt(5) + 1; i++) {
			potok.add(new Potok("поток " + (i + 1), 8 * i + 1, prioritet, id));
			this.operatingTime += potok.get(i).getOperatingTime();
		}
	}
	public int getOperatingTime() {
		return operatingTime;
	}
	public void setOperatingTime(int operatingTime) {
		this.operatingTime = operatingTime;
	}

	public int getprioritet() {
		return prioritet;
	}
	public List<Potok> getlist() {
		return potok;
	}
	public String getid() {
		return id;
	}
}
