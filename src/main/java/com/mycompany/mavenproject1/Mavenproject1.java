/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author harma
 */
public class Mavenproject1 {

    public static void main(String[] args) {
             NewClass[] list = new NewClass[3];
     
     NewClass s1 =new NewClass();
     s1.setName("peter");
     s1.setAge(23);
     NewClass s2 =new NewClass();
     s2.setName("randeep");
     s2.setAge(22);
     NewClass s3 =new NewClass();
     s3.setName("vani");
     s3.setAge(22);
     list[0]=s1;
     list[1]=s2;
     list[2]=s3;
     for(int i=0;i<list.length;i++ )
     {
         System.out.println(list[i].getName()+list[i].getAge());
     }
    }
}
