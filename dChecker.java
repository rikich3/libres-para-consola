package facil_c;

public class dChecker extends Checker{
	private double subjectd;
	protected boolean check(){
		try{
			subjectd = Double.parseDouble(sujeto);
			return false;
		}
		catch(Exception e){
			System.out.println(warning);
			return true;
		}
	}
	public double get(double l1, double l2, String prompt, String missD){
		status = true;
		has_res = (l1 == l2)? false : true;
		do{
			do{
				System.out.println(missD);
				slave();
			}
			while(check());
	
			if(!has_res) status = false;
			else if(subjectd >= Math.min(l1, l2) && subjectd <= Math.max(l1, l2)) status = false;
			else System.out.println(prompt);
		}
		while(status);
        return subjectd;
	}
	public double get(double l1, double l2, String prompt){
		status = true;
		has_res = (l1 == l2)? false : true;
		do{
			do{
				System.out.println(prompt);
				slave();
			}
			while(check());
	
			if(!has_res) status = false;
			else if(subjectd >= Math.min(l1, l2) && subjectd <= Math.max(l1, l2)) status = false;
			else System.out.println(defmissD);
		}
		while(status);
        return subjectd;
	}
    public double get(double l1, String prompt, String missD){
		status = true;
		do{
			do{
				System.out.println(prompt);
				slave();
			}
			while(check());
			if(subjectd >= l1) status = false;
			else System.out.println(missD);
		}
		while(status);
        return subjectd;
	}
    public double get(double lim, String prompt){
		status = true;
		do{
			do{
				System.out.println(prompt);
				slave();
			}
			while(check());
			if(subjectd >= 0 && subjectd <= lim) status = false;
			else System.out.println(defmissD);
		}
		while(status);
        return subjectd;
    }
    public dChecker(String warning){
        this.warning = warning;
    }
}
