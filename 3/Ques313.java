public class Ques313
{
    String pNum; // variable representing part number
    String pDes; // variable representing part description
    int quan; // quantity of item being purchased
    int price; // price of item being purchased
    
    public Ques313( String part, String desc, int quantity, int goodPrice) // constructor
    {
        pNum = part;
        pDes = desc;
        quan = quantity;
        price = goodPrice;
    }
    public void setNumber(String number) // set part number
    {
        pNum = number;
    }
    public void setDescription(String description) // set part description
    {
        pDes = description;
    }
    public void setQuantity (int quantity) // set quantity to be purchased
    {
        quan = quantity;
    }
    public void setPrice (int priceOfGood) // set price of item purchased
    {
        price = priceOfGood;
    }
    public String getNumber()  // get part number
    {
        return pNum;
    }
    public String getDescription()  // get part description
    {
        return pDes;
    }
    public int getQuantity() // get quantity to be purchased
    {
        return quan;
    }
    public int getPrice()  // get price of item being purchased
    {
        return price;
    }
    public double getInvoiceAmount()
    {
        if ( quan < 0)
            quan = 0; // set quantity to 0 if quantity is less than 0
        if ( price < 0)
            price = (int)0.0; // to maintain integer type of price variable
        return quan*price;  // double value to return after multiplying quantity and price
    }
}