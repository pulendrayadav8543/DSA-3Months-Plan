public class RemoveDuplicate{
	public static String removeDuplicate(String arr){
		String str="";
		char[] ch=arr.toCharArray();
		for(int i=0;i<ch.length;i++){
			char current=ch[i];
			boolean isDuplicate=false;
			for(int j=i+1;j<ch.length;j++){
				if(Character.toLowerCase(current)==Character.toLowerCase(ch[j])){
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate){
				str+=current;
			}
		}
		return str;
	}
	public static void main(String[] args){
		System.out.println(removeDuplicate("Aabbccc"));
	}
}