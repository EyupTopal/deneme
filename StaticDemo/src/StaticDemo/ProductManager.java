package StaticDemo;

import javax.xml.validation.Validator;

public class ProductManager {
    public void add(Product product){
        ProductValidater validater=new ProductValidater ();
        if (validater.isValid (product)){
            System.out.println ("Eklendi");
        }else{
            System.out.println ("ürün bilgileri gecersizdir.");

        }

    }
}
