package facil_c;

public class iChecker extends Checker{
	private int subjecti;
	protected boolean check(){
		try{
			subjecti = Integer.parseInt(sujeto);
			return false;
		}
		catch(Exception e){
			System.out.println(warning);
			return true;
		}
	}
	public int get(int l1, int l2, String prompt, String missD){
		status = true;
		has_res = (l1 == l2)? false : true;
		do{
			do{
				System.out.println(prompt);
				slave();
			}
			while(check());
			if(!has_res) status = false;
			else if(subjecti >= Math.min(l1, l2) && subjecti <= Math.max(l1, l2)) status = false;
			else System.out.println(missD);
		}
		while(status);
        return subjecti;
	}
	public int get(int l1, int l2, String prompt){
		status = true;
		has_res = (l1 == l2)? false : true;
		do{
			do{
				System.out.println(prompt);
				slave();
			}
			while(check());
			if(!has_res) status = false;
			else if(subjecti >= Math.min(l1, l2) && subjecti <= Math.max(l1, l2)) status = false;
			else System.out.println(defmissD);
		}
		while(status);
        return subjecti;
	}
    public int get(int lim, String prompt, String missD){
		status = true;
		do{
			do{
				System.out.println(prompt);
				slave();
			}
			while(check());
			if(subjecti >= 0 && subjecti <= lim) status = false;
			else System.out.println(missD);
		}
		while(status);
        return subjecti;
	}
    public int get(int lim, String prompt){
		status = true;
		do{
			do{
				System.out.println(prompt);
				slave();
			}
			while(check());
			if(subjecti >= 0 && subjecti <= lim) status = false;
			else System.out.println(defmissD);
		}
		while(status);
        return subjecti;
    }
    public iChecker(String warning){
        this.warning = warning;
    }
}

