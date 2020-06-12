package item2;

public class ItemServiceImpl implements ItemService {
	private Item[] list;
	private int index;
	
	public ItemServiceImpl() {
		list = new Item[3]	;
		index = 0;
}
	
	@Override
	public void addCart(Item item) {
		list[index] = item; // index 첫번째 값에 0 , index값 0으로 설정해서.. 
		index++;
	}

	@Override
	public Item[] list() {
		return list;
	}


}
