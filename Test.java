public class Test{
	public static void main(String[] args) {
		MyArrayList<String> arr = new MyArrayList<>();
		arr.add("Apple");
		arr.add("Orange");
		arr.add("Banana");
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);



	}
}
class MyArrayList<E> {
	public static final int INITIAL_CAPACITY=16;
	E[] data = (E[])new Object[INITIAL_CAPACITY];
	private int index;
	public  void add(E element){
		
		if(index>=data.length){
			E[] Newdata =(E[])new Object[data.length*2+1];
			System.arraycopy(data,0,Newdata,0,index);
			data= Newdata;
		}
        data[index++]=element;

	}
	public E get(int i){
		return data[i];
	}
	public void remove(int k){
		if(k<size()){
			data[k]=null;

		index--;
		E[] newArray = (E[]) new Object[size()];
		
		int c=0;
		for(int i=0;i<size()+1;i++){
			if(data[i] != null){
				newArray[c++]=data[i];
			}
		}
		data=newArray;
	}

	}
	public int size(){
		
		return index;
	}
	public String toString(){
		String result ="";
		for(int i=0;i<size();i++){
			result += data[i]+" ";
		}
		return result;
	}

}