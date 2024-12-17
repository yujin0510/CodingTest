public class Main {

	public static void main(String[] args) {
		
		String s = "         ,r\'\"7"	+ "\n"	// \' \" \n 제어시퀀스
				 + "r`-_   ,\'  ,/"		+ "\n"	// \' 제어시퀀스
				 + " \\. \". L_r\'"		+ "\n"	// \\ \" \' 제어시퀀스
				 + "   `~\\/"			+ "\n"	// \\ 제어시퀀스
				 + "      |"			+ "\n"	// \n 엔터
				 + "      |"			+ "\n"
				 ;			
		
		System.out.println(s);
		
	}

}
