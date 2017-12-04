package by.epam.jb.homework522;

import java.util.ArrayList;
import java.util.List;

public class ItemInfo {
	public List<Item> items = new ArrayList<Item>();

	public ItemInfo() {
	}

	public List<Item> getItems() {
		return items;
	}

	public void add(Item item) {
		items.add(item);
	}

	public boolean delete(List item) {
		return items.remove(items);
	}
	
	public Item findByContent(String content){
		for(Item item : items){
			if(item.getItem().equals(content)){
				return item;
			}
		}
		return null;
	}
	
	@Override
	public boolean equals(Object Item){
		if(this == Item){
			return true;
		}
		if(Item == null){
			return false;
		}
		ItemInfo other = (ItemInfo) Item;
			if(items != other.getItems()){
				return false;
			}
			return true;
		}
	
	@Override
	public int hashCode(){
		int hash = 31;
		if(items != null){
			hash = 17 * hash + this.items.hashCode();
		}else{
			hash *= 17;
		}
		return hash;
	}
}
