package com.swap.pojo;

import java.sql.Date;
import java.util.List;

import com.swap.enums.ItemConditionEnum;
import com.swap.enums.ItemCycleEnum;

public class Item {
	private String title;
	private long id;
	private String description;
	private Location location;
	private User user;
	private Category category;
	private List<Image> images;
	private ItemConditionEnum condition;
	private int quantity;
	private int NumOfReviews;
	private int NumOfInterests;
	private ItemCycleEnum itemStage;
	private Date itemEndDate;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public ItemConditionEnum getCondition() {
		return condition;
	}
	public void setCondition(ItemConditionEnum condition) {
		this.condition = condition;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getNumOfReviews() {
		return NumOfReviews;
	}
	public void setNumOfReviews(int numOfReviews) {
		NumOfReviews = numOfReviews;
	}
	public int getNumOfInterests() {
		return NumOfInterests;
	}
	public void setNumOfInterests(int numOfInterests) {
		NumOfInterests = numOfInterests;
	}
	public ItemCycleEnum getItemStage() {
		return itemStage;
	}
	public void setItemStage(ItemCycleEnum itemStage) {
		this.itemStage = itemStage;
	}
	public Date getItemEndDate() {
		return itemEndDate;
	}
	public void setItemEndDate(Date itemEndDate) {
		this.itemEndDate = itemEndDate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [title=").append(title).append(", id=").append(id).append(", description=")
				.append(description).append(", location=").append(location).append(", user=").append(user)
				.append(", category=").append(category).append(", images=").append(images).append(", condition=")
				.append(condition).append(", quantity=").append(quantity).append(", NumOfReviews=").append(NumOfReviews)
				.append(", NumOfInterests=").append(NumOfInterests).append(", itemStage=").append(itemStage)
				.append(", itemEndDate=").append(itemEndDate).append("]");
		return builder.toString();
	}
}
