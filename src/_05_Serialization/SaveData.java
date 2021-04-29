package _05_Serialization;

/*
 * Complete this class so that it can be serialized.
 */
public class SaveData {
	private static final long serialzationUID= 0;
	public final String name;
	public final int age;

	public SaveData(String name, int age) {
		this.name = name;
		this.age = age;
	}
public String toString() {
	return "SaveData [name=" + name + ", age=" + age + "]";
}
	
}
