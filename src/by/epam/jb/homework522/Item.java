package by.epam.jb.homework522;

public class Item {

	private String item;
	private int price;
	private Data data;

	public Item() {
		this("", 0, null);
	}

	public Item(String item, int price, Data data) {
		this.item = item;
		this.price = price;
		this.data = data;
	}

	public String getItem() {
		return item;
	}

	public int getPrice() {
		return price;
	}

	public Data getData() {
		return data;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(int Price) {
		this.price = price;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Item other = (Item) obj;
		if (data == null) {
			if (other.data != null) {
				return false;
			} else if (!data.equals(other.data))
				return false;
		}
		if (item == null) {
			if (other.item != null) {
				return false;
			} else if (!item.equals(other.item))
				return false;
		}
		if (price !=other.price){
				return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Item [item=" + item + ", data=" + data + ", price=" + price + "]";
	}
}
