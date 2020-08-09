
public class ReadingTextFile {

	public static void main(String[] args) throws Exception {
		ReadFromFile r1 = new ReadFromFile("E:\\java\\udacitylearning.txt");
		//System.out.println(r1.readFile());
		r1.readFile().forEach(elem -> {
            System.out.println(elem);
        });
	}

}
