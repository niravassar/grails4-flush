package grails4.flush

import grails.gorm.transactions.Transactional

@Transactional
class BookService {

    void run() {
        new Book(title: "NiravBook").save(failOnError: true)
        new Book(title: "RobBook").save(failOnError: true)
        Book book = Book.findByTitle("NiravBook")
        println book.title
    }
}
