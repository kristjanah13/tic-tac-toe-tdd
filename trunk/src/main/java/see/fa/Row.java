package see.fa;

public class Row {

	private final Mark[] marks;

	public Row(Mark... marks) {
		this.marks = marks;
	}

	public Mark getCommonMark() {
		Mark commonMark = marks[0];
		int i = 1;
		while( i < marks.length && commonMark != null) {
			commonMark = commonMark == marks[i] ? commonMark : null;
			i++;
		}
		
		return commonMark;
	}

}
