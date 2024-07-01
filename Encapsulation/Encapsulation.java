class Author {
    String name, email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public static void main(String[] args) {
        Author author = new Author("Ravindra Nath Tagore", "ravindranath@gmail.com", 'M');
        Book b = new Book("Geetanjali", author, 450.45, 56);

        System.out.println("Name of Book : " + b.name);
        System.out.println("Author Name : " + b.author.name);
        System.out.println("Author Email : " + b.author.email);
        System.out.println("Author Gender : " + b.author.gender);
        System.out.println("Price of book : " + b.price);
        System.out.println("Quantity in Stock : " + b.qtyInStock);
    }
}
