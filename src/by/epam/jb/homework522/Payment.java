package by.epam.jb.homework522;

import java.util.List;

public class Payment {

	public static void main(String[] args) {

		ItemInfo myItemInfo = new ItemInfo();

		myItemInfo.add(new Item("item1", 100, new Data(1, 1, 2017)));
		myItemInfo.add(new Item("item2", 200, new Data(2, 2, 2017)));
		myItemInfo.add(new Item("item3", 300, new Data(3, 3, 2017)));
		myItemInfo.add(new Item("item4", 400, new Data(4, 4, 2017)));

		Item findItem = myItemInfo.findByContent("item3");
		if (findItem != null) {
			print(findItem);
		}
		print(myItemInfo);
	}

	public static void print(ItemInfo itemInfo) {
		List<Item> printItems = itemInfo.getItems();
		System.out.println("Items: ");
		for (int i = 0; i < printItems.size(); i++) {
			Item item = printItems.get(i);
			print(item);
		}
	}
	public static void print(Item item){
		System.out.println("Item : " + item.getItem() + "Price : " + item.getPrice() + "[" + item.getData().getDay() + "/" + item.getData().getMonth()
				+ "/" + item.getData().getYear() + "].");
	}
}
