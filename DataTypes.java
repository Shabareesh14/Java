class DataTypes{
	public static void main(String[] args){
		byte a = 10;
		byte b = 10;
		int c = a + b;
		System.out.println(c);
		
		short d = 20;
		short e = 10;
		int f = d + e;
		System.out.println(f);
		
		int g = 25;
		int h = 25;
		int i = g + h;
		System.out.println(i);
		
        long j = 40;
        long k = 15;
        long l = j + k;
        System.out.println(l);
		
		double m = 12;
		double n = 13;
		double o = m + n;
		System.out.println(o);
		
		float p = 34;
		float q = 11;
		float r = (p + q);
		System.out.println(r);
		
		char s = 'A'; 
        char t = 'a';
        int u = s + t; 
        System.out.println(u);
		
		int v = 12856;
        String toBuild = Integer.toOctalString(v);
        System.out.println(toBuild);
		
		int intValue = Integer.parseInt("10", 2);
		System.out.println(intValue);
	}
}