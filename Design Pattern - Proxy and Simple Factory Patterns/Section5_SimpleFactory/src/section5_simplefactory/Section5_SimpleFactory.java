/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section5_simplefactory;


public class Section5_SimpleFactory {

 
    public static void main(String[] args) {
       
        ButtonSimpleFactory ButtonObj=new ButtonSimpleFactory();
        Button butHtml= ButtonObj.createButton("html");
        Button butwind=ButtonObj.createButton("window");
        
        System.out.println(butHtml.getType());
        System.out.println(butwind.getType());
    }
    
}
