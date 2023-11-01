class Array {
    
    private int[] items;
    private int count;
    //constructor
    public Array(int length){

      items = new int[length];
    }
    public void print(){
        for(int i=0; i<count; i++)
            System.out.println(items[i]);
        
    }

    public void printDivider(){
        System.out.println("_________________");
    }
    public void insert(int givenItem){
        if(items.length==count){
           //create int array x2 of privios array
            int [] newItems= new int[count*2];
            //for copy current elements into the new array
            for(int i=0;i<count;i++)
                newItems[i]=items[i]; 
                items=newItems;
            
                                    }
        //add given item in item and increse the numbers of empth space
        items[count++]=givenItem;
        
    }

    //removeAt Method:
    public void removeAt(int index){
        //validation:
        if(index<0 || index>count){
            throw new IllegalArgumentException();
        
        }
        for(int i=index;i<count;i++)
            items[i]=items[i+1];
            count--;
    }

public int indexOf(int askedItem){

    for(int i=0;i<count;i++)
        if(items[i]==askedItem)
            return i;
        return -1;

}

 

}