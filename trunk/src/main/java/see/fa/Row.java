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

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !Row.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		
		Row that = (Row)obj;
		return Mark.equals(this.marks, that.marks);
	}

	@Override
	public int hashCode() {
		return Mark.hashCode(marks);
	}

	@Override
	public String toString() {
		return Mark.toString(marks);
	}
	

}
