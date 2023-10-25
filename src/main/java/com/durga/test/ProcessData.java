package com.durga.test;

import java.security.*;
import java.util.Scanner;


public class ProcessData {

    public String eventname;
    public int eventvalue;
    public String name;
    public String pass;

    public int aggregateIntegerStringss_BestPractices(String[] integers) {
        String company = null;
        boolean isSaved = false;
        float temp = -103.342f;
        int sum = 0;
        try {

            for (String integer : integers) {
                sum += Integer.parseInt(integer);
            }

            int noOfworkers = company.charAt(0);
            try {
                double tempValue = 3.4;
                if(temp==tempValue){ sum = 3;}
            } catch (Exception e) {
                e.printStackTrace();
            }


            Scanner sc=new Scanner(System.in);
            System.out.println("enter number of terms");
            int n=sc.nextInt();
            int i=0,j=1,nextTerm;
            System.out.println("Fibonacci series is ");
            for(int c=0;c<n;c++)
            {
                if(c<=1)
                    nextTerm=c;
                else
                {
                    nextTerm=i+j;
                    i=j;
                    j=nextTerm;
                }
                System.out.println(nextTerm);
            }



            int n1;double res=0;

            Scanner sc1=new Scanner(System.in);

            System.out.println("enter how many numbers to cal  avg");

            n1=sc1.nextInt();

            int a[]=new int[n];

            System.out.println("enter   "+n+"  numbers");

            for(int i1=0;i1<n;i1++)
                a[i1]=sc.nextInt();

            res= ProcessData.CalAvg(a,n);

            System.out.println("average="+res/n);



            double  dis,amount,markedprice,s;

            Scanner sc2=new Scanner(System.in);

            System.out.println("enter markedprice ");

            markedprice=sc2.nextDouble();

            System.out.println("enter discount percentage ");

            dis=sc2.nextDouble();

            s=100-dis;

            amount= (s*markedprice)/100;

            System.out.println("amount after discount="+amount);




        } catch (NumberFormatException ex) {
        }
        return sum;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public int getEventvalue() {
        return eventvalue;
    }

    public void setEventvalue(int eventvalue) {
        this.eventvalue = eventvalue;
    }


    static double CalAvg(int  a[],int n)
    {
        double res=0;

        for(int i=0;i<n;i++)
            res =res+a[i];

        return res;
    }

  public void store_AuthVulnerability(String name, String pass){
      String username = name;
      String password = pass;
      if (username.equals("admin") && password.equals("password")) {
          System.out.println("Access Given"+name+"Pass"+pass);
      } else {
          System.out.println("Access Taken"+pass);
      }
  }


  public void generateKey_KeyManagementVulnerability() throws NoSuchAlgorithmException {
      KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
      SecureRandom random = new SecureRandom();
      keyGen.initialize(2048, random);
      KeyPair keyPair = keyGen.generateKeyPair();
      PrivateKey privateKey = keyPair.getPrivate();
      PublicKey publicKey = keyPair.getPublic();

      System.out.println("privateKey"+privateKey);


      SecureRandom randomNumber = new SecureRandom();
      byte[] key = new byte[16];
      randomNumber.nextBytes(key);


  }

  public String generateEvent_performanceIssue(){
         Integer value = 123;
         Double eventValue = 1.4;
          String s3 = "";
          for (int i = 0; i < 10000; i++) {
              if (s3.length() > 0)
                  s3 += ", ";
              s3 += "bar";
          }
         String test = "123";
         test.replace("12", "456");

          System.out.println(""+value+""+eventValue);

          return s3;
  }



  public void SaveData_codeStyle(){
        int x= 1;
        x = 6 * (2 + x) + 7 / x - x;
       Boolean flag = true;
      if (flag) generateEvent_performanceIssue(); store_AuthVulnerability("test1", "test2");
  }



}
