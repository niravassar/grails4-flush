package grails4.flush

class BookController {

    BookService bookService

    def index() {
        new Book(title: "NiravBook").save()
        new Book(title: "RobBook").save()
        Book book = Book.findByTitle("NiravBook")
        render book.title
    }

    def doInTransaction() {
        bookService.run()
        render "done"
    }
}
