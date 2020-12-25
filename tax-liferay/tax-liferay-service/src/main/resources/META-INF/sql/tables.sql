create table jb_Cart (
	uuid_ VARCHAR(75) null,
	cartId LONG not null primary key,
	active_ BOOLEAN,
	createDate DATE null
);

create table jb_CartItem (
	cartItemId LONG not null primary key,
	cartId LONG,
	itemId LONG,
	price DOUBLE,
	amount DOUBLE,
	tax DOUBLE,
	total DOUBLE
);

create table jb_Item (
	itemId LONG not null primary key,
	name VARCHAR(75) null,
	isImported BOOLEAN,
	isExempt BOOLEAN,
	price DOUBLE,
	active_ BOOLEAN
);

create table jb_ItemShopBasket (
	itemShopBasketId LONG not null primary key,
	shopBasketId LONG,
	name VARCHAR(75) null,
	isImported BOOLEAN,
	isExempt BOOLEAN,
	price DOUBLE,
	active_ BOOLEAN,
	amount LONG,
	tax DOUBLE,
	total DOUBLE
);

create table jb_ShopBasket (
	uuid_ VARCHAR(75) null,
	shopBasketId LONG not null primary key,
	active_ BOOLEAN,
	createDate DATE null
);