package StudentHomework;


	public class TEST1 {  
		  public static void main(String[] args) {  
			    Print print = new Print();  
		 
		        Num n = new Num(print);  
		        Alphabetical a = new Alphabetical(print);  
		        //�½������߳�
		        Thread t1 = new Thread(n);  
		        Thread t2 = new Thread(a);  
		        //�߳�����
		        t1.start();  
		        t2.start();  
		    }  
		}  
		  
		class Print { 
			//�����жϴ�ӡ���ֻ���ĸ�ı�־
		    boolean flag = false;  
		    //
		    public synchronized void printnum() throws InterruptedException {  
		        for (int i = 1; i <= 9; i++) {  
		        	//ֻ��flagΪfalse������Ŵ�ӡ����num
		          while (flag == true) {
		        	  //����ȴ�
		                this.wait();  
		            }  
		          //��ӡ����
		            System.out.print(i);  
//		            if (i % 1 == 0) {  
		               flag = true;  
		               this.notify();  
//		            }  
		       }  
		    }  
		  
		    public synchronized void printa() throws InterruptedException {  
		        for (int i = 1; i <= 9; i++) { 
		        	//ֻ��flagΪtrue������Ŵ�ӡ��ĸ
		            while (flag == false) { 
		            	//����ȴ�
		                this.wait();  
		            }  
		            //��ӡ��ĸ
		            System.out.println((char) (i + 64));  
		            flag = false;  
		            this.notify();  
		  
	        }  
		   }  
		}  
	 
		class Num implements Runnable {  
		    Print p;  
		  
		    public Num(Print p) {  
		        super();  
		        this.p = p;  
		    }  
		  
		    @Override  
	    public void run() {  
		       try {  
		            p.printnum();  
		        } catch (InterruptedException e) {  
		            // TODO Auto-generated catch block  
		            e.printStackTrace();  
		        }  
		    }  
		  
		}  
		  
		class Alphabetical implements Runnable {  
		    Print p;  
		  
		    public Alphabetical(Print p) {  
		        super();  
		        this.p = p;  
		    }  
		 
	    @Override  
	    public void run() {  
		        try {  
		           p.printa();  
		        } catch (InterruptedException e) {  
		            e.printStackTrace();  
		        }  
		    }  
		  
		}  


