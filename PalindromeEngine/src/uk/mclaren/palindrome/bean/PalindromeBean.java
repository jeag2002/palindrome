package uk.mclaren.palindrome.bean;

public class PalindromeBean {
	
	private String palindrome;

	public PalindromeBean(){
		super();
		palindrome = "";
	}
	
	public PalindromeBean(String _palyndrome){
		palindrome = _palyndrome;
	}
	
	public void clear(){
		palindrome = "";
	}
	
	public String getPalindrome() {
		return palindrome;
	}

	public void setPalindrome(String palyndrome) {
		this.palindrome = palyndrome;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!(obj instanceof PalindromeBean)){
	        return false;
	    }
	    final PalindromeBean other = (PalindromeBean) obj;   
	    return (this.palindrome.indexOf(other.getPalindrome())!=-1) || (other.getPalindrome().indexOf(this.palindrome)!=-1) ;
	}

	

}
