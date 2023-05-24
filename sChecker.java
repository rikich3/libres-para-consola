package facil_c;

public class sChecker extends Checker{
	protected int index;
	public String get(int l1, int l2, String prompt, String missD){
		status = true;
		has_res = true;
		if(l1 == l2) has_res = false;
		do{
            System.out.println(prompt);
			slave();
			if(!has_res || (sujeto.length() >= Math.min(l1, l2) && sujeto.length() <= Math.max(l1, l2))) status = false;
			else System.out.println(missD);
		}
		while(status);
            return sujeto;
	}
	public String get(int l1, int l2, String prompt){
		status = true;
		has_res = true;
		if(l1 == l2) has_res = false;
		do{
            System.out.println(prompt);
			slave();
			if(!has_res || (sujeto.length() >= Math.min(l1, l2)&& sujeto.length() <= Math.max(l1, l2))) status = false;
			else System.out.println(defmissD);
		}
		while(status);
                return sujeto;
	}
    public String get(int lim, String prompt, String missD){
		status = true;
		do{
            System.out.println(prompt);
			slave();
			if(sujeto.length() >= 1 && sujeto.length() <= lim) status = false;
			else System.out.println(missD);
		}
		while(status);
        return sujeto;
	}
    public String get(int lim, String prompt){
		status = true;
		do{
            System.out.println(prompt);
			slave();
			if(sujeto.length() >= 1 && sujeto.length() <= lim) status = false;
			else System.out.println(defmissD);
		}
		while(status);
        return sujeto;
    }
	public int get(String[] daList, String prompt){
		status = true;
		do{
            System.out.println(prompt);
			slave();
		}
		while(check(daList));
        return index;
    }
    protected boolean check(String[] daList){
		index = 0;
		for (String current: daList){
			if(sujeto.equals(current)) return false;
			else index++;
		}
		System.out.println(warning);
		return true;
	}
    protected boolean check(){return true;}
    public sChecker(String warning){
        this.warning = warning;
    }
}
